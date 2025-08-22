package me.zero.skyblock.items.itemlist.NULL;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CRYOPOWDER_SHARD extends SItem implements ItemStatistics, SkullItem {

    @Override
    public String getName() {
        return "Cryopowder Shard";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "CRYOPOWDER_SHARD"; 
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
        return Rarity.LEGENDARY;
    }

    @Override
    public String getTexture() {
        return "ewogICJ0aW1lc3RhbXAiIDogMTcwODU1MDcwOTg2MSwKICAicHJvZmlsZUlkIiA6ICI0NTlkNzVlNjMyOWQ0MzQ1ODk4NjkxN2VjMTc3ZTA2MiIsCiAgInByb2ZpbGVOYW1lIiA6ICJTa2lkYXV4IiwKICAic2lnbmF0dXJlUmVxdWlyZWQiIDogdHJ1ZSwKICAidGV4dHVyZXMiIDogewogICAgIlNLSU4iIDogewogICAgICAidXJsIiA6ICJodHRwOi8vdGV4dHVyZXMubWluZWNyYWZ0Lm5ldC90ZXh0dXJlLzM0NjQ4NzRkZjQ1MmMxZDcxN2VkZGQwZmIzYjg0ODIwMmFkMTU1NzEyNDVhZjZmYWRlMmVjZjUxNGYzYzgwYmIiLAogICAgICAibWV0YWRhdGEiIDogewogICAgICAgICJtb2RlbCIgOiAic2xpbSIKICAgICAgfQogICAgfQogIH0KfQ==";
    }

}
