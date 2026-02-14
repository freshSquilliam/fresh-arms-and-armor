package com.freshsquilliam.fresharmsandarmor.client;

import com.freshsquilliam.fresharmsandarmor.FreshArmsAndArmor;
import com.freshsquilliam.fresharmsandarmor.item.KnightArmorMaterials;
import com.freshsquilliam.fresharmsandarmor.item.custom.KnightArmorItem;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.ArmorMaterial;
import software.bernie.geckolib.model.GeoModel;

public class KnightArmorModel extends GeoModel<KnightArmorItem> {

    @Override
    public ResourceLocation getModelResource(KnightArmorItem animatable) {
        return new ResourceLocation(
                FreshArmsAndArmor.MODID,
                "geo/knight_armor.geo.json"
        );
    }

    @Override
    public ResourceLocation getTextureResource(KnightArmorItem animatable) {
        ArmorMaterial material = animatable.getMaterial();

        // Match on material
        if (material == KnightArmorMaterials.DIAMOND) {
            return new ResourceLocation(
                    FreshArmsAndArmor.MODID,
                    "textures/armor/knight_armor_diamond.png"
            );
        }

        if (material == KnightArmorMaterials.NETHERITE) {
            return new ResourceLocation(
                    FreshArmsAndArmor.MODID,
                    "textures/armor/knight_armor_netherite.png"
            );
        }

        // Default: iron
        return new ResourceLocation(
                FreshArmsAndArmor.MODID,
                "textures/armor/knight_armor_iron.png"
        );
    }

    @Override
    public ResourceLocation getAnimationResource(KnightArmorItem animatable) {
        return new ResourceLocation(
                FreshArmsAndArmor.MODID,
                "animations/knight_armor.animation.json"
        );
    }
}
