package me.zero.skyblock.items.itemlist.NULL;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class OAK_GENERATOR_10 extends SItem implements ItemStatistics, SkullItem {

    @Override
    public String getName() {
        return "Oak Minion X";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "OAK_GENERATOR_10"; 
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
        return "eyJ0aW1lc3RhbXAiOjE1NTc5NDc1NzA4MzIsInByb2ZpbGVJZCI6IjNmYzdmZGY5Mzk2MzRjNDE5MTE5OWJhM2Y3Y2MzZmVkIiwicHJvZmlsZU5hbWUiOiJZZWxlaGEiLCJzaWduYXR1cmVSZXF1aXJlZCI6dHJ1ZSwidGV4dHVyZXMiOnsiU0tJTiI6eyJ1cmwiOiJodHRwOi8vdGV4dHVyZXMubWluZWNyYWZ0Lm5ldC90ZXh0dXJlLzU0NmY0MDQwMDU0YTA5Nzk1NmJmN2UxMzU2NTZlYThmNTJjNTNhY2FlYmRkYmRkYmZmOGQxMjMyMzFjODJlOTMifX19";
    }

}
