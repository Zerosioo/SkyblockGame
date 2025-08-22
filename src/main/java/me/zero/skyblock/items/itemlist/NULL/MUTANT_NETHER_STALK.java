package me.zero.skyblock.items.itemlist.NULL;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MUTANT_NETHER_STALK extends SItem implements ItemStatistics, SkullItem, Sellable {

    @Override
    public String getName() {
        return "Mutant Nether Wart";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "MUTANT_NETHER_STALK"; 
    }

    @Override
    public Material getMaterial() {
        return Material.SKULL_ITEM;
    }

    @Override
    public byte getDurability() {
        return 3;
    }

    @Override
    public ItemType getItemType() {
 	return null;
    }

    @Override
    public Rarity getRarity() {
        return Rarity.RARE;
    }

    @Override
    public int getPrice() {
        return 102400;
    }

    @Override
    public String getTexture() {
        return "eyJ0aW1lc3RhbXAiOjE1NzE3NzY3NDAzMzYsInByb2ZpbGVJZCI6ImVkNTNkZDgxNGY5ZDRhM2NiNGViNjUxZGNiYTc3ZTY2IiwicHJvZmlsZU5hbWUiOiJGb3J5eExPTCIsInNpZ25hdHVyZVJlcXVpcmVkIjp0cnVlLCJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvNzdlZmMyYmYzMjk3YmFkZTczOTFkZmJkNTBlZmY1NTZhNGU5ZDM5MjBkNTYxNWJlMjNiMjJkNjY3ZTA1MzMiLCJtZXRhZGF0YSI6eyJtb2RlbCI6InNsaW0ifX19fQ==";
    }

}
