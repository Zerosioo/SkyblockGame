package me.zero.skyblock.items.itemlist.HELMET;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PRECURSOR_EYE extends SItem implements ItemStatistics, SkullItem, Sellable {

    @Override
    public String getName() {
        return "Precursor Eye";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "PRECURSOR_EYE"; 
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
    public boolean isDungeonItem() {
      	return true;
    }

    @Override
    public Gamestage getGamestage() {
        return Gamestage.EXPERT;
    }

    @Override
    public DungeonType getDungeonType() {
        return DungeonType.CATACOMBS;
    }

    @Override
    public int getGearScore() {
        return 100;
    }

    @Override
    public int getPrice() {
        return 1000;
    }

    @Override
    public int getHealth() {
        return 222;
    }

    @Override
    public int getDefense() {
        return 222;
    }

    @Override
    public int getIntelligence() {
        return 222;
    }

    @Override
    public String getTexture() {
        return "ewogICJ0aW1lc3RhbXAiIDogMTYwMTQ3OTI0MjkyNCwKICAicHJvZmlsZUlkIiA6ICI1NjY3NWIyMjMyZjA0ZWUwODkxNzllOWM5MjA2Y2ZlOCIsCiAgInByb2ZpbGVOYW1lIiA6ICJUaGVJbmRyYSIsCiAgInNpZ25hdHVyZVJlcXVpcmVkIiA6IHRydWUsCiAgInRleHR1cmVzIiA6IHsKICAgICJTS0lOIiA6IHsKICAgICAgInVybCIgOiAiaHR0cDovL3RleHR1cmVzLm1pbmVjcmFmdC5uZXQvdGV4dHVyZS83MmMwNjgzYjIwMTljYTNkMzk0NzI3M2UzOTRiZmNhMWI0ZDcxYjYxYjY3YjM5NDc0YzJkNmQ3M2E5YjY3NTA4IgogICAgfQogIH0KfQ==";
    }

}
