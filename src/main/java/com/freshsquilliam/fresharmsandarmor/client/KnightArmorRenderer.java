package com.freshsquilliam.fresharmsandarmor.client;

import com.freshsquilliam.fresharmsandarmor.item.knight.KnightArmorItem;
import software.bernie.geckolib.renderer.GeoArmorRenderer;

public class KnightArmorRenderer extends GeoArmorRenderer<KnightArmorItem> {
    public KnightArmorRenderer() {
        super(new KnightArmorModel());
    }
}