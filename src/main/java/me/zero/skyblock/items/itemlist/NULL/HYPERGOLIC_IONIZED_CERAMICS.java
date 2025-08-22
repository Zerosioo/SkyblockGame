package me.zero.skyblock.items.itemlist.NULL;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class HYPERGOLIC_IONIZED_CERAMICS extends SItem implements ItemStatistics, SkullItem {

    @Override
    public String getName() {
        return "Hypergolic Ionized Ceramics";
    }

    @Override
    public List<String> getLore() {
        return new ArrayList(Arrays.asList("Obtained from","expired hypergolic","fuel.","","§8First the gabagool","§8fuel is vitrified","§8through","§8calcination, then","§8stabilized using a","§8phosphate-based","§8crystalline","§8ceramic host","§8through an ion","§8exchange, or","§8something...")); 
    }

    @Override
    public String getId() {
        return "HYPERGOLIC_IONIZED_CERAMICS"; 
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
        return "ewogICJ0aW1lc3RhbXAiIDogMTY1ODQ3MzIwNTEwMiwKICAicHJvZmlsZUlkIiA6ICIwMGZiNTRiOWI4NDA0YTA0YTViMmJhMzBlYzBlYTAxMiIsCiAgInByb2ZpbGVOYW1lIiA6ICJrbGxveWQ3MCIsCiAgInNpZ25hdHVyZVJlcXVpcmVkIiA6IHRydWUsCiAgInRleHR1cmVzIiA6IHsKICAgICJTS0lOIiA6IHsKICAgICAgInVybCIgOiAiaHR0cDovL3RleHR1cmVzLm1pbmVjcmFmdC5uZXQvdGV4dHVyZS81NWQ1ZWJlZjk5ODY4YTliNmFjZTk0ODljOTM5N2U5NzlmZTBmMmI1NmNhZmIyZjY5Yjk0YThjNTlhODU2ODYwIiwKICAgICAgIm1ldGFkYXRhIiA6IHsKICAgICAgICAibW9kZWwiIDogInNsaW0iCiAgICAgIH0KICAgIH0KICB9Cn0=";
    }

}
