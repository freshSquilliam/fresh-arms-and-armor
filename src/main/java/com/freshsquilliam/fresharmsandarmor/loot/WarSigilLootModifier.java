package com.freshsquilliam.fresharmsandarmor.loot;

import com.freshsquilliam.fresharmsandarmor.item.ModItems;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.storage.loot.LootContext;
import net.minecraft.world.level.storage.loot.predicates.LootItemCondition;
import net.minecraft.world.level.storage.loot.parameters.LootContextParams;
import net.minecraftforge.common.loot.IGlobalLootModifier;
import net.minecraftforge.common.loot.LootModifier;
import org.jetbrains.annotations.NotNull;

public class WarSigilLootModifier extends LootModifier {

    public static final Codec<WarSigilLootModifier> CODEC =
            RecordCodecBuilder.create(instance ->
                    codecStart(instance).apply(instance, WarSigilLootModifier::new)
            );

    protected WarSigilLootModifier(LootItemCondition[] conditions) {
        super(conditions);
    }

    @Override
    protected @NotNull ObjectArrayList<ItemStack> doApply(
            ObjectArrayList<ItemStack> generatedLoot,
            LootContext context
    ) {
        // DEBUG — proves the modifier is firing at all
        System.out.println("[WarSigilLootModifier] doApply fired");

        Entity entity = context.getParamOrNull(LootContextParams.THIS_ENTITY);

        if (entity != null) {
            System.out.println("[WarSigilLootModifier] Entity type: " + entity.getType());
        }

        if (entity != null && entity.getType() == EntityType.PILLAGER) {
            System.out.println("[WarSigilLootModifier] Pillager detected");

            // 1 in 12 drop chance
            if (context.getRandom().nextInt(12) == 0) {
                System.out.println("[WarSigilLootModifier] Dropping War Sigil");
                generatedLoot.add(new ItemStack(ModItems.WAR_SIGIL.get()));
            }
        }

        return generatedLoot;
    }

    @Override
    public Codec<? extends IGlobalLootModifier> codec() {
        return CODEC;
    }
}
