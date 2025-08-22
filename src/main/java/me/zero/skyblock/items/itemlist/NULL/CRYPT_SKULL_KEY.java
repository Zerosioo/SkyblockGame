package me.zero.skyblock.items.itemlist.NULL;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CRYPT_SKULL_KEY extends SItem implements ItemStatistics, SkullItem {

    @Override
    public String getName() {
        return "Crypt Skull Key";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "CRYPT_SKULL_KEY"; 
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
        return Rarity.UNCOMMON;
    }

    @Override
    public boolean isDungeonItem() {
      	return true;
    }

    @Override
    public String getTexture() {
        return "ewogICJ0aW1lc3RhbXAiIDogMTcyMDAyMDEzNDY5NywKICAicHJvZmlsZUlkIiA6ICJmN2QxOWQxNTZhY2I0NDE2OGQ4YTAxYThkNWYwMmEyZCIsCiAgInByb2ZpbGVOYW1lIiA6ICJUaGVGbG9vZDQyNEsiLAogICJzaWduYXR1cmVSZXF1aXJlZCIgOiB0cnVlLAogICJ0ZXh0dXJlcyIgOiB7CiAgICAiU0tJTiIgOiB7CiAgICAgICJ1cmwiIDogImh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvMzJlY2FiMDNmNDNjMGRiNWNlMDFlYzZkOThiYTIyNzk1ZmE1MjY0NjU1MTlkMGRkYzk4YWJjMzcwYTBlNTA1NCIsCiAgICAgICJtZXRhZGF0YSIgOiB7CiAgICAgICAgIm1vZGVsIiA6ICJzbGltIgogICAgICB9CiAgICB9CiAgfQp9";
    }

}
