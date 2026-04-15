package com.freshsquilliam.fresharmsandarmor.client;

import com.freshsquilliam.fresharmsandarmor.FreshArmsAndArmor;
import com.freshsquilliam.fresharmsandarmor.item.archer.ArcherArmorItem;
import com.freshsquilliam.fresharmsandarmor.item.archer.ArcherArmorMaterials;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.ArmorMaterial;
import software.bernie.geckolib.model.GeoModel;

public class ArcherArmorModel extends GeoModel<ArcherArmorItem> {

    @Override
    public ResourceLocation getModelResource(ArcherArmorItem animatable) {
        return new ResourceLocation(
                FreshArmsAndArmor.MODID,
                "geo/archer_armor.geo.json"
        );
    }

    @Override
    public ResourceLocation getTextureResource(ArcherArmorItem animatable) {
        ArmorMaterial material = animatable.getMaterial();

        // Match on material
        if (material == ArcherArmorMaterials.DIAMOND) {
            return new ResourceLocation(
                    FreshArmsAndArmor.MODID,
                    "textures/armor/archer_armor_diamond.png"
            );
        }

        if (material == ArcherArmorMaterials.NETHERITE) {
            return new ResourceLocation(
                    FreshArmsAndArmor.MODID,
                    "textures/armor/archer_armor_netherite.png"
            );
        }

        // Default: iron
        return new ResourceLocation(
                FreshArmsAndArmor.MODID,
                "textures/armor/archer_armor_iron.png"
        );
    }

    @Override
    public ResourceLocation getAnimationResource(ArcherArmorItem animatable) {
        return new ResourceLocation(
                FreshArmsAndArmor.MODID,
                "animations/archer_armor.animation.json"
        );
    }
}
