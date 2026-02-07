package com.freshsquilliam.fresharmsandarmor.loot;

import com.freshsquilliam.fresharmsandarmor.FreshArmsAndArmor;
import com.mojang.serialization.Codec;
import net.minecraftforge.common.loot.IGlobalLootModifier;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModLootModifiers {

    public static final DeferredRegister<Codec<? extends IGlobalLootModifier>> LOOT_MODIFIERS =
            DeferredRegister.create(
                    ForgeRegistries.Keys.GLOBAL_LOOT_MODIFIER_SERIALIZERS,
                    FreshArmsAndArmor.MODID
            );

    public static final RegistryObject<Codec<WarSigilLootModifier>> WAR_SIGIL =
            LOOT_MODIFIERS.register(
                    "war_sigil",
                    () -> WarSigilLootModifier.CODEC
            );
}
