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

    private static final float BONUS_PER_PIECE = 0.05F;

    @SubscribeEvent
    public static void onLivingHurt(LivingHurtEvent event) {
        if (!(event.getSource().getEntity() instanceof Player player)) return;

        ItemStack weapon = player.getMainHandItem();

        if (!weapon.is(ModItemTags.TWO_HANDED)) return;

        int pieces = 0;

        for (EquipmentSlot slot : new EquipmentSlot[]{
                EquipmentSlot.HEAD,
                EquipmentSlot.CHEST,
                EquipmentSlot.LEGS,
                EquipmentSlot.FEET
        }) {
            if (isBarbarianArmor(player.getItemBySlot(slot))) {
                pieces++;
            }
        }

        if (pieces == 0) return;

        float multiplier = 1.0F + (pieces * BONUS_PER_PIECE);
        event.setAmount(event.getAmount() * multiplier);
    }

    private static boolean isBarbarianArmor(ItemStack stack) {
        return stack.getItem() instanceof BarbarianArmor;
    }
}
