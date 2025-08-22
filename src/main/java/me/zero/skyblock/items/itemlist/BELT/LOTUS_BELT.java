package me.zero.skyblock.items.itemlist.BELT;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LOTUS_BELT extends SItem implements ItemStatistics, SkullItem, Sellable {

    @Override
    public String getName() {
        return "Lotus Belt";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "LOTUS_BELT"; 
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
        return ItemType.BELT;
    }

    @Override
    public Rarity getRarity() {
        return Rarity.RARE;
    }

    @Override
    public Gamestage getGamestage() {
        return Gamestage.INTERMEDIATE;
    }

    @Override
    public int getPrice() {
        return 100;
    }

    @Override
    public int getFarmingFortune() {
        return 5;
    }

    @Override
    public String getTexture() {
        return "ewogICJ0aW1lc3RhbXAiIDogMTY2MjUwMjg0NTQyNiwKICAicHJvZmlsZUlkIiA6ICJmMTdkOWJlZmM2NGM0YzA4ODVhYWU3NWQ0YjhiNWE0NCIsCiAgInByb2ZpbGVOYW1lIiA6ICJTaXJCYW5kZXJzbmF0Y2giLAogICJzaWduYXR1cmVSZXF1aXJlZCIgOiB0cnVlLAogICJ0ZXh0dXJlcyIgOiB7CiAgICAiU0tJTiIgOiB7CiAgICAgICJ1cmwiIDogImh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvNGNlOGQxOWIwMTYzZDFlYWRkZTU2MzM3NzM5NGIwNWRlNjM0MjdjNmUzZjhhOTQ5ZTBkZmEzMmJiMjBkN2YyZCIKICAgIH0KICB9Cn0=";
    }

}
