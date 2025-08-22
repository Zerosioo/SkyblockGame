package me.zero.skyblock.items.itemlist.HELMET;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ENCHANTED_JACK_O_LANTERN extends SItem implements ItemStatistics, SkullItem, Sellable {

    @Override
    public String getName() {
        return "Lantern Helmet";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "ENCHANTED_JACK_O_LANTERN"; 
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
        return Rarity.UNCOMMON;
    }

    @Override
    public Gamestage getGamestage() {
        return Gamestage.INTERMEDIATE;
    }

    @Override
    public int getPrice() {
        return 82000;
    }

    @Override
    public int getHealth() {
        return 20;
    }

    @Override
    public int getDefense() {
        return 10;
    }

    @Override
    public String getTexture() {
        return "ewogICJ0aW1lc3RhbXAiIDogMTYwMjk2MDUyNzIxOSwKICAicHJvZmlsZUlkIiA6ICI5NGMzZGM3YTdiMmQ0NzQ1YmVlYjQzZDc2ZjRjNDVkYyIsCiAgInByb2ZpbGVOYW1lIiA6ICJEb25Db3JsZW9uZTE5NzIiLAogICJzaWduYXR1cmVSZXF1aXJlZCIgOiB0cnVlLAogICJ0ZXh0dXJlcyIgOiB7CiAgICAiU0tJTiIgOiB7CiAgICAgICJ1cmwiIDogImh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvOGEwNjIyMWNhNGE3MzU1ZjM0MDk4NjkyZTRkYTY5MWZlZjA2YWJhYzBiZjkwNDFkNTczYTEzZDYyY2MzMDkxIgogICAgfQogIH0KfQ==";
    }

}
