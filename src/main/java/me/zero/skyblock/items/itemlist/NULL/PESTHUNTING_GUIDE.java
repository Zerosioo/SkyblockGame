package me.zero.skyblock.items.itemlist.NULL;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PESTHUNTING_GUIDE extends SItem implements ItemStatistics, SkullItem, Sellable {

    @Override
    public String getName() {
        return "A Beginner's Guide to Pesthunting";
    }

    @Override
    public List<String> getLore() {
        return new ArrayList(Arrays.asList("§8§oAn old,","§8§owell-used","§8§ohandbook","§8§odetailing how to","§8§owrangle various","§8§opest types. Many","§8§oof these pests","§8§odon't seem to","§8§oexist anymore -","§8§olooks like","§8§osomeone did a","§8§ogood job!")); 
    }

    @Override
    public String getId() {
        return "PESTHUNTING_GUIDE"; 
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
        return Rarity.LEGENDARY;
    }

    @Override
    public int getPrice() {
        return 1000000;
    }

    @Override
    public String getTexture() {
        return "ewogICJ0aW1lc3RhbXAiIDogMTczMTk0NzgwMDU1NywKICAicHJvZmlsZUlkIiA6ICI3YjA5ZDg5NWQyYjc0NTU3YmM0YTkzNWYyNjU0NWNjNCIsCiAgInByb2ZpbGVOYW1lIiA6ICJBaXJwbGFuZUdvQnJyIiwKICAic2lnbmF0dXJlUmVxdWlyZWQiIDogdHJ1ZSwKICAidGV4dHVyZXMiIDogewogICAgIlNLSU4iIDogewogICAgICAidXJsIiA6ICJodHRwOi8vdGV4dHVyZXMubWluZWNyYWZ0Lm5ldC90ZXh0dXJlLzM4YTdjOWUwYzFkYWI4OWUxNGI3ODhkOTYxNTdhYjAxNTIxMzZmOGZkN2EyM2Q2ZGIzZWViZTU1NWQ0NDhlYzMiLAogICAgICAibWV0YWRhdGEiIDogewogICAgICAgICJtb2RlbCIgOiAic2xpbSIKICAgICAgfQogICAgfQogIH0KfQ==";
    }

}
