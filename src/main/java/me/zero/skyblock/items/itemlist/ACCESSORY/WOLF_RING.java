package me.zero.skyblock.items.itemlist.ACCESSORY;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class WOLF_RING extends SItem implements ItemStatistics, SkullItem, Sellable {

    @Override
    public String getName() {
        return "Wolf Ring";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "WOLF_RING"; 
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
        return ItemType.ACCESSORY;
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
        return "eyJ0aW1lc3RhbXAiOjE1MDExNzcwNjg4ODcsInByb2ZpbGVJZCI6ImJiMDgwOTFhOTJlZDQzYWQ5NGYxZWRmZDc0NmIwYTJjIiwicHJvZmlsZU5hbWUiOiJJcDRuZHgiLCJzaWduYXR1cmVSZXF1aXJlZCI6dHJ1ZSwidGV4dHVyZXMiOnsiU0tJTiI6eyJ1cmwiOiJodHRwOi8vdGV4dHVyZXMubWluZWNyYWZ0Lm5ldC90ZXh0dXJlL2Y4M2EyYWE5ZDM3MzRiOTE5YWMyNGM5NjU5ZTVlMGY4NmVjYWZiZjY0ZDQ3ODhjZmE0MzNiYmVjMTg5ZTgifX19";
    }

}
