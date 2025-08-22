package me.zero.skyblock.items.itemlist.HELMET;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FIERY_AURORA_HELMET extends SItem implements ItemStatistics, SkullItem {

    @Override
    public String getName() {
        return "Fiery Aurora Helmet";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "FIERY_AURORA_HELMET"; 
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
    public int getHealth() {
        return 320;
    }

    @Override
    public int getDefense() {
        return 100;
    }

    @Override
    public int getIntelligence() {
        return 380;
    }

    @Override
    public double getAbilityDamage() {
        return 32.0;
    }

    @Override
    public String getTexture() {
        return "ewogICJ0aW1lc3RhbXAiIDogMTY0NTUwNDQ2NzQzMCwKICAicHJvZmlsZUlkIiA6ICJmNWQwYjFhZTQxNmU0YTE5ODEyMTRmZGQzMWU3MzA1YiIsCiAgInByb2ZpbGVOYW1lIiA6ICJDYXRjaFRoZVdhdmUxMCIsCiAgInNpZ25hdHVyZVJlcXVpcmVkIiA6IHRydWUsCiAgInRleHR1cmVzIiA6IHsKICAgICJTS0lOIiA6IHsKICAgICAgInVybCIgOiAiaHR0cDovL3RleHR1cmVzLm1pbmVjcmFmdC5uZXQvdGV4dHVyZS8xODU1YWFiYWZhNDYxZDM1Yjg2NDI5MWQ0OTRjYTM2YTJmNDYzMDdjZWFkYWQzYTI4Nzc0MDU0Zjg2Nzg4ZTgiCiAgICB9CiAgfQp9";
    }

}
