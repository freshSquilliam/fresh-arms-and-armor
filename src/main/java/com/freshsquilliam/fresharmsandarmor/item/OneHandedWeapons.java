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

<<<<<<< HEAD
    private static Object FreshArmsAndArmor;
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, FreshArmsAndArmor.MODID);

    public static final RegistryObject<Item> WOODEN_GREATSWORD =
            ITEMS.register("wooden_mace", () ->
=======
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, FreshArmsAndArmor.MODID);

    public static final RegistryObject<Item> WOODEN_SPEAR =
            ITEMS.register("wooden_spear", () ->
>>>>>>> 8fb5d6c5e7c1eff16ed99a3ef4c4407b11c830bc
                    new SwordItem(
                            Tiers.WOOD, //wood/gold=1, stone=2, iron=3, diamond=4, netherite=5
                            9, //material + <this number> = damage
                            -3.06F, //4 - <this number> = speed (attacks/second)
                            new Item.Properties()
                    )
            );

<<<<<<< HEAD
    public static final RegistryObject<Item> STONE_GREATSWORD =
            ITEMS.register("stone_mace", () ->
                    new SwordItem(
                            Tiers.STONE,
                            9,
                            -3F,
=======
    public static final RegistryObject<Item> STONE_SPEAR =
            ITEMS.register("stone_spear", () ->
                    new SwordItem(
                            Tiers.STONE,
                            3,
                            -2.4F,
>>>>>>> 8fb5d6c5e7c1eff16ed99a3ef4c4407b11c830bc
                            new Item.Properties()
                    )
            );

<<<<<<< HEAD
    public static final RegistryObject<Item> IRON_GREATSWORD =
            ITEMS.register("iron_mace", () ->
                    new SwordItem(
                            Tiers.IRON,
                            9,
                            -2.95F,
=======
    public static final RegistryObject<Item> IRON_SPEAR =
            ITEMS.register("iron_spear", () ->
                    new SwordItem(
                            Tiers.IRON,
                            3,
                            -2.45F,
>>>>>>> 8fb5d6c5e7c1eff16ed99a3ef4c4407b11c830bc
                            new Item.Properties()
                    )
            );

<<<<<<< HEAD
    public static final RegistryObject<Item> GOLDEN_GREATSWORD =
            ITEMS.register("golden_mace", () ->
                    new SwordItem(
                            Tiers.GOLD,
                            9,
                            -2.95F,
=======
    public static final RegistryObject<Item> GOLDEN_SPEAR =
            ITEMS.register("golden_spear", () ->
                    new SwordItem(
                            Tiers.GOLD,
                            3,
                            -2.4F,
>>>>>>> 8fb5d6c5e7c1eff16ed99a3ef4c4407b11c830bc
                            new Item.Properties()
                    )
            );

<<<<<<< HEAD
    public static final RegistryObject<Item> DIAMOND_GREATSWORD =
            ITEMS.register("diamond_mace", () ->
                    new SwordItem(
                            Tiers.DIAMOND,
                            9,
                            -2.91F,
=======
    public static final RegistryObject<Item> DIAMOND_SPEAR =
            ITEMS.register("diamond_spear", () ->
                    new SwordItem(
                            Tiers.DIAMOND,
                            3,
                            -2.4F,
>>>>>>> 8fb5d6c5e7c1eff16ed99a3ef4c4407b11c830bc
                            new Item.Properties()
                    )
            );

<<<<<<< HEAD
    public static final RegistryObject<Item> NETHERITE_GREATSWORD =
            ITEMS.register("netherite_mace", () ->
                    new SwordItem(
                            Tiers.NETHERITE,
                            9,
                            -2.87F,
=======
    public static final RegistryObject<Item> NETHERITE_SPEAR =
            ITEMS.register("netherite_spear", () ->
                    new SwordItem(
                            Tiers.NETHERITE,
                            3,
                            -2.4F,
>>>>>>> 8fb5d6c5e7c1eff16ed99a3ef4c4407b11c830bc
                            new Item.Properties().fireResistant()
                    )
            );

<<<<<<< HEAD
    public static final RegistryObject<Item> WOODEN_GREATAXE =
            ITEMS.register("wooden_spear", () ->
                    new SwordItem(
                            Tiers.WOOD,
                            10,
                            -3.05F,
=======
    public static final RegistryObject<Item> WOODEN_MACE =
            ITEMS.register("wooden_mace", () ->
                    new SwordItem(
                            Tiers.WOOD,
                            3,
                            -2.4F,
>>>>>>> 8fb5d6c5e7c1eff16ed99a3ef4c4407b11c830bc
                            new Item.Properties()
                    )
            );

<<<<<<< HEAD
    public static final RegistryObject<Item> STONE_GREATAXE =
            ITEMS.register("stone_spear", () ->
                    new SwordItem(
                            Tiers.STONE,
                            10,
                            -3.08F,
=======
    public static final RegistryObject<Item> STONE_MACE =
            ITEMS.register("stone_mace", () ->
                    new SwordItem(
                            Tiers.STONE,
                            3,
                            -2.4F,
>>>>>>> 8fb5d6c5e7c1eff16ed99a3ef4c4407b11c830bc
                            new Item.Properties()
                    )
            );

<<<<<<< HEAD
    public static final RegistryObject<Item> IRON_GREATAXE =
            ITEMS.register("iron_spear", () ->
                    new SwordItem(
                            Tiers.IRON,
                            10,
                            -3.03F,
=======
    public static final RegistryObject<Item> IRON_MACE =
            ITEMS.register("iron_mace", () ->
                    new SwordItem(
                            Tiers.IRON,
                            3,
                            -2.4F,
>>>>>>> 8fb5d6c5e7c1eff16ed99a3ef4c4407b11c830bc
                            new Item.Properties()
                    )
            );

<<<<<<< HEAD
    public static final RegistryObject<Item> GOLDEN_GREATAXE =
            ITEMS.register("golden_spear", () ->
                    new SwordItem(
                            Tiers.GOLD,
                            10,
                            -3.03F,
=======
    public static final RegistryObject<Item> GOLDEN_MACE =
            ITEMS.register("golden_mace", () ->
                    new SwordItem(
                            Tiers.GOLD,
                            3,
                            -2.4F,
>>>>>>> 8fb5d6c5e7c1eff16ed99a3ef4c4407b11c830bc
                            new Item.Properties()
                    )
            );

<<<<<<< HEAD
    public static final RegistryObject<Item> DIAMOND_GREATAXE =
            ITEMS.register("diamond_spear", () ->
                    new SwordItem(
                            Tiers.DIAMOND,
                            10,
                            -2.99F,
=======
    public static final RegistryObject<Item> DIAMOND_MACE =
            ITEMS.register("diamond_mace", () ->
                    new SwordItem(
                            Tiers.DIAMOND,
                            3,
                            -2.4F,
>>>>>>> 8fb5d6c5e7c1eff16ed99a3ef4c4407b11c830bc
                            new Item.Properties()
                    )
            );

<<<<<<< HEAD
    public static final RegistryObject<Item> NETHERITE_GREATAXE =
            ITEMS.register("netherite_spear", () ->
                    new SwordItem(
                            Tiers.NETHERITE,
                            10,
                            -2.95F,
                            new Item.Properties()
                    )
            );
=======
    public static final RegistryObject<Item> NETHERITE_MACE =
            ITEMS.register("netherite_mace", () ->
                    new SwordItem(
                            Tiers.NETHERITE,
                            3,
                            -2.4F,
                            new Item.Properties().fireResistant()
                    )
            );

>>>>>>> 8fb5d6c5e7c1eff16ed99a3ef4c4407b11c830bc
}
