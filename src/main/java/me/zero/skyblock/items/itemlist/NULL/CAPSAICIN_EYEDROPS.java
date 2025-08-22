package me.zero.skyblock.items.itemlist.NULL;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CAPSAICIN_EYEDROPS extends SItem implements ItemStatistics, SkullItem {

    @Override
    public String getName() {
        return "Capsaicin Eyedrops";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "CAPSAICIN_EYEDROPS"; 
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
        return "ewogICJ0aW1lc3RhbXAiIDogMTYxOTc5Nzg2ODU5NCwKICAicHJvZmlsZUlkIiA6ICJmNDY0NTcxNDNkMTU0ZmEwOTkxNjBlNGJmNzI3ZGNiOSIsCiAgInByb2ZpbGVOYW1lIiA6ICJSZWxhcGFnbzA1IiwKICAic2lnbmF0dXJlUmVxdWlyZWQiIDogdHJ1ZSwKICAidGV4dHVyZXMiIDogewogICAgIlNLSU4iIDogewogICAgICAidXJsIiA6ICJodHRwOi8vdGV4dHVyZXMubWluZWNyYWZ0Lm5ldC90ZXh0dXJlL2M1OTI4YzI3ODUwMjdlN2JjNDlmYjk2ZmY0ODAxYTY3M2QyYTU5ZWYzMGI1NjFmOWYyNDUyMTQ2YjQ1ZGU4OTkiCiAgICB9CiAgfQp9";
    }

}
