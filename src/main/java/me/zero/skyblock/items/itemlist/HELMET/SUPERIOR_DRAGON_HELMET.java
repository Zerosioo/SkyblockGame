package me.zero.skyblock.items.itemlist.HELMET;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SUPERIOR_DRAGON_HELMET extends SItem implements ItemStatistics, SkullItem, Sellable {

    @Override
    public String getName() {
        return "Superior Dragon Helmet";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "SUPERIOR_DRAGON_HELMET"; 
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
        return Gamestage.SKILLED;
    }

    @Override
    public DungeonType getDungeonType() {
        return DungeonType.CATACOMBS;
    }

    @Override
    public int getPrice() {
        return 100000;
    }

    @Override
    public int getStrength() {
        return 10;
    }

    @Override
    public int getCritChance() {
        return 2;
    }

    @Override
    public int getCritDamage() {
        return 10;
    }

    @Override
    public int getHealth() {
        return 90;
    }

    @Override
    public int getDefense() {
        return 130;
    }

    @Override
    public int getIntelligence() {
        return 25;
    }

    @Override
    public int getSpeed() {
        return 3;
    }

    @Override
    public String getTexture() {
        return "ewogICJ0aW1lc3RhbXAiIDogMTcxOTYwMzQyNTU1NywKICAicHJvZmlsZUlkIiA6ICIzZDIxZTYyMTk2NzQ0Y2QwYjM3NjNkNTU3MWNlNGJlZSIsCiAgInByb2ZpbGVOYW1lIiA6ICJTcl83MUJsYWNrYmlyZCIsCiAgInNpZ25hdHVyZVJlcXVpcmVkIiA6IHRydWUsCiAgInRleHR1cmVzIiA6IHsKICAgICJTS0lOIiA6IHsKICAgICAgInVybCIgOiAiaHR0cDovL3RleHR1cmVzLm1pbmVjcmFmdC5uZXQvdGV4dHVyZS8xZTAzMjlmNDIxOTJlZTdjMWEwYzcwNGY4MmRiYmJlN2MwMGZiZmEzZjAyMGMxMDY3YTIwODYzMGI5OTFiOTg4IiwKICAgICAgIm1ldGFkYXRhIiA6IHsKICAgICAgICAibW9kZWwiIDogInNsaW0iCiAgICAgIH0KICAgIH0KICB9Cn0=";
    }

}
