package me.zero.skyblock.items.itemlist.PORTAL;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DANGER_3_PORTAL extends SItem implements ItemStatistics, SkullItem, Sellable {

    @Override
    public String getName() {
        return "Portal to The End";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "DANGER_3_PORTAL"; 
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
        return ItemType.PORTAL;
    }

    @Override
    public Rarity getRarity() {
        return Rarity.UNCOMMON;
    }

    @Override
    public int getPrice() {
        return 100;
    }

    @Override
    public String getTexture() {
        return "ewogICJ0aW1lc3RhbXAiIDogMTYwOTM0OTgxNjE4OSwKICAicHJvZmlsZUlkIiA6ICJjZGM5MzQ0NDAzODM0ZDdkYmRmOWUyMmVjZmM5MzBiZiIsCiAgInByb2ZpbGVOYW1lIiA6ICJSYXdMb2JzdGVycyIsCiAgInNpZ25hdHVyZVJlcXVpcmVkIiA6IHRydWUsCiAgInRleHR1cmVzIiA6IHsKICAgICJTS0lOIiA6IHsKICAgICAgInVybCIgOiAiaHR0cDovL3RleHR1cmVzLm1pbmVjcmFmdC5uZXQvdGV4dHVyZS84MjIxNWNkN2JhNDBlNzAwOWM1MWZkMWFiZjIxZDlkODgxMjZkZDc4MjdiZDdjNGVjMjk5NTJlYzdiZDVlZmM3IgogICAgfQogIH0KfQ==";
    }

}
