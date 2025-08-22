package me.zero.skyblock.items.itemlist.NULL;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class VAMPIRE_GENERATOR_1 extends SItem implements ItemStatistics, SkullItem {

    @Override
    public String getName() {
        return "Vampire Minion I";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "VAMPIRE_GENERATOR_1"; 
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
        return "ewogICJ0aW1lc3RhbXAiIDogMTY4MzU0NDI4Mzg1NSwKICAicHJvZmlsZUlkIiA6ICIyM2YxYTU5ZjQ2OWI0M2RkYmRiNTM3YmZlYzEwNDcxZiIsCiAgInByb2ZpbGVOYW1lIiA6ICIyODA3IiwKICAic2lnbmF0dXJlUmVxdWlyZWQiIDogdHJ1ZSwKICAidGV4dHVyZXMiIDogewogICAgIlNLSU4iIDogewogICAgICAidXJsIiA6ICJodHRwOi8vdGV4dHVyZXMubWluZWNyYWZ0Lm5ldC90ZXh0dXJlLzViMGMyZGI0MmU5MGY4M2ZhZTY1NTFjOTZlODM2NjkyMTFhNzdjMmMxNTVjNTRkMTUyM2FmMzA3OWY5NTY1ZWQiCiAgICB9CiAgfQp9";
    }

}
