package com.freshsquilliam.fresharmsandarmor.combat;

import com.freshsquilliam.fresharmsandarmor.item.KnightArmorMaterials;
import com.freshsquilliam.fresharmsandarmor.item.ModItemTags;
import com.freshsquilliam.fresharmsandarmor.item.custom.KnightArmorItem;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.event.entity.living.LivingHurtEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;


@Mod.EventBusSubscriber(
        modid = "fresharmsandarmor",
        bus = Mod.EventBusSubscriber.Bus.FORGE
)
public class KnightArmorHandler {

    @SubscribeEvent
    public static void onLivingHurt(LivingHurtEvent event) {

        System.out.println("[KnightArmorHandler] LivingHurtEvent fired");

        // Must be player damage
        if (!(event.getSource().getEntity() instanceof Player player)) {
            System.out.println("[KnightArmorHandler] Damage source is not a player");
            return;
        }

        System.out.println("[KnightArmorHandler] Damage source is player");

        // Must be using a one-handed weapon
        ItemStack weapon = player.getMainHandItem();
        if (!weapon.is(ModItemTags.ONE_HANDED)) {
            System.out.println("[KnightArmorHandler] Weapon is NOT one-handed");
            return;
        }

        System.out.println("[KnightArmorHandler] Weapon IS one-handed");

        float bonus = 0.0F;

        for (EquipmentSlot slot : new EquipmentSlot[]{
                EquipmentSlot.HEAD,
                EquipmentSlot.CHEST,
                EquipmentSlot.LEGS,
                EquipmentSlot.FEET
        }) {
            ItemStack armorStack = player.getItemBySlot(slot);

            if (!(armorStack.getItem() instanceof KnightArmorItem armor)) {
                continue;
            }

            float pieceBonus = getBonusForMaterial(armor.getMaterial());
            bonus += pieceBonus;

            System.out.println(
                    "[KnightArmorHandler] Found barbarian armor in slot "
                            + slot + " with bonus " + pieceBonus
            );
        }

        if (bonus <= 0.0F) {
            System.out.println("[KnightArmorHandler] Total bonus is 0 — no damage modification");
            return;
        }

        float original = event.getAmount();
        float modified = original * (1.0F + bonus);

        System.out.println(
                "[KnightArmorHandler] Applying bonus: " +
                        "original=" + original +
                        ", bonus=" + bonus +
                        ", final=" + modified
        );

        event.setAmount(modified);
    }

    private static float getBonusForMaterial(ArmorMaterial material) {

        if (material == KnightArmorMaterials.IRON) {
            return 0.04F; // +4% per piece
        }

        if (material == KnightArmorMaterials.DIAMOND) {
            return 0.06F; // +6% per piece
        }

        if (material == KnightArmorMaterials.NETHERITE) {
            return 0.08F; // +8% per piece
        }

        return 0.0F;
    }
}
