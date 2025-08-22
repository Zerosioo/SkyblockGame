package me.zero.skyblock.items.itemlist.NULL;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LAMP_YELLOW extends SItem implements ItemStatistics, SkullItem, Sellable {

    @Override
    public String getName() {
        return "Yellow Lamp";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "LAMP_YELLOW"; 
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
        return Rarity.COMMON;
    }

    @Override
    public int getPrice() {
        return 500;
    }

    @Override
    public String getTexture() {
        return "eyJ0aW1lc3RhbXAiOjE1NTczMzkzMjE0MjUsInByb2ZpbGVJZCI6IjVkMjRiYTBiMjg4YzQyOTM4YmExMGVjOTkwNjRkMjU5IiwicHJvZmlsZU5hbWUiOiIxbnYzbnQxdjN0NGwzbnQiLCJzaWduYXR1cmVSZXF1aXJlZCI6dHJ1ZSwidGV4dHVyZXMiOnsiU0tJTiI6eyJ1cmwiOiJodHRwOi8vdGV4dHVyZXMubWluZWNyYWZ0Lm5ldC90ZXh0dXJlLzI0MjUwZjFiNzNjNzk5N2MzYWFjMzdkMTEyYTkyMTYyMjQ2YTZhNmM5M2YyNDVkNzZkN2E1NGIzNWNkZDExNmEifX19";
    }

}
