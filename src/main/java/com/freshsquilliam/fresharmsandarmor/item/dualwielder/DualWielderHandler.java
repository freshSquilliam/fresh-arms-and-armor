package com.freshsquilliam.fresharmsandarmor.item.dualwielder;

import com.freshsquilliam.fresharmsandarmor.Config;
import com.freshsquilliam.fresharmsandarmor.FreshArmsAndArmor;
import com.freshsquilliam.fresharmsandarmor.item.dualwielder.DualWielderArmorItem;
import com.freshsquilliam.fresharmsandarmor.item.dualwielder.DualWielderArmorMaterials;
import com.mojang.logging.LogUtils;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.ai.attributes.AttributeInstance;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.ai.attributes.AttributeModifier;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.event.TickEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import org.slf4j.Logger;

import java.util.UUID;

@Mod.EventBusSubscriber(
        modid = FreshArmsAndArmor.MODID,
        bus = Mod.EventBusSubscriber.Bus.FORGE
)
public class DualWielderHandler {

    private static final Logger LOGGER = LogUtils.getLogger();

    private static final UUID SPEED_MODIFIER_UUID = UUID.fromString("7d2c3e5b-6f2a-4c1a-9b1d-123456789abc");

    @SubscribeEvent
    public static void onPlayerTick(TickEvent.PlayerTickEvent event) {

        if (event.phase != TickEvent.Phase.END) return;

        Player player = event.player;

        float totalBonus = 0.0F;

        for (EquipmentSlot slot : EquipmentSlot.values()) {
            if (!slot.isArmor()) continue;

            ItemStack armorStack = player.getItemBySlot(slot);

            if (armorStack.getItem() instanceof DualWielderArmorItem armor) {
                float pieceBonus = getBonusForMaterial(armor.getMaterial());
                totalBonus += pieceBonus;
            }
        }

        AttributeInstance attackSpeed = player.getAttribute(Attributes.ATTACK_SPEED);
        if (attackSpeed == null) return;

        AttributeModifier existing = attackSpeed.getModifier(SPEED_MODIFIER_UUID);
        if (existing != null) {
            attackSpeed.removeModifier(existing);
        }

        if (totalBonus > 0.0F) {

            AttributeModifier modifier = new AttributeModifier(
                    SPEED_MODIFIER_UUID,
                    "Dual Wielder speed bonus",
                    totalBonus,
                    AttributeModifier.Operation.MULTIPLY_TOTAL
            );

            attackSpeed.addTransientModifier(modifier);

            LOGGER.debug("Dual Wielder speed bonus applied: {}", totalBonus);
        }
    }

    private static float getBonusForMaterial(ArmorMaterial material) {

        if (material == DualWielderArmorMaterials.IRON) {
            return Config.DUAL_IRON_SPEED.get().floatValue();
        }

        if (material == DualWielderArmorMaterials.DIAMOND) {
            return Config.DUAL_DIAMOND_SPEED.get().floatValue();
        }

        if (material == DualWielderArmorMaterials.NETHERITE) {
            return Config.DUAL_NETHERITE_SPEED.get().floatValue();
        }

        return 0.0F;
    }
}