package me.zero.skyblock.items.itemlist.NULL;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class REFINED_DIAMOND extends SItem implements ItemStatistics, SkullItem, Sellable {

    @Override
    public String getName() {
        return "Refined Diamond";
    }

    @Override
    public List<String> getLore() {
        return new ArrayList(Arrays.asList("§7§oLooking at it","§7§ofor too long may","§7§ocause eye","§7§otrauma.")); 
    }

    @Override
    public String getId() {
        return "REFINED_DIAMOND"; 
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
    public int getPrice() {
        return 4096;
    }

    @Override
    public String getTexture() {
        return "ewogICJ0aW1lc3RhbXAiIDogMTYyNjQ5MjAyNDM3MSwKICAicHJvZmlsZUlkIiA6ICI4OGU0YWNiYTQwOTc0YWZkYmE0ZDM1YjdlYzdmNmJmYSIsCiAgInByb2ZpbGVOYW1lIiA6ICJKb2FvMDkxNSIsCiAgInNpZ25hdHVyZVJlcXVpcmVkIiA6IHRydWUsCiAgInRleHR1cmVzIiA6IHsKICAgICJTS0lOIiA6IHsKICAgICAgInVybCIgOiAiaHR0cDovL3RleHR1cmVzLm1pbmVjcmFmdC5uZXQvdGV4dHVyZS9kYmZjN2ZhNGU3NGI2ZTQwMWFlMDY0MTQ4YWU1ZTc2OGI4OTNmMWQ5Mjk3Zjg3NDc1MTAxZjcyMjVhMmE1YTZhIiwKICAgICAgIm1ldGFkYXRhIiA6IHsKICAgICAgICAibW9kZWwiIDogInNsaW0iCiAgICAgIH0KICAgIH0KICB9Cn0=";
    }

}
