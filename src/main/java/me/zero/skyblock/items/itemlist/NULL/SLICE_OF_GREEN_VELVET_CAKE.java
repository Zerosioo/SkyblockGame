package me.zero.skyblock.items.itemlist.NULL;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SLICE_OF_GREEN_VELVET_CAKE extends SItem implements ItemStatistics, SkullItem {

    @Override
    public String getName() {
        return "Slice of Matcha Cake";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "SLICE_OF_GREEN_VELVET_CAKE"; 
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
        return Rarity.SPECIAL;
    }

    @Override
    public Soulbound getSoulbound() {
        return Soulbound.SOLO;
    }

    @Override
    public String getTexture() {
        return "ewogICJ0aW1lc3RhbXAiIDogMTczODEzODY0NjgzOSwKICAicHJvZmlsZUlkIiA6ICI2YzdjZWFjNTdjM2Q0ZTdmYWI3MTc3YTRkMDhlMGU2MSIsCiAgInByb2ZpbGVOYW1lIiA6ICJNRzE0MSIsCiAgInNpZ25hdHVyZVJlcXVpcmVkIiA6IHRydWUsCiAgInRleHR1cmVzIiA6IHsKICAgICJTS0lOIiA6IHsKICAgICAgInVybCIgOiAiaHR0cDovL3RleHR1cmVzLm1pbmVjcmFmdC5uZXQvdGV4dHVyZS80NzkwYzM5OTg1MGUyOGI3OWQ3YmEyM2UxY2UzZmQ3NjFlMWIxZGMxNTcwNDg2NjY5NTZhMDFlMTAzMmNhMzgyIiwKICAgICAgIm1ldGFkYXRhIiA6IHsKICAgICAgICAibW9kZWwiIDogInNsaW0iCiAgICAgIH0KICAgIH0KICB9Cn0";
    }

}
