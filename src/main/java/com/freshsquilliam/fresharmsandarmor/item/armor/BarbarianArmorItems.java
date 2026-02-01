package com.freshsquilliam.fresharmsandarmor.item.armor;

import com.freshsquilliam.fresharmsandarmor.FreshArmsAndArmor;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.Item;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class BarbarianArmorItems {

    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, FreshArmsAndArmor.MODID);

    /* =========================
       IRON BARBARIAN ARMOR
       ========================= */

    public static final RegistryObject<Item> IRON_BARBARIAN_HELMET =
            ITEMS.register("iron_barbarian_helmet",
                    () -> new BarbarianArmor(
                            ModArmorMaterials.BARBARIAN_IRON,
                            ArmorItem.Type.HELMET,
                            BarbarianTier.IRON,
                            new Item.Properties()
                    ));

    public static final RegistryObject<Item> IRON_BARBARIAN_CHESTPLATE =
            ITEMS.register("iron_barbarian_chestplate",
                    () -> new BarbarianArmor(
                            ModArmorMaterials.BARBARIAN_IRON,
                            ArmorItem.Type.CHESTPLATE,
                            BarbarianTier.IRON,
                            new Item.Properties()
                    ));

    public static final RegistryObject<Item> IRON_BARBARIAN_LEGGINGS =
            ITEMS.register("iron_barbarian_leggings",
                    () -> new BarbarianArmor(
                            ModArmorMaterials.BARBARIAN_IRON,
                            ArmorItem.Type.LEGGINGS,
                            BarbarianTier.IRON,
                            new Item.Properties()
                    ));

    public static final RegistryObject<Item> IRON_BARBARIAN_BOOTS =
            ITEMS.register("iron_barbarian_boots",
                    () -> new BarbarianArmor(
                            ModArmorMaterials.BARBARIAN_IRON,
                            ArmorItem.Type.BOOTS,
                            BarbarianTier.IRON,
                            new Item.Properties()
                    ));

    /* =========================
       DIAMOND BARBARIAN ARMOR
       ========================= */

    public static final RegistryObject<Item> DIAMOND_BARBARIAN_HELMET =
            ITEMS.register("diamond_barbarian_helmet",
                    () -> new BarbarianArmor(
                            ModArmorMaterials.BARBARIAN_DIAMOND,
                            ArmorItem.Type.HELMET,
                            BarbarianTier.DIAMOND,
                            new Item.Properties()
                    ));

    public static final RegistryObject<Item> DIAMOND_BARBARIAN_CHESTPLATE =
            ITEMS.register("diamond_barbarian_chestplate",
                    () -> new BarbarianArmor(
                            ModArmorMaterials.BARBARIAN_DIAMOND,
                            ArmorItem.Type.CHESTPLATE,
                            BarbarianTier.DIAMOND,
                            new Item.Properties()
                    ));

    public static final RegistryObject<Item> DIAMOND_BARBARIAN_LEGGINGS =
            ITEMS.register("diamond_barbarian_leggings",
                    () -> new BarbarianArmor(
                            ModArmorMaterials.BARBARIAN_DIAMOND,
                            ArmorItem.Type.LEGGINGS,
                            BarbarianTier.DIAMOND,
                            new Item.Properties()
                    ));

    public static final RegistryObject<Item> DIAMOND_BARBARIAN_BOOTS =
            ITEMS.register("diamond_barbarian_boots",
                    () -> new BarbarianArmor(
                            ModArmorMaterials.BARBARIAN_DIAMOND,
                            ArmorItem.Type.BOOTS,
                            BarbarianTier.DIAMOND,
                            new Item.Properties()
                    ));

    /* =========================
       NETHERITE BARBARIAN ARMOR
       ========================= */

    public static final RegistryObject<Item> NETHERITE_BARBARIAN_HELMET =
            ITEMS.register("netherite_barbarian_helmet",
                    () -> new BarbarianArmor(
                            ModArmorMaterials.BARBARIAN_NETHERITE,
                            ArmorItem.Type.HELMET,
                            BarbarianTier.NETHERITE,
                            new Item.Properties().fireResistant()
                    ));

    public static final RegistryObject<Item> NETHERITE_BARBARIAN_CHESTPLATE =
            ITEMS.register("netherite_barbarian_chestplate",
                    () -> new BarbarianArmor(
                            ModArmorMaterials.BARBARIAN_NETHERITE,
                            ArmorItem.Type.CHESTPLATE,
                            BarbarianTier.NETHERITE,
                            new Item.Properties().fireResistant()
                    ));

    public static final RegistryObject<Item> NETHERITE_BARBARIAN_LEGGINGS =
            ITEMS.register("netherite_barbarian_leggings",
                    () -> new BarbarianArmor(
                            ModArmorMaterials.BARBARIAN_NETHERITE,
                            ArmorItem.Type.LEGGINGS,
                            BarbarianTier.NETHERITE,
                            new Item.Properties().fireResistant()
                    ));

    public static final RegistryObject<Item> NETHERITE_BARBARIAN_BOOTS =
            ITEMS.register("netherite_barbarian_boots",
                    () -> new BarbarianArmor(
                            ModArmorMaterials.BARBARIAN_NETHERITE,
                            ArmorItem.Type.BOOTS,
                            BarbarianTier.NETHERITE,
                            new Item.Properties().fireResistant()
                    ));
}
