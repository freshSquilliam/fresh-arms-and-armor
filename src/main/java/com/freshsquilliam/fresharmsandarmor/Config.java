package com.freshsquilliam.fresharmsandarmor;

import net.minecraftforge.common.ForgeConfigSpec;

public class Config {

    public static final ForgeConfigSpec SPEC;

    // ----------------------
    // BARBARIAN
    // ----------------------

    public static final ForgeConfigSpec.DoubleValue BARB_IRON_BONUS;
    public static final ForgeConfigSpec.DoubleValue BARB_DIAMOND_BONUS;
    public static final ForgeConfigSpec.DoubleValue BARB_NETHERITE_BONUS;

    // ----------------------
    // KNIGHT
    // ----------------------

    public static final ForgeConfigSpec.DoubleValue KNIGHT_IRON_BONUS;
    public static final ForgeConfigSpec.DoubleValue KNIGHT_DIAMOND_BONUS;
    public static final ForgeConfigSpec.DoubleValue KNIGHT_NETHERITE_BONUS;

    // ----------------------
    // VANGUARD
    // ----------------------

    public static final ForgeConfigSpec.DoubleValue VANGUARD_IRON_BONUS;
    public static final ForgeConfigSpec.DoubleValue VANGUARD_DIAMOND_BONUS;
    public static final ForgeConfigSpec.DoubleValue VANGUARD_NETHERITE_BONUS;


    static {
        ForgeConfigSpec.Builder builder = new ForgeConfigSpec.Builder();

        // ----------------------
        // Barbarian
        // ----------------------

        builder.push("Barbarian Armor");

        BARB_IRON_BONUS = builder
                .comment("Damage bonus per piece of Iron Barbarian armor (0.05 = 5%)")
                .defineInRange("ironBonus", 0.05D, 0.0D, 5.0D);

        BARB_DIAMOND_BONUS = builder
                .comment("Damage bonus per piece of Diamond Barbarian armor (0.075 = 7.5%)")
                .defineInRange("diamondBonus", 0.075D, 0.0D, 5.0D);

        BARB_NETHERITE_BONUS = builder
                .comment("Damage bonus per piece of Netherite Barbarian armor (0.10 = 10%)")
                .defineInRange("netheriteBonus", 0.10D, 0.0D, 5.0D);

        builder.pop();

        // ----------------------
        // Knight
        // ----------------------

        builder.push("Knight Armor");

        KNIGHT_IRON_BONUS = builder
                .comment("Damage bonus per piece of Iron Knight armor (0.04 = 4%)")
                .defineInRange("ironBonus", 0.04D, 0.0D, 5.0D);

        KNIGHT_DIAMOND_BONUS = builder
                .comment("Damage bonus per piece of Diamond Knight armor (0.06 = 6%)")
                .defineInRange("diamondBonus", 0.06D, 0.0D, 5.0D);

        KNIGHT_NETHERITE_BONUS = builder
                .comment("Damage bonus per piece of Netherite Knight armor (0.08 = 8%)")
                .defineInRange("netheriteBonus", 0.08D, 0.0D, 5.0D);

        builder.pop();

        // ----------------------
        // Vanguard
        // ----------------------

        builder.push("Vanguard Armor");

        VANGUARD_IRON_BONUS = builder
                .comment("Damage bonus per piece of Iron Vanguard armor (0.045 = 4.5%)")
                .defineInRange("ironBonus", 0.045D, 0.0D, 5.0D);

        VANGUARD_DIAMOND_BONUS = builder
                .comment("Damage bonus per piece of Diamond Vanguard armor (0.07 = 7%)")
                .defineInRange("diamondBonus", 0.07D, 0.0D, 5.0D);

        VANGUARD_NETHERITE_BONUS = builder
                .comment("Damage bonus per piece of Netherite Vanguard armor (0.09 = 9%)")
                .defineInRange("netheriteBonus", 0.09D, 0.0D, 5.0D);

        builder.pop();

        SPEC = builder.build();
    }
}