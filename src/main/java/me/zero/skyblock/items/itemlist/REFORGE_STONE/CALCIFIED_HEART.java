package me.zero.skyblock.items.itemlist.REFORGE_STONE;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CALCIFIED_HEART extends SItem implements ItemStatistics, SkullItem, Sellable {

    @Override
    public String getName() {
        return "Calcified Heart";
    }

    @Override
    public List<String> getLore() {
        return new ArrayList(Arrays.asList("§8§oA cold and","§8§ohardened heart","§8§othat was once","§8§obrimming with","§8§oeager love.")); 
    }

    @Override
    public String getId() {
        return "CALCIFIED_HEART"; 
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
        return ItemType.REFORGE_STONE;
    }

    @Override
    public Rarity getRarity() {
        return Rarity.RARE;
    }

    @Override
    public int getPrice() {
        return 5000;
    }

    @Override
    public String getTexture() {
        return "ewogICJ0aW1lc3RhbXAiIDogMTczOTY2NjM1NTg2OSwKICAicHJvZmlsZUlkIiA6ICI3MjU1MDA3NjQzYzQ0YTZiYjM3MjJlNzc3OTk5OTFkOSIsCiAgInByb2ZpbGVOYW1lIiA6ICJ4M250YW55IiwKICAic2lnbmF0dXJlUmVxdWlyZWQiIDogdHJ1ZSwKICAidGV4dHVyZXMiIDogewogICAgIlNLSU4iIDogewogICAgICAidXJsIiA6ICJodHRwOi8vdGV4dHVyZXMubWluZWNyYWZ0Lm5ldC90ZXh0dXJlLzFhMzMzODY2M2VmZmRjM2ZlMTM5YjkzMTc0ZmNmYmY0ZmEzNmM1YjQ4MmVhYjk1N2FmZGY5OWFiYjFlMmY0MTYiLAogICAgICAibWV0YWRhdGEiIDogewogICAgICAgICJtb2RlbCIgOiAic2xpbSIKICAgICAgfQogICAgfQogIH0KfQ==";
    }

}
