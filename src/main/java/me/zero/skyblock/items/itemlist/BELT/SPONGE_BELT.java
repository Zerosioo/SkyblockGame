package me.zero.skyblock.items.itemlist.BELT;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SPONGE_BELT extends SItem implements ItemStatistics, SkullItem {

    @Override
    public String getName() {
        return "Sponge Belt";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "SPONGE_BELT"; 
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
        return ItemType.BELT;
    }

    @Override
    public Rarity getRarity() {
        return Rarity.UNCOMMON;
    }

    @Override
    public Gamestage getGamestage() {
        return Gamestage.AMATEUR;
    }

    @Override
    public int getFishingSpeed() {
        return 2;
    }

    @Override
    public String getTexture() {
        return "ewogICJ0aW1lc3RhbXAiIDogMTcwMzE5NDYwMjk4MiwKICAicHJvZmlsZUlkIiA6ICIxZjgyNTE2M2U0NDY0YjI2OTZlOTcwNzQxOTZiNTYwOCIsCiAgInByb2ZpbGVOYW1lIiA6ICJUaGVCZXN0RGFkMSIsCiAgInNpZ25hdHVyZVJlcXVpcmVkIiA6IHRydWUsCiAgInRleHR1cmVzIiA6IHsKICAgICJTS0lOIiA6IHsKICAgICAgInVybCIgOiAiaHR0cDovL3RleHR1cmVzLm1pbmVjcmFmdC5uZXQvdGV4dHVyZS8yNTkxMzMwNWNmNzMyMjMzOTg1MWEwOWRmOTljZjc0MGY5ZTU4ZDQ4ZTZiN2RhNDM5MzAzNTNhMTY1OTQzMTgzIiwKICAgICAgIm1ldGFkYXRhIiA6IHsKICAgICAgICAibW9kZWwiIDogInNsaW0iCiAgICAgIH0KICAgIH0KICB9Cn0=";
    }

}
