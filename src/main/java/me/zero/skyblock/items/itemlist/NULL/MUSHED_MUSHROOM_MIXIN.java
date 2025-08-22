package me.zero.skyblock.items.itemlist.NULL;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MUSHED_MUSHROOM_MIXIN extends SItem implements ItemStatistics, SkullItem {

    @Override
    public String getName() {
        return "Glowing Mush Mixin";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "MUSHED_MUSHROOM_MIXIN"; 
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
    public boolean isStackable() {
        return false;
    }

    @Override
    public String getTexture() {
        return "ewogICJ0aW1lc3RhbXAiIDogMTcwMTEwNDQ2MjgzOCwKICAicHJvZmlsZUlkIiA6ICIzYmFlMTVhMWU0Zjg0ZTc5OWE3N2QwZDBhZTNlZDc5NiIsCiAgInByb2ZpbGVOYW1lIiA6ICJiYXlyb25fZ2FtZXJfMjU0IiwKICAic2lnbmF0dXJlUmVxdWlyZWQiIDogdHJ1ZSwKICAidGV4dHVyZXMiIDogewogICAgIlNLSU4iIDogewogICAgICAidXJsIiA6ICJodHRwOi8vdGV4dHVyZXMubWluZWNyYWZ0Lm5ldC90ZXh0dXJlLzIyZGY0ZTkyMWJmNTg4ZTNhMGJlZDZhNWZiYzc2ZGE1ZDAyZDIzOWZiMTVlZmNhYzQyNzc0NTkyYWQ2NzlkYWUiLAogICAgICAibWV0YWRhdGEiIDogewogICAgICAgICJtb2RlbCIgOiAic2xpbSIKICAgICAgfQogICAgfQogIH0KfQ==";
    }

}
