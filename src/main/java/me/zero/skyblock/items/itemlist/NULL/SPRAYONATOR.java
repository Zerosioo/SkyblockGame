package me.zero.skyblock.items.itemlist.NULL;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SPRAYONATOR extends SItem implements ItemStatistics, SkullItem {

    @Override
    public String getName() {
        return "Sprayonator";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "SPRAYONATOR"; 
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
        return Rarity.UNCOMMON;
    }

    @Override
    public Soulbound getSoulbound() {
        return Soulbound.COOP;
    }

    @Override
    public Gamestage getGamestage() {
        return Gamestage.AMATEUR;
    }

    @Override
    public String getTexture() {
        return "ewogICJ0aW1lc3RhbXAiIDogMTY5NzU1NzA2MjMxOCwKICAicHJvZmlsZUlkIiA6ICI0MzFhMmRlYTQ4YTE0NTMxYjEyZDU5MzY0NDUxNmIyNSIsCiAgInByb2ZpbGVOYW1lIiA6ICJpQ2FwdGFpbk5lbW8iLAogICJzaWduYXR1cmVSZXF1aXJlZCIgOiB0cnVlLAogICJ0ZXh0dXJlcyIgOiB7CiAgICAiU0tJTiIgOiB7CiAgICAgICJ1cmwiIDogImh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvZWU5NGZhMDg2ZGM4ZmY5ZDcwNDk5MzRiMDk2MmQyNzgzNjBkZTg2OGYyNzM4Y2ExN2E4M2VjN2I1ODJlYmJlZSIKICAgIH0KICB9Cn0=";
    }

}
