package com.freshsquilliam.fresharmsandarmor.item.armor;

import com.freshsquilliam.fresharmsandarmor.FreshArmsAndArmor;
import com.freshsquilliam.fresharmsandarmor.client.renderer.BarbarianArmorRenderer;
import net.minecraft.ChatFormatting;
import net.minecraft.client.model.HumanoidModel;
import net.minecraft.network.chat.Component;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.Level;
import net.minecraftforge.client.extensions.common.IClientItemExtensions;
import org.jetbrains.annotations.NotNull;
import software.bernie.example.client.renderer.armor.GeckoArmorRenderer;
import software.bernie.geckolib.animatable.GeoItem;
import software.bernie.geckolib.core.animatable.instance.AnimatableInstanceCache;
import software.bernie.geckolib.core.animation.AnimatableManager.ControllerRegistrar;
import software.bernie.geckolib.renderer.GeoArmorRenderer;
import software.bernie.geckolib.util.GeckoLibUtil;

import java.util.List;
import java.util.function.Consumer;

public class BarbarianArmor extends ArmorItem implements GeoItem {

    private final BarbarianTier tier;

    private final AnimatableInstanceCache cache =
            GeckoLibUtil.createInstanceCache(this);

    public BarbarianArmor(
            ArmorMaterial material,
            Type type,
            BarbarianTier tier,
            Item.Properties properties
    ) {
        super(material, type, properties);
        this.tier = tier;
    }

    public BarbarianTier getTier() {
        return tier;
    }

    // ===== GeckoLib =====

    public final class BarbarianArmor extends ArmorItem implements GeoItem {
        private final AnimatableInstanceCache cache = GeckoLibUtil.createInstanceCache(this);

        public BarbarianArmor(ArmorMaterial armorMaterial, Type type, Properties properties) {
            super(armorMaterial, type, properties);
        }

        // Create our armor model/renderer for forge and return it
        @Override
        public void initializeClient(Consumer<IClientItemExtensions> consumer) {
            consumer.accept(new IClientItemExtensions() {
                private GeoArmorRenderer<?> renderer;

                @Override
                public @NotNull HumanoidModel<?> getHumanoidArmorModel(LivingEntity livingEntity, ItemStack itemStack, EquipmentSlot equipmentSlot, HumanoidModel<?> original) {
                    if (this.renderer == null)
                        this.renderer = new GeckoArmorRenderer();

                    // This prepares our GeoArmorRenderer for the current render frame.
                    // These parameters may be null however, so we don't do anything further with them
                    this.renderer.prepForRender(livingEntity, itemStack, equipmentSlot, original);

                    return this.renderer;
                }
            });
        }

    /**
     * IMPORTANT:
     * Armor texture selection MUST live on the item, not the renderer,
     * for GeckoLib armor to work correctly.
     */
    @Override
    public String getArmorTexture(
            ItemStack stack,
            Entity entity,
            EquipmentSlot slot,
            String type
    ) {
        return FreshArmsAndArmor.MODID
                + ":textures/item/armor/barbarian_armor_iron";
    }


    @Override
    public AnimatableInstanceCache getAnimatableInstanceCache() {
        return cache;
    }

    @Override
    public void registerControllers(ControllerRegistrar controllers) {
        // no animations yet
    }

    // ===== Tooltip =====

    @Override
    public void appendHoverText(
            ItemStack stack,
            Level level,
            List<Component> tooltip,
            TooltipFlag flag
    ) {
        tooltip.add(
                Component.literal(tier.getTooltip())
                        .withStyle(ChatFormatting.RED)
        );
    }
}
