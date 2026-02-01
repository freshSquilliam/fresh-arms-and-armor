package com.freshsquilliam.fresharmsandarmor.item.armor;

import net.minecraft.ChatFormatting;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.Level;

import java.util.List;

public class BarbarianArmor extends ArmorItem {

    private final BarbarianTier tier;

    public BarbarianArmor(
            ArmorMaterial material,
            Type type,
            BarbarianTier tier,
            Item.Properties properties
    ) {
        super(material, type, properties);
        this.tier = tier;
    }

    public BarbarianTier getTier() {
        return tier;
    }

    @Override
    public void appendHoverText(
            ItemStack stack,
            Level level,
            List<Component> tooltip,
            TooltipFlag flag
    ) {
        tooltip.add(
                Component.literal(tier.getTooltip())
                        .withStyle(ChatFormatting.RED)
        );
    }
}
