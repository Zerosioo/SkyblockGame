package me.zero.skyblock.items.itemlist.NULL;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class WHEAT_GENERATOR_3 extends SItem implements ItemStatistics, SkullItem {

    @Override
    public String getName() {
        return "Wheat Minion III";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "WHEAT_GENERATOR_3"; 
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
        return "eyJ0aW1lc3RhbXAiOjE1NTc5MzY0MzAzMDEsInByb2ZpbGVJZCI6IjU3MGIwNWJhMjZmMzRhOGViZmRiODBlY2JjZDdlNjIwIiwicHJvZmlsZU5hbWUiOiJMb3JkU29ubnkiLCJzaWduYXR1cmVSZXF1aXJlZCI6dHJ1ZSwidGV4dHVyZXMiOnsiU0tJTiI6eyJ1cmwiOiJodHRwOi8vdGV4dHVyZXMubWluZWNyYWZ0Lm5ldC90ZXh0dXJlL2U2MTc3MzYyOGVkNzU1NWUwYTYzYWRkMjExNjZhZDM0MjI3ZDEwZDIxZTM0YzNjN2U1YTBmYTg1MzJkZDNmNiJ9fX0=";
    }

}
