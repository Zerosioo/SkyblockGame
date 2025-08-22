package me.zero.skyblock.items.itemlist.NULL;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class UNDEAD_CATALYST extends SItem implements ItemStatistics, SkullItem, Sellable {

    @Override
    public String getName() {
        return "Undead Catalyst";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "UNDEAD_CATALYST"; 
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
        return 2000;
    }

    @Override
    public String getTexture() {
        return "ewogICJ0aW1lc3RhbXAiIDogMTcyMDA0MTk5OTUxMiwKICAicHJvZmlsZUlkIiA6ICIxNmQ4NjI4NzYzMWY0NDY2OGQ0NDM2ZTJlY2IwNTllNSIsCiAgInByb2ZpbGVOYW1lIiA6ICJSZXphVG91cm5leSIsCiAgInNpZ25hdHVyZVJlcXVpcmVkIiA6IHRydWUsCiAgInRleHR1cmVzIiA6IHsKICAgICJTS0lOIiA6IHsKICAgICAgInVybCIgOiAiaHR0cDovL3RleHR1cmVzLm1pbmVjcmFmdC5uZXQvdGV4dHVyZS81NWI4NzE1MDZmNWEyOTUwMjY1Nzk2MzRlZTUxNzU1YjI5YWJlMjkwN2NiNDI0OGVhNWNjMzY0MDhmY2U2OTI4IiwKICAgICAgIm1ldGFkYXRhIiA6IHsKICAgICAgICAibW9kZWwiIDogInNsaW0iCiAgICAgIH0KICAgIH0KICB9Cn0=";
    }

}
