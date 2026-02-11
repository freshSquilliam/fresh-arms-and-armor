package com.freshsquilliam.fresharmsandarmor.item;

import com.freshsquilliam.fresharmsandarmor.FreshArmsAndArmor;
import net.minecraft.world.item.Item;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {

    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, FreshArmsAndArmor.MODID);

    public static final RegistryObject<Item> WAR_SIGIL = ITEMS.register("war_sigil",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> WOODEN_SHIELD =
            ITEMS.register("wooden_shield",
                    () -> new Shields(
                            1, // +1 armor
                            new Item.Properties().durability(350)
                    ));

    public static final RegistryObject<Item> IRON_SHIELD =
            ITEMS.register("iron_shield",
                    () -> new Shields(
                            2, // +2 armor
                            new Item.Properties().durability(400)
                    ));

    public static final RegistryObject<Item> GOLDEN_SHIELD =
            ITEMS.register("golden_shield",
                    () -> new Shields(
                            2, // +2 armor
                            new Item.Properties().durability(300)
                    ));


    public static final RegistryObject<Item> DIAMOND_SHIELD =
            ITEMS.register("diamond_shield",
                    () -> new Shields(
                            3, // +3 armor
                            new Item.Properties().durability(450)
                    ));

    public static final RegistryObject<Item> NETHERITE_SHIELD =
            ITEMS.register("netherite_shield",
                    () -> new Shields(
                            4, // +4 armor
                            new Item.Properties()
                                    .durability(500)
                                    .fireResistant()
                    ));
}
