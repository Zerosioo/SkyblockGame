package me.zero.skyblock.items.itemlist.ACCESSORY;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BLUERTOOTH_RING extends SItem implements ItemStatistics, SkullItem {

    @Override
    public String getName() {
        return "Bluertooth Ring";
    }

    @Override
    public List<String> getLore() {
        return new ArrayList(Arrays.asList("§8§oThough it may","§8§onot be bluer","§8§ovisually, it is","§8§oin spirit.")); 
    }

    @Override
    public String getId() {
        return "BLUERTOOTH_RING"; 
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
        return Rarity.EPIC;
    }

    @Override
    public String getTexture() {
        return "ewogICJ0aW1lc3RhbXAiIDogMTczOTY2NjM1MDMyMiwKICAicHJvZmlsZUlkIiA6ICJiODU0NWMxMDlhZjE0ZGRjYmY4ZjhmZjg4ZTU2NzI4OSIsCiAgInByb2ZpbGVOYW1lIiA6ICJQdGFrb3B5c2tDWiIsCiAgInNpZ25hdHVyZVJlcXVpcmVkIiA6IHRydWUsCiAgInRleHR1cmVzIiA6IHsKICAgICJTS0lOIiA6IHsKICAgICAgInVybCIgOiAiaHR0cDovL3RleHR1cmVzLm1pbmVjcmFmdC5uZXQvdGV4dHVyZS85NzAyZGRjMGVmMGQxNzEwYWI4YjE3ZWI5MTA3MDdhYzUzN2VkMzMwOWVlMDdhMmIxYjBmMjc4NDdiMDdiYzliIiwKICAgICAgIm1ldGFkYXRhIiA6IHsKICAgICAgICAibW9kZWwiIDogInNsaW0iCiAgICAgIH0KICAgIH0KICB9Cn0=";
    }

}
