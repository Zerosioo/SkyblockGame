package me.zero.skyblock.items.itemlist.NULL;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AMBER_CRYSTAL extends SItem implements ItemStatistics, SkullItem {

    @Override
    public String getName() {
        return "Amber Crystal";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "AMBER_CRYSTAL"; 
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
    public String getTexture() {
        return "ewogICJ0aW1lc3RhbXAiIDogMTYyMDA3NjM2NDU2NSwKICAicHJvZmlsZUlkIiA6ICJmN2RiZWFlNmE5MWQ0OTYxYTU4NjY5NThiMjc2MjJhNyIsCiAgInByb2ZpbGVOYW1lIiA6ICJzbGltZWdhbWVyNDM3IiwKICAic2lnbmF0dXJlUmVxdWlyZWQiIDogdHJ1ZSwKICAidGV4dHVyZXMiIDogewogICAgIlNLSU4iIDogewogICAgICAidXJsIiA6ICJodHRwOi8vdGV4dHVyZXMubWluZWNyYWZ0Lm5ldC90ZXh0dXJlL2VmNzgzNWZjOWU2ZGFmNjMyMTYwZTliN2ZmMzc4Nzg4YTQwODA2NGNjNzVlYmY5ZjUxNThlNjE1YmRkNTk2MDMiCiAgICB9CiAgfQp9";
    }

}
