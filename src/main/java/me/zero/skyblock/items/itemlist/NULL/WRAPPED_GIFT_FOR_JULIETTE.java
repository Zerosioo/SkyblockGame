package me.zero.skyblock.items.itemlist.NULL;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class WRAPPED_GIFT_FOR_JULIETTE extends SItem implements ItemStatistics, SkullItem {

    @Override
    public String getName() {
        return "§cSecret Gift for Juliette";
    }

    @Override
    public List<String> getLore() {
        return new ArrayList(Arrays.asList("§7§oA well-wrapped","§7§opresent that's","§7§ohot to the","§7§otouch.")); 
    }

    @Override
    public String getId() {
        return "WRAPPED_GIFT_FOR_JULIETTE"; 
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
    public Soulbound getSoulbound() {
        return Soulbound.COOP;
    }

    @Override
    public String getTexture() {
        return "eyJ0aW1lc3RhbXAiOjE1MTExODc0NTI3NzEsInByb2ZpbGVJZCI6IjBiZTU2MmUxNzIyODQ3YmQ5MDY3MWYxNzNjNjA5NmNhIiwicHJvZmlsZU5hbWUiOiJ4Y29vbHgzIiwic2lnbmF0dXJlUmVxdWlyZWQiOnRydWUsInRleHR1cmVzIjp7IlNLSU4iOnsidXJsIjoiaHR0cDovL3RleHR1cmVzLm1pbmVjcmFmdC5uZXQvdGV4dHVyZS9iZGFjOWE1MTgxM2FiY2I2NjZlZTJjMmNhODRjZWZjZmIyMWU1OGI3YjAxYWUwZWE3ZTk5ZDM1ZjMyM2EifX19";
    }

}
