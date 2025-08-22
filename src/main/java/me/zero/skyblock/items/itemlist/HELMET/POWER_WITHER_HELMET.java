package me.zero.skyblock.items.itemlist.HELMET;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class POWER_WITHER_HELMET extends SItem implements ItemStatistics, SkullItem, Sellable {

    @Override
    public String getName() {
        return "Necron's Helmet";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "POWER_WITHER_HELMET"; 
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
        return Gamestage.PROFESSIONAL;
    }

    @Override
    public DungeonType getDungeonType() {
        return DungeonType.CATACOMBS;
    }

    @Override
    public int getGearScore() {
        return 25;
    }

    @Override
    public int getPrice() {
        return 5000;
    }

    @Override
    public int getStrength() {
        return 40;
    }

    @Override
    public int getCritDamage() {
        return 30;
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
    public int getIntelligence() {
        return 30;
    }

    @Override
    public String getTexture() {
        return "ewogICJ0aW1lc3RhbXAiIDogMTYwNTYyMzI0OTc5MywKICAicHJvZmlsZUlkIiA6ICIwNjEzY2I1Y2QxYjg0M2JjYjI4OTk1NWU4N2QzMGEyYyIsCiAgInByb2ZpbGVOYW1lIiA6ICJicmVhZGxvYWZzcyIsCiAgInNpZ25hdHVyZVJlcXVpcmVkIiA6IHRydWUsCiAgInRleHR1cmVzIiA6IHsKICAgICJTS0lOIiA6IHsKICAgICAgInVybCIgOiAiaHR0cDovL3RleHR1cmVzLm1pbmVjcmFmdC5uZXQvdGV4dHVyZS8yYmJiMmZhN2E2Y2EwODcyODBlYTBjYjU2NGI0MWVmMWFlNDA0YTE5ZjdhODEyOGQzZDI4YzUxOWE4NWUwNjNmIgogICAgfQogIH0KfQ==";
    }

}
