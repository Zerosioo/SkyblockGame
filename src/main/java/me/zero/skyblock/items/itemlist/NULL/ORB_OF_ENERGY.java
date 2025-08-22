package me.zero.skyblock.items.itemlist.NULL;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ORB_OF_ENERGY extends SItem implements ItemStatistics, SkullItem, Sellable {

    @Override
    public String getName() {
        return "Orb of Energy";
    }

    @Override
    public List<String> getLore() {
        return new ArrayList(Arrays.asList("§7§oAccording to","§7§oProfessor Selta","§7§othey are 9V","§7§obatteries and","§7§ocan supply about","§7§o50mA of current.","§7§oProfessor Selta","§7§ois currently in","§7§oa mental asylum.")); 
    }

    @Override
    public String getId() {
        return "ORB_OF_ENERGY"; 
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
        return "ewogICJ0aW1lc3RhbXAiIDogMTY0MTA5ODU5OTQ1NCwKICAicHJvZmlsZUlkIiA6ICI1NzdhNGViOGFjNzE0Y2M0OTQxOThhOGM2ODkyOTkxMiIsCiAgInByb2ZpbGVOYW1lIiA6ICJTYW1wYXJvIiwKICAic2lnbmF0dXJlUmVxdWlyZWQiIDogdHJ1ZSwKICAidGV4dHVyZXMiIDogewogICAgIlNLSU4iIDogewogICAgICAidXJsIiA6ICJodHRwOi8vdGV4dHVyZXMubWluZWNyYWZ0Lm5ldC90ZXh0dXJlLzgzMzYwNTRjODU4YzBhZDY1MWYwOGJhYjZjNmIzZmRmMWM0N2Y1ZjY1NmZkOTZkNDU0ZTk4MWQzZmNlYjk5YzEiLAogICAgICAibWV0YWRhdGEiIDogewogICAgICAgICJtb2RlbCIgOiAic2xpbSIKICAgICAgfQogICAgfQogIH0KfQ==";
    }

}
