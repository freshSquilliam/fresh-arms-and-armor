package com.freshsquilliam.fresharmsandarmor;

import com.freshsquilliam.fresharmsandarmor.item.ModCreativeTabs;
import com.freshsquilliam.fresharmsandarmor.item.TwoHandedWeapons;
import com.freshsquilliam.fresharmsandarmor.item.armor.BarbarianArmorItems;
import com.mojang.logging.LogUtils;
import net.minecraft.client.Minecraft;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.server.ServerStartingEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.config.ModConfig;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.slf4j.Logger;

@Mod(FreshArmsAndArmor.MODID)
public class FreshArmsAndArmor {

    public static final String MODID = "fresh_arms_and_armor";
    private static final Logger LOGGER = LogUtils.getLogger();

    public FreshArmsAndArmor(FMLJavaModLoadingContext context) {
        IEventBus modEventBus = context.getModEventBus();

        modEventBus.addListener(this::commonSetup);
        ModCreativeTabs.TABS.register(modEventBus);

        TwoHandedWeapons.ITEMS.register(modEventBus);
        BarbarianArmorItems.ITEMS.register(modEventBus);

        MinecraftForge.EVENT_BUS.register(this);

        context.registerConfig(ModConfig.Type.COMMON, Config.SPEC);
    }

    private void commonSetup(final FMLCommonSetupEvent event) {
        LOGGER.info("Fresh Arms & Armor loaded");
    }

    @SubscribeEvent
    public void onServerStarting(ServerStartingEvent event) {
        LOGGER.info("Server starting");
    }

    @Mod.EventBusSubscriber(modid = MODID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
    public static class ClientModEvents {

        @SubscribeEvent
        public static void onClientSetup(FMLClientSetupEvent event) {
            LOGGER.info("Client setup complete");
            LOGGER.info("Player name: {}", Minecraft.getInstance().getUser().getName());
        }
    }
}
