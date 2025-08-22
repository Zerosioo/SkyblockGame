package me.zero.skyblock.items.itemlist.CLOAK;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GILLSPLASH_CLOAK extends SItem implements ItemStatistics, SkullItem, Sellable {

    @Override
    public String getName() {
        return "Gillsplash Cloak";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "GILLSPLASH_CLOAK"; 
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
        return ItemType.CLOAK;
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
    public int getPrice() {
        return 9000;
    }

    @Override
    public int getHealthRegeneration() {
        return 2;
    }

    @Override
    public int getFishingSpeed() {
        return 14;
    }

    @Override
    public String getTexture() {
        return "ewogICJ0aW1lc3RhbXAiIDogMTY2MjU1OTUxNTkwMSwKICAicHJvZmlsZUlkIiA6ICIxNmQ4NjI4NzYzMWY0NDY2OGQ0NDM2ZTJlY2IwNTllNSIsCiAgInByb2ZpbGVOYW1lIiA6ICJSZXphVG91cm5leSIsCiAgInNpZ25hdHVyZVJlcXVpcmVkIiA6IHRydWUsCiAgInRleHR1cmVzIiA6IHsKICAgICJTS0lOIiA6IHsKICAgICAgInVybCIgOiAiaHR0cDovL3RleHR1cmVzLm1pbmVjcmFmdC5uZXQvdGV4dHVyZS80ZGRkZmU3MDEwMGU2OTBmMmZjNWFiOTljMDhhNGJjZGY0ZWUxZjg4MGYwOGQ0OTU4ZThiYzJiYjU2MjRmZjc5IgogICAgfQogIH0KfQ==";
    }

}
