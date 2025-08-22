package me.zero.skyblock.items.itemlist.NONE;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BLOOD_STAINED_COINS extends SItem implements ItemStatistics, SkullItem {

    @Override
    public String getName() {
        return "Blood-Stained Coins";
    }

    @Override
    public List<String> getLore() {
        return new ArrayList(Arrays.asList("§7This is probably","§7not what they","§7meant by \"§cblood","§cmoney§7\".")); 
    }

    @Override
    public String getId() {
        return "BLOOD_STAINED_COINS"; 
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
        return ItemType.NONE;
    }

    @Override
    public Rarity getRarity() {
        return Rarity.RARE;
    }

    @Override
    public String getTexture() {
        return "ewogICJ0aW1lc3RhbXAiIDogMTcyMDA1MjUzMjAyMywKICAicHJvZmlsZUlkIiA6ICJkNmM2ZGYwOThiZDc0YmQzODEyMzkwZDY5MDUyNjI5MCIsCiAgInByb2ZpbGVOYW1lIiA6ICJpbmtvZ25pdG8zMzgiLAogICJzaWduYXR1cmVSZXF1aXJlZCIgOiB0cnVlLAogICJ0ZXh0dXJlcyIgOiB7CiAgICAiU0tJTiIgOiB7CiAgICAgICJ1cmwiIDogImh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvYmJlNDg5ODIxOWRiZDkxNmM5ZGZlZTA2NjA4NGI4MTNlZDhmNjNmZjU4ZjJlMGIyMzI4YzkwOThlMGZkMTQ4NSIsCiAgICAgICJtZXRhZGF0YSIgOiB7CiAgICAgICAgIm1vZGVsIiA6ICJzbGltIgogICAgICB9CiAgICB9CiAgfQp9";
    }

}
