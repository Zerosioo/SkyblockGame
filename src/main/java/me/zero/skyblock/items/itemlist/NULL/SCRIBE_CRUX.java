package me.zero.skyblock.items.itemlist.NULL;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SCRIBE_CRUX extends SItem implements ItemStatistics, SkullItem {

    @Override
    public String getName() {
        return "Scribe Crux";
    }

    @Override
    public List<String> getLore() {
        return new ArrayList(Arrays.asList("What dinosaur is a","scribe's best","friend?","Thesaurus.")); 
    }

    @Override
    public String getId() {
        return "SCRIBE_CRUX"; 
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
        return "ewogICJ0aW1lc3RhbXAiIDogMTY3NjkwOTc0MDA5NSwKICAicHJvZmlsZUlkIiA6ICI1MTY4ZjZlMjIyM2E0Y2FjYjdiN2QyZjYyZWMxZGFhOSIsCiAgInByb2ZpbGVOYW1lIiA6ICJkZWZfbm90X2FzaCIsCiAgInNpZ25hdHVyZVJlcXVpcmVkIiA6IHRydWUsCiAgInRleHR1cmVzIiA6IHsKICAgICJTS0lOIiA6IHsKICAgICAgInVybCIgOiAiaHR0cDovL3RleHR1cmVzLm1pbmVjcmFmdC5uZXQvdGV4dHVyZS9lMGVlNzgxYjc5YjFmZGMxNGFjMDhiNTA0NDhjZDkxNzRmNzFlMTU1NTE2ZTNiZjU0MmEyZDZjNDY2ZWFjZjgyIiwKICAgICAgIm1ldGFkYXRhIiA6IHsKICAgICAgICAibW9kZWwiIDogInNsaW0iCiAgICAgIH0KICAgIH0KICB9Cn0=";
    }

}
