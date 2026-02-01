package com.freshsquilliam.fresharmsandarmor.item;

import com.freshsquilliam.fresharmsandarmor.FreshArmsAndArmor;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;

public class ModItemTags {

    public static final TagKey<Item> TWO_HANDED =
            TagKey.create(
                    Registries.ITEM,
                    new ResourceLocation(
                            FreshArmsAndArmor.MODID,
                            "two_handed"
                    )
            );
}
