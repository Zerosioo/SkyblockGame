package me.zero.skyblock.items.itemlist.HELMET;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MINERAL_HELMET extends SItem implements ItemStatistics, SkullItem {

    @Override
    public String getName() {
        return "Mineral Helmet";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "MINERAL_HELMET"; 
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
        return Rarity.EPIC;
    }

    @Override
    public Gamestage getGamestage() {
        return Gamestage.SKILLED;
    }

    @Override
    public int getDefense() {
        return 70;
    }

    @Override
    public int getSpeed() {
        return 10;
    }

    @Override
    public String getTexture() {
        return "ewogICJ0aW1lc3RhbXAiIDogMTYwMDk1NjcyNjk4OSwKICAicHJvZmlsZUlkIiA6ICJhMjk1ODZmYmU1ZDk0Nzk2OWZjOGQ4ZGE0NzlhNDNlZSIsCiAgInByb2ZpbGVOYW1lIiA6ICJWaWVydGVsdG9hc3RpaWUiLAogICJzaWduYXR1cmVSZXF1aXJlZCIgOiB0cnVlLAogICJ0ZXh0dXJlcyIgOiB7CiAgICAiU0tJTiIgOiB7CiAgICAgICJ1cmwiIDogImh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvYTk1MjgwYTdiMjFiMDZlMzg4N2YxNjVjOGNhN2EwM2JmYWM5NjM3OGFjZDk2Y2RmNTk0NGJjZDA4YTBiNjU4NyIKICAgIH0KICB9Cn0=";
    }

}
