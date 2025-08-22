package me.zero.skyblock.items.itemlist.NULL;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class EASTER_BASKET extends SItem implements ItemStatistics, SkullItem {

    @Override
    public String getName() {
        return "Easter Basket";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "EASTER_BASKET"; 
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
    public String getTexture() {
        return "eyJ0aW1lc3RhbXAiOjE1MTgyNzQ3ODI4NjcsInByb2ZpbGVJZCI6ImE5MGI4MmIwNzE4NTQ0ZjU5YmE1MTZkMGY2Nzk2NDkwIiwicHJvZmlsZU5hbWUiOiJJbUZhdFRCSCIsInNpZ25hdHVyZVJlcXVpcmVkIjp0cnVlLCJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvODNjMjVhN2ExODgxOTZiMTg3MTcyNjRmZmU4MzdjYTM0OGNmNzE5ZTgyNzE3OWVkYzRiNzhjYmNiOGM3ZGQ4In19fQ==";
    }

}
