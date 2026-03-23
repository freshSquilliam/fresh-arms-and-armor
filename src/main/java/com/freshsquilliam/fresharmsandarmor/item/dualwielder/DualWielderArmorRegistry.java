package com.freshsquilliam.fresharmsandarmor.item.dualwielder;

import com.freshsquilliam.fresharmsandarmor.FreshArmsAndArmor;
import com.freshsquilliam.fresharmsandarmor.item.dualwielder.DualWielderArmorMaterials;
import com.freshsquilliam.fresharmsandarmor.item.dualwielder.DualWielderArmorItem;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.Item;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class DualWielderArmorRegistry {

    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, FreshArmsAndArmor.MODID);

    // ===== IRON =====

    public static final RegistryObject<Item> IRON_DUALWIELDER_HELMET = ITEMS.register(
            "iron_dualwielder_helmet",
            () -> new DualWielderArmorItem(DualWielderArmorMaterials.IRON, ArmorItem.Type.HELMET, new Item.Properties())
    );

    public static final RegistryObject<Item> IRON_DUALWIELDER_CHESTPLATE = ITEMS.register(
            "iron_dualwielder_chestplate",
            () -> new DualWielderArmorItem(DualWielderArmorMaterials.IRON, ArmorItem.Type.CHESTPLATE, new Item.Properties())
    );

    public static final RegistryObject<Item> IRON_DUALWIELDER_LEGGINGS = ITEMS.register(
            "iron_dualwielder_leggings",
            () -> new DualWielderArmorItem(DualWielderArmorMaterials.IRON, ArmorItem.Type.LEGGINGS, new Item.Properties())
    );

    public static final RegistryObject<Item> IRON_DUALWIELDER_BOOTS = ITEMS.register(
            "iron_dualwielder_boots",
            () -> new DualWielderArmorItem(DualWielderArmorMaterials.IRON, ArmorItem.Type.BOOTS, new Item.Properties())
    );

    // ===== DIAMOND =====

    public static final RegistryObject<Item> DIAMOND_DUALWIELDER_HELMET = ITEMS.register(
            "diamond_dualwielder_helmet",
            () -> new DualWielderArmorItem(DualWielderArmorMaterials.DIAMOND, ArmorItem.Type.HELMET, new Item.Properties())
    );

    public static final RegistryObject<Item> DIAMOND_DUALWIELDER_CHESTPLATE = ITEMS.register(
            "diamond_dualwielder_chestplate",
            () -> new DualWielderArmorItem(DualWielderArmorMaterials.DIAMOND, ArmorItem.Type.CHESTPLATE, new Item.Properties())
    );

    public static final RegistryObject<Item> DIAMOND_DUALWIELDER_LEGGINGS = ITEMS.register(
            "diamond_dualwielder_leggings",
            () -> new DualWielderArmorItem(DualWielderArmorMaterials.DIAMOND, ArmorItem.Type.LEGGINGS, new Item.Properties())
    );

    public static final RegistryObject<Item> DIAMOND_DUALWIELDER_BOOTS = ITEMS.register(
            "diamond_dualwielder_boots",
            () -> new DualWielderArmorItem(DualWielderArmorMaterials.DIAMOND, ArmorItem.Type.BOOTS, new Item.Properties())
    );

    // ===== NETHERITE =====

    public static final RegistryObject<Item> NETHERITE_DUALWIELDER_HELMET = ITEMS.register(
            "netherite_dualwielder_helmet",
            () -> new DualWielderArmorItem(
                    DualWielderArmorMaterials.NETHERITE,
                    ArmorItem.Type.HELMET,
                    new Item.Properties().fireResistant()
            )
    );

    public static final RegistryObject<Item> NETHERITE_DUALWIELDER_CHESTPLATE = ITEMS.register(
            "netherite_dualwielder_chestplate",
            () -> new DualWielderArmorItem(
                    DualWielderArmorMaterials.NETHERITE,
                    ArmorItem.Type.CHESTPLATE,
                    new Item.Properties().fireResistant()
            )
    );

    public static final RegistryObject<Item> NETHERITE_DUALWIELDER_LEGGINGS = ITEMS.register(
            "netherite_dualwielder_leggings",
            () -> new DualWielderArmorItem(
                    DualWielderArmorMaterials.NETHERITE,
                    ArmorItem.Type.LEGGINGS,
                    new Item.Properties().fireResistant()
            )
    );

    public static final RegistryObject<Item> NETHERITE_DUALWIELDER_BOOTS = ITEMS.register(
            "netherite_dualwielder_boots",
            () -> new DualWielderArmorItem(
                    DualWielderArmorMaterials.NETHERITE,
                    ArmorItem.Type.BOOTS,
                    new Item.Properties().fireResistant()
            )
    );
}
