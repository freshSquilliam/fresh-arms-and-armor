package com.freshsquilliam.fresharmsandarmor.item;

import com.freshsquilliam.fresharmsandarmor.FreshArmsAndArmor;
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

                                // -------- Spears --------
                                output.accept(OneHandedWeapons.WOODEN_TRIDENT.get());
                                output.accept(OneHandedWeapons.STONE_TRIDENT.get());
                                output.accept(OneHandedWeapons.IRON_TRIDENT.get());
                                output.accept(OneHandedWeapons.GOLDEN_TRIDENT.get());
                                output.accept(OneHandedWeapons.DIAMOND_TRIDENT.get());
                                output.accept(OneHandedWeapons.NETHERITE_TRIDENT.get());

                                // -------- Maces --------
                                output.accept(OneHandedWeapons.WOODEN_MACE.get());
                                output.accept(OneHandedWeapons.STONE_MACE.get());
                                output.accept(OneHandedWeapons.IRON_MACE.get());
                                output.accept(OneHandedWeapons.GOLDEN_MACE.get());
                                output.accept(OneHandedWeapons.DIAMOND_MACE.get());
                                output.accept(OneHandedWeapons.NETHERITE_MACE.get());

                                // -------- Glaives --------
                                output.accept(Polearms.WOODEN_GLAIVE.get());
                                output.accept(Polearms.STONE_GLAIVE.get());
                                output.accept(Polearms.IRON_GLAIVE.get());
                                output.accept(Polearms.GOLDEN_GLAIVE.get());
                                output.accept(Polearms.DIAMOND_GLAIVE.get());
                                output.accept(Polearms.NETHERITE_GLAIVE.get());

                                // -------- Halberds --------
                                output.accept(Polearms.WOODEN_HALBERD.get());
                                output.accept(Polearms.STONE_HALBERD.get());
                                output.accept(Polearms.IRON_HALBERD.get());
                                output.accept(Polearms.GOLDEN_HALBERD.get());
                                output.accept(Polearms.DIAMOND_HALBERD.get());
                                output.accept(Polearms.NETHERITE_HALBERD.get());

                                // -------- Pikes --------
                                output.accept(Polearms.WOODEN_PIKE.get());
                                output.accept(Polearms.STONE_PIKE.get());
                                output.accept(Polearms.IRON_PIKE.get());
                                output.accept(Polearms.GOLDEN_PIKE.get());
                                output.accept(Polearms.DIAMOND_PIKE.get());
                                output.accept(Polearms.NETHERITE_PIKE.get());

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

                                // -------- Knight Armor – Iron --------
                                output.accept(KnightArmorRegistry.IRON_KNIGHT_HELMET.get());
                                output.accept(KnightArmorRegistry.IRON_KNIGHT_CHESTPLATE.get());
                                output.accept(KnightArmorRegistry.IRON_KNIGHT_LEGGINGS.get());
                                output.accept(KnightArmorRegistry.IRON_KNIGHT_BOOTS.get());

                                // -------- Knight Armor – Diamond --------
                                output.accept(KnightArmorRegistry.DIAMOND_KNIGHT_HELMET.get());
                                output.accept(KnightArmorRegistry.DIAMOND_KNIGHT_CHESTPLATE.get());
                                output.accept(KnightArmorRegistry.DIAMOND_KNIGHT_LEGGINGS.get());
                                output.accept(KnightArmorRegistry.DIAMOND_KNIGHT_BOOTS.get());

                                // -------- Knight Armor – Netherite --------
                                output.accept(KnightArmorRegistry.NETHERITE_KNIGHT_HELMET.get());
                                output.accept(KnightArmorRegistry.NETHERITE_KNIGHT_CHESTPLATE.get());
                                output.accept(KnightArmorRegistry.NETHERITE_KNIGHT_LEGGINGS.get());
                                output.accept(KnightArmorRegistry.NETHERITE_KNIGHT_BOOTS.get());

                            })
                            .build()
            );
}
