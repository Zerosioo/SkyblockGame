package me.zero.skyblock.farming.data;

import org.bukkit.inventory.ItemStack;

import me.zero.skyblock.farming.drop.DropRarity;

public class CustomDropResult {
    private final ItemStack drop;
    private final double baseChance;
    private final DropRarity rarity;
    private final int amount;

    public CustomDropResult(ItemStack drop, double baseChance, DropRarity rarity, int amount) {
        this.drop = drop;
        this.baseChance = baseChance;
        this.rarity = rarity;
        this.amount = amount;
    }

    public ItemStack getDrop() { return drop; }
    public double getBaseChance() { return baseChance; }
    public DropRarity getRarity() { return rarity; }
    public int getAmount() { return amount; }
}
