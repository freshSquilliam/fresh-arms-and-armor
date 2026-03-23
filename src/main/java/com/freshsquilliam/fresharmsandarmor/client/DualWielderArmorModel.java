package com.freshsquilliam.fresharmsandarmor.client;

import com.freshsquilliam.fresharmsandarmor.FreshArmsAndArmor;
import com.freshsquilliam.fresharmsandarmor.item.dualwielder.DualWielderArmorMaterials;
import com.freshsquilliam.fresharmsandarmor.item.dualwielder.DualWielderArmorItem;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.ArmorMaterial;
import software.bernie.geckolib.model.GeoModel;

public class DualWielderArmorModel extends GeoModel<DualWielderArmorItem> {

    @Override
    public ResourceLocation getModelResource(DualWielderArmorItem animatable) {
        return new ResourceLocation(
                FreshArmsAndArmor.MODID,
                "geo/dualwielder_armor.geo.json"
        );
    }

    @Override
    public ResourceLocation getTextureResource(DualWielderArmorItem animatable) {
        ArmorMaterial material = animatable.getMaterial();

        // Match on material
        if (material == DualWielderArmorMaterials.DIAMOND) {
            return new ResourceLocation(
                    FreshArmsAndArmor.MODID,
                    "textures/armor/dualwielder_armor_diamond.png"
            );
        }

        if (material == DualWielderArmorMaterials.NETHERITE) {
            return new ResourceLocation(
                    FreshArmsAndArmor.MODID,
                    "textures/armor/dualwielder_armor_netherite.png"
            );
        }

        // Default: iron
        return new ResourceLocation(
                FreshArmsAndArmor.MODID,
                "textures/armor/dualwielder_armor_iron.png"
        );
    }

    @Override
    public ResourceLocation getAnimationResource(DualWielderArmorItem animatable) {
        return new ResourceLocation(
                FreshArmsAndArmor.MODID,
                "animations/dualwielder_armor.animation.json"
        );
    }
}
