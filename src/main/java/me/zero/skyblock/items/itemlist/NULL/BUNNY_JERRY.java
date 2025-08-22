package me.zero.skyblock.items.itemlist.NULL;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BUNNY_JERRY extends SItem implements ItemStatistics, SkullItem {

    @Override
    public String getName() {
        return "Bunny Jerry";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "BUNNY_JERRY"; 
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
        return Rarity.RARE;
    }

    @Override
    public String getTexture() {
        return "eyJ0aW1lc3RhbXAiOjE1MTIyMTE4MjQ0MzAsInByb2ZpbGVJZCI6ImJkNDgyNzM5NzY3YzQ1ZGNhMWY4YzMzYzQwNTMwOTUyIiwicHJvZmlsZU5hbWUiOiJNSEZfVmlsbGFnZXIiLCJzaWduYXR1cmVSZXF1aXJlZCI6dHJ1ZSwidGV4dHVyZXMiOnsiU0tJTiI6eyJ1cmwiOiJodHRwOi8vdGV4dHVyZXMubWluZWNyYWZ0Lm5ldC90ZXh0dXJlLzgyMmQ4ZTc1MWM4ZjJmZDRjODk0MmM0NGJkYjJmNWNhNGQ4YWU4ZTU3NWVkM2ViMzRjMThhODZlOTNiIn19fQ==";
    }

}
