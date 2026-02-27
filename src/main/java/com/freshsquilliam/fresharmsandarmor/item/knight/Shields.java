package com.freshsquilliam.fresharmsandarmor.item.knight;

import com.google.common.collect.ImmutableMultimap;
import com.google.common.collect.Multimap;
import net.minecraft.ChatFormatting;
import net.minecraft.network.chat.Component;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.ai.attributes.Attribute;
import net.minecraft.world.entity.ai.attributes.AttributeModifier;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.ShieldItem;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.Level;

import java.util.List;
import java.util.UUID;

public class Shields extends ShieldItem {

    private static final UUID ARMOR_UUID =
            UUID.fromString("a3c9c7e6-4f8b-4c2e-9b7a-8b6e1a64c3aa");

    private final int armorValue;
    private final Multimap<Attribute, AttributeModifier> armorModifiers;

    public Shields(int armorValue, Item.Properties properties) {
        super(properties);
        this.armorValue = armorValue;

        this.armorModifiers = ImmutableMultimap.of(
                Attributes.ARMOR,
                new AttributeModifier(
                        ARMOR_UUID,
                        "Shield armor bonus",
                        armorValue,
                        AttributeModifier.Operation.ADDITION
                )
        );
    }

    @Override
    public Multimap<Attribute, AttributeModifier> getAttributeModifiers(
            EquipmentSlot slot,
            ItemStack stack
    ) {
        return slot == EquipmentSlot.OFFHAND
                ? armorModifiers
                : super.getAttributeModifiers(slot, stack);
    }

    @Override
    public void appendHoverText(
            ItemStack stack,
            Level level,
            List<Component> tooltip,
            TooltipFlag flag
    ) {
        tooltip.add(
                Component.literal("+" + armorValue + " Armor while held")
                        .withStyle(ChatFormatting.BLUE)
        );
    }
}