package me.zero.skyblock.items.itemlist.REFORGE_STONE;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BURROWING_SPORES extends SItem implements ItemStatistics, SkullItem, Sellable {

    @Override
    public String getName() {
        return "Burrowing Spores";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "BURROWING_SPORES"; 
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
        return Rarity.RARE;
    }

    @Override
    public int getPrice() {
        return 1;
    }

    @Override
    public String getTexture() {
        return "ewogICJ0aW1lc3RhbXAiIDogMTY3ODgyMjIyMzAxNywKICAicHJvZmlsZUlkIiA6ICJhZjQwMzQxMTk1YTg0ZDcwODFkNWNmNDE3MDM5ODJmNSIsCiAgInByb2ZpbGVOYW1lIiA6ICJBdHJ4dSIsCiAgInNpZ25hdHVyZVJlcXVpcmVkIiA6IHRydWUsCiAgInRleHR1cmVzIiA6IHsKICAgICJTS0lOIiA6IHsKICAgICAgInVybCIgOiAiaHR0cDovL3RleHR1cmVzLm1pbmVjcmFmdC5uZXQvdGV4dHVyZS82MmNmZjg3YzFhYmU2OTJjZGIyMDUyNmE1ODYzYjZjYjc1YWNmMzZjYWYwNTNhMjJjN2YxZmM2YzM2OTZhZGFjIgogICAgfQogIH0KfQ==";
    }

}
