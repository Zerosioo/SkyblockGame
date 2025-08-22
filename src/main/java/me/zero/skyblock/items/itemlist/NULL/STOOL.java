package me.zero.skyblock.items.itemlist.NULL;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class STOOL extends SItem implements ItemStatistics, SkullItem {

    @Override
    public String getName() {
        return "Stool";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "STOOL"; 
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
        return Rarity.COMMON;
    }

    @Override
    public String getTexture() {
        return "ewogICJ0aW1lc3RhbXAiIDogMTY0NDc2NjEwODE3MywKICAicHJvZmlsZUlkIiA6ICI0NGNlMmMwZTFjNTM0ZDhmYmExNmNkNDhlYjkyYTUxZSIsCiAgInByb2ZpbGVOYW1lIiA6ICJ4WGlyYW56dThYeCIsCiAgInNpZ25hdHVyZVJlcXVpcmVkIiA6IHRydWUsCiAgInRleHR1cmVzIiA6IHsKICAgICJTS0lOIiA6IHsKICAgICAgInVybCIgOiAiaHR0cDovL3RleHR1cmVzLm1pbmVjcmFmdC5uZXQvdGV4dHVyZS80OGQ5YzhjZTkwNTJmYTkxYWM3YWNmNmE5OThlOTY0YzZiMTkyYzE1NDczOGQwMTAwOWUzZjYxMjhmZGVkYzcxIgogICAgfQogIH0KfQ==";
    }

}
