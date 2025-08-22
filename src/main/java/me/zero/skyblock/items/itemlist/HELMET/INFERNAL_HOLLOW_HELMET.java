package me.zero.skyblock.items.itemlist.HELMET;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class INFERNAL_HOLLOW_HELMET extends SItem implements ItemStatistics, SkullItem {

    @Override
    public String getName() {
        return "Infernal Hollow Helmet";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "INFERNAL_HOLLOW_HELMET"; 
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
        return 427;
    }

    @Override
    public int getDefense() {
        return 134;
    }

    @Override
    public int getIntelligence() {
        return 328;
    }

    @Override
    public int getSpeed() {
        return 13;
    }

    @Override
    public String getTexture() {
        return "ewogICJ0aW1lc3RhbXAiIDogMTY0NTUwNDE3MjcwNSwKICAicHJvZmlsZUlkIiA6ICI4YjgyM2E1YmU0Njk0YjhiOTE0NmE5MWRhMjk4ZTViNSIsCiAgInByb2ZpbGVOYW1lIiA6ICJTZXBoaXRpcyIsCiAgInNpZ25hdHVyZVJlcXVpcmVkIiA6IHRydWUsCiAgInRleHR1cmVzIiA6IHsKICAgICJTS0lOIiA6IHsKICAgICAgInVybCIgOiAiaHR0cDovL3RleHR1cmVzLm1pbmVjcmFmdC5uZXQvdGV4dHVyZS84NGVlZTlmMjM5NTJmOTc3N2QwNTE5YzExMTY1NTA2Njg1MWZiNGMxNzkzNjI5ZDM3NjdhMDBkYWNlZTZmMjUwIgogICAgfQogIH0KfQ==";
    }

}
