package me.zero.skyblock.items.itemlist.NULL;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CHICK_NEST extends SItem implements ItemStatistics, SkullItem {

    @Override
    public String getName() {
        return "Chick Nest";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "CHICK_NEST"; 
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
        return "ewogICJ0aW1lc3RhbXAiIDogMTcyMDA0Mzc1MTI5MiwKICAicHJvZmlsZUlkIiA6ICIxMzEzZGFmMDc2OGQ0YmQ5Yjc1ODJkMGI1NWUwZGQxNiIsCiAgInByb2ZpbGVOYW1lIiA6ICJMZW50aWNjaGllIiwKICAic2lnbmF0dXJlUmVxdWlyZWQiIDogdHJ1ZSwKICAidGV4dHVyZXMiIDogewogICAgIlNLSU4iIDogewogICAgICAidXJsIiA6ICJodHRwOi8vdGV4dHVyZXMubWluZWNyYWZ0Lm5ldC90ZXh0dXJlLzFmZjA2OTljYmM0OTFkNzFlNDlmNzAyMTM3ZjRhM2FjMTE3YzAwODk0MWE1Y2NiYTEyMDNkYzI3ZmYzMGQwIgogICAgfQogIH0KfQ==";
    }

}
