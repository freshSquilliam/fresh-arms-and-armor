package com.freshsquilliam.fresharmsandarmor.item.barbarian;

import com.freshsquilliam.fresharmsandarmor.Config;
import com.freshsquilliam.fresharmsandarmor.FreshArmsAndArmor;
import com.freshsquilliam.fresharmsandarmor.item.ModItemTags;
import com.mojang.logging.LogUtils;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraftforge.event.entity.living.LivingHurtEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import org.slf4j.Logger;

@Mod.EventBusSubscriber(
        modid = FreshArmsAndArmor.MODID,
        bus = Mod.EventBusSubscriber.Bus.FORGE
)
public class BarbarianArmorHandler {

    private static final Logger LOGGER = LogUtils.getLogger();

    @SubscribeEvent
    public static void onLivingHurt(LivingHurtEvent event) {

        if (!(event.getSource().getEntity() instanceof Player player)) {
            return;
        }

        // Must be using a two-handed weapon
        ItemStack weapon = player.getMainHandItem();
        if (!weapon.is(ModItemTags.TWO_HANDED)) {
            return;
        }

        float totalBonus = 0.0F;

        for (EquipmentSlot slot : EquipmentSlot.values()) {
            if (!slot.isArmor()) continue;

            ItemStack armorStack = player.getItemBySlot(slot);

            if (armorStack.getItem() instanceof BarbarianArmorItem armor) {
                float pieceBonus = getBonusForMaterial(armor.getMaterial());
                totalBonus += pieceBonus;
            }
        }

        if (totalBonus <= 0.0F) {
            return;
        }

        float original = event.getAmount();
        float modified = original * (1.0F + totalBonus);

        LOGGER.debug("Barbarian bonus applied: original={}, bonus={}, final={}",
                original, totalBonus, modified);

        event.setAmount(modified);
    }

    private static float getBonusForMaterial(ArmorMaterial material) {

        if (material == BarbArmorMaterials.IRON) {
            return Config.BARB_IRON_BONUS.get().floatValue();
        }

        if (material == BarbArmorMaterials.DIAMOND) {
            return Config.BARB_DIAMOND_BONUS.get().floatValue();
        }

        if (material == BarbArmorMaterials.NETHERITE) {
            return Config.BARB_NETHERITE_BONUS.get().floatValue();
        }

        return 0.0F;
    }
}