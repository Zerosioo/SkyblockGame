package me.zero.skyblock.items.itemlist.NULL;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class HARP extends SItem implements ItemStatistics, SkullItem {

    @Override
    public String getName() {
        return "Personal Harp";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "HARP"; 
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
        return Rarity.EPIC;
    }

    @Override
    public String getTexture() {
        return "eyJ0aW1lc3RhbXAiOjE1ODcwMTU4MTQ5NTIsInByb2ZpbGVJZCI6ImIwZDRiMjhiYzFkNzQ4ODlhZjBlODY2MWNlZTk2YWFiIiwicHJvZmlsZU5hbWUiOiJNaW5lU2tpbl9vcmciLCJzaWduYXR1cmVSZXF1aXJlZCI6dHJ1ZSwidGV4dHVyZXMiOnsiU0tJTiI6eyJ1cmwiOiJodHRwOi8vdGV4dHVyZXMubWluZWNyYWZ0Lm5ldC90ZXh0dXJlLzRkMjM4Y2NjODE4YWIwYzBmZGViZDA3ZDRhNTZjMzUzZmY1ZWI1NDFjODVkMzg2MzYyMTYxNzgxZDFkZDc0Y2MifX19";
    }

}
