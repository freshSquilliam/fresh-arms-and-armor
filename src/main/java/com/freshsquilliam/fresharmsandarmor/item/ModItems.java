package com.freshsquilliam.fresharmsandarmor.item;

import com.freshsquilliam.fresharmsandarmor.FreshArmsAndArmor;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ShieldItem;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {

    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, FreshArmsAndArmor.MODID);

    public static final RegistryObject<Item> WAR_SIGIL = ITEMS.register(
            "war_sigil",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> WOODEN_SHIELD = ITEMS.register("wooden_shield",
            () -> new ShieldItem(new Item.Properties().durability(500)));
}
