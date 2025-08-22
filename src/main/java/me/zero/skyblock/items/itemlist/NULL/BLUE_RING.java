package me.zero.skyblock.items.itemlist.NULL;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BLUE_RING extends SItem implements ItemStatistics, SkullItem, Sellable {

    @Override
    public String getName() {
        return "Blue Ring";
    }

    @Override
    public List<String> getLore() {
        return new ArrayList(Arrays.asList("§7As the Octopus","§7makes its great","§7escape, it","§7accidentally","§7leaves something","§7behind...")); 
    }

    @Override
    public String getId() {
        return "BLUE_RING"; 
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
        return Rarity.RARE;
    }

    @Override
    public int getPrice() {
        return 25000;
    }

    @Override
    public String getTexture() {
        return "ewogICJ0aW1lc3RhbXAiIDogMTc0MDA3MTUzOTA0OSwKICAicHJvZmlsZUlkIiA6ICJmYjZkM2E5Zjk3MWY0ZTdlYmQ0MjE2Yjk0MjE5NDA3NCIsCiAgInByb2ZpbGVOYW1lIiA6ICJtYXJjaXhkZCIsCiAgInNpZ25hdHVyZVJlcXVpcmVkIiA6IHRydWUsCiAgInRleHR1cmVzIiA6IHsKICAgICJTS0lOIiA6IHsKICAgICAgInVybCIgOiAiaHR0cDovL3RleHR1cmVzLm1pbmVjcmFmdC5uZXQvdGV4dHVyZS80YmE3NGU3NmIzYTk5ZjE0NmRiNjI4ZWRlNmJlMmYzYzM3MjBkYWE4ZjY4MjljY2MxMjUxZDlkYjQyYmMyZDYzIiwKICAgICAgIm1ldGFkYXRhIiA6IHsKICAgICAgICAibW9kZWwiIDogInNsaW0iCiAgICAgIH0KICAgIH0KICB9Cn0=";
    }

}
