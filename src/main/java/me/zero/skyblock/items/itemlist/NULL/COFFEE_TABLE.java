package me.zero.skyblock.items.itemlist.NULL;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class COFFEE_TABLE extends SItem implements ItemStatistics, SkullItem {

    @Override
    public String getName() {
        return "Coffee Table";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "COFFEE_TABLE"; 
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
        return Rarity.COMMON;
    }

    @Override
    public String getTexture() {
        return "ewogICJ0aW1lc3RhbXAiIDogMTY0NDc2NjAzMDY3MCwKICAicHJvZmlsZUlkIiA6ICIwYjg3ZTgyZTgwODA0MmU4ODM3MzMwOTk4Mjk4OThmOSIsCiAgInByb2ZpbGVOYW1lIiA6ICJ6ZWxhMjAwMCIsCiAgInNpZ25hdHVyZVJlcXVpcmVkIiA6IHRydWUsCiAgInRleHR1cmVzIiA6IHsKICAgICJTS0lOIiA6IHsKICAgICAgInVybCIgOiAiaHR0cDovL3RleHR1cmVzLm1pbmVjcmFmdC5uZXQvdGV4dHVyZS9mMDk1MGIwNTEyMmEwYjUxZTljZTkxNDg1ZjJmN2MxNzk5NjQ2OTZhOWUzNjM4NmQ0OTAwNWU5ZTUxZDM5YTlmIgogICAgfQogIH0KfQ==";
    }

}
