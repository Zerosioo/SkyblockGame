package me.zero.skyblock.items.itemlist.NULL;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class EPOCH_CAKE_GRAY extends SItem implements ItemStatistics, SkullItem, Museum {

    @Override
    public String getName() {
        return "Not-a-lie Century Cake";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "EPOCH_CAKE_GRAY"; 
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
        return Rarity.UNCOMMON;
    }

    @Override
    public boolean isMuseum() {
        return true;
    }

    @Override
    public String getTexture() {
        return "ewogICJ0aW1lc3RhbXAiIDogMTY5MjgwMzkwNTI0NSwKICAicHJvZmlsZUlkIiA6ICIzNTE2NjhhMTk5MmM0ZGZlOWRkNmY5NTUxNWFkNzVmNyIsCiAgInByb2ZpbGVOYW1lIiA6ICJCbHVlX1BrIiwKICAic2lnbmF0dXJlUmVxdWlyZWQiIDogdHJ1ZSwKICAidGV4dHVyZXMiIDogewogICAgIlNLSU4iIDogewogICAgICAidXJsIiA6ICJodHRwOi8vdGV4dHVyZXMubWluZWNyYWZ0Lm5ldC90ZXh0dXJlL2Q0MGY5Mjk5NTA4Mzg3NjE4Y2ZhZDZkYjM1YzlmNmQ4MDdjNDkzMzdkMzMzZDZlYzNiMTNkOWU4N2QwZDQ4OGYiLAogICAgICAibWV0YWRhdGEiIDogewogICAgICAgICJtb2RlbCIgOiAic2xpbSIKICAgICAgfQogICAgfQogIH0KfQ==";
    }

}
