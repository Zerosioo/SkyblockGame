package me.zero.skyblock.items.itemlist.BOOTS;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SUPERIOR_DRAGON_BOOTS extends SItem implements ItemStatistics,ColoredArmor, Sellable {

    @Override
    public String getName() {
        return "Superior Dragon Boots";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "SUPERIOR_DRAGON_BOOTS"; 
    }

    @Override
    public Material getMaterial() {
        return Material.LEATHER_BOOTS;
    }

    @Override
    public ItemType getItemType() {
        return ItemType.BOOTS;
    }

    @Override
    public Rarity getRarity() {
        return Rarity.LEGENDARY;
    }

    @Override
    public Color getColor() {
        return Color.fromRGB(242,93,24);
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
        return 80;
    }

    @Override
    public int getDefense() {
        return 110;
    }

    @Override
    public int getIntelligence() {
        return 25;
    }

    @Override
    public int getSpeed() {
        return 3;
    }

}
