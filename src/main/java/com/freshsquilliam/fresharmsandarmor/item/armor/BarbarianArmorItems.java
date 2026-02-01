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

    public static final RegistryObject<Item> BARBARIAN_HELMET =
            ITEMS.register("barbarian_helmet",
                    () -> new BarbarianArmor(
                            ModArmorMaterials.BARBARIAN,
                            ArmorItem.Type.HELMET,
                            new Item.Properties()
                    ));

    public static final RegistryObject<Item> BARBARIAN_CHESTPLATE =
            ITEMS.register("barbarian_chestplate",
                    () -> new BarbarianArmor(
                            ModArmorMaterials.BARBARIAN,
                            ArmorItem.Type.CHESTPLATE,
                            new Item.Properties()
                    ));

    public static final RegistryObject<Item> BARBARIAN_LEGGINGS =
            ITEMS.register("barbarian_leggings",
                    () -> new BarbarianArmor(
                            ModArmorMaterials.BARBARIAN,
                            ArmorItem.Type.LEGGINGS,
                            new Item.Properties()
                    ));

    public static final RegistryObject<Item> BARBARIAN_BOOTS =
            ITEMS.register("barbarian_boots",
                    () -> new BarbarianArmor(
                            ModArmorMaterials.BARBARIAN,
                            ArmorItem.Type.BOOTS,
                            new Item.Properties()
                    ));
}
