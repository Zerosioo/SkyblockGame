package me.zero.skyblock.items.itemlist.NULL;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class VAMPIRE_GENERATOR_11 extends SItem implements ItemStatistics, SkullItem {

    @Override
    public String getName() {
        return "Vampire Minion XI";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "VAMPIRE_GENERATOR_11"; 
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
        return "ewogICJ0aW1lc3RhbXAiIDogMTY4MzU0NDQ3MjQyNywKICAicHJvZmlsZUlkIiA6ICJiNDA5ZmMyZjg4OTk0ZTVkOWZmNWFiMmUyOWZjNjQzMyIsCiAgInByb2ZpbGVOYW1lIiA6ICJkb2dzaGp0IiwKICAic2lnbmF0dXJlUmVxdWlyZWQiIDogdHJ1ZSwKICAidGV4dHVyZXMiIDogewogICAgIlNLSU4iIDogewogICAgICAidXJsIiA6ICJodHRwOi8vdGV4dHVyZXMubWluZWNyYWZ0Lm5ldC90ZXh0dXJlL2M1NzJjM2I0Y2RlZGVmMTE2MmE2ZGE5YmU3ZjEwZGQyNGZjZjY0Mjc5M2Q2YzQ5YWEwOGVlMGJmNGY5ZDMzMTMiCiAgICB9CiAgfQp9";
    }

}
