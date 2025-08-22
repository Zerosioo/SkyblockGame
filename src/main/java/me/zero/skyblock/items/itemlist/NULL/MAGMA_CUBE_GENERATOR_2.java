package me.zero.skyblock.items.itemlist.NULL;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MAGMA_CUBE_GENERATOR_2 extends SItem implements ItemStatistics, SkullItem {

    @Override
    public String getName() {
        return "Magma Cube Minion II";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "MAGMA_CUBE_GENERATOR_2"; 
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
        return "eyJ0aW1lc3RhbXAiOjE1NTc5Mzc1MTk3MjAsInByb2ZpbGVJZCI6IjNmYzdmZGY5Mzk2MzRjNDE5MTE5OWJhM2Y3Y2MzZmVkIiwicHJvZmlsZU5hbWUiOiJZZWxlaGEiLCJzaWduYXR1cmVSZXF1aXJlZCI6dHJ1ZSwidGV4dHVyZXMiOnsiU0tJTiI6eyJ1cmwiOiJodHRwOi8vdGV4dHVyZXMubWluZWNyYWZ0Lm5ldC90ZXh0dXJlLzIxMmZmNDdmNWM4YjM4ZTk2ZTk0MGI5OTU3OTU4ZTM3ZDYxMDkxOGRmOWI2NjRiMGMxMWJkNjI0Njc5OWY0YWYifX19";
    }

}
