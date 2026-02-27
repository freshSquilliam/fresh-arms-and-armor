package com.freshsquilliam.fresharmsandarmor.client;

import com.freshsquilliam.fresharmsandarmor.FreshArmsAndArmor;
import com.freshsquilliam.fresharmsandarmor.item.vanguard.VanguardArmorMaterials;
import com.freshsquilliam.fresharmsandarmor.item.vanguard.VanguardArmorItem;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.ArmorMaterial;
import software.bernie.geckolib.model.GeoModel;

public class VanguardArmorModel extends GeoModel<VanguardArmorItem> {

    @Override
    public ResourceLocation getModelResource(VanguardArmorItem animatable) {
        return new ResourceLocation(
                FreshArmsAndArmor.MODID,
                "geo/vanguard_armor.geo.json"
        );
    }

    @Override
    public ResourceLocation getTextureResource(VanguardArmorItem animatable) {
        ArmorMaterial material = animatable.getMaterial();

        // Match on material
        if (material == VanguardArmorMaterials.DIAMOND) {
            return new ResourceLocation(
                    FreshArmsAndArmor.MODID,
                    "textures/armor/vanguard_armor_diamond.png"
            );
        }

        if (material == VanguardArmorMaterials.NETHERITE) {
            return new ResourceLocation(
                    FreshArmsAndArmor.MODID,
                    "textures/armor/vanguard_armor_netherite.png"
            );
        }

        // Default: iron
        return new ResourceLocation(
                FreshArmsAndArmor.MODID,
                "textures/armor/vanguard_armor_iron.png"
        );
    }

    @Override
    public ResourceLocation getAnimationResource(VanguardArmorItem animatable) {
        return new ResourceLocation(
                FreshArmsAndArmor.MODID,
                "animations/vanguard_armor.animation.json"
        );
    }
}
