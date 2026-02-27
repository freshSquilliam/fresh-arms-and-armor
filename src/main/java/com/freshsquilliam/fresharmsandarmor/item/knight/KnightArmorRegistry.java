package com.freshsquilliam.fresharmsandarmor.item.knight;

import com.freshsquilliam.fresharmsandarmor.FreshArmsAndArmor;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.Item;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class KnightArmorRegistry {

    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, FreshArmsAndArmor.MODID);

    // ===== IRON =====

    public static final RegistryObject<Item> IRON_KNIGHT_HELMET = ITEMS.register(
            "iron_knight_helmet",
            () -> new KnightArmorItem(KnightArmorMaterials.IRON, ArmorItem.Type.HELMET, new Item.Properties())
    );

    public static final RegistryObject<Item> IRON_KNIGHT_CHESTPLATE = ITEMS.register(
            "iron_knight_chestplate",
            () -> new KnightArmorItem(KnightArmorMaterials.IRON, ArmorItem.Type.CHESTPLATE, new Item.Properties())
    );

    public static final RegistryObject<Item> IRON_KNIGHT_LEGGINGS = ITEMS.register(
            "iron_knight_leggings",
            () -> new KnightArmorItem(KnightArmorMaterials.IRON, ArmorItem.Type.LEGGINGS, new Item.Properties())
    );

    public static final RegistryObject<Item> IRON_KNIGHT_BOOTS = ITEMS.register(
            "iron_knight_boots",
            () -> new KnightArmorItem(KnightArmorMaterials.IRON, ArmorItem.Type.BOOTS, new Item.Properties())
    );

    // ===== DIAMOND =====

    public static final RegistryObject<Item> DIAMOND_KNIGHT_HELMET = ITEMS.register(
            "diamond_knight_helmet",
            () -> new KnightArmorItem(KnightArmorMaterials.DIAMOND, ArmorItem.Type.HELMET, new Item.Properties())
    );

    public static final RegistryObject<Item> DIAMOND_KNIGHT_CHESTPLATE = ITEMS.register(
            "diamond_knight_chestplate",
            () -> new KnightArmorItem(KnightArmorMaterials.DIAMOND, ArmorItem.Type.CHESTPLATE, new Item.Properties())
    );

    public static final RegistryObject<Item> DIAMOND_KNIGHT_LEGGINGS = ITEMS.register(
            "diamond_knight_leggings",
            () -> new KnightArmorItem(KnightArmorMaterials.DIAMOND, ArmorItem.Type.LEGGINGS, new Item.Properties())
    );

    public static final RegistryObject<Item> DIAMOND_KNIGHT_BOOTS = ITEMS.register(
            "diamond_knight_boots",
            () -> new KnightArmorItem(KnightArmorMaterials.DIAMOND, ArmorItem.Type.BOOTS, new Item.Properties())
    );

    // ===== NETHERITE =====

    public static final RegistryObject<Item> NETHERITE_KNIGHT_HELMET = ITEMS.register(
            "netherite_knight_helmet",
            () -> new KnightArmorItem(
                    KnightArmorMaterials.NETHERITE,
                    ArmorItem.Type.HELMET,
                    new Item.Properties().fireResistant()
            )
    );

    public static final RegistryObject<Item> NETHERITE_KNIGHT_CHESTPLATE = ITEMS.register(
            "netherite_knight_chestplate",
            () -> new KnightArmorItem(
                    KnightArmorMaterials.NETHERITE,
                    ArmorItem.Type.CHESTPLATE,
                    new Item.Properties().fireResistant()
            )
    );

    public static final RegistryObject<Item> NETHERITE_KNIGHT_LEGGINGS = ITEMS.register(
            "netherite_knight_leggings",
            () -> new KnightArmorItem(
                    KnightArmorMaterials.NETHERITE,
                    ArmorItem.Type.LEGGINGS,
                    new Item.Properties().fireResistant()
            )
    );

    public static final RegistryObject<Item> NETHERITE_KNIGHT_BOOTS = ITEMS.register(
            "netherite_knight_boots",
            () -> new KnightArmorItem(
                    KnightArmorMaterials.NETHERITE,
                    ArmorItem.Type.BOOTS,
                    new Item.Properties().fireResistant()
            )
    );
}
