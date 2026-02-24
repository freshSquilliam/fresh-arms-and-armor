package com.freshsquilliam.fresharmsandarmor.item;

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
                            9, //material + <this number> = damage
                            -3.06F, //4 - <this number> = speed (attacks/second)
                            new Item.Properties()
                    )
            );

    public static final RegistryObject<Item> STONE_GLAIVE =
            ITEMS.register("stone_glaive", () ->
                    new SwordItem(
                            Tiers.STONE,
                            9,
                            -3F,
                            new Item.Properties()
                    )
            );

    public static final RegistryObject<Item> IRON_GLAIVE =
            ITEMS.register("iron_glaive", () ->
                    new SwordItem(
                            Tiers.IRON,
                            9,
                            -2.95F,
                            new Item.Properties()
                    )
            );

    public static final RegistryObject<Item> GOLDEN_GLAIVE =
            ITEMS.register("golden_glaive", () ->
                    new SwordItem(
                            Tiers.GOLD,
                            9,
                            -2.95F,
                            new Item.Properties()
                    )
            );

    public static final RegistryObject<Item> DIAMOND_GLAIVE =
            ITEMS.register("diamond_glaive", () ->
                    new SwordItem(
                            Tiers.DIAMOND,
                            9,
                            -2.91F,
                            new Item.Properties()
                    )
            );

    public static final RegistryObject<Item> NETHERITE_GLAIVE =
            ITEMS.register("netherite_glaive", () ->
                    new SwordItem(
                            Tiers.NETHERITE,
                            9,
                            -2.87F,
                            new Item.Properties().fireResistant()
                    )
            );

    public static final RegistryObject<Item> WOODEN_HALBERD =
            ITEMS.register("wooden_halberd", () ->
                    new SwordItem(
                            Tiers.WOOD,
                            10,
                            -3.05F,
                            new Item.Properties()
                    )
            );

    public static final RegistryObject<Item> STONE_HALBERD =
            ITEMS.register("stone_halberd", () ->
                    new SwordItem(
                            Tiers.STONE,
                            10,
                            -3.08F,
                            new Item.Properties()
                    )
            );

    public static final RegistryObject<Item> IRON_HALBERD =
            ITEMS.register("iron_halberd", () ->
                    new SwordItem(
                            Tiers.IRON,
                            10,
                            -3.03F,
                            new Item.Properties()
                    )
            );

    public static final RegistryObject<Item> GOLDEN_HALBERD =
            ITEMS.register("golden_halberd", () ->
                    new SwordItem(
                            Tiers.GOLD,
                            10,
                            -3.03F,
                            new Item.Properties()
                    )
            );

    public static final RegistryObject<Item> DIAMOND_HALBERD =
            ITEMS.register("diamond_halberd", () ->
                    new SwordItem(
                            Tiers.DIAMOND,
                            10,
                            -2.99F,
                            new Item.Properties()
                    )
            );

    public static final RegistryObject<Item> NETHERITE_HALBERD =
            ITEMS.register("netherite_halberd", () ->
                    new SwordItem(
                            Tiers.NETHERITE,
                            10,
                            -2.95F,
                            new Item.Properties()
                    )
            );

    public static final RegistryObject<Item> WOODEN_PIKE =
            ITEMS.register("wooden_pike", () ->
                    new SwordItem(
                            Tiers.WOOD,
                            11,
                            -3.22F,
                            new Item.Properties()
                    )
            );

    public static final RegistryObject<Item> STONE_PIKE =
            ITEMS.register("stone_pike", () ->
                    new SwordItem(
                            Tiers.STONE,
                            11,
                            -3.08F,
                            new Item.Properties()
                    )
            );

    public static final RegistryObject<Item> IRON_PIKE =
            ITEMS.register("iron_pike", () ->
                    new SwordItem(
                            Tiers.IRON,
                            11,
                            -3.03F,
                            new Item.Properties()
                    )
            );

    public static final RegistryObject<Item> GOLDEN_PIKE =
            ITEMS.register("golden_pike", () ->
                    new SwordItem(
                            Tiers.GOLD,
                            11,
                            -3.03F,
                            new Item.Properties()
                    )
            );

    public static final RegistryObject<Item> DIAMOND_PIKE =
            ITEMS.register("diamond_pike", () ->
                    new SwordItem(
                            Tiers.DIAMOND,
                            11,
                            -2.99F,
                            new Item.Properties()
                    )
            );

    public static final RegistryObject<Item> NETHERITE_PIKE =
            ITEMS.register("netherite_pike", () ->
                    new SwordItem(
                            Tiers.NETHERITE,
                            11,
                            -3.01F,
                            new Item.Properties().fireResistant()
                    )
            );

}
