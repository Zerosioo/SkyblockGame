package me.zero.skyblock.items.itemlist.NULL;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ANNI_PODIUM_MEME_FIRST extends SItem implements ItemStatistics, SkullItem {

    @Override
    public String getName() {
        return "10th Anniversary Podium";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "ANNI_PODIUM_MEME_FIRST"; 
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
        return Rarity.EPIC;
    }

    @Override
    public boolean isStackable() {
        return false;
    }

    @Override
    public Soulbound getSoulbound() {
        return Soulbound.COOP;
    }

    @Override
    public String getTexture() {
        return "ewogICJ0aW1lc3RhbXAiIDogMTY4MTUwMTg2OTI1NiwKICAicHJvZmlsZUlkIiA6ICJhZjQwMzQxMTk1YTg0ZDcwODFkNWNmNDE3MDM5ODJmNSIsCiAgInByb2ZpbGVOYW1lIiA6ICJBdHJ4dSIsCiAgInNpZ25hdHVyZVJlcXVpcmVkIiA6IHRydWUsCiAgInRleHR1cmVzIiA6IHsKICAgICJTS0lOIiA6IHsKICAgICAgInVybCIgOiAiaHR0cDovL3RleHR1cmVzLm1pbmVjcmFmdC5uZXQvdGV4dHVyZS9lODEwZjdmZWY0YmQ0NDc3NGI0MTA2OWIwN2E3MjQ4OGY2Mjc1ZjhjY2Q4OGUyZmRhOWY5ZTI3NzUzNWE0YzcxIgogICAgfQogIH0KfQ==";
    }

}
