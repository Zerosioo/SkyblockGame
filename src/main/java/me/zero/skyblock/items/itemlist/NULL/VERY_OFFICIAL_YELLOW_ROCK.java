package me.zero.skyblock.items.itemlist.NULL;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class VERY_OFFICIAL_YELLOW_ROCK extends SItem implements ItemStatistics, SkullItem {

    @Override
    public String getName() {
        return "§eVery Official Yellow Rock of Love!";
    }

    @Override
    public List<String> getLore() {
        return new ArrayList(Arrays.asList("§7§oA majestic,","§7§oone-of-a-kind","§7§omineral that","§7§oglistens in the","§7§omorning sun.")); 
    }

    @Override
    public String getId() {
        return "VERY_OFFICIAL_YELLOW_ROCK"; 
    }

    @Override
    public Material getMaterial() {
        return Material.GOLD_NUGGET;
    }

    @Override
    public ItemType getItemType() {
 	return null;
    }

    @Override
    public Rarity getRarity() {
        return Rarity.LEGENDARY;
    }

    @Override
    public boolean isEnchanted() {
        return true;
    }

    @Override
    public Soulbound getSoulbound() {
        return Soulbound.COOP;
    }

    @Override
    public String getTexture() {
        return "ewogICJ0aW1lc3RhbXAiIDogMTcxOTQyMjE2ODIwMiwKICAicHJvZmlsZUlkIiA6ICIyMmNiM2U0ZDdmOTY0ZmNjYjE1MDIyNWIwN2YzMTEyMCIsCiAgInByb2ZpbGVOYW1lIiA6ICJ0dWxleW1hbkIiLAogICJzaWduYXR1cmVSZXF1aXJlZCIgOiB0cnVlLAogICJ0ZXh0dXJlcyIgOiB7CiAgICAiU0tJTiIgOiB7CiAgICAgICJ1cmwiIDogImh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvODY5MGMxOGUyYjg3ODBjOTI3ZmQxMjFkNWEzNjE5NmE1M2E3MmM2NzBhODlkNzg1ZGVlZGVlMzE1NTAyNGIyYSIsCiAgICAgICJtZXRhZGF0YSIgOiB7CiAgICAgICAgIm1vZGVsIiA6ICJzbGltIgogICAgICB9CiAgICB9CiAgfQp9";
    }

}
