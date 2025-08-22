package me.zero.skyblock.items.itemlist.HELMET;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DARK_GOGGLES extends SItem implements ItemStatistics, SkullItem, Sellable {

    @Override
    public String getName() {
        return "Dark Goggles";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "DARK_GOGGLES"; 
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
        return ItemType.HELMET;
    }

    @Override
    public Rarity getRarity() {
        return Rarity.RARE;
    }

    @Override
    public boolean isDungeonItem() {
      	return true;
    }

    @Override
    public Gamestage getGamestage() {
        return Gamestage.AMATEUR;
    }

    @Override
    public int getPrice() {
        return 1;
    }

    @Override
    public int getIntelligence() {
        return 150;
    }

    @Override
    public double getAbilityDamage() {
        return 25.0;
    }

    @Override
    public String getTexture() {
        return "ewogICJ0aW1lc3RhbXAiIDogMTYyNDQxNjQ4MTIyNSwKICAicHJvZmlsZUlkIiA6ICIzNDkxZjJiOTdjMDE0MWE2OTM2YjFjMjJhMmEwMGZiNyIsCiAgInByb2ZpbGVOYW1lIiA6ICJKZXNzc3N1aGgiLAogICJzaWduYXR1cmVSZXF1aXJlZCIgOiB0cnVlLAogICJ0ZXh0dXJlcyIgOiB7CiAgICAiU0tJTiIgOiB7CiAgICAgICJ1cmwiIDogImh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvMjkzMTk1MjU4MjVmMWYzMDcyN2ViOTQwZDNhMDY0MjZiYzRjZWMwN2ZiZDgwYWY1Y2QxNDZlM2ViMzg3OWY2OCIsCiAgICAgICJtZXRhZGF0YSIgOiB7CiAgICAgICAgIm1vZGVsIiA6ICJzbGltIgogICAgICB9CiAgICB9CiAgfQp9";
    }

}
