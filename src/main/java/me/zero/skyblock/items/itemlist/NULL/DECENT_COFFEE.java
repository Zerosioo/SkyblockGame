package me.zero.skyblock.items.itemlist.NULL;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DECENT_COFFEE extends SItem implements ItemStatistics, SkullItem {

    @Override
    public String getName() {
        return "Decent Coffee";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "DECENT_COFFEE"; 
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
    public boolean isStackable() {
        return false;
    }

    @Override
    public String getTexture() {
        return "eyJ0aW1lc3RhbXAiOjE1MjMyOTMyMjY3MzEsInByb2ZpbGVJZCI6IjNlMjZiMDk3MWFjZDRjNmQ5MzVjNmFkYjE1YjYyMDNhIiwicHJvZmlsZU5hbWUiOiJOYWhlbGUiLCJzaWduYXR1cmVSZXF1aXJlZCI6dHJ1ZSwidGV4dHVyZXMiOnsiU0tJTiI6eyJ1cmwiOiJodHRwOi8vdGV4dHVyZXMubWluZWNyYWZ0Lm5ldC90ZXh0dXJlLzdlYTBmNzc1NzE4NWJlOWRmNWIyZmM5ZDg1ZDQwNjQyZWE0ZmRiNDUxNWYzMTRkYTE4ZjU5YzY5NmU1YmU5In19fQ==";
    }

}
