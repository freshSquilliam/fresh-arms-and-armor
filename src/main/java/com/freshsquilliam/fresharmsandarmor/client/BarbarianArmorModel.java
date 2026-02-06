package com.freshsquilliam.fresharmsandarmor.client;

import com.freshsquilliam.fresharmsandarmor.FreshArmsAndArmor;
import com.freshsquilliam.fresharmsandarmor.item.ModArmorMaterials;
import com.freshsquilliam.fresharmsandarmor.item.custom.BarbarianArmorItem;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.ArmorMaterial;
import software.bernie.geckolib.model.GeoModel;

public class BarbarianArmorModel extends GeoModel<BarbarianArmorItem> {

    @Override
    public ResourceLocation getModelResource(BarbarianArmorItem animatable) {
        return new ResourceLocation(
                FreshArmsAndArmor.MODID,
                "geo/barbarian_armor.geo.json"
        );
    }

    @Override
    public ResourceLocation getTextureResource(BarbarianArmorItem animatable) {
        ArmorMaterial material = animatable.getMaterial();

        // Match on material — simple and explicit
        if (material == ModArmorMaterials.DIAMOND) {
            return new ResourceLocation(
                    FreshArmsAndArmor.MODID,
                    "textures/armor/barbarian_armor_diamond.png"
            );
        }

        if (material == ModArmorMaterials.NETHERITE) {
            return new ResourceLocation(
                    FreshArmsAndArmor.MODID,
                    "textures/armor/barbarian_armor_netherite.png"
            );
        }

        // Default: iron
        return new ResourceLocation(
                FreshArmsAndArmor.MODID,
                "textures/armor/barbarian_armor_iron.png"
        );
    }

    @Override
    public ResourceLocation getAnimationResource(BarbarianArmorItem animatable) {
        return new ResourceLocation(
                FreshArmsAndArmor.MODID,
                "animations/barbarian_armor.animation.json"
        );
    }
}
