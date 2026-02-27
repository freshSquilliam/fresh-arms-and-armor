package com.freshsquilliam.fresharmsandarmor.item.knight;

import com.freshsquilliam.fresharmsandarmor.Config;
import com.freshsquilliam.fresharmsandarmor.item.ModItemTags;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.monster.Enemy;
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

        if (!player.getMainHandItem().is(ModItemTags.ONE_HANDED)) {
            return;
        }

        float totalBonus = 0.0F;

        for (EquipmentSlot slot : EquipmentSlot.values()) {
            if (!slot.isArmor()) continue;

            ItemStack armorStack = player.getItemBySlot(slot);

            if (armorStack.getItem() instanceof KnightArmorItem armor) {
                totalBonus += getBonusForMaterial(armor.getMaterial());
            }
        }

        if (totalBonus <= 0.0F) return;

        event.setAmount(event.getAmount() * (1.0F + totalBonus));
    }

    private static float getBonusForMaterial(ArmorMaterial material) {

        if (material == KnightArmorMaterials.IRON) {
            return Config.KNIGHT_IRON_BONUS.get().floatValue();
        }

        if (material == KnightArmorMaterials.DIAMOND) {
            return Config.KNIGHT_DIAMOND_BONUS.get().floatValue();
        }

        if (material == KnightArmorMaterials.NETHERITE) {
            return Config.KNIGHT_NETHERITE_BONUS.get().floatValue();
        }

        return 0.0F;
    }

    // ----------------------
    // FULL SET HOSTILE AGGRO SYSTEM
    // ----------------------

    @SubscribeEvent
    public static void onLivingTick(LivingEvent.LivingTickEvent event) {

        if (!(event.getEntity() instanceof Player knight)) {
            return;
        }

        if (knight.level().isClientSide) {
            return;
        }

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

            if (!(mob instanceof Enemy)) continue;
            if (!mob.isAlive()) continue;

            if (mob.getAttribute(Attributes.FOLLOW_RANGE) != null) {
                double followRange = mob.getAttribute(Attributes.FOLLOW_RANGE).getValue();
                if (mob.distanceTo(knight) > followRange) continue;
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