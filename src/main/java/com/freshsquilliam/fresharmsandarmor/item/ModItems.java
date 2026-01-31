package com.freshsquilliam.fresharmsandarmor.item;

import com.freshsquilliam.fresharmsandarmor.FreshArmsAndArmor;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.Tiers;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {

    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, FreshArmsAndArmor.MODID);

    public static final RegistryObject<Item> WOODEN_GREATSWORD =
            ITEMS.register("wooden_greatsword", () ->
                    new SwordItem(
                            Tiers.WOOD,
                            7,
                            -2.7F,
                            new Item.Properties()
                    )
            );

    public static final RegistryObject<Item> STONE_GREATSWORD =
            ITEMS.register("stone_greatsword", () ->
                    new SwordItem(
                            Tiers.STONE,
                            7,
                            -2.67F,
                            new Item.Properties()
                    )
            );

    public static final RegistryObject<Item> IRON_GREATSWORD =
            ITEMS.register("iron_greatsword", () ->
                    new SwordItem(
                            Tiers.IRON,
                            7,
                            -2.64F,
                            new Item.Properties()
                    )
            );

    public static final RegistryObject<Item> GOLDEN_GREATSWORD =
            ITEMS.register("golden_greatsword", () ->
                    new SwordItem(
                            Tiers.GOLD,
                            7,
                            -2.64F,
                            new Item.Properties()
                    )
            );

    public static final RegistryObject<Item> DIAMOND_GREATSWORD =
            ITEMS.register("diamond_greatsword", () ->
                    new SwordItem(
                            Tiers.DIAMOND,
                            7,
                            -2.62F,
                            new Item.Properties()
                    )
            );

    public static final RegistryObject<Item> NETHERITE_GREATSWORD =
            ITEMS.register("netherite_greatsword", () ->
                    new SwordItem(
                            Tiers.NETHERITE,
                            7,
                            -2.6F,
                            new Item.Properties().fireResistant()
                    )
            );

    public static final RegistryObject<Item> WOODEN_GREATAXE =
            ITEMS.register("wooden_greataxe", () ->
                    new SwordItem(
                            Tiers.WOOD,
                            8,
                            -2.84F,
                            new Item.Properties()
                    )
            );

    public static final RegistryObject<Item> STONE_GREATAXE =
            ITEMS.register("stone_greataxe", () ->
                    new SwordItem(
                            Tiers.STONE,
                            8,
                            -2.8F,
                            new Item.Properties()
                    )
            );

    public static final RegistryObject<Item> IRON_GREATAXE =
            ITEMS.register("iron_greataxe", () ->
                    new SwordItem(
                            Tiers.IRON,
                            8,
                            -2.76F,
                            new Item.Properties()
                    )
            );

    public static final RegistryObject<Item> GOLDEN_GREATAXE =
            ITEMS.register("golden_greataxe", () ->
                    new SwordItem(
                            Tiers.GOLD,
                            8,
                            -2.76F,
                            new Item.Properties()
                    )
            );

    public static final RegistryObject<Item> DIAMOND_GREATAXE =
            ITEMS.register("diamond_greataxe", () ->
                    new SwordItem(
                            Tiers.DIAMOND,
                            8,
                            -2.73F,
                            new Item.Properties()
                    )
            );

    public static final RegistryObject<Item> NETHERITE_GREATAXE =
            ITEMS.register("netherite_greataxe", () ->
                    new SwordItem(
                            Tiers.NETHERITE,
                            8,
                            -2.71F,
                            new Item.Properties()
                    )
            );
}
