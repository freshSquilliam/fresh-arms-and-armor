package com.freshsquilliam.fresharmsandarmor.item.armor;

public enum BarbarianTier {

    IRON(0.04F, "+4% damage with two-handed weapons"),
    DIAMOND(0.08F, "+8% damage with two-handed weapons"),
    NETHERITE(0.10F, "+10% damage with two-handed weapons");

    private final float damageBonusPerPiece;
    private final String tooltip;

    BarbarianTier(float damageBonusPerPiece, String tooltip) {
        this.damageBonusPerPiece = damageBonusPerPiece;
        this.tooltip = tooltip;
    }

    public float getDamageBonusPerPiece() {
        return damageBonusPerPiece;
    }

    public String getTooltip() {
        return tooltip;
    }
}
