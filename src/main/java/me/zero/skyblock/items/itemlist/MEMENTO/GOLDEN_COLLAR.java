package me.zero.skyblock.items.itemlist.MEMENTO;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GOLDEN_COLLAR extends SItem implements ItemStatistics, SkullItem {

    @Override
    public String getName() {
        return "Golden Collar";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "GOLDEN_COLLAR"; 
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
        return ItemType.MEMENTO;
    }

    @Override
    public Rarity getRarity() {
        return Rarity.SPECIAL;
    }

    @Override
    public String getTexture() {
        return "ewogICJ0aW1lc3RhbXAiIDogMTcwMTcyMDY4MDY3MywKICAicHJvZmlsZUlkIiA6ICIwZjlmYzU0MDQxZjk0NzEyOWQxYmEzODg1YmQ3N2M4NyIsCiAgInByb2ZpbGVOYW1lIiA6ICI4MTE5NGJheiIsCiAgInNpZ25hdHVyZVJlcXVpcmVkIiA6IHRydWUsCiAgInRleHR1cmVzIiA6IHsKICAgICJTS0lOIiA6IHsKICAgICAgInVybCIgOiAiaHR0cDovL3RleHR1cmVzLm1pbmVjcmFmdC5uZXQvdGV4dHVyZS8xZGRiMzc3ODRkODNkYmI2MDcwOTZhMzZmZmExYTI3OGY2MzNiMDc3MGQxNjI3NDFlOTg4NjI3MDQzZmZiMTk3IiwKICAgICAgIm1ldGFkYXRhIiA6IHsKICAgICAgICAibW9kZWwiIDogInNsaW0iCiAgICAgIH0KICAgIH0KICB9Cn0=";
    }

}
