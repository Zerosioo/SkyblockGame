package me.zero.skyblock.items.itemlist.NULL;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SLED extends SItem implements ItemStatistics, SkullItem {

    @Override
    public String getName() {
        return "Sled";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "SLED"; 
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
        return "eyJ0aW1lc3RhbXAiOjE1MjE4MTM5OTM0MTQsInByb2ZpbGVJZCI6ImNhYjI4ODVkMTUxNjQ1OTNhZmI2MDkwODJlOTE2NmU3IiwicHJvZmlsZU5hbWUiOiJGYW5jeV9MdWR3aWciLCJzaWduYXR1cmVSZXF1aXJlZCI6dHJ1ZSwidGV4dHVyZXMiOnsiU0tJTiI6eyJ1cmwiOiJodHRwOi8vdGV4dHVyZXMubWluZWNyYWZ0Lm5ldC90ZXh0dXJlLzQ4YjgzNWY4ODZmNGY0NWYzYjI0ZWEyZTEyNGNlZTNmNzM3MTM0Njg5ZTNlOWNjYWU4MTQ1MGVhNmFmNDJhIn19fQ==";
    }

}
