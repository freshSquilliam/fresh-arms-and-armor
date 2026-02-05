package com.freshsquilliam.fresharmsandarmor.item;

import com.freshsquilliam.fresharmsandarmor.FreshArmsAndArmor;
import com.freshsquilliam.fresharmsandarmor.item.custom.BarbarianArmorItem;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.Item;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class BarbarianArmorRegistry {

    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, FreshArmsAndArmor.MODID);

    public static final RegistryObject<Item> IRON_BARBARIAN_HELMET = ITEMS.register("iron_barbarian_helmet",
            () -> new BarbarianArmorItem(ModArmorMaterials.IRON, ArmorItem.Type.HELMET, new Item.Properties()));

    public static final RegistryObject<Item> IRON_BARBARIAN_CHESTPLATE = ITEMS.register("iron_barbarian_chestplate",
            () -> new BarbarianArmorItem(ModArmorMaterials.IRON, ArmorItem.Type.CHESTPLATE, new Item.Properties()));

    public static final RegistryObject<Item> IRON_BARBARIAN_LEGGINGS = ITEMS.register("iron_barbarian_leggings",
            () -> new BarbarianArmorItem(ModArmorMaterials.IRON, ArmorItem.Type.LEGGINGS, new Item.Properties()));

    public static final RegistryObject<Item> IRON_BARBARIAN_BOOTS = ITEMS.register("iron_barbarian_boots",
            () -> new BarbarianArmorItem(ModArmorMaterials.IRON, ArmorItem.Type.BOOTS, new Item.Properties()));

}
