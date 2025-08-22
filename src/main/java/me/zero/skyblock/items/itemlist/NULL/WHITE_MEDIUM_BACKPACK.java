package me.zero.skyblock.items.itemlist.NULL;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class WHITE_MEDIUM_BACKPACK extends SItem implements ItemStatistics, SkullItem {

    @Override
    public String getName() {
        return "Medium Backpack";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "WHITE_MEDIUM_BACKPACK"; 
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
        return "ewogICJ0aW1lc3RhbXAiIDogMTcxOTUzODU3NzkwOSwKICAicHJvZmlsZUlkIiA6ICI0NDAzZGM1NDc1YmM0YjE1YTU0OGNmZGE2YjBlYjdkOSIsCiAgInByb2ZpbGVOYW1lIiA6ICI4Qml0czFCeXRlIiwKICAic2lnbmF0dXJlUmVxdWlyZWQiIDogdHJ1ZSwKICAidGV4dHVyZXMiIDogewogICAgIlNLSU4iIDogewogICAgICAidXJsIiA6ICJodHRwOi8vdGV4dHVyZXMubWluZWNyYWZ0Lm5ldC90ZXh0dXJlL2MyZTMxNDRmNDNhYzhiN2FhNjdhNjJlYzk2OWFlOTdjYjI4ZjNhZjc1ZmEwODcyZDM1NDRkOGZiYjBhYzUwMDUiLAogICAgICAibWV0YWRhdGEiIDogewogICAgICAgICJtb2RlbCIgOiAic2xpbSIKICAgICAgfQogICAgfQogIH0KfQ==";
    }

}
