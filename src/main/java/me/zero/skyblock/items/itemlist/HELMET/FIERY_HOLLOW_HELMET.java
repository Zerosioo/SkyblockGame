package me.zero.skyblock.items.itemlist.HELMET;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FIERY_HOLLOW_HELMET extends SItem implements ItemStatistics, SkullItem {

    @Override
    public String getName() {
        return "Fiery Hollow Helmet";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "FIERY_HOLLOW_HELMET"; 
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
        return Rarity.LEGENDARY;
    }

    @Override
    public int getHealth() {
        return 342;
    }

    @Override
    public int getDefense() {
        return 107;
    }

    @Override
    public int getIntelligence() {
        return 260;
    }

    @Override
    public int getSpeed() {
        return 10;
    }

    @Override
    public String getTexture() {
        return "ewogICJ0aW1lc3RhbXAiIDogMTY0NTUwNDE4OTk2NywKICAicHJvZmlsZUlkIiA6ICIyNzZlMDQ2YjI0MDM0M2VkOTk2NmU0OTRlN2U2Y2IzNCIsCiAgInByb2ZpbGVOYW1lIiA6ICJBRFJBTlM3MTAiLAogICJzaWduYXR1cmVSZXF1aXJlZCIgOiB0cnVlLAogICJ0ZXh0dXJlcyIgOiB7CiAgICAiU0tJTiIgOiB7CiAgICAgICJ1cmwiIDogImh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvMjhjNmJkYmZmNmYwMzNjNjFiYzMzNWRkOWE3ODk1NmU2Y2RmZGQ2MTNlYmI1YTc3ZWMzOGQyNzFhODMzMjYxMiIKICAgIH0KICB9Cn0=";
    }

}
