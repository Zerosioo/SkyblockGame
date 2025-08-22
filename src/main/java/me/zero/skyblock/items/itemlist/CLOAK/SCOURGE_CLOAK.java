package me.zero.skyblock.items.itemlist.CLOAK;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SCOURGE_CLOAK extends SItem implements ItemStatistics, SkullItem, Sellable {

    @Override
    public String getName() {
        return "Scourge Cloak";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "SCOURGE_CLOAK"; 
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
        return ItemType.CLOAK;
    }

    @Override
    public Rarity getRarity() {
        return Rarity.EPIC;
    }

    @Override
    public Gamestage getGamestage() {
        return Gamestage.EXPERT;
    }

    @Override
    public int getPrice() {
        return 57000;
    }

    @Override
    public int getCritDamage() {
        return 20;
    }

    @Override
    public int getHealth() {
        return 25;
    }

    @Override
    public String getTexture() {
        return "ewogICJ0aW1lc3RhbXAiIDogMTY0NDU4OTE4NTM1MSwKICAicHJvZmlsZUlkIiA6ICI4ODBiZWMwYTE0MmM0YzRlYTJlZjliMTFiMTBkNWNiNyIsCiAgInByb2ZpbGVOYW1lIiA6ICJmZ2FiIiwKICAic2lnbmF0dXJlUmVxdWlyZWQiIDogdHJ1ZSwKICAidGV4dHVyZXMiIDogewogICAgIlNLSU4iIDogewogICAgICAidXJsIiA6ICJodHRwOi8vdGV4dHVyZXMubWluZWNyYWZ0Lm5ldC90ZXh0dXJlLzNjODg3NDMyMDliODgxZWE2ZjcxYTBlNWQ2ZDdiNGUyOTA0NTU0Mjk5ZDVlNzAxYmY5MTZiZTA5YTkzZWZlNjAiLAogICAgICAibWV0YWRhdGEiIDogewogICAgICAgICJtb2RlbCIgOiAic2xpbSIKICAgICAgfQogICAgfQogIH0KfQ==";
    }

}
