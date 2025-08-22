package me.zero.skyblock.items.itemlist.NULL;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ARCHERY_CUBE extends SItem implements ItemStatistics, SkullItem {

    @Override
    public String getName() {
        return "Archery Cube";
    }

    @Override
    public List<String> getLore() {
        return new ArrayList(Arrays.asList("§8Decoration item","§8","§8§7Obtained during","§7the §eCarnival§7","§7for placing within","§7the §aTop 500 §7in","§7§cZombie","§cShootout§7.")); 
    }

    @Override
    public String getId() {
        return "ARCHERY_CUBE"; 
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
    public String getTexture() {
        return "ewogICJ0aW1lc3RhbXAiIDogMTcyMDA1Mjk4MTA3OCwKICAicHJvZmlsZUlkIiA6ICI5YzM1ZGU3MjdmMzU0ZTVlYjFiOWRhOGViYTZhYzM1YyIsCiAgInByb2ZpbGVOYW1lIiA6ICJtb21teXR3ZXJrZXVzZSIsCiAgInNpZ25hdHVyZVJlcXVpcmVkIiA6IHRydWUsCiAgInRleHR1cmVzIiA6IHsKICAgICJTS0lOIiA6IHsKICAgICAgInVybCIgOiAiaHR0cDovL3RleHR1cmVzLm1pbmVjcmFmdC5uZXQvdGV4dHVyZS82Zjc1MWU1NGQ3Y2M5MGQxNjE3YjgyMTU0ZTVmYWI3MmQ5N2E5YmNjNzYyMjEzNDhkNzM2ZmEyODdiYjYxZTg0IiwKICAgICAgIm1ldGFkYXRhIiA6IHsKICAgICAgICAibW9kZWwiIDogInNsaW0iCiAgICAgIH0KICAgIH0KICB9Cn0=";
    }

}
