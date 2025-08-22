package me.zero.skyblock.items.itemlist.NULL;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CHEESE_FUEL extends SItem implements ItemStatistics, SkullItem, Sellable {

    @Override
    public String getName() {
        return "Tasty Cheese";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "CHEESE_FUEL"; 
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
    public int getPrice() {
        return 500;
    }

    @Override
    public String getTexture() {
        return "ewogICJ0aW1lc3RhbXAiIDogMTY0MTQ3NjExOTg1NiwKICAicHJvZmlsZUlkIiA6ICIwYTUzMDU0MTM4YWI0YjIyOTVhMGNlZmJiMGU4MmFkYiIsCiAgInByb2ZpbGVOYW1lIiA6ICJQX0hpc2lybyIsCiAgInNpZ25hdHVyZVJlcXVpcmVkIiA6IHRydWUsCiAgInRleHR1cmVzIiA6IHsKICAgICJTS0lOIiA6IHsKICAgICAgInVybCIgOiAiaHR0cDovL3RleHR1cmVzLm1pbmVjcmFmdC5uZXQvdGV4dHVyZS8zZDljOGRkMjQ1YTY4NDVkODcwNDE0NWJhYjVmYWM2MGEzMDc2NWUxMjkxZTcwZTk4ZTI1ZDlmZWM0MWIyNmM1IgogICAgfQogIH0KfQ==";
    }

}
