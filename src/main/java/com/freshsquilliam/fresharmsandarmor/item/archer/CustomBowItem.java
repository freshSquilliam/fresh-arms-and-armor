package com.freshsquilliam.fresharmsandarmor.item.archer;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.projectile.AbstractArrow;
import net.minecraft.world.item.ArrowItem;
import net.minecraft.world.item.BowItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.enchantment.EnchantmentHelper;
import net.minecraft.world.item.enchantment.Enchantments;
import net.minecraft.world.level.Level;

public class CustomBowItem extends BowItem {

    private final float pullTime;
    private final float arrowSpeed;
    private final boolean autoRelease; // ⭐ NEW

    public CustomBowItem(Properties properties, float arrowSpeed, float pullTime, boolean autoRelease) {
        super(properties);
        this.arrowSpeed = arrowSpeed;
        this.pullTime = pullTime;
        this.autoRelease = autoRelease;
    }

    public float getPower(int time) {
        float f = (float) time / this.pullTime;
        f = (f * f + f * 2.0F) / 3.0F;
        if (f > 1.0F) f = 1.0F;
        return f;
    }

    @Override
    public int getUseDuration(ItemStack stack) {
        return 72000; // DO NOT change this
    }

    // ⭐ NEW: auto-release logic
    @Override
    public void onUseTick(Level level, LivingEntity entity, ItemStack stack, int remainingTicks) {
        if (!autoRelease) return;
        if (!(entity instanceof Player player)) return;

        int useTime = this.getUseDuration(stack) - remainingTicks;
        float power = getPower(useTime);

        if (power >= 1.0F && remainingTicks > 0) {
            player.releaseUsingItem();
        }
    }

    @Override
    public void releaseUsing(ItemStack stack, Level level, LivingEntity entity, int timeLeft) {
        if (!(entity instanceof Player player)) return;

        boolean infinite = player.getAbilities().instabuild ||
                EnchantmentHelper.getItemEnchantmentLevel(Enchantments.INFINITY_ARROWS, stack) > 0;

        ItemStack ammo = player.getProjectile(stack);
        int useTime = this.getUseDuration(stack) - timeLeft;

        if (ammo.isEmpty() && !infinite) return;
        if (ammo.isEmpty()) ammo = new ItemStack(Items.ARROW);

        float power = getPower(useTime);
        if (power < 0.1F) return;

        if (!level.isClientSide) {
            ArrowItem arrowItem = (ArrowItem)(ammo.getItem() instanceof ArrowItem ? ammo.getItem() : Items.ARROW);
            AbstractArrow arrow = arrowItem.createArrow(level, ammo, player);

            // Velocity
            arrow.shootFromRotation(player, player.getXRot(), player.getYRot(), 0.0F,
                    power * this.arrowSpeed, 0.2F);

            if (power >= 1.0F) {
                arrow.setCritArrow(true);
            }

            // Enchantments
            int powerEnchant = EnchantmentHelper.getItemEnchantmentLevel(Enchantments.POWER_ARROWS, stack);
            if (powerEnchant > 0) {
                arrow.setBaseDamage(arrow.getBaseDamage() + powerEnchant * 0.5D + 0.5D);
            }

            int punch = EnchantmentHelper.getItemEnchantmentLevel(Enchantments.PUNCH_ARROWS, stack);
            if (punch > 0) arrow.setKnockback(punch);

            if (EnchantmentHelper.getItemEnchantmentLevel(Enchantments.FLAMING_ARROWS, stack) > 0) {
                arrow.setSecondsOnFire(100);
            }

            level.addFreshEntity(arrow);
        }

        if (!infinite) {
            ammo.shrink(1);
        }
    }

    public float getPullTime() {
        return this.pullTime;
    }
}