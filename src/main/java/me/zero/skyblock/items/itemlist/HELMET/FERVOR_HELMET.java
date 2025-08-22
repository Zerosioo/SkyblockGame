package me.zero.skyblock.items.itemlist.HELMET;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FERVOR_HELMET extends SItem implements ItemStatistics, SkullItem {

    @Override
    public String getName() {
        return "Fervor Helmet";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "FERVOR_HELMET"; 
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
        return Rarity.LEGENDARY;
    }

    @Override
    public Gamestage getGamestage() {
        return Gamestage.PROFESSIONAL;
    }

    @Override
    public int getHealth() {
        return 180;
    }

    @Override
    public int getDefense() {
        return 100;
    }

    @Override
    public int getTrueDefense() {
        return 5;
    }

    @Override
    public int getIntelligence() {
        return 15;
    }

    @Override
    public String getTexture() {
        return "ewogICJ0aW1lc3RhbXAiIDogMTY0NTUwNDMxOTYxMiwKICAicHJvZmlsZUlkIiA6ICIwNDNkZWIzOGIyNjE0MTg1YTIzYzU4ZmI2YTc5ZWZkYyIsCiAgInByb2ZpbGVOYW1lIiA6ICJWaXRhbFNpZ256MiIsCiAgInNpZ25hdHVyZVJlcXVpcmVkIiA6IHRydWUsCiAgInRleHR1cmVzIiA6IHsKICAgICJTS0lOIiA6IHsKICAgICAgInVybCIgOiAiaHR0cDovL3RleHR1cmVzLm1pbmVjcmFmdC5uZXQvdGV4dHVyZS9iYzZlMTM3ZTJhNmE1MDFkZmM4NTRjYTkwMGI1YjY4MTIyN2RlYTRkNWE5NjE2ODQ5YTNhNjhmMDljNmRjMzI3IgogICAgfQogIH0KfQ==";
    }

}
