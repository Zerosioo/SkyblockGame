package me.zero.skyblock.items.itemlist.NULL;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BAG_OF_GOLD extends SItem implements ItemStatistics, SkullItem, Sellable {

    @Override
    public String getName() {
        return "Bag of Gold";
    }

    @Override
    public List<String> getLore() {
        return new ArrayList(Arrays.asList("§6A thank you","§6present from a","§6grateful person in","§6the Crimson Isle.")); 
    }

    @Override
    public String getId() {
        return "BAG_OF_GOLD"; 
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
    public boolean isStackable() {
        return false;
    }

    @Override
    public Soulbound getSoulbound() {
        return Soulbound.SOLO;
    }

    @Override
    public int getPrice() {
        return 250000;
    }

    @Override
    public String getTexture() {
        return "eyJ0aW1lc3RhbXAiOjE0ODU0NjAwMjA1OTgsInByb2ZpbGVJZCI6IjdkYTJhYjNhOTNjYTQ4ZWU4MzA0OGFmYzNiODBlNjhlIiwicHJvZmlsZU5hbWUiOiJHb2xkYXBmZWwiLCJzaWduYXR1cmVSZXF1aXJlZCI6dHJ1ZSwidGV4dHVyZXMiOnsiU0tJTiI6eyJ1cmwiOiJodHRwOi8vdGV4dHVyZXMubWluZWNyYWZ0Lm5ldC90ZXh0dXJlL2UzNmU5NGY2YzM0YTM1NDY1ZmNlNGE5MGYyZTI1OTc2Mzg5ZWI5NzA5YTEyMjczNTc0ZmY3MGZkNGRhYTY4NTIifX19";
    }

}
