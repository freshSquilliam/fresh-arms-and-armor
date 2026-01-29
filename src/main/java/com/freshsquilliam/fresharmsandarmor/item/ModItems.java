package com.freshsquilliam.fresharmsandarmor.item;

import com.freshsquilliam.fresharmsandarmor.FreshArmsAndArmor;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Tiers;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {

    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, FreshArmsAndArmor.MODID);

    public static final RegistryObject<Item> WOODEN_GREATSWORD =
            ITEMS.register("wooden_greatsword", () ->
                    new GreatswordItem(
                            Tiers.WOOD,
                            7,
                            -2.7F,
                            new Item.Properties()
                    )
            );

    public static final RegistryObject<Item> STONE_GREATSWORD =
            ITEMS.register("stone_greatsword", () ->
                    new GreatswordItem(
                            Tiers.STONE,
                            7,
                            -2.67F,
                            new Item.Properties()
                    )
            );

    public static final RegistryObject<Item> IRON_GREATSWORD =
            ITEMS.register("iron_greatsword", () ->
                    new GreatswordItem(
                            Tiers.IRON,
                            7,
                            -2.64F,
                            new Item.Properties()
                    )
            );

    public static final RegistryObject<Item> GOLDEN_GREATSWORD =
            ITEMS.register("golden_greatsword", () ->
                    new GreatswordItem(
                            Tiers.GOLD,
                            7,
                            -2.64F,
                            new Item.Properties()
                    )
            );

    public static final RegistryObject<Item> DIAMOND_GREATSWORD =
            ITEMS.register("diamond_greatsword", () ->
                    new GreatswordItem(
                            Tiers.DIAMOND,
                            7,
                            -2.62F,
                            new Item.Properties()
                    )
            );

    public static final RegistryObject<Item> NETHERITE_GREATSWORD =
            ITEMS.register("netherite_greatsword", () ->
                    new GreatswordItem(
                            Tiers.NETHERITE,
                            7,
                            -2.6F,
                            new Item.Properties().fireResistant()
                    )
            );
}
