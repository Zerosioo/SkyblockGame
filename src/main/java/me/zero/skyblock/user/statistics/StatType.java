package me.zero.skyblock.user.statistics;

public enum StatType {
    DAMAGE(false, "§c❁ Damage", "§c❁"),
    STRENGTH(false, "§c❁ Strength", "§c❁"),
    CRIT_CHANCE(false, "§9☣ Crit Chance", "§9☣", true),
    CRIT_DAMAGE(false, "§9☠ Crit Damage", "§9☠", true),
    FEROCITY(false, "§c// Ferocity", "§c//", true),
    SEA_CREATURE_CHANCE(false, "§3ð Sea Creature Chance", "§3ð", true),
    BONUS_ATTACK_SPEED(false, "§e⚔ Bonus Attack Speed", "§e⚔", true),
    HEALTH(true, "§c❤ Health", "§c❤"),
    DEFENSE(true, "§a❇ Defense", "§a❇"),
    SPEED(true, "§f✦ Speed", "§f✦"),
    INTELLIGENCE(true, "§b✎ Intelligence", "§b✎"),
    MINING_FORTUNE(true, "§6☘ Mining Fortune", "§6☘"),
    FARMING_FORTUNE(true, "§6☘ Farming Fortune", "§6☘"),
    FORAGING_FORTUNE(true, "§6☘ Foraging Fortune", "§6☘"),
    MINING_SPEED(true, "§6ℷ Mining Speed", "§6ℷ"),
    MAGIC_FIND(true, "§b✯ Magic Find", "§b✯", true),
    TRUE_DEFENSE(true, "§f❂ True Defense", "§f❂"),
    ABILITY_DAMAGE(true, "§c๑ Ability Damage", "§c๑", true),
    HEALTH_REGEN(true, "§cHealth Regeneration", "§c❣️"),
    HEALTH_PERCENT_REGEN(true, "§cHealth Percent Regeneration", "§c❣️");
    boolean passive;
    String formattedName;
    String symbol;
    boolean percent;

    StatType(boolean passive, String formattedName, String symbol) {
        this.formattedName = formattedName;
        this.passive = passive;
        this.symbol = symbol;
    }

    StatType(boolean passive, String formattedName, String symbol, boolean percent) {
        this.formattedName = formattedName;
        this.passive = passive;
        this.percent = percent;
        this.symbol = symbol;
    }

    public boolean isPassive() {
        return passive;
    }

    public String getFormattedName() {
        return this.formattedName;
    }

    public String getStatSymbol() {
        return symbol;
    }

    public boolean isPercent() {
        return percent;
    }
}