package com.freshsquilliam.fresharmsandarmor.client.renderer;

import com.freshsquilliam.fresharmsandarmor.item.armor.BarbarianArmor;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib.GeckoLib;
import software.bernie.geckolib.model.DefaultedItemGeoModel;
import software.bernie.geckolib.renderer.GeoArmorRenderer;
import software.bernie.geckolib.renderer.layer.AutoGlowingGeoLayer;


public final class BarbarianArmorRenderer extends GeoArmorRenderer<BarbarianArmor.BarbarianArmor> {
    public BarbarianArmorRenderer() {
        super(new DefaultedItemGeoModel<>(new ResourceLocation(GeckoLib.MOD_ID, "armor/gecko_armor")));

        addRenderLayer(new AutoGlowingGeoLayer<>(this));
    }
}
