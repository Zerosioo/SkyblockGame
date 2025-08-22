package me.zero.skyblock.farming.crops.impl;

import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

import me.zero.skyblock.farming.crops.Crop;
import me.zero.skyblock.farming.data.CustomDropResult;
import me.zero.skyblock.farming.data.FortuneChanceCalculator;
import me.zero.skyblock.farming.drop.DropRarity;
import me.zero.skyblock.util.ToolCheckUtil;

import java.util.*;

public class WheatCrop implements Crop {

    @Override
    public List<ItemStack> getRegularDrops(Player player, boolean doubleChance) {
        List<ItemStack> drops = new ArrayList<>();
        double chance = doubleChance ? 0.5 : 0.25;

        int wheatAmount = FortuneChanceCalculator.calculateDrop(1, chance);
        drops.add(new ItemStack(Material.WHEAT, wheatAmount));

        int seedsAmount = FortuneChanceCalculator.calculateDrop(2, chance);
        drops.add(new ItemStack(Material.SEEDS, seedsAmount));

        return drops;
    }

    @Override
    public List<CustomDropResult> getCustomDrops(Player player, boolean doubleChance) {
        List<CustomDropResult> drops = new ArrayList<>();

        if (ToolCheckUtil.isHolding(player, "Hoe of Greater Tilling")) {
            double chance = doubleChance ? 0.5 : 0.25;

            int breadAmount = FortuneChanceCalculator.calculateDrop(1, chance);
            drops.add(new CustomDropResult(new ItemStack(Material.BREAD, breadAmount), chance, DropRarity.RARE, breadAmount));

            int seedAmount = FortuneChanceCalculator.calculateDrop(2, chance);
            drops.add(new CustomDropResult(new ItemStack(Material.SEEDS, seedAmount), chance, DropRarity.UNCOMMON, seedAmount));
        }

        return drops;
    }

    @Override
    public int getRewardedXP() {
        return 4;
    }

    @Override
    public Material getMaterial() {
        return Material.WHEAT;
    }
}
