package com.freshsquilliam.fresharmsandarmor.item;

import com.freshsquilliam.fresharmsandarmor.FreshArmsAndArmor;
import com.freshsquilliam.fresharmsandarmor.item.armor.BarbarianArmorItems;
import com.freshsquilliam.fresharmsandarmor.item.shield.ShieldItems;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModCreativeTabs {

    public static final DeferredRegister<CreativeModeTab> TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, FreshArmsAndArmor.MODID);

    public static final RegistryObject<CreativeModeTab> FRESH_ARMS_AND_ARMOR =
            TABS.register("fresh_arms_and_armor", () ->
                    CreativeModeTab.builder()
                            .title(Component.translatable("creativetab.fresh_arms_and_armor"))
                            .icon(() -> TwoHandedWeapons.NETHERITE_GREATSWORD.get().getDefaultInstance())
                            .displayItems((parameters, output) -> {

                                // -------- Greatswords --------
                                output.accept(TwoHandedWeapons.WOODEN_GREATSWORD.get());
                                output.accept(TwoHandedWeapons.STONE_GREATSWORD.get());
                                output.accept(TwoHandedWeapons.IRON_GREATSWORD.get());
                                output.accept(TwoHandedWeapons.GOLDEN_GREATSWORD.get());
                                output.accept(TwoHandedWeapons.DIAMOND_GREATSWORD.get());
                                output.accept(TwoHandedWeapons.NETHERITE_GREATSWORD.get());

                                // -------- Greataxes --------
                                output.accept(TwoHandedWeapons.WOODEN_GREATAXE.get());
                                output.accept(TwoHandedWeapons.STONE_GREATAXE.get());
                                output.accept(TwoHandedWeapons.IRON_GREATAXE.get());
                                output.accept(TwoHandedWeapons.GOLDEN_GREATAXE.get());
                                output.accept(TwoHandedWeapons.DIAMOND_GREATAXE.get());
                                output.accept(TwoHandedWeapons.NETHERITE_GREATAXE.get());

                                // -------- Mauls --------
                                output.accept(TwoHandedWeapons.WOODEN_MAUL.get());
                                output.accept(TwoHandedWeapons.STONE_MAUL.get());
                                output.accept(TwoHandedWeapons.IRON_MAUL.get());
                                output.accept(TwoHandedWeapons.GOLDEN_MAUL.get());
                                output.accept(TwoHandedWeapons.DIAMOND_MAUL.get());
                                output.accept(TwoHandedWeapons.NETHERITE_MAUL.get());

                                // -------- Shields --------
                                output.accept(ShieldItems.WOODEN_SHIELD.get());
                                output.accept(ShieldItems.IRON_SHIELD.get());
                                output.accept(ShieldItems.DIAMOND_SHIELD.get());
                                output.accept(ShieldItems.NETHERITE_SHIELD.get());

                                // -------- Barbarian Armor – Iron --------
                                output.accept(BarbarianArmorItems.IRON_BARBARIAN_HELMET.get());
                                output.accept(BarbarianArmorItems.IRON_BARBARIAN_CHESTPLATE.get());
                                output.accept(BarbarianArmorItems.IRON_BARBARIAN_LEGGINGS.get());
                                output.accept(BarbarianArmorItems.IRON_BARBARIAN_BOOTS.get());

                                // -------- Barbarian Armor – Diamond --------
                                output.accept(BarbarianArmorItems.DIAMOND_BARBARIAN_HELMET.get());
                                output.accept(BarbarianArmorItems.DIAMOND_BARBARIAN_CHESTPLATE.get());
                                output.accept(BarbarianArmorItems.DIAMOND_BARBARIAN_LEGGINGS.get());
                                output.accept(BarbarianArmorItems.DIAMOND_BARBARIAN_BOOTS.get());

                                // -------- Barbarian Armor – Netherite --------
                                output.accept(BarbarianArmorItems.NETHERITE_BARBARIAN_HELMET.get());
                                output.accept(BarbarianArmorItems.NETHERITE_BARBARIAN_CHESTPLATE.get());
                                output.accept(BarbarianArmorItems.NETHERITE_BARBARIAN_LEGGINGS.get());
                                output.accept(BarbarianArmorItems.NETHERITE_BARBARIAN_BOOTS.get());
                            })
                            .build()
            );
}
