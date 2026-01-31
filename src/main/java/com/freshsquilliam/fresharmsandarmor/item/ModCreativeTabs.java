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
            TABS.register("fresh_arms_and_armor", () ->
                    CreativeModeTab.builder()
                            .title(Component.translatable(
                                    "creativetab.fresh_arms_and_armor"
                            ))
                            .icon(() ->
                                    TwoHandedItems.NETHERITE_GREATSWORD.get().getDefaultInstance()
                            )
                            .displayItems((parameters, output) -> {

                                // Greatswords
                                output.accept(TwoHandedItems.WOODEN_GREATSWORD.get());
                                output.accept(TwoHandedItems.STONE_GREATSWORD.get());
                                output.accept(TwoHandedItems.IRON_GREATSWORD.get());
                                output.accept(TwoHandedItems.GOLDEN_GREATSWORD.get());
                                output.accept(TwoHandedItems.DIAMOND_GREATSWORD.get());
                                output.accept(TwoHandedItems.NETHERITE_GREATSWORD.get());

                                // Greataxes
                                output.accept(TwoHandedItems.WOODEN_GREATAXE.get());
                                output.accept(TwoHandedItems.STONE_GREATAXE.get());
                                output.accept(TwoHandedItems.IRON_GREATAXE.get());
                                output.accept(TwoHandedItems.GOLDEN_GREATAXE.get());
                                output.accept(TwoHandedItems.DIAMOND_GREATAXE.get());
                                output.accept(TwoHandedItems.NETHERITE_GREATAXE.get());

                                // Mauls
                                output.accept(TwoHandedItems.WOODEN_MAUL.get());
                                output.accept(TwoHandedItems.STONE_MAUL.get());
                                output.accept(TwoHandedItems.IRON_MAUL.get());
                                output.accept(TwoHandedItems.GOLDEN_MAUL.get());
                                output.accept(TwoHandedItems.DIAMOND_MAUL.get());
                                output.accept(TwoHandedItems.NETHERITE_MAUL.get());

                            })
                            .build()
            );
}
