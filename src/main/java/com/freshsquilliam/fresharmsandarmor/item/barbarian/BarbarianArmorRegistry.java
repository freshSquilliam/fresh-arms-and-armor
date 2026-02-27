package com.freshsquilliam.fresharmsandarmor.item.barbarian;

import com.freshsquilliam.fresharmsandarmor.FreshArmsAndArmor;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.Item;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class BarbarianArmorRegistry {

    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, FreshArmsAndArmor.MODID);

    // ===== IRON =====

    public static final RegistryObject<Item> IRON_BARBARIAN_HELMET = ITEMS.register(
            "iron_barbarian_helmet",
            () -> new BarbarianArmorItem(BarbArmorMaterials.IRON, ArmorItem.Type.HELMET, new Item.Properties())
    );

    public static final RegistryObject<Item> IRON_BARBARIAN_CHESTPLATE = ITEMS.register(
            "iron_barbarian_chestplate",
            () -> new BarbarianArmorItem(BarbArmorMaterials.IRON, ArmorItem.Type.CHESTPLATE, new Item.Properties())
    );

    public static final RegistryObject<Item> IRON_BARBARIAN_LEGGINGS = ITEMS.register(
            "iron_barbarian_leggings",
            () -> new BarbarianArmorItem(BarbArmorMaterials.IRON, ArmorItem.Type.LEGGINGS, new Item.Properties())
    );

    public static final RegistryObject<Item> IRON_BARBARIAN_BOOTS = ITEMS.register(
            "iron_barbarian_boots",
            () -> new BarbarianArmorItem(BarbArmorMaterials.IRON, ArmorItem.Type.BOOTS, new Item.Properties())
    );

    // ===== DIAMOND =====

    public static final RegistryObject<Item> DIAMOND_BARBARIAN_HELMET = ITEMS.register(
            "diamond_barbarian_helmet",
            () -> new BarbarianArmorItem(BarbArmorMaterials.DIAMOND, ArmorItem.Type.HELMET, new Item.Properties())
    );

    public static final RegistryObject<Item> DIAMOND_BARBARIAN_CHESTPLATE = ITEMS.register(
            "diamond_barbarian_chestplate",
            () -> new BarbarianArmorItem(BarbArmorMaterials.DIAMOND, ArmorItem.Type.CHESTPLATE, new Item.Properties())
    );

    public static final RegistryObject<Item> DIAMOND_BARBARIAN_LEGGINGS = ITEMS.register(
            "diamond_barbarian_leggings",
            () -> new BarbarianArmorItem(BarbArmorMaterials.DIAMOND, ArmorItem.Type.LEGGINGS, new Item.Properties())
    );

    public static final RegistryObject<Item> DIAMOND_BARBARIAN_BOOTS = ITEMS.register(
            "diamond_barbarian_boots",
            () -> new BarbarianArmorItem(BarbArmorMaterials.DIAMOND, ArmorItem.Type.BOOTS, new Item.Properties())
    );

    // ===== NETHERITE =====

    public static final RegistryObject<Item> NETHERITE_BARBARIAN_HELMET = ITEMS.register(
            "netherite_barbarian_helmet",
            () -> new BarbarianArmorItem(
                    BarbArmorMaterials.NETHERITE,
                    ArmorItem.Type.HELMET,
                    new Item.Properties().fireResistant()
            )
    );

    public static final RegistryObject<Item> NETHERITE_BARBARIAN_CHESTPLATE = ITEMS.register(
            "netherite_barbarian_chestplate",
            () -> new BarbarianArmorItem(
                    BarbArmorMaterials.NETHERITE,
                    ArmorItem.Type.CHESTPLATE,
                    new Item.Properties().fireResistant()
            )
    );

    public static final RegistryObject<Item> NETHERITE_BARBARIAN_LEGGINGS = ITEMS.register(
            "netherite_barbarian_leggings",
            () -> new BarbarianArmorItem(
                    BarbArmorMaterials.NETHERITE,
                    ArmorItem.Type.LEGGINGS,
                    new Item.Properties().fireResistant()
            )
    );

    public static final RegistryObject<Item> NETHERITE_BARBARIAN_BOOTS = ITEMS.register(
            "netherite_barbarian_boots",
            () -> new BarbarianArmorItem(
                    BarbArmorMaterials.NETHERITE,
                    ArmorItem.Type.BOOTS,
                    new Item.Properties().fireResistant()
            )
    );
}
