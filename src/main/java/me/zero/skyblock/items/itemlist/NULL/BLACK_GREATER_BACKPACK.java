package me.zero.skyblock.items.itemlist.NULL;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BLACK_GREATER_BACKPACK extends SItem implements ItemStatistics, SkullItem {

    @Override
    public String getName() {
        return "Greater Backpack";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "BLACK_GREATER_BACKPACK"; 
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
    public String getTexture() {
        return "ewogICJ0aW1lc3RhbXAiIDogMTcxOTUzODExNTM1OSwKICAicHJvZmlsZUlkIiA6ICIzNjQ4MzkyNGRmNjQ0ZDlmYTM0NjcyYTRhMWRlYmU2MiIsCiAgInByb2ZpbGVOYW1lIiA6ICJKdWFuQXRpbnM3OSIsCiAgInNpZ25hdHVyZVJlcXVpcmVkIiA6IHRydWUsCiAgInRleHR1cmVzIiA6IHsKICAgICJTS0lOIiA6IHsKICAgICAgInVybCIgOiAiaHR0cDovL3RleHR1cmVzLm1pbmVjcmFmdC5uZXQvdGV4dHVyZS83MmE3OTNlNWUwMTc0ZmM2M2RkZmNiYTNjNTQzMzhhOTVmMjdmODQ2NmIwOWNlMzVjZjBjZWQyMzZlNTFiZjA3IiwKICAgICAgIm1ldGFkYXRhIiA6IHsKICAgICAgICAibW9kZWwiIDogInNsaW0iCiAgICAgIH0KICAgIH0KICB9Cn0=";
    }

}
