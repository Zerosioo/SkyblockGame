package me.zero.skyblock.items.itemlist.NULL;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class HEAVY_PEARL extends SItem implements ItemStatistics, SkullItem {

    @Override
    public String getName() {
        return "Heavy Pearl";
    }

    @Override
    public List<String> getLore() {
        return new ArrayList(Arrays.asList("§7§oIt can take","§7§oyears for","§7§oHellwisp to","§7§ocreate a pearl,","§7§obut the","§7§oMatriarch","§7§osecretes so much","§7§ofluid that it","§7§ocan make","§7§omultiple of","§7§othose pearls","§7§oevery day.")); 
    }

    @Override
    public String getId() {
        return "HEAVY_PEARL"; 
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
        return Rarity.LEGENDARY;
    }

    @Override
    public boolean isStackable() {
        return false;
    }

    @Override
    public String getTexture() {
        return "ewogICJ0aW1lc3RhbXAiIDogMTY0MjUxOTMyMjgwOSwKICAicHJvZmlsZUlkIiA6ICI1NjY3NWIyMjMyZjA0ZWUwODkxNzllOWM5MjA2Y2ZlOCIsCiAgInByb2ZpbGVOYW1lIiA6ICJUaGVJbmRyYSIsCiAgInNpZ25hdHVyZVJlcXVpcmVkIiA6IHRydWUsCiAgInRleHR1cmVzIiA6IHsKICAgICJTS0lOIiA6IHsKICAgICAgInVybCIgOiAiaHR0cDovL3RleHR1cmVzLm1pbmVjcmFmdC5uZXQvdGV4dHVyZS8yZGJkNGU1ZDNkOWMwNWEwMzZmYjYyZTZlNzBmYWY5ZTZmOThkMjk0ZjlkMDA2NzgxYzE0NGM5ZjE1Yjg3NzE1IiwKICAgICAgIm1ldGFkYXRhIiA6IHsKICAgICAgICAibW9kZWwiIDogInNsaW0iCiAgICAgIH0KICAgIH0KICB9Cn0=";
    }

}
