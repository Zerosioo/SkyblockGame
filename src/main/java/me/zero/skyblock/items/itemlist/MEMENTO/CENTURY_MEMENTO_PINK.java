package me.zero.skyblock.items.itemlist.MEMENTO;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CENTURY_MEMENTO_PINK extends SItem implements ItemStatistics, SkullItem {

    @Override
    public String getName() {
        return "Cake Slice of the Century";
    }

    @Override
    public List<String> getLore() {
        return new ArrayList(Arrays.asList("Taste of strawberry.")); 
    }

    @Override
    public String getId() {
        return "CENTURY_MEMENTO_PINK"; 
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
        return ItemType.MEMENTO;
    }

    @Override
    public Rarity getRarity() {
        return Rarity.SPECIAL;
    }

    @Override
    public boolean isStackable() {
        return false;
    }

    @Override
    public String getTexture() {
        return "ewogICJ0aW1lc3RhbXAiIDogMTY5MzQzMTYwMzkwMCwKICAicHJvZmlsZUlkIiA6ICIzYjA2ZTc3YzAzYTg0MGExOGIzOGY0Y2Q1ZWE0YzYxMyIsCiAgInByb2ZpbGVOYW1lIiA6ICJIT1JVU19JTyIsCiAgInNpZ25hdHVyZVJlcXVpcmVkIiA6IHRydWUsCiAgInRleHR1cmVzIiA6IHsKICAgICJTS0lOIiA6IHsKICAgICAgInVybCIgOiAiaHR0cDovL3RleHR1cmVzLm1pbmVjcmFmdC5uZXQvdGV4dHVyZS9hNmEzNDg4ZDUwZDQ2NWNjM2UwZjliMGJkZDJlZTdmNTBlMTAwMmZlYzE0MGUwYTFhYjVmNGYxOGUxOTk3OWNiIiwKICAgICAgIm1ldGFkYXRhIiA6IHsKICAgICAgICAibW9kZWwiIDogInNsaW0iCiAgICAgIH0KICAgIH0KICB9Cn0=";
    }

}
