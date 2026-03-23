package com.freshsquilliam.fresharmsandarmor.item;

import com.freshsquilliam.fresharmsandarmor.FreshArmsAndArmor;
import com.freshsquilliam.fresharmsandarmor.item.barbarian.BarbarianArmorRegistry;
import com.freshsquilliam.fresharmsandarmor.item.barbarian.TwoHandedWeapons;
import com.freshsquilliam.fresharmsandarmor.item.dualwielder.DualWielderArmorRegistry;
import com.freshsquilliam.fresharmsandarmor.item.dualwielder.LightWeapons;
import com.freshsquilliam.fresharmsandarmor.item.knight.KnightArmorRegistry;
import com.freshsquilliam.fresharmsandarmor.item.knight.OneHandedWeapons;
import com.freshsquilliam.fresharmsandarmor.item.vanguard.Polearms;
import com.freshsquilliam.fresharmsandarmor.item.vanguard.VanguardArmorRegistry;
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
                                output.accept(Polearms.WOODEN_SPEAR.get());
                                output.accept(Polearms.STONE_SPEAR.get());
                                output.accept(Polearms.IRON_SPEAR.get());
                                output.accept(Polearms.GOLDEN_SPEAR.get());
                                output.accept(Polearms.DIAMOND_SPEAR.get());
                                output.accept(Polearms.NETHERITE_SPEAR.get());

                                // -------- Shortswords --------
                                output.accept(LightWeapons.WOODEN_SHORTSWORD.get());
                                output.accept(LightWeapons.STONE_SHORTSWORD.get());
                                output.accept(LightWeapons.IRON_SHORTSWORD.get());
                                output.accept(LightWeapons.GOLDEN_SHORTSWORD.get());
                                output.accept(LightWeapons.DIAMOND_SHORTSWORD.get());
                                output.accept(LightWeapons.NETHERITE_SHORTSWORD.get());

                                // -------- Handaxes --------
                                output.accept(LightWeapons.WOODEN_HANDAXE.get());
                                output.accept(LightWeapons.STONE_HANDAXE.get());
                                output.accept(LightWeapons.IRON_HANDAXE.get());
                                output.accept(LightWeapons.GOLDEN_HANDAXE.get());
                                output.accept(LightWeapons.DIAMOND_HANDAXE.get());
                                output.accept(LightWeapons.NETHERITE_HANDAXE.get());

                                // -------- Scimitars --------
                                output.accept(LightWeapons.WOODEN_SCIMITAR.get());
                                output.accept(LightWeapons.STONE_SCIMITAR.get());
                                output.accept(LightWeapons.IRON_SCIMITAR.get());
                                output.accept(LightWeapons.GOLDEN_SCIMITAR.get());
                                output.accept(LightWeapons.DIAMOND_SCIMITAR.get());
                                output.accept(LightWeapons.NETHERITE_SCIMITAR.get());

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

                                // -------- Vanguard Armor – Iron --------
                                output.accept(VanguardArmorRegistry.IRON_VANGUARD_HELMET.get());
                                output.accept(VanguardArmorRegistry.IRON_VANGUARD_CHESTPLATE.get());
                                output.accept(VanguardArmorRegistry.IRON_VANGUARD_LEGGINGS.get());
                                output.accept(VanguardArmorRegistry.IRON_VANGUARD_BOOTS.get());

                                // -------- Vanguard Armor – Diamond --------
                                output.accept(VanguardArmorRegistry.DIAMOND_VANGUARD_HELMET.get());
                                output.accept(VanguardArmorRegistry.DIAMOND_VANGUARD_CHESTPLATE.get());
                                output.accept(VanguardArmorRegistry.DIAMOND_VANGUARD_LEGGINGS.get());
                                output.accept(VanguardArmorRegistry.DIAMOND_VANGUARD_BOOTS.get());

                                // -------- Vanguard Armor – Netherite --------
                                output.accept(VanguardArmorRegistry.NETHERITE_VANGUARD_HELMET.get());
                                output.accept(VanguardArmorRegistry.NETHERITE_VANGUARD_CHESTPLATE.get());
                                output.accept(VanguardArmorRegistry.NETHERITE_VANGUARD_LEGGINGS.get());
                                output.accept(VanguardArmorRegistry.NETHERITE_VANGUARD_BOOTS.get());

                                // -------- Dual Wielder Armor – Iron --------
                                output.accept(DualWielderArmorRegistry.IRON_DUALWIELDER_HELMET.get());
                                output.accept(DualWielderArmorRegistry.IRON_DUALWIELDER_CHESTPLATE.get());
                                output.accept(DualWielderArmorRegistry.IRON_DUALWIELDER_LEGGINGS.get());
                                output.accept(DualWielderArmorRegistry.IRON_DUALWIELDER_BOOTS.get());

                                // -------- Dual Wielder Armor – Diamond --------
                                output.accept(DualWielderArmorRegistry.DIAMOND_DUALWIELDER_HELMET.get());
                                output.accept(DualWielderArmorRegistry.DIAMOND_DUALWIELDER_CHESTPLATE.get());
                                output.accept(DualWielderArmorRegistry.DIAMOND_DUALWIELDER_LEGGINGS.get());
                                output.accept(DualWielderArmorRegistry.DIAMOND_DUALWIELDER_BOOTS.get());

                                // -------- Dual Wielder Armor – Netherite --------
                                output.accept(DualWielderArmorRegistry.NETHERITE_DUALWIELDER_HELMET.get());
                                output.accept(DualWielderArmorRegistry.NETHERITE_DUALWIELDER_CHESTPLATE.get());
                                output.accept(DualWielderArmorRegistry.NETHERITE_DUALWIELDER_LEGGINGS.get());
                                output.accept(DualWielderArmorRegistry.NETHERITE_DUALWIELDER_BOOTS.get());

                            })
                            .build()
            );
}
