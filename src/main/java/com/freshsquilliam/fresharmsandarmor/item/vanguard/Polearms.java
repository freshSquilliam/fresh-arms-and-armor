package com.freshsquilliam.fresharmsandarmor.item.vanguard;

import com.freshsquilliam.fresharmsandarmor.FreshArmsAndArmor;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.Tiers;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class Polearms {

    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, FreshArmsAndArmor.MODID);

    public static final RegistryObject<Item> WOODEN_GLAIVE =
            ITEMS.register("wooden_glaive", () ->
                    new SwordItem(
                            Tiers.WOOD, //wood/gold=1, stone=2, iron=3, diamond=4, netherite=5
                            7, //material + <this number> = damage
                            -3.05F, //4 - <this number> = speed (attacks/second)
                            new Item.Properties()
                    )
            );

    public static final RegistryObject<Item> STONE_GLAIVE =
            ITEMS.register("stone_glaive", () ->
                    new SwordItem(
                            Tiers.STONE,
                            7,
                            -3F,
                            new Item.Properties()
                    )
            );

    public static final RegistryObject<Item> IRON_GLAIVE =
            ITEMS.register("iron_glaive", () ->
                    new SwordItem(
                            Tiers.IRON,
                            7,
                            -2.96F,
                            new Item.Properties()
                    )
            );

    public static final RegistryObject<Item> GOLDEN_GLAIVE =
            ITEMS.register("golden_glaive", () ->
                    new SwordItem(
                            Tiers.GOLD,
                            7,
                            -2.96F,
                            new Item.Properties()
                    )
            );

    public static final RegistryObject<Item> DIAMOND_GLAIVE =
            ITEMS.register("diamond_glaive", () ->
                    new SwordItem(
                            Tiers.DIAMOND,
                            7,
                            -2.89F,
                            new Item.Properties()
                    )
            );

    public static final RegistryObject<Item> NETHERITE_GLAIVE =
            ITEMS.register("netherite_glaive", () ->
                    new SwordItem(
                            Tiers.NETHERITE,
                            7,
                            -2.85F,
                            new Item.Properties().fireResistant()
                    )
            );

    public static final RegistryObject<Item> WOODEN_HALBERD =
            ITEMS.register("wooden_halberd", () ->
                    new SwordItem(
                            Tiers.WOOD,
                            8,
                            -2.78F,
                            new Item.Properties()
                    )
            );
//<3
    public static final RegistryObject<Item> STONE_HALBERD =
            ITEMS.register("stone_halberd", () ->
                    new SwordItem(
                            Tiers.STONE,
                            8,
                            -2.88F,
                            new Item.Properties()
                    )
            );

    public static final RegistryObject<Item> IRON_HALBERD =
            ITEMS.register("iron_halberd", () ->
                    new SwordItem(
                            Tiers.IRON,
                            8,
                            -2.96F,
                            new Item.Properties()
                    )
            );

    public static final RegistryObject<Item> GOLDEN_HALBERD =
            ITEMS.register("golden_halberd", () ->
                    new SwordItem(
                            Tiers.GOLD,
                            8,
                            -2.96F,
                            new Item.Properties()
                    )
            );

    public static final RegistryObject<Item> DIAMOND_HALBERD =
            ITEMS.register("diamond_halberd", () ->
                    new SwordItem(
                            Tiers.DIAMOND,
                            8,
                            -2.98F,
                            new Item.Properties()
                    )
            );

    public static final RegistryObject<Item> NETHERITE_HALBERD =
            ITEMS.register("netherite_halberd", () ->
                    new SwordItem(
                            Tiers.NETHERITE,
                            8,
                            -2.94F,
                            new Item.Properties()
                    )
            );

    public static final RegistryObject<Item> WOODEN_SPEAR =
            ITEMS.register("wooden_spear", () ->
                    new SwordItem(
                            Tiers.WOOD,
                            6,
                            -2.94F,
                            new Item.Properties()
                    )
            );

    public static final RegistryObject<Item> STONE_SPEAR =
            ITEMS.register("stone_spear", () ->
                    new SwordItem(
                            Tiers.STONE,
                            6,
                            -2.87F,
                            new Item.Properties()
                    )
            );

    public static final RegistryObject<Item> IRON_SPEAR =
            ITEMS.register("iron_spear", () ->
                    new SwordItem(
                            Tiers.IRON,
                            6,
                            -2.82F,
                            new Item.Properties()
                    )
            );

    public static final RegistryObject<Item> GOLDEN_SPEAR =
            ITEMS.register("golden_spear", () ->
                    new SwordItem(
                            Tiers.GOLD,
                            6,
                            -2.82F,
                            new Item.Properties()
                    )
            );

    public static final RegistryObject<Item> DIAMOND_SPEAR =
            ITEMS.register("diamond_spear", () ->
                    new SwordItem(
                            Tiers.DIAMOND,
                            6,
                            -2.78F,
                            new Item.Properties()
                    )
            );

    public static final RegistryObject<Item> NETHERITE_SPEAR =
            ITEMS.register("netherite_spear", () ->
                    new SwordItem(
                            Tiers.NETHERITE,
                            6,
                            -2.74F,
                            new Item.Properties().fireResistant()
                    )
            );

}
