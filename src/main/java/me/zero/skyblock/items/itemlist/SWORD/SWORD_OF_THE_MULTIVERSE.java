package me.zero.skyblock.items.itemlist.SWORD;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SWORD_OF_THE_MULTIVERSE extends SItem implements ItemStatistics {

    @Override
    public String getName() {
        return "§4§lS§c§lw§6§lo§e§lr§a§ld §b§lo§3§lf §9§lt§d§lh§9§le §3§lM§b§lu§a§ll§e§lt§6§li§c§lv§4§le§c§lr§6§ls§e§le";
    }

    @Override
    public List<String> getLore() {
        return null;
    }

    @Override
    public String getId() {
        return "SWORD_OF_THE_MULTIVERSE"; 
    }

    @Override
    public Material getMaterial() {
        return Material.IRON_SWORD;
    }

    @Override
    public ItemType getItemType() {
        return ItemType.SWORD;
    }

    @Override
    public Rarity getRarity() {
        return Rarity.UNOBTAINABLE;
    }

    @Override
    public int getSwingRange() {
        return 15;
    }

}
