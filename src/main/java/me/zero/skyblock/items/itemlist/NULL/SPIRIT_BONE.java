package me.zero.skyblock.items.itemlist.NULL;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SPIRIT_BONE extends SItem implements ItemStatistics, SkullItem {

    @Override
    public String getName() {
        return "Spirit Bone";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "SPIRIT_BONE"; 
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
        return Rarity.EPIC;
    }

    @Override
    public boolean isDungeonItem() {
      	return true;
    }

    @Override
    public String getTexture() {
        return "eyJ0aW1lc3RhbXAiOjE1NzE0OTg0NzUxNTYsInByb2ZpbGVJZCI6ImVkNTNkZDgxNGY5ZDRhM2NiNGViNjUxZGNiYTc3ZTY2IiwicHJvZmlsZU5hbWUiOiJGb3J5eExPTCIsInNpZ25hdHVyZVJlcXVpcmVkIjp0cnVlLCJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvZDg0ODA1MTdhNDQ5N2NmN2NiZjFmYzVlZjhlZWViMTExMTliYTA3MzZkOTNkNTFiYzVlMWU2ZGE5MGU2OTgyNCJ9fX0=";
    }

}
