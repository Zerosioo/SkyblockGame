package me.zero.skyblock.items.itemlist.NULL;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class JASPER_CRYSTAL extends SItem implements ItemStatistics, SkullItem, Museum {

    @Override
    public String getName() {
        return "Jasper Crystal";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "JASPER_CRYSTAL"; 
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
        return Rarity.SPECIAL;
    }

    @Override
    public boolean isMuseum() {
        return true;
    }

    @Override
    public String getTexture() {
        return "ewogICJ0aW1lc3RhbXAiIDogMTYyMTQ2Mzk4NDEwMSwKICAicHJvZmlsZUlkIiA6ICI0OWIzODUyNDdhMWY0NTM3YjBmN2MwZTFmMTVjMTc2NCIsCiAgInByb2ZpbGVOYW1lIiA6ICJiY2QyMDMzYzYzZWM0YmY4IiwKICAic2lnbmF0dXJlUmVxdWlyZWQiIDogdHJ1ZSwKICAidGV4dHVyZXMiIDogewogICAgIlNLSU4iIDogewogICAgICAidXJsIiA6ICJodHRwOi8vdGV4dHVyZXMubWluZWNyYWZ0Lm5ldC90ZXh0dXJlL2UyYjVmZTllYTUyMzk1YTQxYWM2OGMwY2I1NzU4NjRmZWI1ZmRkOGVhMTU4MjYyZThmODI5MTI1ZWMzM2Q0ODciLAogICAgICAibWV0YWRhdGEiIDogewogICAgICAgICJtb2RlbCIgOiAic2xpbSIKICAgICAgfQogICAgfQogIH0KfQ==";
    }

}
