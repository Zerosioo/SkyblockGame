package me.zero.skyblock.items.itemlist.HELMET;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class INFERNAL_TERROR_HELMET extends SItem implements ItemStatistics, SkullItem {

    @Override
    public String getName() {
        return "Infernal Terror Helmet";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "INFERNAL_TERROR_HELMET"; 
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
    public int getCritDamage() {
        return 126;
    }

    @Override
    public int getHealth() {
        return 403;
    }

    @Override
    public int getDefense() {
        return 126;
    }

    @Override
    public int getIntelligence() {
        return 38;
    }

    @Override
    public int getSpeed() {
        return 30;
    }

    @Override
    public String getTexture() {
        return "ewogICJ0aW1lc3RhbXAiIDogMTY0NTUwNDA2Njk0OCwKICAicHJvZmlsZUlkIiA6ICJkYmQ4MDQ2M2EwMzY0Y2FjYjI3OGNhODBhMDBkZGIxMyIsCiAgInByb2ZpbGVOYW1lIiA6ICJ4bG9nMjEiLAogICJzaWduYXR1cmVSZXF1aXJlZCIgOiB0cnVlLAogICJ0ZXh0dXJlcyIgOiB7CiAgICAiU0tJTiIgOiB7CiAgICAgICJ1cmwiIDogImh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvNGVhZGYyOTU0ZjE2MjlkNzkzZDdmNDY3MTgxYzQ0OWUxOGQ4OWFhNDk0MWJlYzNlYTUyMTFlNTkwOWJiNTY3IgogICAgfQogIH0KfQ==";
    }

}
