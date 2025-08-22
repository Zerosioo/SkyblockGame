package me.zero.skyblock.items.itemlist.NULL;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class EMERALD_CHEST extends SItem implements ItemStatistics, SkullItem {

    @Override
    public String getName() {
        return "Emerald Chest+";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "EMERALD_CHEST"; 
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
        return "ewogICJ0aW1lc3RhbXAiIDogMTY0NDc2NjQ3NTUwNiwKICAicHJvZmlsZUlkIiA6ICJhYTZhNzUwNWVkYmU0NjNiYjk1NWYyMWY0MjNiYTM1NCIsCiAgInByb2ZpbGVOYW1lIiA6ICJub3RhbmR5d2FyaG9sIiwKICAic2lnbmF0dXJlUmVxdWlyZWQiIDogdHJ1ZSwKICAidGV4dHVyZXMiIDogewogICAgIlNLSU4iIDogewogICAgICAidXJsIiA6ICJodHRwOi8vdGV4dHVyZXMubWluZWNyYWZ0Lm5ldC90ZXh0dXJlLzgxYzVhYWU2YWVhMDk0MDBkMjcxOGEyMWU2MmRlNDBlMjNhYjUzMGI2ZjhmNDg2Y2QzM2I2NjE0YzFmNDdkYTAiCiAgICB9CiAgfQp9";
    }

}
