package me.zero.skyblock.items.itemlist.NULL;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GOLDOR_THE_FISH extends SItem implements ItemStatistics, SkullItem, Museum {

    @Override
    public String getName() {
        return "Goldor the Fish";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "GOLDOR_THE_FISH"; 
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
        return Rarity.SPECIAL;
    }

    @Override
    public boolean isEnchanted() {
        return true;
    }

    @Override
    public boolean isDungeonItem() {
      	return true;
    }

    @Override
    public boolean isMuseum() {
        return true;
    }

    @Override
    public String getTexture() {
        return "eyJ0aW1lc3RhbXAiOjE1NjUwMjk3ODk3NDIsInByb2ZpbGVJZCI6Ijc1MTQ0NDgxOTFlNjQ1NDY4Yzk3MzlhNmUzOTU3YmViIiwicHJvZmlsZU5hbWUiOiJUaGFua3NNb2phbmciLCJzaWduYXR1cmVSZXF1aXJlZCI6dHJ1ZSwidGV4dHVyZXMiOnsiU0tJTiI6eyJ1cmwiOiJodHRwOi8vdGV4dHVyZXMubWluZWNyYWZ0Lm5ldC90ZXh0dXJlLzMwYTViYzcyZjM3NmZhZjg2NWYzZTAxN2Q5MzMwMzM4NGViZmJkZWQ0Y2RmMmE2NDkxYTI2MTdmYmUzMWY2MjUifX19";
    }

}
