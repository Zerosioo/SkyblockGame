package me.zero.skyblock.items.itemlist.NULL;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class HOLIDAY_TRAIN extends SItem implements ItemStatistics, SkullItem {

    @Override
    public String getName() {
        return "Holiday Train";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "HOLIDAY_TRAIN"; 
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
        return Rarity.EPIC;
    }

    @Override
    public String getTexture() {
        return "eyJ0aW1lc3RhbXAiOjE1MTE3MjY0MzAzODgsInByb2ZpbGVJZCI6IjNkOWNmOTZiN2MyNzRiZWVhZDFiOWQ0NTM3NTRjYjc2IiwicHJvZmlsZU5hbWUiOiJOaWtha2EiLCJzaWduYXR1cmVSZXF1aXJlZCI6dHJ1ZSwidGV4dHVyZXMiOnsiU0tJTiI6eyJ1cmwiOiJodHRwOi8vdGV4dHVyZXMubWluZWNyYWZ0Lm5ldC90ZXh0dXJlLzZlZjM1OTljMTQ1ZDM3MmVhOTg2OTg3NzYzZTI0OThkMjFiNTY3ZDcxZmJmN2UyM2Q1ZmE4MTk3ZTlhZDFkIn19fQ==";
    }

}
