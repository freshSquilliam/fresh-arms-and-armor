package com.freshsquilliam.fresharmsandarmor.item;

import com.freshsquilliam.fresharmsandarmor.FreshArmsAndArmor;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.Tiers;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class OneHandedWeapons {

    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, FreshArmsAndArmor.MODID);

    public static final RegistryObject<Item> WOODEN_MACE =
            ITEMS.register("wooden_mace", () ->
                    new SwordItem(
                            Tiers.WOOD, //wood/gold=1, stone=2, iron=3, diamond=4, netherite=5
                            4, //material + <this number> = damage
                            -2.72F, //4 - <this number> = speed (attacks/second)
                            new Item.Properties()
                    )
            );

    public static final RegistryObject<Item> STONE_MACE =
            ITEMS.register("stone_mace", () ->
                    new SwordItem(
                            Tiers.STONE,
                            4,
                            -2.72F,
                            new Item.Properties()
                    )
            );

    public static final RegistryObject<Item> IRON_MACE =
            ITEMS.register("iron_mace", () ->
                    new SwordItem(
                            Tiers.IRON,
                            4,
                            -2.67F,
                            new Item.Properties()
                    )
            );

    public static final RegistryObject<Item> GOLDEN_MACE =
            ITEMS.register("golden_mace", () ->
                    new SwordItem(
                            Tiers.GOLD,
                            4,
                            -2.67F,
                            new Item.Properties()
                    )
            );

    public static final RegistryObject<Item> DIAMOND_MACE =
            ITEMS.register("diamond_mace", () ->
                    new SwordItem(
                            Tiers.DIAMOND,
                            4,
                            -2.6F,
                            new Item.Properties()
                    )
            );

    public static final RegistryObject<Item> NETHERITE_MACE =
            ITEMS.register("netherite_mace", () ->
                    new SwordItem(
                            Tiers.NETHERITE,
                            4,
                            -2.58F,
                            new Item.Properties().fireResistant()
                    )
            );

    public static final RegistryObject<Item> WOODEN_TRIDENT =
            ITEMS.register("wooden_trident", () ->
                    new SwordItem(
                            Tiers.WOOD,
                            2,
                            -1.87F,
                            new Item.Properties()
                    )
            );

    public static final RegistryObject<Item> STONE_TRIDENT =
            ITEMS.register("stone_trident", () ->
                    new SwordItem(
                            Tiers.STONE,
                            2,
                            -2F,
                            new Item.Properties()
                    )
            );

    public static final RegistryObject<Item> IRON_TRIDENT =
            ITEMS.register("iron_trident", () ->
                    new SwordItem(
                            Tiers.IRON,
                            2,
                            -2.08F,
                            new Item.Properties()
                    )
            );

    public static final RegistryObject<Item> GOLDEN_TRIDENT =
            ITEMS.register("golden_trident", () ->
                    new SwordItem(
                            Tiers.GOLD,
                            2,
                            -2.08F,
                            new Item.Properties()
                    )
            );

    public static final RegistryObject<Item> DIAMOND_TRIDENT =
            ITEMS.register("diamond_trident", () ->
                    new SwordItem(
                            Tiers.DIAMOND,
                            2,
                            -2.13F,
                            new Item.Properties()
                    )
            );

    public static final RegistryObject<Item> NETHERITE_TRIDENT =
            ITEMS.register("netherite_trident", () ->
                    new SwordItem(
                            Tiers.NETHERITE,
                            2,
                            -2.17F,
                            new Item.Properties().fireResistant()
                    )
            );

}
