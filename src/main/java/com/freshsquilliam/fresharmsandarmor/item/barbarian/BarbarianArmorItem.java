package com.freshsquilliam.fresharmsandarmor.item.barbarian;

import com.freshsquilliam.fresharmsandarmor.client.BarbarianArmorRenderer;
import net.minecraft.ChatFormatting;
import net.minecraft.client.model.HumanoidModel;
import net.minecraft.network.chat.Component;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.Level;
import net.minecraftforge.client.extensions.common.IClientItemExtensions;
import org.jetbrains.annotations.NotNull;
import software.bernie.geckolib.animatable.GeoItem;
import software.bernie.geckolib.core.animatable.instance.AnimatableInstanceCache;
import software.bernie.geckolib.core.animatable.instance.SingletonAnimatableInstanceCache;
import software.bernie.geckolib.core.animation.*;
import software.bernie.geckolib.core.object.PlayState;

import java.util.List;
import java.util.function.Consumer;

public class BarbarianArmorItem extends ArmorItem implements GeoItem {

    private final AnimatableInstanceCache cache =
            new SingletonAnimatableInstanceCache(this);

    public BarbarianArmorItem(ArmorMaterial material, Type type, Properties properties) {
        super(material, type, properties);
    }

    // ===== GeckoLib =====

    @Override
    public void initializeClient(Consumer<IClientItemExtensions> consumer) {
        consumer.accept(new IClientItemExtensions() {

            private BarbarianArmorRenderer renderer;

            @Override
            public @NotNull HumanoidModel<?> getHumanoidArmorModel(
                    LivingEntity livingEntity,
                    ItemStack itemStack,
                    EquipmentSlot equipmentSlot,
                    HumanoidModel<?> original
            ) {
                if (this.renderer == null) {
                    this.renderer = new BarbarianArmorRenderer();
                }

                this.renderer.prepForRender(
                        livingEntity,
                        itemStack,
                        equipmentSlot,
                        original
                );

                return this.renderer;
            }
        });
    }

    private PlayState predicate(AnimationState<?> state) {
        state.getController().setAnimation(
                RawAnimation.begin().then("idle", Animation.LoopType.LOOP)
        );
        return PlayState.CONTINUE;
    }

    @Override
    public void registerControllers(AnimatableManager.ControllerRegistrar controllers) {
        controllers.add(
                new AnimationController<>(this, "controller", 0, this::predicate)
        );
    }

    @Override
    public AnimatableInstanceCache getAnimatableInstanceCache() {
        return cache;
    }

    // ===== Tooltip =====

    @Override
    public void appendHoverText(
            ItemStack stack,
            Level level,
            List<Component> tooltip,
            TooltipFlag flag
    ) {
        float bonus = getTwoHandedBonusForMaterial(this.getMaterial());

        if (bonus > 0.0F) {
            tooltip.add(
                    Component.literal("+" + bonus + "% Two-Handed Weapon Damage")
                            .withStyle(ChatFormatting.RED)
            );
        }
    }

    private static float getTwoHandedBonusForMaterial(ArmorMaterial material) {

        if (material == BarbArmorMaterials.IRON) {
            return 5.0F;
        }

        if (material == BarbArmorMaterials.DIAMOND) {
            return 7.5F;
        }

        if (material == BarbArmorMaterials.NETHERITE) {
            return 10.0F;
        }

        return 0.0F;
    }
}
