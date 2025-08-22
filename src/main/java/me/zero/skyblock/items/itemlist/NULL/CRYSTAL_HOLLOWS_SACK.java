package me.zero.skyblock.items.itemlist.NULL;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CRYSTAL_HOLLOWS_SACK extends SItem implements ItemStatistics, SkullItem {

    @Override
    public String getName() {
        return "Crystal Hollows Sack";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "CRYSTAL_HOLLOWS_SACK"; 
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
    public boolean isStackable() {
        return false;
    }

    @Override
    public String getTexture() {
        return "ewogICJ0aW1lc3RhbXAiIDogMTY4MDE5MDk5MDUwMSwKICAicHJvZmlsZUlkIiA6ICIyYzA3NmUzNDU0N2M0OWU2OTMwYzQzZDE2MDZmYjI1ZCIsCiAgInByb2ZpbGVOYW1lIiA6ICJsUmVzdSIsCiAgInNpZ25hdHVyZVJlcXVpcmVkIiA6IHRydWUsCiAgInRleHR1cmVzIiA6IHsKICAgICJTS0lOIiA6IHsKICAgICAgInVybCIgOiAiaHR0cDovL3RleHR1cmVzLm1pbmVjcmFmdC5uZXQvdGV4dHVyZS9hNmI0NmJlZWI1ZjZlMDAwNjE2M2VkYTRhNTA3MDNhNDBlNjU5MTA4MGIwZTY3Nzc5MzEyYWRjZmVjNDYxNTIiCiAgICB9CiAgfQp9";
    }

}
