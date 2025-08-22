package me.zero.skyblock.items.itemlist.NULL;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FOURTH_MASTER_STAR extends SItem implements ItemStatistics, SkullItem {

    @Override
    public String getName() {
        return "Fourth Master Star";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "FOURTH_MASTER_STAR"; 
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
    public boolean isDungeonItem() {
      	return true;
    }

    @Override
    public String getTexture() {
        return "ewogICJ0aW1lc3RhbXAiIDogMTY0NTgwMjU0MDA2NywKICAicHJvZmlsZUlkIiA6ICIyYWQwZDlmMGUxMTM0ODM0OGVmNDQ0OWRmNTRlYTFkNCIsCiAgInByb2ZpbGVOYW1lIiA6ICJGaXJlQjB5IiwKICAic2lnbmF0dXJlUmVxdWlyZWQiIDogdHJ1ZSwKICAidGV4dHVyZXMiIDogewogICAgIlNLSU4iIDogewogICAgICAidXJsIiA6ICJodHRwOi8vdGV4dHVyZXMubWluZWNyYWZ0Lm5ldC90ZXh0dXJlL2QzN2ExNTk2ODdiZTM2ODc3ZDRlM2IwNWY2MWJiNTk4ZDgzMzFjNzkxMDhhY2MzYzFhZjgwZjIyNTM4OTJiYjIiCiAgICB9CiAgfQp9";
    }

}
