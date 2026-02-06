package com.freshsquilliam.fresharmsandarmor.combat;

import com.freshsquilliam.fresharmsandarmor.item.ModItemTags;
import com.freshsquilliam.fresharmsandarmor.item.ModArmorMaterials;
import com.freshsquilliam.fresharmsandarmor.item.custom.BarbarianArmorItem;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraftforge.event.entity.living.LivingHurtEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(
        modid = "fresharmsandarmor",
        bus = Mod.EventBusSubscriber.Bus.FORGE
)
public class BarbarianArmorHandler {

    @SubscribeEvent
    public static void onLivingHurt(LivingHurtEvent event) {

        System.out.println("[BarbarianArmorHandler] LivingHurtEvent fired");

        // Must be player damage
        if (!(event.getSource().getEntity() instanceof Player player)) {
            System.out.println("[BarbarianArmorHandler] Damage source is not a player");
            return;
        }

        System.out.println("[BarbarianArmorHandler] Damage source is player");

        // Must be using a two-handed weapon
        ItemStack weapon = player.getMainHandItem();
        if (!weapon.is(ModItemTags.TWO_HANDED)) {
            System.out.println("[BarbarianArmorHandler] Weapon is NOT two-handed");
            return;
        }

        System.out.println("[BarbarianArmorHandler] Weapon IS two-handed");

        float bonus = 0.0F;

        for (EquipmentSlot slot : new EquipmentSlot[]{
                EquipmentSlot.HEAD,
                EquipmentSlot.CHEST,
                EquipmentSlot.LEGS,
                EquipmentSlot.FEET
        }) {
            ItemStack armorStack = player.getItemBySlot(slot);

            if (!(armorStack.getItem() instanceof BarbarianArmorItem armor)) {
                continue;
            }

            float pieceBonus = getBonusForMaterial(armor.getMaterial());
            bonus += pieceBonus;

            System.out.println(
                    "[BarbarianArmorHandler] Found barbarian armor in slot "
                            + slot + " with bonus " + pieceBonus
            );
        }

        if (bonus <= 0.0F) {
            System.out.println("[BarbarianArmorHandler] Total bonus is 0 — no damage modification");
            return;
        }

        float original = event.getAmount();
        float modified = original * (1.0F + bonus);

        System.out.println(
                "[BarbarianArmorHandler] Applying bonus: " +
                        "original=" + original +
                        ", bonus=" + bonus +
                        ", final=" + modified
        );

        event.setAmount(modified);
    }

    private static float getBonusForMaterial(ArmorMaterial material) {

        if (material == ModArmorMaterials.IRON) {
            return 0.05F; // +5% per piece
        }

        if (material == ModArmorMaterials.DIAMOND) {
            return 0.075F; // +7.5% per piece
        }

        if (material == ModArmorMaterials.NETHERITE) {
            return 0.10F; // +10% per piece
        }

        return 0.0F;
    }
}
