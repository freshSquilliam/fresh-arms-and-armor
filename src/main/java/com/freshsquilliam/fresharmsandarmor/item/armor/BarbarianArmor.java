package com.freshsquilliam.fresharmsandarmor.item.armor;

import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.Item;

public class BarbarianArmor extends ArmorItem {

    public BarbarianArmor(
            ArmorMaterial material,
            Type type,
            Item.Properties properties
    ) {
        super(material, type, properties);
    }
}
