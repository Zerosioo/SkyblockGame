package me.zero.skyblock.items.itemlist.NULL;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FTX_3070 extends SItem implements ItemStatistics, SkullItem {

    @Override
    public String getName() {
        return "FTX 3070";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "FTX_3070"; 
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
        return "ewogICJ0aW1lc3RhbXAiIDogMTYyMTQ4NDc4OTI5MiwKICAicHJvZmlsZUlkIiA6ICJmYWEzMzcyYjhhOWE0ZDQ4OTA0ZDM3YTI3MzM1Yzc3YiIsCiAgInByb2ZpbGVOYW1lIiA6ICJLYW1lblJpZGVyMDE3IiwKICAic2lnbmF0dXJlUmVxdWlyZWQiIDogdHJ1ZSwKICAidGV4dHVyZXMiIDogewogICAgIlNLSU4iIDogewogICAgICAidXJsIiA6ICJodHRwOi8vdGV4dHVyZXMubWluZWNyYWZ0Lm5ldC90ZXh0dXJlLzc2NTk4NGYwMzdmMTIzMWI0MDY3MDY4ZjYyNTA3ZDc3YzkzZDAxN2Y4NzI4OTBjZGQ1M2U4YzFlMmYwOTlhMTUiCiAgICB9CiAgfQp9";
    }

}
