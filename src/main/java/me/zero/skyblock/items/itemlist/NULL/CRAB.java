package me.zero.skyblock.items.itemlist.NULL;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CRAB extends SItem implements ItemStatistics, SkullItem {

    @Override
    public String getName() {
        return "Crab";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "CRAB"; 
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
        return "eyJ0aW1lc3RhbXAiOjE0NzQxOTI3ODk0NzMsInByb2ZpbGVJZCI6ImRhNzQ2NWVkMjljYjRkZTA5MzRkOTIwMTc0NDkxMzU1IiwicHJvZmlsZU5hbWUiOiJJc2F5bGEiLCJzaWduYXR1cmVSZXF1aXJlZCI6dHJ1ZSwidGV4dHVyZXMiOnsiU0tJTiI6eyJ1cmwiOiJodHRwOi8vdGV4dHVyZXMubWluZWNyYWZ0Lm5ldC90ZXh0dXJlL2I3OTdmZTU0OTkxOTFkZGVjOTRmNTBmYTZhYjljYmMxOGM5Y2Q2ZmExYjk3ZTM2YjRkNTE5YjYyMzE5M2Q1In19fQ==";
    }

}
