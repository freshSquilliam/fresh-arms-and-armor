package com.freshsquilliam.fresharmsandarmor.item.dualwielder;

import com.freshsquilliam.fresharmsandarmor.FreshArmsAndArmor;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.Tiers;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class LightWeapons {

    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, FreshArmsAndArmor.MODID);

    public static final RegistryObject<Item> WOODEN_SHORTSWORD =
            ITEMS.register("wooden_shortsword", () ->
                    new SwordItem(
                            Tiers.WOOD, //wood/gold=1, stone=2, iron=3, diamond=4, netherite=5
                            2, //material + <this number> = damage
                            -1.53F, //4 - <this number> = speed (attacks/second)
                            new Item.Properties()
                    )
            );

    public static final RegistryObject<Item> STONE_SHORTSWORD =
            ITEMS.register("stone_shortsword", () ->
                    new SwordItem(
                            Tiers.STONE,
                            2,
                            -1.75F,
                            new Item.Properties()
                    )
            );

    public static final RegistryObject<Item> IRON_SHORTSWORD =
            ITEMS.register("iron_shortsword", () ->
                    new SwordItem(
                            Tiers.IRON,
                            2,
                            -1.88F,
                            new Item.Properties()
                    )
            );

    public static final RegistryObject<Item> GOLDEN_SHORTSWORD =
            ITEMS.register("golden_shortsword", () ->
                    new SwordItem(
                            Tiers.GOLD,
                            2,
                            -1.53F,
                            new Item.Properties()
                    )
            );

    public static final RegistryObject<Item> DIAMOND_SHORTSWORD =
            ITEMS.register("diamond_shortsword", () ->
                    new SwordItem(
                            Tiers.DIAMOND,
                            2,
                            -1.8F,
                            new Item.Properties()
                    )
            );

    public static final RegistryObject<Item> NETHERITE_SHORTSWORD =
            ITEMS.register("netherite_shortsword", () ->
                    new SwordItem(
                            Tiers.NETHERITE,
                            2,
                            -1.89F,
                            new Item.Properties().fireResistant()
                    )
            );

    public static final RegistryObject<Item> WOODEN_HANDAXE =
            ITEMS.register("wooden_handaxe", () ->
                    new SwordItem(
                            Tiers.WOOD,
                            3,
                            -2.15F,
                            new Item.Properties()
                    )
            );

    public static final RegistryObject<Item> STONE_HANDAXE =
            ITEMS.register("stone_handaxe", () ->
                    new SwordItem(
                            Tiers.STONE,
                            3,
                            -2.2F,
                            new Item.Properties()
                    )
            );

    public static final RegistryObject<Item> IRON_HANDAXE =
            ITEMS.register("iron_handaxe", () ->
                    new SwordItem(
                            Tiers.IRON,
                            3,
                            -2.23F,
                            new Item.Properties()
                    )
            );

    public static final RegistryObject<Item> GOLDEN_HANDAXE =
            ITEMS.register("golden_handaxe", () ->
                    new SwordItem(
                            Tiers.GOLD,
                            3,
                            -2.15F,
                            new Item.Properties()
                    )
            );

    public static final RegistryObject<Item> DIAMOND_HANDAXE =
            ITEMS.register("diamond_handaxe", () ->
                    new SwordItem(
                            Tiers.DIAMOND,
                            3,
                            -2.11F,
                            new Item.Properties()
                    )
            );

    public static final RegistryObject<Item> NETHERITE_HANDAXE =
            ITEMS.register("netherite_handaxe", () ->
                    new SwordItem(
                            Tiers.NETHERITE,
                            3,
                            -2.15F,
                            new Item.Properties()
                    )
            );

    public static final RegistryObject<Item> WOODEN_SCIMITAR =
            ITEMS.register("wooden_scimitar", () ->
                    new SwordItem(
                            Tiers.WOOD,
                            1,
                            -1F,
                            new Item.Properties()
                    )
            );

    public static final RegistryObject<Item> STONE_SCIMITAR =
            ITEMS.register("stone_scimitar", () ->
                    new SwordItem(
                            Tiers.STONE,
                            1,
                            -1F,
                            new Item.Properties()
                    )
            );

    public static final RegistryObject<Item> IRON_SCIMITAR =
            ITEMS.register("iron_scimitar", () ->
                    new SwordItem(
                            Tiers.IRON,
                            1,
                            -1.35F,
                            new Item.Properties()
                    )
            );

    public static final RegistryObject<Item> GOLDEN_SCIMITAR =
            ITEMS.register("golden_scimitar", () ->
                    new SwordItem(
                            Tiers.GOLD,
                            1,
                            -1F,
                            new Item.Properties()
                    )
            );

    public static final RegistryObject<Item> DIAMOND_SCIMITAR =
            ITEMS.register("diamond_scimitar", () ->
                    new SwordItem(
                            Tiers.DIAMOND,
                            1,
                            -1.36F,
                            new Item.Properties()
                    )
            );

    public static final RegistryObject<Item> NETHERITE_SCIMITAR =
            ITEMS.register("netherite_scimitar", () ->
                    new SwordItem(
                            Tiers.NETHERITE,
                            1,
                            -1.53F,
                            new Item.Properties().fireResistant()
                    )
            );

}
