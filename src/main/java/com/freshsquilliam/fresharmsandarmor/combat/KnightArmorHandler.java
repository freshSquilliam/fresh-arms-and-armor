package com.freshsquilliam.fresharmsandarmor.combat;

import com.freshsquilliam.fresharmsandarmor.item.KnightArmorMaterials;
import com.freshsquilliam.fresharmsandarmor.item.ModItemTags;
import com.freshsquilliam.fresharmsandarmor.item.custom.KnightArmorItem;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.event.entity.living.LivingEvent;
import net.minecraftforge.event.entity.living.LivingHurtEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(
        modid = "fresharmsandarmor",
        bus = Mod.EventBusSubscriber.Bus.FORGE
)
public class KnightArmorHandler {

    private static final double AGGRO_RADIUS = 32.0D;

    // ----------------------
    // DAMAGE BONUS HANDLER
    // ----------------------

    @SubscribeEvent
    public static void onLivingHurt(LivingHurtEvent event) {

        if (!(event.getSource().getEntity() instanceof Player player)) {
            return;
        }

        if (!weaponIsOneHanded(player)) {
            return;
        }

        float bonus = 0.0F;

        for (EquipmentSlot slot : EquipmentSlot.values()) {
            if (!slot.isArmor()) continue;

            ItemStack armorStack = player.getItemBySlot(slot);

            if (armorStack.getItem() instanceof KnightArmorItem armor) {
                bonus += getBonusForMaterial(armor.getMaterial());
            }
        }

        if (bonus <= 0.0F) return;

        event.setAmount(event.getAmount() * (1.0F + bonus));
    }

    private static boolean weaponIsOneHanded(Player player) {
        return player.getMainHandItem().is(ModItemTags.ONE_HANDED);
    }

    private static float getBonusForMaterial(ArmorMaterial material) {

        if (material == KnightArmorMaterials.IRON) {
            return 0.04F;
        }

        if (material == KnightArmorMaterials.DIAMOND) {
            return 0.06F;
        }

        if (material == KnightArmorMaterials.NETHERITE) {
            return 0.08F;
        }

        return 0.0F;
    }

    // ----------------------
    // FULL SET AGGRO SYSTEM
    // ----------------------

    @SubscribeEvent
    public static void onLivingTick(LivingEvent.LivingTickEvent event) {

        if (!(event.getEntity() instanceof Player knight)) {
            return;
        }

        if (knight.level().isClientSide) {
            return;
        }

        // Only every 10 ticks (performance safe)
        if (knight.tickCount % 60 != 0) {
            return;
        }

        if (!isWearingFullKnightSet(knight)) {
            return;
        }

        for (Mob mob : knight.level().getEntitiesOfClass(
                Mob.class,
                knight.getBoundingBox().inflate(AGGRO_RADIUS)
        )) {
            if (!mob.isAlive()) continue;

            // Respect mob follow range if present
            if (mob.getAttribute(Attributes.FOLLOW_RANGE) != null) {
                double followRange = mob.getAttribute(Attributes.FOLLOW_RANGE).getValue();
                if (mob.distanceTo(knight) > followRange) {
                    continue;
                }
            }

            if (mob.getTarget() != knight) {
                mob.setTarget(knight);
            }
        }
    }

    private static boolean isWearingFullKnightSet(Player player) {

        int pieces = 0;

        for (EquipmentSlot slot : EquipmentSlot.values()) {
            if (!slot.isArmor()) continue;

            ItemStack stack = player.getItemBySlot(slot);

            if (stack.getItem() instanceof KnightArmorItem) {
                pieces++;
            }
        }

        return pieces == 4;
    }
}
