package me.zero.skyblock.items.itemlist.HELMET;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BLOBFISH_HAT extends SItem implements ItemStatistics, SkullItem, Sellable, Museum {

    @Override
    public String getName() {
        return "Blobfish Hat";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "BLOBFISH_HAT"; 
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
        return ItemType.HELMET;
    }

    @Override
    public Rarity getRarity() {
        return Rarity.UNCOMMON;
    }

    @Override
    public boolean isMuseum() {
        return true;
    }

    @Override
    public Gamestage getGamestage() {
        return Gamestage.AMATEUR;
    }

    @Override
    public int getPrice() {
        return 25;
    }

    @Override
    public int getStrength() {
        return 25;
    }

    @Override
    public int getIntelligence() {
        return -10;
    }

    @Override
    public String getTexture() {
        return "ewogICJ0aW1lc3RhbXAiIDogMTY4Nzg4MTU1MjI0NSwKICAicHJvZmlsZUlkIiA6ICJjMTNkYzkxZjg1YjA0ZWM4OGU2NDk5YzdjZDc4Zjk3MSIsCiAgInByb2ZpbGVOYW1lIiA6ICJjYXNzdGhlY3J5cHRpZCIsCiAgInNpZ25hdHVyZVJlcXVpcmVkIiA6IHRydWUsCiAgInRleHR1cmVzIiA6IHsKICAgICJTS0lOIiA6IHsKICAgICAgInVybCIgOiAiaHR0cDovL3RleHR1cmVzLm1pbmVjcmFmdC5uZXQvdGV4dHVyZS9lYmVmNWVlMTczODA5MGMzODMxYjA4Mzg0MzM5ZjRlY2FhZjJjNWYxNWM4MDM2MTljMjY0NWNhMTAyNmNmNDQ1IgogICAgfQogIH0KfQ==";
    }

}
