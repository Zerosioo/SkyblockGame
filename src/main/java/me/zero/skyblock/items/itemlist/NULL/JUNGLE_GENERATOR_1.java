package me.zero.skyblock.items.itemlist.NULL;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class JUNGLE_GENERATOR_1 extends SItem implements ItemStatistics, SkullItem {

    @Override
    public String getName() {
        return "Jungle Minion I";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "JUNGLE_GENERATOR_1"; 
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
        return "eyJ0aW1lc3RhbXAiOjE1NTc5MTk4MTgzOTYsInByb2ZpbGVJZCI6IjVkMjRiYTBiMjg4YzQyOTM4YmExMGVjOTkwNjRkMjU5IiwicHJvZmlsZU5hbWUiOiIxbnYzbnQxdjN0NGwzbnQiLCJzaWduYXR1cmVSZXF1aXJlZCI6dHJ1ZSwidGV4dHVyZXMiOnsiU0tJTiI6eyJ1cmwiOiJodHRwOi8vdGV4dHVyZXMubWluZWNyYWZ0Lm5ldC90ZXh0dXJlLzJmZTczZDk4MTY5MGMxYmUzNDZhMTYzMzE4MTljNGU4ODAwODU5ZmNkYzNlNTE1MzcxOGM2YWQ0NTg2MTkyNGMifX19";
    }

}
