package me.zero.skyblock.items.itemlist.NULL;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GENERATOR_UPGRADE_STONE_FISHING_12 extends SItem implements ItemStatistics, SkullItem {

    @Override
    public String getName() {
        return "Fishing Minion XII Upgrade Stone";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "GENERATOR_UPGRADE_STONE_FISHING_12"; 
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
        return Rarity.LEGENDARY;
    }

    @Override
    public boolean isStackable() {
        return false;
    }

    @Override
    public String getTexture() {
        return "ewogICJ0aW1lc3RhbXAiIDogMTczNzk5NzIwMDc4OSwKICAicHJvZmlsZUlkIiA6ICIwNDg2YWUwMWI4Y2I0OWUzODMyZDcwOTNmMWJlNzI3NyIsCiAgInByb2ZpbGVOYW1lIiA6ICJfcGFrbWFuXyIsCiAgInNpZ25hdHVyZVJlcXVpcmVkIiA6IHRydWUsCiAgInRleHR1cmVzIiA6IHsKICAgICJTS0lOIiA6IHsKICAgICAgInVybCIgOiAiaHR0cDovL3RleHR1cmVzLm1pbmVjcmFmdC5uZXQvdGV4dHVyZS9jYjA5ODUzYWJlM2UzZjdjZTk5OTJkMDNhNTI2MjNkMDQ3YjU1ZmU2YmE4ZTdiYWQ5NTc1MGNmM2U2MDgyYTU1IiwKICAgICAgIm1ldGFkYXRhIiA6IHsKICAgICAgICAibW9kZWwiIDogInNsaW0iCiAgICAgIH0KICAgIH0KICB9Cn0=";
    }

}
