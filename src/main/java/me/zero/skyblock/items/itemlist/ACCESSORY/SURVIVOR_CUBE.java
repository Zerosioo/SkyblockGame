package me.zero.skyblock.items.itemlist.ACCESSORY;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SURVIVOR_CUBE extends SItem implements ItemStatistics, SkullItem {

    @Override
    public String getName() {
        return "Survivor Cube";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "SURVIVOR_CUBE"; 
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
        return ItemType.ACCESSORY;
    }

    @Override
    public Rarity getRarity() {
        return Rarity.RARE;
    }

    @Override
    public Soulbound getSoulbound() {
        return Soulbound.SOLO;
    }

    @Override
    public int getVitality() {
        return 5;
    }

    @Override
    public String getTexture() {
        return "ewogICJ0aW1lc3RhbXAiIDogMTYwMjAzODYzMDQ4MywKICAicHJvZmlsZUlkIiA6ICJjOGY3Y2M4Y2QxNjY0NTFlOTMxMjE5YmM5YTY3MDg5MSIsCiAgInByb2ZpbGVOYW1lIiA6ICJUcmlTdGFyMTYxNiIsCiAgInNpZ25hdHVyZVJlcXVpcmVkIiA6IHRydWUsCiAgInRleHR1cmVzIiA6IHsKICAgICJTS0lOIiA6IHsKICAgICAgInVybCIgOiAiaHR0cDovL3RleHR1cmVzLm1pbmVjcmFmdC5uZXQvdGV4dHVyZS8yMTViMWM3Njk2NmEyOWY0OTkyMTlkNGM2MmE4NTMyN2E4Y2I2NGE2NmU4MGY3OWJkNjZkZmI3MGExMDliYTVlIgogICAgfQogIH0KfQ==";
    }

}
