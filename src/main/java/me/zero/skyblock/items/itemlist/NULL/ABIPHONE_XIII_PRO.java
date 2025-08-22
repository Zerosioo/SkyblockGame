package me.zero.skyblock.items.itemlist.NULL;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ABIPHONE_XIII_PRO extends SItem implements ItemStatistics, SkullItem, Sellable {

    @Override
    public String getName() {
        return "Abiphone XIII Pro";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "ABIPHONE_XIII_PRO"; 
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
        return 160;
    }

    @Override
    public String getTexture() {
        return "ewogICJ0aW1lc3RhbXAiIDogMTY0NDI0Njk4NTU3NCwKICAicHJvZmlsZUlkIiA6ICI5ZDIyZGRhOTVmZGI0MjFmOGZhNjAzNTI1YThkZmE4ZCIsCiAgInByb2ZpbGVOYW1lIiA6ICJTYWZlRHJpZnQ0OCIsCiAgInNpZ25hdHVyZVJlcXVpcmVkIiA6IHRydWUsCiAgInRleHR1cmVzIiA6IHsKICAgICJTS0lOIiA6IHsKICAgICAgInVybCIgOiAiaHR0cDovL3RleHR1cmVzLm1pbmVjcmFmdC5uZXQvdGV4dHVyZS9hODQ2ZTdmNjZiNDNhYjAxOWY1MTYyNjZlNjc2NDZjODZjZTM2MDJhYjg0YTQ0MzQ5N2Q4YjE1ZWE1NDZjMjFmIiwKICAgICAgIm1ldGFkYXRhIiA6IHsKICAgICAgICAibW9kZWwiIDogInNsaW0iCiAgICAgIH0KICAgIH0KICB9Cn0=";
    }

}
