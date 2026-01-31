package com.freshsquilliam.fresharmsandarmor.item;

import com.freshsquilliam.fresharmsandarmor.FreshArmsAndArmor;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.Tiers;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class TwoHandedItems {

    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, FreshArmsAndArmor.MODID);

    public static final RegistryObject<Item> WOODEN_GREATSWORD =
            ITEMS.register("wooden_greatsword", () ->
                    new SwordItem(
                            Tiers.WOOD,
                            9,
                            -3.06F,
                            new Item.Properties()
                    )
            );

    public static final RegistryObject<Item> STONE_GREATSWORD =
            ITEMS.register("stone_greatsword", () ->
                    new SwordItem(
                            Tiers.STONE,
                            9,
                            -3F,
                            new Item.Properties()
                    )
            );

    public static final RegistryObject<Item> IRON_GREATSWORD =
            ITEMS.register("iron_greatsword", () ->
                    new SwordItem(
                            Tiers.IRON,
                            9,
                            -2.95F,
                            new Item.Properties()
                    )
            );

    public static final RegistryObject<Item> GOLDEN_GREATSWORD =
            ITEMS.register("golden_greatsword", () ->
                    new SwordItem(
                            Tiers.GOLD,
                            9,
                            -2.95F,
                            new Item.Properties()
                    )
            );

    public static final RegistryObject<Item> DIAMOND_GREATSWORD =
            ITEMS.register("diamond_greatsword", () ->
                    new SwordItem(
                            Tiers.DIAMOND,
                            9,
                            -2.91F,
                            new Item.Properties()
                    )
            );

    public static final RegistryObject<Item> NETHERITE_GREATSWORD =
            ITEMS.register("netherite_greatsword", () ->
                    new SwordItem(
                            Tiers.NETHERITE,
                            9,
                            -2.87F,
                            new Item.Properties().fireResistant()
                    )
            );

    public static final RegistryObject<Item> WOODEN_GREATAXE =
            ITEMS.register("wooden_greataxe", () ->
                    new SwordItem(
                            Tiers.WOOD,
                            10,
                            -3.05F,
                            new Item.Properties()
                    )
            );

    public static final RegistryObject<Item> STONE_GREATAXE =
            ITEMS.register("stone_greataxe", () ->
                    new SwordItem(
                            Tiers.STONE,
                            10,
                            -3.08F,
                            new Item.Properties()
                    )
            );

    public static final RegistryObject<Item> IRON_GREATAXE =
            ITEMS.register("iron_greataxe", () ->
                    new SwordItem(
                            Tiers.IRON,
                            10,
                            -3.03F,
                            new Item.Properties()
                    )
            );

    public static final RegistryObject<Item> GOLDEN_GREATAXE =
            ITEMS.register("golden_greataxe", () ->
                    new SwordItem(
                            Tiers.GOLD,
                            10,
                            -3.03F,
                            new Item.Properties()
                    )
            );

    public static final RegistryObject<Item> DIAMOND_GREATAXE =
            ITEMS.register("diamond_greataxe", () ->
                    new SwordItem(
                            Tiers.DIAMOND,
                            10,
                            -2.99F,
                            new Item.Properties()
                    )
            );

    public static final RegistryObject<Item> NETHERITE_GREATAXE =
            ITEMS.register("netherite_greataxe", () ->
                    new SwordItem(
                            Tiers.NETHERITE,
                            10,
                            -2.95F,
                            new Item.Properties()
                    )
            );

    public static final RegistryObject<Item> WOODEN_MAUL =
            ITEMS.register("wooden_maul", () ->
                    new SwordItem(
                            Tiers.WOOD,
                            11,
                            -3.22F,
                            new Item.Properties()
                    )
            );

    public static final RegistryObject<Item> STONE_MAUL =
            ITEMS.register("stone_maul", () ->
                    new SwordItem(
                            Tiers.STONE,
                            11,
                            -3.08F,
                            new Item.Properties()
                    )
            );

    public static final RegistryObject<Item> IRON_MAUL =
            ITEMS.register("iron_maul", () ->
                    new SwordItem(
                            Tiers.IRON,
                            11,
                            -3.03F,
                            new Item.Properties()
                    )
            );

    public static final RegistryObject<Item> GOLDEN_MAUL =
            ITEMS.register("golden_maul", () ->
                    new SwordItem(
                            Tiers.GOLD,
                            11,
                            -3.03F,
                            new Item.Properties()
                    )
            );

    public static final RegistryObject<Item> DIAMOND_MAUL =
            ITEMS.register("diamond_maul", () ->
                    new SwordItem(
                            Tiers.DIAMOND,
                            11,
                            -2.99F,
                            new Item.Properties()
                    )
            );

    public static final RegistryObject<Item> NETHERITE_MAUL =
            ITEMS.register("netherite_maul", () ->
                    new SwordItem(
                            Tiers.NETHERITE,
                            11,
                            -3.01F,
                            new Item.Properties().fireResistant()
                    )
            );

}
