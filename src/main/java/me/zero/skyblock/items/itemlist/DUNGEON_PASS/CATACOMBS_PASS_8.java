package me.zero.skyblock.items.itemlist.DUNGEON_PASS;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CATACOMBS_PASS_8 extends SItem implements ItemStatistics, SkullItem {

    @Override
    public String getName() {
        return "Catacombs Pass VIII";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "CATACOMBS_PASS_8"; 
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
        return ItemType.DUNGEON_PASS;
    }

    @Override
    public Rarity getRarity() {
        return Rarity.EPIC;
    }

    @Override
    public boolean isDungeonItem() {
      	return true;
    }

    @Override
    public String getTexture() {
        return "ewogICJ0aW1lc3RhbXAiIDogMTcxOTg3MjM1ODMyMSwKICAicHJvZmlsZUlkIiA6ICIxYjQwYzcxMGZjMTY0NmQ2OTIxOTVmYzY3YzZlMTE0ZCIsCiAgInByb2ZpbGVOYW1lIiA6ICJ3c3pvbHNvbiIsCiAgInNpZ25hdHVyZVJlcXVpcmVkIiA6IHRydWUsCiAgInRleHR1cmVzIiA6IHsKICAgICJTS0lOIiA6IHsKICAgICAgInVybCIgOiAiaHR0cDovL3RleHR1cmVzLm1pbmVjcmFmdC5uZXQvdGV4dHVyZS8zM2EwMjQ2ZDUxMzUwYjc3MGRlMjdmMWExOTI1YjExY2VjZTU3YjNjOWIyMDllMmI2YmYyNzVkMzJkMDE1NGMzIiwKICAgICAgIm1ldGFkYXRhIiA6IHsKICAgICAgICAibW9kZWwiIDogInNsaW0iCiAgICAgIH0KICAgIH0KICB9Cn0=";
    }

}
