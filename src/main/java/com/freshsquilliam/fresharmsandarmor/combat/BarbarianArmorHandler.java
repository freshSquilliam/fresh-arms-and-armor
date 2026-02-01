package com.freshsquilliam.fresharmsandarmor.combat;

import com.freshsquilliam.fresharmsandarmor.item.ModItemTags;
import com.freshsquilliam.fresharmsandarmor.item.armor.BarbarianArmor;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.event.entity.living.LivingHurtEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber
public class BarbarianArmorHandler {

    @SubscribeEvent
    public static void onLivingHurt(LivingHurtEvent event) {
        if (!(event.getSource().getEntity() instanceof Player player)) return;

        ItemStack weapon = player.getMainHandItem();
        if (!weapon.is(ModItemTags.TWO_HANDED)) return;

        float bonus = 0.0F;

        for (EquipmentSlot slot : new EquipmentSlot[]{
                EquipmentSlot.HEAD,
                EquipmentSlot.CHEST,
                EquipmentSlot.LEGS,
                EquipmentSlot.FEET
        }) {
            ItemStack stack = player.getItemBySlot(slot);
            if (stack.getItem() instanceof BarbarianArmor armor) {
                bonus += armor.getTier().getDamageBonusPerPiece();
            }
        }

        if (bonus == 0.0F) return;

        event.setAmount(event.getAmount() * (1.0F + bonus));
    }
}
