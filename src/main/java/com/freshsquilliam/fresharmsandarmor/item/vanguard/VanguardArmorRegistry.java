package com.freshsquilliam.fresharmsandarmor.item.vanguard;

import com.freshsquilliam.fresharmsandarmor.FreshArmsAndArmor;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.Item;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class VanguardArmorRegistry {

    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, FreshArmsAndArmor.MODID);

    // ===== IRON =====

    public static final RegistryObject<Item> IRON_VANGUARD_HELMET = ITEMS.register(
            "iron_vanguard_helmet",
            () -> new VanguardArmorItem(VanguardArmorMaterials.IRON, ArmorItem.Type.HELMET, new Item.Properties())
    );

    public static final RegistryObject<Item> IRON_VANGUARD_CHESTPLATE = ITEMS.register(
            "iron_vanguard_chestplate",
            () -> new VanguardArmorItem(VanguardArmorMaterials.IRON, ArmorItem.Type.CHESTPLATE, new Item.Properties())
    );

    public static final RegistryObject<Item> IRON_VANGUARD_LEGGINGS = ITEMS.register(
            "iron_vanguard_leggings",
            () -> new VanguardArmorItem(VanguardArmorMaterials.IRON, ArmorItem.Type.LEGGINGS, new Item.Properties())
    );

    public static final RegistryObject<Item> IRON_VANGUARD_BOOTS = ITEMS.register(
            "iron_vanguard_boots",
            () -> new VanguardArmorItem(VanguardArmorMaterials.IRON, ArmorItem.Type.BOOTS, new Item.Properties())
    );

    // ===== DIAMOND =====

    public static final RegistryObject<Item> DIAMOND_VANGUARD_HELMET = ITEMS.register(
            "diamond_vanguard_helmet",
            () -> new VanguardArmorItem(VanguardArmorMaterials.DIAMOND, ArmorItem.Type.HELMET, new Item.Properties())
    );

    public static final RegistryObject<Item> DIAMOND_VANGUARD_CHESTPLATE = ITEMS.register(
            "diamond_vanguard_chestplate",
            () -> new VanguardArmorItem(VanguardArmorMaterials.DIAMOND, ArmorItem.Type.CHESTPLATE, new Item.Properties())
    );

    public static final RegistryObject<Item> DIAMOND_VANGUARD_LEGGINGS = ITEMS.register(
            "diamond_vanguard_leggings",
            () -> new VanguardArmorItem(VanguardArmorMaterials.DIAMOND, ArmorItem.Type.LEGGINGS, new Item.Properties())
    );

    public static final RegistryObject<Item> DIAMOND_VANGUARD_BOOTS = ITEMS.register(
            "diamond_vanguard_boots",
            () -> new VanguardArmorItem(VanguardArmorMaterials.DIAMOND, ArmorItem.Type.BOOTS, new Item.Properties())
    );

    // ===== NETHERITE =====

    public static final RegistryObject<Item> NETHERITE_VANGUARD_HELMET = ITEMS.register(
            "netherite_vanguard_helmet",
            () -> new VanguardArmorItem(
                    VanguardArmorMaterials.NETHERITE,
                    ArmorItem.Type.HELMET,
                    new Item.Properties().fireResistant()
            )
    );

    public static final RegistryObject<Item> NETHERITE_VANGUARD_CHESTPLATE = ITEMS.register(
            "netherite_vanguard_chestplate",
            () -> new VanguardArmorItem(
                    VanguardArmorMaterials.NETHERITE,
                    ArmorItem.Type.CHESTPLATE,
                    new Item.Properties().fireResistant()
            )
    );

    public static final RegistryObject<Item> NETHERITE_VANGUARD_LEGGINGS = ITEMS.register(
            "netherite_vanguard_leggings",
            () -> new VanguardArmorItem(
                    VanguardArmorMaterials.NETHERITE,
                    ArmorItem.Type.LEGGINGS,
                    new Item.Properties().fireResistant()
            )
    );

    public static final RegistryObject<Item> NETHERITE_VANGUARD_BOOTS = ITEMS.register(
            "netherite_vanguard_boots",
            () -> new VanguardArmorItem(
                    VanguardArmorMaterials.NETHERITE,
                    ArmorItem.Type.BOOTS,
                    new Item.Properties().fireResistant()
            )
    );
}
