package me.zero.skyblock.items.itemlist.NULL;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SLICE_OF_CHEESECAKE extends SItem implements ItemStatistics, SkullItem {

    @Override
    public String getName() {
        return "Slice of Lemon Cheesecake";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "SLICE_OF_CHEESECAKE"; 
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
        return Rarity.SPECIAL;
    }

    @Override
    public Soulbound getSoulbound() {
        return Soulbound.SOLO;
    }

    @Override
    public String getTexture() {
        return "ewogICJ0aW1lc3RhbXAiIDogMTczODEzODY4MTc1OSwKICAicHJvZmlsZUlkIiA6ICI1OGUzZWJmYmNhMzg0MDhlYTkzNzhmYTE2MzdhMWRkYyIsCiAgInByb2ZpbGVOYW1lIiA6ICJQYXliYWNrZXI4MTIzIiwKICAic2lnbmF0dXJlUmVxdWlyZWQiIDogdHJ1ZSwKICAidGV4dHVyZXMiIDogewogICAgIlNLSU4iIDogewogICAgICAidXJsIiA6ICJodHRwOi8vdGV4dHVyZXMubWluZWNyYWZ0Lm5ldC90ZXh0dXJlLzE0ZWQ5OWM5ZTFjZTk5ZTg2ZGJjYzM0ODA5OWM3ODRiOTVlZTliMjgyYWZhODUwMTczNzk5YjEyMTQ1N2FmMSIsCiAgICAgICJtZXRhZGF0YSIgOiB7CiAgICAgICAgIm1vZGVsIiA6ICJzbGltIgogICAgICB9CiAgICB9CiAgfQp9";
    }

}
