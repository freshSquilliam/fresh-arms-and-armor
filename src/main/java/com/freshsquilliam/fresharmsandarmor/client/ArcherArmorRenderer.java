package com.freshsquilliam.fresharmsandarmor.client;

import com.freshsquilliam.fresharmsandarmor.item.archer.ArcherArmorItem;
import software.bernie.geckolib.renderer.GeoArmorRenderer;

public class ArcherArmorRenderer extends GeoArmorRenderer<ArcherArmorItem> {
    public ArcherArmorRenderer() {
        super(new ArcherArmorModel());
    }
}