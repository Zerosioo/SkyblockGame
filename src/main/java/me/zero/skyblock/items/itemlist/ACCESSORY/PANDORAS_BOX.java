package me.zero.skyblock.items.itemlist.ACCESSORY;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PANDORAS_BOX extends SItem implements ItemStatistics, SkullItem {

    @Override
    public String getName() {
        return "Pandora's Box";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "PANDORAS_BOX"; 
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
    public boolean isStackable() {
        return false;
    }

    @Override
    public String getTexture() {
        return "ewogICJ0aW1lc3RhbXAiIDogMTY1ODg3MTI2MTcwNiwKICAicHJvZmlsZUlkIiA6ICJiMjdjMjlkZWZiNWU0OTEyYjFlYmQ5NDVkMmI2NzE0YSIsCiAgInByb2ZpbGVOYW1lIiA6ICJIRUtUMCIsCiAgInNpZ25hdHVyZVJlcXVpcmVkIiA6IHRydWUsCiAgInRleHR1cmVzIiA6IHsKICAgICJTS0lOIiA6IHsKICAgICAgInVybCIgOiAiaHR0cDovL3RleHR1cmVzLm1pbmVjcmFmdC5uZXQvdGV4dHVyZS9mZTI0NjkyNWNiZDRjMDUyNzliOWM4ZGNmN2MyZmRmYzliYWY5YjE0MjRhYTM1ZTUwMTUzM2ViYjk4ZTAwNTIyIiwKICAgICAgIm1ldGFkYXRhIiA6IHsKICAgICAgICAibW9kZWwiIDogInNsaW0iCiAgICAgIH0KICAgIH0KICB9Cn0=";
    }

}
