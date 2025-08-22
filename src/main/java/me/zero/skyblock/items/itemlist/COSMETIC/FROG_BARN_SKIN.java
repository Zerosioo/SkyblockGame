package me.zero.skyblock.items.itemlist.COSMETIC;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FROG_BARN_SKIN extends SItem implements ItemStatistics, SkullItem {

    @Override
    public String getName() {
        return "Frog Barn Skin";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "FROG_BARN_SKIN"; 
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
        return ItemType.COSMETIC;
    }

    @Override
    public Rarity getRarity() {
        return Rarity.LEGENDARY;
    }

    @Override
    public String getTexture() {
        return "ewogICJ0aW1lc3RhbXAiIDogMTY3NzA5Mjg2Mjc0MiwKICAicHJvZmlsZUlkIiA6ICIwODFiZTAxZmZlMmU0ODMyODI3MDIwMjBlNmI1M2ExNyIsCiAgInByb2ZpbGVOYW1lIiA6ICJMeXJpY1BsYXRlMjUyNDIiLAogICJzaWduYXR1cmVSZXF1aXJlZCIgOiB0cnVlLAogICJ0ZXh0dXJlcyIgOiB7CiAgICAiU0tJTiIgOiB7CiAgICAgICJ1cmwiIDogImh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvYTU1YzFiYTg5ODM5OGY5NWZjZTNjODE5MjRkY2Y1Nzc2NzAxY2YyMGRlOWZlOTEwNjE4ZDU4MzliYTRiMzVhNyIKICAgIH0KICB9Cn0=";
    }

}
