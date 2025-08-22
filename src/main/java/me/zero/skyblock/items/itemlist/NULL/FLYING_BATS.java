package me.zero.skyblock.items.itemlist.NULL;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FLYING_BATS extends SItem implements ItemStatistics, SkullItem {

    @Override
    public String getName() {
        return "Flying Bats";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "FLYING_BATS"; 
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
        return Rarity.COMMON;
    }

    @Override
    public String getTexture() {
        return "ewogICJ0aW1lc3RhbXAiIDogMTY0NDc2NjY2NzQ0MywKICAicHJvZmlsZUlkIiA6ICIwNjNhMTc2Y2RkMTU0ODRiYjU1MjRhNjQyMGM1YjdhNCIsCiAgInByb2ZpbGVOYW1lIiA6ICJkYXZpcGF0dXJ5IiwKICAic2lnbmF0dXJlUmVxdWlyZWQiIDogdHJ1ZSwKICAidGV4dHVyZXMiIDogewogICAgIlNLSU4iIDogewogICAgICAidXJsIiA6ICJodHRwOi8vdGV4dHVyZXMubWluZWNyYWZ0Lm5ldC90ZXh0dXJlL2E4NWYzMTM4MjU5MWQyZGFiMGVmZWQ0ZGQzMWVkMzg1NDk0YWQ5NTYzNDA5YzhhMmUwZWZkMDU0OTJkNjBiNTUiCiAgICB9CiAgfQp9";
    }

}
