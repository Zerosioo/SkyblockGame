package me.zero.skyblock.items.itemlist.PET_ITEM;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class EDIBLE_SEAWEED extends SItem implements ItemStatistics, SkullItem, Sellable {

    @Override
    public String getName() {
        return "Edible Seaweed";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "EDIBLE_SEAWEED"; 
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
        return ItemType.PET_ITEM;
    }

    @Override
    public Rarity getRarity() {
        return Rarity.RARE;
    }

    @Override
    public int getPrice() {
        return 50000;
    }

    @Override
    public String getTexture() {
        return "ewogICJ0aW1lc3RhbXAiIDogMTc0MDMyMTg4NzE4NCwKICAicHJvZmlsZUlkIiA6ICIyZDUxZmI0ZmJjM2Y0MjJjOTMyYzIzMDg5NGU2YmM1MiIsCiAgInByb2ZpbGVOYW1lIiA6ICJGR0ZTX3N0dWRpbyIsCiAgInNpZ25hdHVyZVJlcXVpcmVkIiA6IHRydWUsCiAgInRleHR1cmVzIiA6IHsKICAgICJTS0lOIiA6IHsKICAgICAgInVybCIgOiAiaHR0cDovL3RleHR1cmVzLm1pbmVjcmFmdC5uZXQvdGV4dHVyZS9lZjc3MzQ2ZjU4OTRjZjBmNWVmZjJhNGMwNmNiOWI2ZWFiMGJmMzlkNzg5MTkxYjcwY2Y3YzA4ZDM2ZmRhMjQ4IiwKICAgICAgIm1ldGFkYXRhIiA6IHsKICAgICAgICAibW9kZWwiIDogInNsaW0iCiAgICAgIH0KICAgIH0KICB9Cn0=";
    }

}
