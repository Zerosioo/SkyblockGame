package me.zero.skyblock.items.itemlist.NULL;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ASPIRING_LEAP extends SItem implements ItemStatistics, SkullItem, Sellable {

    @Override
    public String getName() {
        return "Aspiring Leap";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "ASPIRING_LEAP"; 
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
        return Rarity.EPIC;
    }

    @Override
    public boolean isDungeonItem() {
      	return true;
    }

    @Override
    public int getPrice() {
        return 16000;
    }

    @Override
    public String getTexture() {
        return "ewogICJ0aW1lc3RhbXAiIDogMTY1MjE0NjkwNTM1OCwKICAicHJvZmlsZUlkIiA6ICJhMWU4OThjNWEyNmY0MTYyOTQyYmNmNmM1MzRiMTE5ZiIsCiAgInByb2ZpbGVOYW1lIiA6ICJ0b21keGlpaSIsCiAgInNpZ25hdHVyZVJlcXVpcmVkIiA6IHRydWUsCiAgInRleHR1cmVzIiA6IHsKICAgICJTS0lOIiA6IHsKICAgICAgInVybCIgOiAiaHR0cDovL3RleHR1cmVzLm1pbmVjcmFmdC5uZXQvdGV4dHVyZS9hMzgyNjE4MWNlOTAxMmI2NjU4NjVmM2FjMDA2NjMwN2I0ZDAyZGEyODE1NDAxMDRlMDQ2MWZmZWZhNzQ1OWZkIiwKICAgICAgIm1ldGFkYXRhIiA6IHsKICAgICAgICAibW9kZWwiIDogInNsaW0iCiAgICAgIH0KICAgIH0KICB9Cn0=";
    }

}
