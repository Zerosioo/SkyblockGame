package me.zero.skyblock.items.itemlist.ACCESSORY;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CRUX_TALISMAN_3 extends SItem implements ItemStatistics, SkullItem {

    @Override
    public String getName() {
        return "Crux Artifact";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "CRUX_TALISMAN_3"; 
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
        return ItemType.ACCESSORY;
    }

    @Override
    public Rarity getRarity() {
        return Rarity.RARE;
    }

    @Override
    public String getTexture() {
        return "ewogICJ0aW1lc3RhbXAiIDogMTY4NDM1MzMyNDY1NywKICAicHJvZmlsZUlkIiA6ICJmODJmNTQ1MDIzZDA0MTFkYmVlYzU4YWI4Y2JlMTNjNyIsCiAgInByb2ZpbGVOYW1lIiA6ICJSZXNwb25kZW50cyIsCiAgInNpZ25hdHVyZVJlcXVpcmVkIiA6IHRydWUsCiAgInRleHR1cmVzIiA6IHsKICAgICJTS0lOIiA6IHsKICAgICAgInVybCIgOiAiaHR0cDovL3RleHR1cmVzLm1pbmVjcmFmdC5uZXQvdGV4dHVyZS81NGQ2NjM0NTFmMzUwYTM2NmU2NzRiYjBkOWY3MWZlOTIyYzExZmYxYmI4ZTU4M2QwNWQyMzc5MzhhZmQwYzg4IiwKICAgICAgIm1ldGFkYXRhIiA6IHsKICAgICAgICAibW9kZWwiIDogInNsaW0iCiAgICAgIH0KICAgIH0KICB9Cn0=";
    }

}
