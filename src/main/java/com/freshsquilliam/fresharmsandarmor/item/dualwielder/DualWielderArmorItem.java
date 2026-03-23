package com.freshsquilliam.fresharmsandarmor.item.dualwielder;

import com.freshsquilliam.fresharmsandarmor.Config;
import com.freshsquilliam.fresharmsandarmor.client.DualWielderArmorRenderer;
import com.freshsquilliam.fresharmsandarmor.item.dualwielder.DualWielderArmorMaterials;
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

public class DualWielderArmorItem extends ArmorItem implements GeoItem {

    private final AnimatableInstanceCache cache =
            new SingletonAnimatableInstanceCache(this);

    public DualWielderArmorItem(ArmorMaterial material, Type type, Properties properties) {
        super(material, type, properties);
    }

    // ===== GeckoLib =====

    @Override
    public void initializeClient(Consumer<IClientItemExtensions> consumer) {
        consumer.accept(new IClientItemExtensions() {

            private DualWielderArmorRenderer renderer;

            @Override
            public @NotNull HumanoidModel<?> getHumanoidArmorModel(
                    LivingEntity livingEntity,
                    ItemStack itemStack,
                    EquipmentSlot equipmentSlot,
                    HumanoidModel<?> original
            ) {
                if (this.renderer == null) {
                    this.renderer = new DualWielderArmorRenderer();
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
        float bonus = getSpeedBonusForMaterial(this.getMaterial());

        if (bonus > 0.0F) {
            int percent = Math.round(bonus * 100);

            tooltip.add(
                    Component.literal("+" + percent + "% Attack Speed")
                            .withStyle(ChatFormatting.AQUA)
            );
        }
    }

    private static float getSpeedBonusForMaterial(ArmorMaterial material) {

        if (material == DualWielderArmorMaterials.IRON) {
            return Config.DUAL_IRON_SPEED.get().floatValue();
        }

        if (material == DualWielderArmorMaterials.DIAMOND) {
            return Config.DUAL_DIAMOND_SPEED.get().floatValue();
        }

        if (material == DualWielderArmorMaterials.NETHERITE) {
            return Config.DUAL_NETHERITE_SPEED.get().floatValue();
        }

        return 0.0F;
    }
}