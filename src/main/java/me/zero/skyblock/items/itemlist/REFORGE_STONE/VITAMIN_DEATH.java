package me.zero.skyblock.items.itemlist.REFORGE_STONE;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class VITAMIN_DEATH extends SItem implements ItemStatistics, SkullItem, Sellable {

    @Override
    public String getName() {
        return "Vitamin Death";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "VITAMIN_DEATH"; 
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
        return Rarity.LEGENDARY;
    }

    @Override
    public int getPrice() {
        return 1;
    }

    @Override
    public String getTexture() {
        return "ewogICJ0aW1lc3RhbXAiIDogMTY1MTgwNzEwOTUyNSwKICAicHJvZmlsZUlkIiA6ICJhMWU4OThjNWEyNmY0MTYyOTQyYmNmNmM1MzRiMTE5ZiIsCiAgInByb2ZpbGVOYW1lIiA6ICJ0b21keGlpaSIsCiAgInNpZ25hdHVyZVJlcXVpcmVkIiA6IHRydWUsCiAgInRleHR1cmVzIiA6IHsKICAgICJTS0lOIiA6IHsKICAgICAgInVybCIgOiAiaHR0cDovL3RleHR1cmVzLm1pbmVjcmFmdC5uZXQvdGV4dHVyZS9lMjRkNTkzOWM3MTZkNDdkODgzNDVhMGVjMzZmMjU2ZGRkNzMzYWQxNjlkM2M2NGIzOGM3MzQxNmQ1MzA4NTk5IiwKICAgICAgIm1ldGFkYXRhIiA6IHsKICAgICAgICAibW9kZWwiIDogInNsaW0iCiAgICAgIH0KICAgIH0KICB9Cn0=";
    }

}
