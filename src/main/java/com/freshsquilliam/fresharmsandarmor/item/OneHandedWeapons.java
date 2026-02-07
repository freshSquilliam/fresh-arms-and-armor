package com.freshsquilliam.fresharmsandarmor.item;

import com.freshsquilliam.fresharmsandarmor.FreshArmsAndArmor;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.Tiers;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
//functional
public class OneHandedWeapons {

    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, FreshArmsAndArmor.MODID);

    public static final RegistryObject<Item> WOODEN_SPEAR =
            ITEMS.register("wooden_spear", () ->
                    new SwordItem(
                            Tiers.WOOD, //wood/gold=1, stone=2, iron=3, diamond=4, netherite=5
                            9, //material + <this number> = damage
                            -3.06F, //4 - <this number> = speed (attacks/second)
                            new Item.Properties()
                    )
            );

    public static final RegistryObject<Item> STONE_SPEAR =
            ITEMS.register("stone_spear", () ->
                    new SwordItem(
                            Tiers.STONE,
                            3,
                            -2.4F,
                            new Item.Properties()
                    )
            );

    public static final RegistryObject<Item> IRON_SPEAR =
            ITEMS.register("iron_spear", () ->
                    new SwordItem(
                            Tiers.IRON,
                            3,
                            -2.45F,
                            new Item.Properties()
                    )
            );

    public static final RegistryObject<Item> GOLDEN_SPEAR =
            ITEMS.register("golden_spear", () ->
                    new SwordItem(
                            Tiers.GOLD,
                            3,
                            -2.4F,
                            new Item.Properties()
                    )
            );

    public static final RegistryObject<Item> DIAMOND_SPEAR =
            ITEMS.register("diamond_spear", () ->
                    new SwordItem(
                            Tiers.DIAMOND,
                            3,
                            -2.4F,
                            new Item.Properties()
                    )
            );

    public static final RegistryObject<Item> NETHERITE_SPEAR =
            ITEMS.register("netherite_spear", () ->
                    new SwordItem(
                            Tiers.NETHERITE,
                            3,
                            -2.4F,
                            new Item.Properties().fireResistant()
                    )
            );

    public static final RegistryObject<Item> WOODEN_MACE =
            ITEMS.register("wooden_mace", () ->
                    new SwordItem(
                            Tiers.WOOD,
                            3,
                            -2.4F,
                            new Item.Properties()
                    )
            );

    public static final RegistryObject<Item> STONE_MACE =
            ITEMS.register("stone_mace", () ->
                    new SwordItem(
                            Tiers.STONE,
                            3,
                            -2.4F,
                            new Item.Properties()
                    )
            );

    public static final RegistryObject<Item> IRON_MACE =
            ITEMS.register("iron_mace", () ->
                    new SwordItem(
                            Tiers.IRON,
                            3,
                            -2.4F,
                            new Item.Properties()
                    )
            );

    public static final RegistryObject<Item> GOLDEN_MACE =
            ITEMS.register("golden_mace", () ->
                    new SwordItem(
                            Tiers.GOLD,
                            3,
                            -2.4F,
                            new Item.Properties()
                    )
            );

    public static final RegistryObject<Item> DIAMOND_MACE =
            ITEMS.register("diamond_mace", () ->
                    new SwordItem(
                            Tiers.DIAMOND,
                            3,
                            -2.4F,
                            new Item.Properties()
                    )
            );

    public static final RegistryObject<Item> NETHERITE_MACE =
            ITEMS.register("netherite_mace", () ->
                    new SwordItem(
                            Tiers.NETHERITE,
                            3,
                            -2.4F,
                            new Item.Properties().fireResistant()
                    )
            );

}
