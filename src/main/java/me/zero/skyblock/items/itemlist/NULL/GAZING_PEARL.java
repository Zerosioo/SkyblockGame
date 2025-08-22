package me.zero.skyblock.items.itemlist.NULL;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GAZING_PEARL extends SItem implements ItemStatistics, SkullItem, Sellable {

    @Override
    public String getName() {
        return "Gazing Pearl";
    }

    @Override
    public List<String> getLore() {
        return new ArrayList(Arrays.asList("§7§oCan be used","§7§oinstead of a","§7§olamp, if you","§7§oenjoy living on","§7§othe edge.")); 
    }

    @Override
    public String getId() {
        return "GAZING_PEARL"; 
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
        return "ewogICJ0aW1lc3RhbXAiIDogMTY0MjQ0MzQ1NTczNywKICAicHJvZmlsZUlkIiA6ICJmYmVhZDcyNTQwNjI0NzM0YmNlNjc0OGUzNDdlNTFiOSIsCiAgInByb2ZpbGVOYW1lIiA6ICJkX3ZpaWlkIiwKICAic2lnbmF0dXJlUmVxdWlyZWQiIDogdHJ1ZSwKICAidGV4dHVyZXMiIDogewogICAgIlNLSU4iIDogewogICAgICAidXJsIiA6ICJodHRwOi8vdGV4dHVyZXMubWluZWNyYWZ0Lm5ldC90ZXh0dXJlLzQ2ZTBhM2NjNjY1N2Q0MjA1ODE4ZmZlZjVjYzdiN2UzNmMzODFkNDI2OWI2OTAxMGM3Mjk3YTZmYTY4ZDgzZDciLAogICAgICAibWV0YWRhdGEiIDogewogICAgICAgICJtb2RlbCIgOiAic2xpbSIKICAgICAgfQogICAgfQogIH0KfQ==";
    }

}
