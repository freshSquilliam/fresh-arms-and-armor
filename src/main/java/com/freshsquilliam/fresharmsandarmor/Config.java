package com.freshsquilliam.fresharmsandarmor;

import net.minecraftforge.common.ForgeConfigSpec;

public class Config {

    public static final ForgeConfigSpec SPEC;
    public static final Common COMMON;

    static {
        ForgeConfigSpec.Builder builder = new ForgeConfigSpec.Builder();
        COMMON = new Common(builder);
        SPEC = builder.build();
    }

    public static class Common {

        public final ForgeConfigSpec.DoubleValue barbarianIronBonus;
        public final ForgeConfigSpec.DoubleValue barbarianDiamondBonus;
        public final ForgeConfigSpec.DoubleValue barbarianNetheriteBonus;

        Common(ForgeConfigSpec.Builder builder) {

            builder.push("barbarian");

            barbarianIronBonus = builder
                    .comment("Damage bonus per IRON Barbarian armor piece (e.g. 0.05 = +5%)")
                    .defineInRange("iron_bonus", 0.05D, 0.0D, 10.0D);

            barbarianDiamondBonus = builder
                    .comment("Damage bonus per DIAMOND Barbarian armor piece")
                    .defineInRange("diamond_bonus", 0.075D, 0.0D, 10.0D);

            barbarianNetheriteBonus = builder
                    .comment("Damage bonus per NETHERITE Barbarian armor piece")
                    .defineInRange("netherite_bonus", 0.10D, 0.0D, 10.0D);

            builder.pop();
        }
    }
}
