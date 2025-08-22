package me.zero.skyblock.items.itemlist.HELMET;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class WARM_WIZARD_FACE_2 extends SItem implements ItemStatistics, SkullItem {

    @Override
    public String getName() {
        return "Warmer Wizard Face";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "WARM_WIZARD_FACE_2"; 
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
        return ItemType.HELMET;
    }

    @Override
    public Rarity getRarity() {
        return Rarity.MYTHIC;
    }

    @Override
    public String getTexture() {
        return "ewogICJ0aW1lc3RhbXAiIDogMTczMzg4NTY4NDkzMywKICAicHJvZmlsZUlkIiA6ICJkMWRkMDJlOWQwN2E0YWU1YWRjYWQyYzI5YTZhYmIyMCIsCiAgInByb2ZpbGVOYW1lIiA6ICJSYW5pd2lzXyIsCiAgInNpZ25hdHVyZVJlcXVpcmVkIiA6IHRydWUsCiAgInRleHR1cmVzIiA6IHsKICAgICJTS0lOIiA6IHsKICAgICAgInVybCIgOiAiaHR0cDovL3RleHR1cmVzLm1pbmVjcmFmdC5uZXQvdGV4dHVyZS81ZDk4YTEyZjMyYTAyODRiNzRmZWZiOWU5ODJhMWU5ZWMyNDg3NzY2NDcwYWExMjMwZjZmMjZmOWFhY2UzZGU2IiwKICAgICAgIm1ldGFkYXRhIiA6IHsKICAgICAgICAibW9kZWwiIDogInNsaW0iCiAgICAgIH0KICAgIH0KICB9Cn0";
    }

}
