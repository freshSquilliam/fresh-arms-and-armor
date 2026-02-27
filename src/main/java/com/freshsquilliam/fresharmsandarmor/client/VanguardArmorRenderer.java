package com.freshsquilliam.fresharmsandarmor.client;

import com.freshsquilliam.fresharmsandarmor.item.vanguard.VanguardArmorItem;
import software.bernie.geckolib.renderer.GeoArmorRenderer;

public class VanguardArmorRenderer extends GeoArmorRenderer<VanguardArmorItem> {
    public VanguardArmorRenderer() {
        super(new VanguardArmorModel());
    }
}