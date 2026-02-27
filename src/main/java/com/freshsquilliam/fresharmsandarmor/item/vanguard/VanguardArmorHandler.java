package com.freshsquilliam.fresharmsandarmor.item.vanguard;

import com.freshsquilliam.fresharmsandarmor.Config;
import com.freshsquilliam.fresharmsandarmor.FreshArmsAndArmor;
import com.freshsquilliam.fresharmsandarmor.item.ModItemTags;
import com.mojang.logging.LogUtils;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.event.entity.living.LivingHurtEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import org.slf4j.Logger;

@Mod.EventBusSubscriber(
        modid = FreshArmsAndArmor.MODID,
        bus = Mod.EventBusSubscriber.Bus.FORGE
)
public class VanguardArmorHandler {

    private static final Logger LOGGER = LogUtils.getLogger();

    @SubscribeEvent
    public static void onLivingHurt(LivingHurtEvent event) {

        if (!(event.getSource().getEntity() instanceof Player player)) {
            return;
        }

        // Must be using a polearm
        ItemStack weapon = player.getMainHandItem();
        if (!weapon.is(ModItemTags.POLEARMS)) {
            return;
        }

        float totalBonus = 0.0F;

        for (EquipmentSlot slot : EquipmentSlot.values()) {
            if (!slot.isArmor()) continue;

            ItemStack armorStack = player.getItemBySlot(slot);

            if (armorStack.getItem() instanceof VanguardArmorItem armor) {
                float pieceBonus = getBonusForMaterial(armor.getMaterial());
                totalBonus += pieceBonus;
            }
        }

        if (totalBonus <= 0.0F) {
            return;
        }

        float original = event.getAmount();
        float modified = original * (1.0F + totalBonus);

        LOGGER.debug("Vanguard bonus applied: original={}, bonus={}, final={}",
                original, totalBonus, modified);

        event.setAmount(modified);
    }

    private static float getBonusForMaterial(ArmorMaterial material) {

        if (material == VanguardArmorMaterials.IRON) {
            return Config.VANGUARD_IRON_BONUS.get().floatValue();
        }

        if (material == VanguardArmorMaterials.DIAMOND) {
            return Config.VANGUARD_DIAMOND_BONUS.get().floatValue();
        }

        if (material == VanguardArmorMaterials.NETHERITE) {
            return Config.VANGUARD_NETHERITE_BONUS.get().floatValue();
        }

        return 0.0F;
    }
}