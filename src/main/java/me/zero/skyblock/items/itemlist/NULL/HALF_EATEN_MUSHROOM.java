package me.zero.skyblock.items.itemlist.NULL;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class HALF_EATEN_MUSHROOM extends SItem implements ItemStatistics, SkullItem, Sellable {

    @Override
    public String getName() {
        return "Half-Eaten Mushroom";
    }

    @Override
    public List<String> getLore() {
        return new ArrayList(Arrays.asList("§8§oWhatever was","§8§otasked with","§8§oguarding this","§8§ovaluable","§8§omushroom looks","§8§oto have gotten a","§8§olittle hungry.")); 
    }

    @Override
    public String getId() {
        return "HALF_EATEN_MUSHROOM"; 
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
        return Rarity.UNCOMMON;
    }

    @Override
    public int getPrice() {
        return 500;
    }

    @Override
    public String getTexture() {
        return "ewogICJ0aW1lc3RhbXAiIDogMTczOTY3NTc5OTA2OSwKICAicHJvZmlsZUlkIiA6ICI0NDAzZGM1NDc1YmM0YjE1YTU0OGNmZGE2YjBlYjdkOSIsCiAgInByb2ZpbGVOYW1lIiA6ICI4Qml0czFCeXRlIiwKICAic2lnbmF0dXJlUmVxdWlyZWQiIDogdHJ1ZSwKICAidGV4dHVyZXMiIDogewogICAgIlNLSU4iIDogewogICAgICAidXJsIiA6ICJodHRwOi8vdGV4dHVyZXMubWluZWNyYWZ0Lm5ldC90ZXh0dXJlLzcyMTVlOGVmNzVlYjU2ZmI1ODU5NjljNDViNzA0MTA0ODQ3YjU1MzZkMGFmNzQ0ZTE2MTc2M2Y0MjExNDU2NzMiLAogICAgICAibWV0YWRhdGEiIDogewogICAgICAgICJtb2RlbCIgOiAic2xpbSIKICAgICAgfQogICAgfQogIH0KfQ==";
    }

}
