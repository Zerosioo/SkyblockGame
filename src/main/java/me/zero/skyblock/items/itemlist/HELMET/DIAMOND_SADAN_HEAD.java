package me.zero.skyblock.items.itemlist.HELMET;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DIAMOND_SADAN_HEAD extends SItem implements ItemStatistics, SkullItem, Museum {

    @Override
    public String getName() {
        return "Diamond Sadan Head";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "DIAMOND_SADAN_HEAD"; 
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
        return Rarity.SPECIAL;
    }

    @Override
    public boolean isDungeonItem() {
      	return true;
    }

    @Override
    public boolean isMuseum() {
        return true;
    }

    @Override
    public Soulbound getSoulbound() {
        return Soulbound.COOP;
    }

    @Override
    public Gamestage getGamestage() {
        return Gamestage.MASTER;
    }

    @Override
    public int getStrength() {
        return 35;
    }

    @Override
    public int getHealth() {
        return 190;
    }

    @Override
    public int getDefense() {
        return 70;
    }

    @Override
    public String getTexture() {
        return "ewogICJ0aW1lc3RhbXAiIDogMTY1NjI2NzY4MTEwNywKICAicHJvZmlsZUlkIiA6ICJkYmQ4MDQ2M2EwMzY0Y2FjYjI3OGNhODBhMDBkZGIxMyIsCiAgInByb2ZpbGVOYW1lIiA6ICJ4bG9nMjEiLAogICJzaWduYXR1cmVSZXF1aXJlZCIgOiB0cnVlLAogICJ0ZXh0dXJlcyIgOiB7CiAgICAiU0tJTiIgOiB7CiAgICAgICJ1cmwiIDogImh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvM2M2M2M0ZjdmOGY1YjhjNWZlMWJhYzlhNzA4ZTVhNjJjY2QwNDk3MDA3MmFhYjVlMzIzYjFiN2Q0MDA0ZjRhMiIKICAgIH0KICB9Cn0=";
    }

}
