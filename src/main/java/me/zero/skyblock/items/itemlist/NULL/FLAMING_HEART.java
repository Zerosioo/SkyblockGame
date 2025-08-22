package me.zero.skyblock.items.itemlist.NULL;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FLAMING_HEART extends SItem implements ItemStatistics, SkullItem, Sellable {

    @Override
    public String getName() {
        return "Flaming Heart";
    }

    @Override
    public List<String> getLore() {
        return new ArrayList(Arrays.asList("§7§oBurning passion.")); 
    }

    @Override
    public String getId() {
        return "FLAMING_HEART"; 
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
    public int getPrice() {
        return 200;
    }

    @Override
    public String getTexture() {
        return "ewogICJ0aW1lc3RhbXAiIDogMTY0MzYwMTM5NzMyNCwKICAicHJvZmlsZUlkIiA6ICJmZDQ3Y2I4YjgzNjQ0YmY3YWIyYmUxODZkYjI1ZmMwZCIsCiAgInByb2ZpbGVOYW1lIiA6ICJDVUNGTDEyIiwKICAic2lnbmF0dXJlUmVxdWlyZWQiIDogdHJ1ZSwKICAidGV4dHVyZXMiIDogewogICAgIlNLSU4iIDogewogICAgICAidXJsIiA6ICJodHRwOi8vdGV4dHVyZXMubWluZWNyYWZ0Lm5ldC90ZXh0dXJlLzg4M2I4NjI0MmRjMTQ5NmM4NDZiZTYwMWIzOTJiM2JhZTBjOWQ4ZmQ4ZTE3YmI5NWY4NjU5MmZhZjhkYzVkMTEiLAogICAgICAibWV0YWRhdGEiIDogewogICAgICAgICJtb2RlbCIgOiAic2xpbSIKICAgICAgfQogICAgfQogIH0KfQ==";
    }

}
