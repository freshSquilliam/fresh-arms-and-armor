package com.freshsquilliam.fresharmsandarmor.item;

import com.google.common.collect.ImmutableMultimap;
import com.google.common.collect.Multimap;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.ai.attributes.Attribute;
import net.minecraft.world.entity.ai.attributes.AttributeModifier;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.Tier;
import net.minecraftforge.common.ForgeMod;

import java.util.UUID;

public class GreatswordItem extends SwordItem {

    private static final UUID REACH_UUID =
            UUID.fromString("3f1a0f40-6db2-4c3e-8b62-0a6f10b5c001");


    public GreatswordItem(Tier tier, int damage, float speed, Properties properties) {
        super(tier, damage, speed, properties);

    }

    @Override
    public Multimap<Attribute, AttributeModifier> getDefaultAttributeModifiers(EquipmentSlot slot) {
        if (slot != EquipmentSlot.MAINHAND) {
            return super.getDefaultAttributeModifiers(slot);
        }

        ImmutableMultimap.Builder<Attribute, AttributeModifier> builder =
                ImmutableMultimap.builder();

        builder.putAll(super.getDefaultAttributeModifiers(slot));

        return builder.build();
    }
}
