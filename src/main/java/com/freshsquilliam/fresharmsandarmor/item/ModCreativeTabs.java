package com.freshsquilliam.fresharmsandarmor.item;

import com.freshsquilliam.fresharmsandarmor.FreshArmsAndArmor;
import com.freshsquilliam.fresharmsandarmor.item.ModItems;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModCreativeTabs {

    public static final DeferredRegister<CreativeModeTab> TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, FreshArmsAndArmor.MODID);

    public static final RegistryObject<CreativeModeTab> FRESH_ARMS_AND_ARMOR =
            TABS.register("fresharmsandarmor", () ->
                    CreativeModeTab.builder()
                            .title(Component.translatable("creativetab.fresharmsandarmor"))
                            .icon(() -> TwoHandedWeapons.NETHERITE_GREATSWORD.get().getDefaultInstance())
                            .displayItems((parameters, output) -> {

                                output.accept(ModItems.WAR_SIGIL.get());

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
                                output.accept(ModItems.WOODEN_SHIELD.get());
                                output.accept(ModItems.IRON_SHIELD.get());
                                output.accept(ModItems.GOLDEN_SHIELD.get());
                                output.accept(ModItems.DIAMOND_SHIELD.get());
                                output.accept(ModItems.NETHERITE_SHIELD.get());

                                // -------- Barbarian Armor – Iron --------
                                output.accept(BarbarianArmorRegistry.IRON_BARBARIAN_HELMET.get());
                                output.accept(BarbarianArmorRegistry.IRON_BARBARIAN_CHESTPLATE.get());
                                output.accept(BarbarianArmorRegistry.IRON_BARBARIAN_LEGGINGS.get());
                                output.accept(BarbarianArmorRegistry.IRON_BARBARIAN_BOOTS.get());

                                // -------- Barbarian Armor – Diamond --------
                                output.accept(BarbarianArmorRegistry.DIAMOND_BARBARIAN_HELMET.get());
                                output.accept(BarbarianArmorRegistry.DIAMOND_BARBARIAN_CHESTPLATE.get());
                                output.accept(BarbarianArmorRegistry.DIAMOND_BARBARIAN_LEGGINGS.get());
                                output.accept(BarbarianArmorRegistry.DIAMOND_BARBARIAN_BOOTS.get());

                                // -------- Barbarian Armor – Netherite --------
                                output.accept(BarbarianArmorRegistry.NETHERITE_BARBARIAN_HELMET.get());
                                output.accept(BarbarianArmorRegistry.NETHERITE_BARBARIAN_CHESTPLATE.get());
                                output.accept(BarbarianArmorRegistry.NETHERITE_BARBARIAN_LEGGINGS.get());
                                output.accept(BarbarianArmorRegistry.NETHERITE_BARBARIAN_BOOTS.get());
                            })
                            .build()
            );
}
