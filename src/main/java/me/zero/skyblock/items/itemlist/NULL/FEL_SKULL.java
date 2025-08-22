package me.zero.skyblock.items.itemlist.NULL;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FEL_SKULL extends SItem implements ItemStatistics, SkullItem {

    @Override
    public String getName() {
        return "Fel Skull";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "FEL_SKULL"; 
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
    public boolean isDungeonItem() {
      	return true;
    }

    @Override
    public String getTexture() {
        return "ewogICJ0aW1lc3RhbXAiIDogMTY5NDQ0NzI4Nzc0NSwKICAicHJvZmlsZUlkIiA6ICJmZDYwZjM2ZjU4NjE0ZjEyYjNjZDQ3YzJkODU1Mjk5YSIsCiAgInByb2ZpbGVOYW1lIiA6ICJSZWFkIiwKICAic2lnbmF0dXJlUmVxdWlyZWQiIDogdHJ1ZSwKICAidGV4dHVyZXMiIDogewogICAgIlNLSU4iIDogewogICAgICAidXJsIiA6ICJodHRwOi8vdGV4dHVyZXMubWluZWNyYWZ0Lm5ldC90ZXh0dXJlLzNlN2Q1OTg0NzAxMTk4YjVmMTdjNWI5MzA3NDgxYzczZjZlY2I2M2ViY2FlZDQxYzFlYTg1Yzk5YzIwNDRjYWUiCiAgICB9CiAgfQp9";
    }

}
