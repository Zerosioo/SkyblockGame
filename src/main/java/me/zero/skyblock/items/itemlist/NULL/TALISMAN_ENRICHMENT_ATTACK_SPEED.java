package me.zero.skyblock.items.itemlist.NULL;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TALISMAN_ENRICHMENT_ATTACK_SPEED extends SItem implements ItemStatistics, SkullItem {

    @Override
    public String getName() {
        return "Attack Speed Enrichment";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "TALISMAN_ENRICHMENT_ATTACK_SPEED"; 
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
    public boolean isEnchanted() {
        return true;
    }

    @Override
    public String getTexture() {
        return "ewogICJ0aW1lc3RhbXAiIDogMTcyMDA0MDEyODY3OSwKICAicHJvZmlsZUlkIiA6ICJkYjZiYWRlN2NjMzI0MjM4YjU3OTQ4NzMxNTBkNjA1MiIsCiAgInByb2ZpbGVOYW1lIiA6ICJRdWFudHVtQmxvY2tlciIsCiAgInNpZ25hdHVyZVJlcXVpcmVkIiA6IHRydWUsCiAgInRleHR1cmVzIiA6IHsKICAgICJTS0lOIiA6IHsKICAgICAgInVybCIgOiAiaHR0cDovL3RleHR1cmVzLm1pbmVjcmFmdC5uZXQvdGV4dHVyZS9kZWNjZGQ2MTkzOTRiZmZhMjUzNTQ2MTdlYzZiMzI3ZWVkZTQ1ZTJjNzNmMWNmN2FmYTNjMTFhYzEwZWUxYTBmIiwKICAgICAgIm1ldGFkYXRhIiA6IHsKICAgICAgICAibW9kZWwiIDogInNsaW0iCiAgICAgIH0KICAgIH0KICB9Cn0=";
    }

}
