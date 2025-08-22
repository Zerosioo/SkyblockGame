package me.zero.skyblock.items.itemlist.ACCESSORY;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CENTURY_RING extends SItem implements ItemStatistics, SkullItem {

    @Override
    public String getName() {
        return "Ring of the Century";
    }

    @Override
    public List<String> getLore() {
        return new ArrayList(Arrays.asList("What's better than a","party? A party with","free goodies and an","accessory upgrade!")); 
    }

    @Override
    public String getId() {
        return "CENTURY_RING"; 
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
        return Rarity.UNCOMMON;
    }

    @Override
    public String getTexture() {
        return "ewogICJ0aW1lc3RhbXAiIDogMTczNTM3OTQyNDg4NSwKICAicHJvZmlsZUlkIiA6ICIzZDU1OGQ3Y2NmZjk0ODdkYWE1MzhkMjM4NGE3OWFkZCIsCiAgInByb2ZpbGVOYW1lIiA6ICJDcnlwdGljTG9zZXIxMyIsCiAgInNpZ25hdHVyZVJlcXVpcmVkIiA6IHRydWUsCiAgInRleHR1cmVzIiA6IHsKICAgICJTS0lOIiA6IHsKICAgICAgInVybCIgOiAiaHR0cDovL3RleHR1cmVzLm1pbmVjcmFmdC5uZXQvdGV4dHVyZS9kZGE5NWIwMjM5ODAyNjEwOWM0MmNjMjJlN2Q4MmQ0ZTFkN2E1OGFkZjExMDA5Y2VkYmVmMzY0OTZmZjhkYzU4IiwKICAgICAgIm1ldGFkYXRhIiA6IHsKICAgICAgICAibW9kZWwiIDogInNsaW0iCiAgICAgIH0KICAgIH0KICB9Cn0=";
    }

}
