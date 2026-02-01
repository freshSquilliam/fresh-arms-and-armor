package com.freshsquilliam.fresharmsandarmor.item.armor;

import com.freshsquilliam.fresharmsandarmor.FreshArmsAndArmor;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.Ingredient;
import org.jetbrains.annotations.NotNull;

public enum ModArmorMaterials implements ArmorMaterial {

    BARBARIAN_IRON(
            "barbarian_iron",
            15,
            new int[]{2, 5, 4, 1}, // 12 total
            10,
            SoundEvents.ARMOR_EQUIP_IRON,
            0.0F,
            0.0F,
            Ingredient.of(Items.IRON_INGOT)
    ),

    BARBARIAN_DIAMOND(
            "barbarian_diamond",
            33,
            new int[]{3, 6, 4, 1}, // 14 total
            10,
            SoundEvents.ARMOR_EQUIP_DIAMOND,
            1.0F,
            0.0F,
            Ingredient.of(Items.DIAMOND)
    ),

    BARBARIAN_NETHERITE(
            "barbarian_netherite",
            37,
            new int[]{3, 6, 4, 1}, // 14 total
            15,
            SoundEvents.ARMOR_EQUIP_NETHERITE,
            2.0F,
            0.1F,
            Ingredient.of(Items.NETHERITE_INGOT)
    );

    private static final int[] DURABILITY_PER_TYPE = {13, 15, 16, 11};

    private final String name;
    private final int durabilityMultiplier;
    private final int[] defense;
    private final int enchantmentValue;
    private final SoundEvent equipSound;
    private final float toughness;
    private final float knockbackResistance;
    private final Ingredient repairIngredient;

    ModArmorMaterials(
            String name,
            int durabilityMultiplier,
            int[] defense,
            int enchantmentValue,
            SoundEvent equipSound,
            float toughness,
            float knockbackResistance,
            Ingredient repairIngredient
    ) {
        this.name = name;
        this.durabilityMultiplier = durabilityMultiplier;
        this.defense = defense;
        this.enchantmentValue = enchantmentValue;
        this.equipSound = equipSound;
        this.toughness = toughness;
        this.knockbackResistance = knockbackResistance;
        this.repairIngredient = repairIngredient;
    }

    @Override
    public int getDurabilityForType(ArmorItem.Type type) {
        return DURABILITY_PER_TYPE[type.ordinal()] * durabilityMultiplier;
    }

    @Override
    public int getDefenseForType(ArmorItem.Type type) {
        return defense[type.ordinal()];
    }

    @Override
    public int getEnchantmentValue() {
        return enchantmentValue;
    }

    @Override
    public @NotNull SoundEvent getEquipSound() {
        return equipSound;
    }

    @Override
    public @NotNull Ingredient getRepairIngredient() {
        return repairIngredient;
    }

    /**
     * IMPORTANT:
     * Must return a fully-qualified resource location in modern Forge.
     * This controls the worn armor texture lookup.
     */
    @Override
    public String getName() {
        return FreshArmsAndArmor.MODID + ":" + this.name;
    }

    @Override
    public float getToughness() {
        return toughness;
    }

    @Override
    public float getKnockbackResistance() {
        return knockbackResistance;
    }
}
