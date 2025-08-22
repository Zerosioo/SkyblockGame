package me.zero.skyblock.items.itemlist.NULL;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class VOLT_CRUX extends SItem implements ItemStatistics, SkullItem {

    @Override
    public String getName() {
        return "Volt Crux";
    }

    @Override
    public List<String> getLore() {
        return new ArrayList(Arrays.asList("Watt is this?")); 
    }

    @Override
    public String getId() {
        return "VOLT_CRUX"; 
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
        return Rarity.UNCOMMON;
    }

    @Override
    public String getTexture() {
        return "ewogICJ0aW1lc3RhbXAiIDogMTY3MzYzNjkyOTE0NiwKICAicHJvZmlsZUlkIiA6ICIwMGZiNTRiOWI4NDA0YTA0YTViMmJhMzBlYzBlYTAxMiIsCiAgInByb2ZpbGVOYW1lIiA6ICJrbGxveWQ3MCIsCiAgInNpZ25hdHVyZVJlcXVpcmVkIiA6IHRydWUsCiAgInRleHR1cmVzIiA6IHsKICAgICJTS0lOIiA6IHsKICAgICAgInVybCIgOiAiaHR0cDovL3RleHR1cmVzLm1pbmVjcmFmdC5uZXQvdGV4dHVyZS82ZTAyYjdhY2IzY2NjMGE3MjI5YThkZWUyNGY1OWYzMTZkZjA1YzYxZTVlY2M3OWUyOWE1MzU4YWRiZDJmYmFlIiwKICAgICAgIm1ldGFkYXRhIiA6IHsKICAgICAgICAibW9kZWwiIDogInNsaW0iCiAgICAgIH0KICAgIH0KICB9Cn0=";
    }

}
