package me.zero.skyblock.items.itemlist.NULL;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RED_SAND_GENERATOR_7 extends SItem implements ItemStatistics, SkullItem {

    @Override
    public String getName() {
        return "Red Sand Minion VII";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "RED_SAND_GENERATOR_7"; 
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
        return "ewogICJ0aW1lc3RhbXAiIDogMTYzODk2MzMyMTQ5NywKICAicHJvZmlsZUlkIiA6ICIxNzhmMTJkYWMzNTQ0ZjRhYjExNzkyZDc1MDkzY2JmYyIsCiAgInByb2ZpbGVOYW1lIiA6ICJzaWxlbnRkZXRydWN0aW9uIiwKICAic2lnbmF0dXJlUmVxdWlyZWQiIDogdHJ1ZSwKICAidGV4dHVyZXMiIDogewogICAgIlNLSU4iIDogewogICAgICAidXJsIiA6ICJodHRwOi8vdGV4dHVyZXMubWluZWNyYWZ0Lm5ldC90ZXh0dXJlLzU2Y2FmZGVkZWI5YjdiNzA4Yjk5YzY3NWJlNmQzZTMyZGQ0OGE2MjhjOWFhMDIyMjQ1OGZhMGQ3MWUxODc4MTMiCiAgICB9CiAgfQp9";
    }

}
