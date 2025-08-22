package me.zero.skyblock.items.itemlist.HELMET;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FLEX_HELMET extends SItem implements ItemStatistics, SkullItem {

    @Override
    public String getName() {
        return "Flex Helmet";
    }

    @Override
    public List<String> getLore() {
        return new ArrayList(Arrays.asList("Fact: Ducks have a","specially designed","beak that allow them","to filter water and","mud for food while","swimming.")); 
    }

    @Override
    public String getId() {
        return "FLEX_HELMET"; 
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
        return Rarity.LEGENDARY;
    }

    @Override
    public String getTexture() {
        return "ewogICJ0aW1lc3RhbXAiIDogMTY3MzU2Njg0MzM1MywKICAicHJvZmlsZUlkIiA6ICJlYjA3ZmQzMmFiOTE0NjRjODVjYmU1YjVhYTlkYTRjZSIsCiAgInByb2ZpbGVOYW1lIiA6ICJ4bUUiLAogICJzaWduYXR1cmVSZXF1aXJlZCIgOiB0cnVlLAogICJ0ZXh0dXJlcyIgOiB7CiAgICAiU0tJTiIgOiB7CiAgICAgICJ1cmwiIDogImh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvNmQxOGJjZWM0MGZhZWI5ZDhkZGUwZWY0M2QzYThkZTE0NzQzYjU1NGVhNDNiYzM5MjM3YTE3OWJmZmFkZmM3ZSIsCiAgICAgICJtZXRhZGF0YSIgOiB7CiAgICAgICAgIm1vZGVsIiA6ICJzbGltIgogICAgICB9CiAgICB9CiAgfQp9";
    }

}
