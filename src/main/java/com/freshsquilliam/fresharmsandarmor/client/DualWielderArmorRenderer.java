package com.freshsquilliam.fresharmsandarmor.client;

import com.freshsquilliam.fresharmsandarmor.item.dualwielder.DualWielderArmorItem;
import software.bernie.geckolib.renderer.GeoArmorRenderer;

public class DualWielderArmorRenderer extends GeoArmorRenderer<DualWielderArmorItem> {
    public DualWielderArmorRenderer() {
        super(new DualWielderArmorModel());
    }
}