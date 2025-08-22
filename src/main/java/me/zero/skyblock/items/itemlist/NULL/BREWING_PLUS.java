package me.zero.skyblock.items.itemlist.NULL;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BREWING_PLUS extends SItem implements ItemStatistics, SkullItem {

    @Override
    public String getName() {
        return "Brewing+";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "BREWING_PLUS"; 
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
        return Rarity.COMMON;
    }

    @Override
    public String getTexture() {
        return "ewogICJ0aW1lc3RhbXAiIDogMTY0NDc2NjI4NzEyNSwKICAicHJvZmlsZUlkIiA6ICI3MzY0ODFkZmY2ZGY0NWUwOTA0ODg0ZjNiMWExMjY1NSIsCiAgInByb2ZpbGVOYW1lIiA6ICJUd2lsaWdodFFBUSIsCiAgInNpZ25hdHVyZVJlcXVpcmVkIiA6IHRydWUsCiAgInRleHR1cmVzIiA6IHsKICAgICJTS0lOIiA6IHsKICAgICAgInVybCIgOiAiaHR0cDovL3RleHR1cmVzLm1pbmVjcmFmdC5uZXQvdGV4dHVyZS8zYjFiNWI3NjVkNDM3MDgyYTZkNWUwODZmMDNlZTFmMzllNzZjM2YzNmJjYmQyOWNiNzMyMjA5N2Y2ZDdhMTQ5IgogICAgfQogIH0KfQ==";
    }

}
