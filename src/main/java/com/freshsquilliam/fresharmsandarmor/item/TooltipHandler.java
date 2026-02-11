package com.freshsquilliam.fresharmsandarmor.item;

import net.minecraft.ChatFormatting;
import net.minecraft.network.chat.Component;
import net.minecraftforge.event.entity.player.ItemTooltipEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber
public class TooltipHandler {

    @SubscribeEvent
    public static void onItemTooltip(ItemTooltipEvent event) {

        if (event.getItemStack().is(ModItemTags.TWO_HANDED)) {
            event.getToolTip().add(
                    Component.literal("Two-Handed")
                            .withStyle(ChatFormatting.RED)
            );
        }

        if (event.getItemStack().is(ModItemTags.ONE_HANDED)) {
            event.getToolTip().add(
                    Component.literal("One-Handed")
                            .withStyle(ChatFormatting.RED)
            );
        }
    }
}
