package me.zero.skyblock.items.itemlist.NULL;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DIVER_FRAGMENT extends SItem implements ItemStatistics, SkullItem, Sellable {

    @Override
    public String getName() {
        return "Emperor's Skull";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "DIVER_FRAGMENT"; 
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
    public int getPrice() {
        return 100;
    }

    @Override
    public String getTexture() {
        return "eyJ0aW1lc3RhbXAiOjE1NjE3MzA3MDE5MTUsInByb2ZpbGVJZCI6IjNmYzdmZGY5Mzk2MzRjNDE5MTE5OWJhM2Y3Y2MzZmVkIiwicHJvZmlsZU5hbWUiOiJZZWxlaGEiLCJzaWduYXR1cmVSZXF1aXJlZCI6dHJ1ZSwidGV4dHVyZXMiOnsiU0tJTiI6eyJ1cmwiOiJodHRwOi8vdGV4dHVyZXMubWluZWNyYWZ0Lm5ldC90ZXh0dXJlLzg2MWJhZDYzOTNhMDhlMjU4MjY4ZWU4NGY2NDFlNGRhNjEyNjAzZmVjMzVkOTQzOGE2YmFjYzVjNjYwY2NhNDMifX19";
    }

}
