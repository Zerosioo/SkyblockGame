package me.zero.skyblock.items.itemlist.NULL;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LAPIS_CHEST extends SItem implements ItemStatistics, SkullItem {

    @Override
    public String getName() {
        return "Lapis Chest+";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "LAPIS_CHEST"; 
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
 	return null;
    }

    @Override
    public Rarity getRarity() {
        return Rarity.RARE;
    }

    @Override
    public String getTexture() {
        return "ewogICJ0aW1lc3RhbXAiIDogMTY0NDc2NjU3NTgwMSwKICAicHJvZmlsZUlkIiA6ICIwYjg3ZTgyZTgwODA0MmU4ODM3MzMwOTk4Mjk4OThmOSIsCiAgInByb2ZpbGVOYW1lIiA6ICJ6ZWxhMjAwMCIsCiAgInNpZ25hdHVyZVJlcXVpcmVkIiA6IHRydWUsCiAgInRleHR1cmVzIiA6IHsKICAgICJTS0lOIiA6IHsKICAgICAgInVybCIgOiAiaHR0cDovL3RleHR1cmVzLm1pbmVjcmFmdC5uZXQvdGV4dHVyZS84NDMyMTE0NmYyOTAzYmE4ZjRhZWRhZmU4M2NjZmIzOGFkZTAzMDk2YzMzMTIxMDcxZjFmODQ0ZmNkMjg2OTRkIgogICAgfQogIH0KfQ==";
    }

}
