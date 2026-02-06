package com.freshsquilliam.fresharmsandarmor.client;

import com.freshsquilliam.fresharmsandarmor.item.custom.BarbarianArmorItem;
import software.bernie.geckolib.renderer.GeoArmorRenderer;

public class BarbarianArmorRenderer extends GeoArmorRenderer<BarbarianArmorItem> {
    public BarbarianArmorRenderer() {
        super(new BarbarianArmorModel());
    }
}