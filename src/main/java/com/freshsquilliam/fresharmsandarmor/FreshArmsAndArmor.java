package com.freshsquilliam.fresharmsandarmor;

import com.freshsquilliam.fresharmsandarmor.combat.BarbarianArmorHandler;
import com.freshsquilliam.fresharmsandarmor.item.*;
import com.freshsquilliam.fresharmsandarmor.loot.ModLootModifiers;
import com.mojang.logging.LogUtils;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.ModLoadingContext;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.config.ModConfig;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.slf4j.Logger;

@Mod(FreshArmsAndArmor.MODID)
public class FreshArmsAndArmor {

    public static final String MODID = "fresharmsandarmor";
    private static final Logger LOGGER = LogUtils.getLogger();

    public FreshArmsAndArmor() {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();

        modEventBus.addListener(this::commonSetup);
        ModCreativeTabs.TABS.register(modEventBus);

        ModLootModifiers.register(modEventBus);

        TwoHandedWeapons.ITEMS.register(modEventBus);
        OneHandedWeapons.ITEMS.register(modEventBus);
        BarbarianArmorRegistry.ITEMS.register(modEventBus);
        KnightArmorRegistry.ITEMS.register(modEventBus);
        ModItems.ITEMS.register(modEventBus);

        MinecraftForge.EVENT_BUS.register(BarbarianArmorHandler.class);
        MinecraftForge.EVENT_BUS.register(this);

        ModLoadingContext.get().registerConfig(
                ModConfig.Type.COMMON,
                Config.SPEC);
    }

    private void commonSetup(final FMLCommonSetupEvent event) {
        LOGGER.info("Fresh Arms & Armor loaded");
    }

    @Mod.EventBusSubscriber(modid = MODID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
    public static class ClientModEvents {
        @SubscribeEvent
        public static void onClientSetup(FMLClientSetupEvent event) {
            event.enqueueWork(() -> {
                ModItemProperties.addCustomItemProperties();

            });
        }
    }
}
