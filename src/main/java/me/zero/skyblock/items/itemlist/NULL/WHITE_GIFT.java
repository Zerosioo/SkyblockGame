package me.zero.skyblock.items.itemlist.NULL;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class WHITE_GIFT extends SItem implements ItemStatistics, SkullItem {

    @Override
    public String getName() {
        return "White Gift";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "WHITE_GIFT"; 
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
    public String getTexture() {
        return "eyJ0aW1lc3RhbXAiOjE1MTQzMjM1NTc0ODYsInByb2ZpbGVJZCI6IjcwOTU2NDU0NTJkOTRiYTI5YzcwZDFmYTY3YjhkYTQyIiwicHJvZmlsZU5hbWUiOiJIaWRkdXMiLCJzaWduYXR1cmVSZXF1aXJlZCI6dHJ1ZSwidGV4dHVyZXMiOnsiU0tJTiI6eyJ1cmwiOiJodHRwOi8vdGV4dHVyZXMubWluZWNyYWZ0Lm5ldC90ZXh0dXJlLzEwZjUzOTg1MTBiMWEwNWFmYzViMjAxZWFkOGJmYzU4M2U1N2Q3MjAyZjUxOTNiMGI3NjFmY2JkMGFlMiJ9fX0=";
    }

}
