package me.zero.skyblock.items.itemlist.NULL;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PRECURSOR_APPARATUS extends SItem implements ItemStatistics, SkullItem {

    @Override
    public String getName() {
        return "Precursor Apparatus";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "PRECURSOR_APPARATUS"; 
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
        return "eyJ0aW1lc3RhbXAiOjE1NzI3NDE4NDc4NjcsInByb2ZpbGVJZCI6IjdkYTJhYjNhOTNjYTQ4ZWU4MzA0OGFmYzNiODBlNjhlIiwicHJvZmlsZU5hbWUiOiJHb2xkYXBmZWwiLCJzaWduYXR1cmVSZXF1aXJlZCI6dHJ1ZSwidGV4dHVyZXMiOnsiU0tJTiI6eyJ1cmwiOiJodHRwOi8vdGV4dHVyZXMubWluZWNyYWZ0Lm5ldC90ZXh0dXJlLzgxZTcwZDM5MzU3MDFmYTBlMTI5YmI2YWEwNjU2MTY1MzEwMTNjY2Q5YjZlMDBhY2VjNTcwYWVlYTNlZjUwNTIifX19";
    }

}
