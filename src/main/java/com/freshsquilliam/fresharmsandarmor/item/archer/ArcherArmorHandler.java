package com.freshsquilliam.fresharmsandarmor.item.archer;

import com.freshsquilliam.fresharmsandarmor.Config;
import com.freshsquilliam.fresharmsandarmor.FreshArmsAndArmor;
import com.mojang.logging.LogUtils;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.BowItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraftforge.event.entity.living.LivingEntityUseItemEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import org.slf4j.Logger;

@Mod.EventBusSubscriber(
        modid = FreshArmsAndArmor.MODID,
        bus = Mod.EventBusSubscriber.Bus.FORGE
)
public class ArcherArmorHandler {

    private static final Logger LOGGER = LogUtils.getLogger();

    @SubscribeEvent
    public static void onItemUseTick(LivingEntityUseItemEvent.Tick event) {

        if (!(event.getEntity() instanceof Player player)) return;

        ItemStack item = event.getItem();

        // Support BOTH vanilla + your custom bows
        if (!(item.getItem() instanceof BowItem)) return;

        float totalBonus = 0.0F;

        for (EquipmentSlot slot : EquipmentSlot.values()) {
            if (!slot.isArmor()) continue;

            ItemStack armorStack = player.getItemBySlot(slot);

            if (armorStack.getItem() instanceof ArcherArmorItem armor) {
                totalBonus += getBonusForMaterial(armor.getMaterial());
            }
        }

        if (totalBonus <= 0.0F) return;

        /*
         * CORE FIX:
         * Convert bonus into "extra ticks per tick"
         *
         * Example:
         * 0.20 bonus → 1.2x speed → +0.2 ticks per tick
         */

        float extraTicks = totalBonus;

        int reduction = (int) extraTicks;

        // Handle fractional part smoothly
        if (player.level().random.nextFloat() < (extraTicks - reduction)) {
            reduction++;
        }

        if (reduction > 0) {
            int newDuration = event.getDuration() - reduction;

            // IMPORTANT: only subtract small amounts
            if (newDuration > 0 && newDuration < event.getDuration()) {
                event.setDuration(newDuration);
            }
        }

        LOGGER.debug("Archer draw speed: bonus={}, reduction={}",
                totalBonus, reduction);
    }

    private static float getBonusForMaterial(ArmorMaterial material) {

        if (material == ArcherArmorMaterials.IRON) {
            return Config.ARCHER_IRON_BONUS.get().floatValue();
        }

        if (material == ArcherArmorMaterials.DIAMOND) {
            return Config.ARCHER_DIAMOND_BONUS.get().floatValue();
        }

        if (material == ArcherArmorMaterials.NETHERITE) {
            return Config.ARCHER_NETHERITE_BONUS.get().floatValue();
        }

        return 0.0F;
    }
}