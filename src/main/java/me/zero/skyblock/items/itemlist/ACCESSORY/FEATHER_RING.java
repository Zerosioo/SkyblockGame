package me.zero.skyblock.items.itemlist.ACCESSORY;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FEATHER_RING extends SItem implements ItemStatistics, SkullItem, Sellable {

    @Override
    public String getName() {
        return "Feather Ring";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "FEATHER_RING"; 
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
        return ItemType.ACCESSORY;
    }

    @Override
    public Rarity getRarity() {
        return Rarity.UNCOMMON;
    }

    @Override
    public int getPrice() {
        return 1800;
    }

    @Override
    public String getTexture() {
        return "ewogICJ0aW1lc3RhbXAiIDogMTYwNDE3MjAzMzgxNywKICAicHJvZmlsZUlkIiA6ICJjMWE3ZjlkZjgyYTU0NjZmOGQ2YjdkYTk3OTA4NGY0OSIsCiAgInByb2ZpbGVOYW1lIiA6ICJTa2lkU25pcGU5NzIyMTMiLAogICJzaWduYXR1cmVSZXF1aXJlZCIgOiB0cnVlLAogICJ0ZXh0dXJlcyIgOiB7CiAgICAiU0tJTiIgOiB7CiAgICAgICJ1cmwiIDogImh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvY2I2ODUxZjRlOWE4NzcwN2FkNzJmNWI1Y2QxN2VmZWNhMzZjMmMxOGNjOTlhYWFkNzEyMWZlNzJjZjc5YjliMSIsCiAgICAgICJtZXRhZGF0YSIgOiB7CiAgICAgICAgIm1vZGVsIiA6ICJzbGltIgogICAgICB9CiAgICB9CiAgfQp9";
    }

}
