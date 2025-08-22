package me.zero.skyblock.items.itemlist.ACCESSORY;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CRUX_TALISMAN_1 extends SItem implements ItemStatistics, SkullItem {

    @Override
    public String getName() {
        return "Crux Talisman";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "CRUX_TALISMAN_1"; 
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
        return Rarity.COMMON;
    }

    @Override
    public String getTexture() {
        return "ewogICJ0aW1lc3RhbXAiIDogMTY4NDM1MzI3NzQ3NywKICAicHJvZmlsZUlkIiA6ICIxNmJhNWU4MDJhMmU0ZDJhYjEwZmZiYWJiYmQ1MDdlZSIsCiAgInByb2ZpbGVOYW1lIiA6ICJzbGlua3l1c2VyMzMxNSIsCiAgInNpZ25hdHVyZVJlcXVpcmVkIiA6IHRydWUsCiAgInRleHR1cmVzIiA6IHsKICAgICJTS0lOIiA6IHsKICAgICAgInVybCIgOiAiaHR0cDovL3RleHR1cmVzLm1pbmVjcmFmdC5uZXQvdGV4dHVyZS83YjIyNTRkYmJmNTJjMzg4NTU3ODQ5MTA4ZTkzZGNjNWE5YjNiN2ZhNDdlNjRmNGNhMDYzZGZhYTFhMzAyYzYwIiwKICAgICAgIm1ldGFkYXRhIiA6IHsKICAgICAgICAibW9kZWwiIDogInNsaW0iCiAgICAgIH0KICAgIH0KICB9Cn0=";
    }

}
