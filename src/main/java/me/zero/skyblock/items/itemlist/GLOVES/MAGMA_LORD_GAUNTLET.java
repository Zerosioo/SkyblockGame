package me.zero.skyblock.items.itemlist.GLOVES;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MAGMA_LORD_GAUNTLET extends SItem implements ItemStatistics, SkullItem, Sellable {

    @Override
    public String getName() {
        return "Magma Lord Gauntlet";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "MAGMA_LORD_GAUNTLET"; 
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
        return ItemType.GLOVES;
    }

    @Override
    public Rarity getRarity() {
        return Rarity.EPIC;
    }

    @Override
    public boolean isStackable() {
        return false;
    }

    @Override
    public Gamestage getGamestage() {
        return Gamestage.MASTER;
    }

    @Override
    public int getPrice() {
        return 93750;
    }

    @Override
    public int getStrength() {
        return 10;
    }

    @Override
    public int getCritDamage() {
        return 30;
    }

    @Override
    public int getHealth() {
        return 35;
    }

    @Override
    public String getTexture() {
        return "ewogICJ0aW1lc3RhbXAiIDogMTY1MDM3OTExMjUxMywKICAicHJvZmlsZUlkIiA6ICJkOGNkMTNjZGRmNGU0Y2IzODJmYWZiYWIwOGIyNzQ4OSIsCiAgInByb2ZpbGVOYW1lIiA6ICJaYWNoeVphY2giLAogICJzaWduYXR1cmVSZXF1aXJlZCIgOiB0cnVlLAogICJ0ZXh0dXJlcyIgOiB7CiAgICAiU0tJTiIgOiB7CiAgICAgICJ1cmwiIDogImh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvMTY4YTJiZmU2ZTU2ZGRlYTEwM2RlOGNlYzAwMGVmYTgzZWJiOWE5NTljNjhkODI0MDI1NDNjMDFkNDEzN2QyNiIsCiAgICAgICJtZXRhZGF0YSIgOiB7CiAgICAgICAgIm1vZGVsIiA6ICJzbGltIgogICAgICB9CiAgICB9CiAgfQp9";
    }

}
