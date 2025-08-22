package me.zero.skyblock.items.itemlist.NULL;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CADUCOUS_STEM_BUNCH extends SItem implements ItemStatistics, SkullItem {

    @Override
    public String getName() {
        return "Caducous Stem Bunch";
    }

    @Override
    public List<String> getLore() {
        return new ArrayList(Arrays.asList("Bundling what bees","find attractive","together in an","industrial","production process","is definitely what","nature planned.")); 
    }

    @Override
    public String getId() {
        return "CADUCOUS_STEM_BUNCH"; 
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
        return "ewogICJ0aW1lc3RhbXAiIDogMTY3NzI4NzM0MDYzNywKICAicHJvZmlsZUlkIiA6ICIwZTM3MmZiOGEzOTk0YTkzODliMGY3NGUzZmJlZjY1ZSIsCiAgInByb2ZpbGVOYW1lIiA6ICJBVVNUSU5MT0wwN19ZVCIsCiAgInNpZ25hdHVyZVJlcXVpcmVkIiA6IHRydWUsCiAgInRleHR1cmVzIiA6IHsKICAgICJTS0lOIiA6IHsKICAgICAgInVybCIgOiAiaHR0cDovL3RleHR1cmVzLm1pbmVjcmFmdC5uZXQvdGV4dHVyZS9lNzY3MzkxNTk4NjgwYjQ2NWYyMTA2YjcwZTIxZWY1MTk2ZGExNGYwODdkMWU3NzlkZDY1MGQ0MzIwYjY5NjJhIiwKICAgICAgIm1ldGFkYXRhIiA6IHsKICAgICAgICAibW9kZWwiIDogInNsaW0iCiAgICAgIH0KICAgIH0KICB9Cn0=";
    }

}
