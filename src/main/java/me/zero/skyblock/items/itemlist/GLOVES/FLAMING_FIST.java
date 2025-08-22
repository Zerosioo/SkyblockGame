package me.zero.skyblock.items.itemlist.GLOVES;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FLAMING_FIST extends SItem implements ItemStatistics, SkullItem, Sellable {

    @Override
    public String getName() {
        return "Flaming Fist";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "FLAMING_FIST"; 
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
    public Gamestage getGamestage() {
        return Gamestage.PROFESSIONAL;
    }

    @Override
    public int getPrice() {
        return 12750;
    }

    @Override
    public int getStrength() {
        return 10;
    }

    @Override
    public int getCritDamage() {
        return 10;
    }

    @Override
    public int getHealth() {
        return 30;
    }

    @Override
    public int getDefense() {
        return 20;
    }

    @Override
    public String getTexture() {
        return "ewogICJ0aW1lc3RhbXAiIDogMTY0NDUwMDUyMTI2NiwKICAicHJvZmlsZUlkIiA6ICI0ZDEzZWUyZjViOWI0N2I2OGU2NzhhMjAxN2VmZTc1MyIsCiAgInByb2ZpbGVOYW1lIiA6ICJCcmF5ZGVyZWsiLAogICJzaWduYXR1cmVSZXF1aXJlZCIgOiB0cnVlLAogICJ0ZXh0dXJlcyIgOiB7CiAgICAiU0tJTiIgOiB7CiAgICAgICJ1cmwiIDogImh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvMTg3MTk4NDljZWY0MjY0ZDY3MGM2Yjg4ZTZiNWViZDQwYjMyYjUzNWE2OGEyYzIyODkyZGQwOGQ4YmNjMTNjNCIsCiAgICAgICJtZXRhZGF0YSIgOiB7CiAgICAgICAgIm1vZGVsIiA6ICJzbGltIgogICAgICB9CiAgICB9CiAgfQp9";
    }

}
