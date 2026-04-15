package com.freshsquilliam.fresharmsandarmor.item.archer;

import com.freshsquilliam.fresharmsandarmor.FreshArmsAndArmor;
import com.freshsquilliam.fresharmsandarmor.item.archer.ArcherArmorMaterials;
import com.freshsquilliam.fresharmsandarmor.item.archer.ArcherArmorItem;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.Item;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ArcherArmorRegistry {

    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, FreshArmsAndArmor.MODID);

    // ===== IRON =====

    public static final RegistryObject<Item> IRON_ARCHER_HELMET = ITEMS.register(
            "iron_archer_helmet",
            () -> new ArcherArmorItem(ArcherArmorMaterials.IRON, ArmorItem.Type.HELMET, new Item.Properties())
    );

    public static final RegistryObject<Item> IRON_ARCHER_CHESTPLATE = ITEMS.register(
            "iron_archer_chestplate",
            () -> new ArcherArmorItem(ArcherArmorMaterials.IRON, ArmorItem.Type.CHESTPLATE, new Item.Properties())
    );

    public static final RegistryObject<Item> IRON_ARCHER_LEGGINGS = ITEMS.register(
            "iron_archer_leggings",
            () -> new ArcherArmorItem(ArcherArmorMaterials.IRON, ArmorItem.Type.LEGGINGS, new Item.Properties())
    );

    public static final RegistryObject<Item> IRON_ARCHER_BOOTS = ITEMS.register(
            "iron_archer_boots",
            () -> new ArcherArmorItem(ArcherArmorMaterials.IRON, ArmorItem.Type.BOOTS, new Item.Properties())
    );

    // ===== DIAMOND =====

    public static final RegistryObject<Item> DIAMOND_ARCHER_HELMET = ITEMS.register(
            "diamond_archer_helmet",
            () -> new ArcherArmorItem(ArcherArmorMaterials.DIAMOND, ArmorItem.Type.HELMET, new Item.Properties())
    );

    public static final RegistryObject<Item> DIAMOND_ARCHER_CHESTPLATE = ITEMS.register(
            "diamond_archer_chestplate",
            () -> new ArcherArmorItem(ArcherArmorMaterials.DIAMOND, ArmorItem.Type.CHESTPLATE, new Item.Properties())
    );

    public static final RegistryObject<Item> DIAMOND_ARCHER_LEGGINGS = ITEMS.register(
            "diamond_archer_leggings",
            () -> new ArcherArmorItem(ArcherArmorMaterials.DIAMOND, ArmorItem.Type.LEGGINGS, new Item.Properties())
    );

    public static final RegistryObject<Item> DIAMOND_ARCHER_BOOTS = ITEMS.register(
            "diamond_archer_boots",
            () -> new ArcherArmorItem(ArcherArmorMaterials.DIAMOND, ArmorItem.Type.BOOTS, new Item.Properties())
    );

    // ===== NETHERITE =====

    public static final RegistryObject<Item> NETHERITE_ARCHER_HELMET = ITEMS.register(
            "netherite_archer_helmet",
            () -> new ArcherArmorItem(
                    ArcherArmorMaterials.NETHERITE,
                    ArmorItem.Type.HELMET,
                    new Item.Properties().fireResistant()
            )
    );

    public static final RegistryObject<Item> NETHERITE_ARCHER_CHESTPLATE = ITEMS.register(
            "netherite_archer_chestplate",
            () -> new ArcherArmorItem(
                    ArcherArmorMaterials.NETHERITE,
                    ArmorItem.Type.CHESTPLATE,
                    new Item.Properties().fireResistant()
            )
    );

    public static final RegistryObject<Item> NETHERITE_ARCHER_LEGGINGS = ITEMS.register(
            "netherite_archer_leggings",
            () -> new ArcherArmorItem(
                    ArcherArmorMaterials.NETHERITE,
                    ArmorItem.Type.LEGGINGS,
                    new Item.Properties().fireResistant()
            )
    );

    public static final RegistryObject<Item> NETHERITE_ARCHER_BOOTS = ITEMS.register(
            "netherite_archer_boots",
            () -> new ArcherArmorItem(
                    ArcherArmorMaterials.NETHERITE,
                    ArmorItem.Type.BOOTS,
                    new Item.Properties().fireResistant()
            )
    );
}
