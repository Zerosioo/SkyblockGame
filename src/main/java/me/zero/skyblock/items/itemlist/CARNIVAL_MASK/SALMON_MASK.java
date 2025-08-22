package me.zero.skyblock.items.itemlist.CARNIVAL_MASK;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SALMON_MASK extends SItem implements ItemStatistics, SkullItem {

    @Override
    public String getName() {
        return "Salmon Mask";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "SALMON_MASK"; 
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
        return ItemType.CARNIVAL_MASK;
    }

    @Override
    public Rarity getRarity() {
        return Rarity.UNCOMMON;
    }

    @Override
    public boolean isStackable() {
        return false;
    }

    @Override
    public Gamestage getGamestage() {
        return Gamestage.AMATEUR;
    }

    @Override
    public String getTexture() {
        return "ewogICJ0aW1lc3RhbXAiIDogMTcxNDI0NjI4MzIxMSwKICAicHJvZmlsZUlkIiA6ICJhNDAxZjEzMTZlMjI0ZTNjOTg0ODk1MmVjMzhjMTEwYyIsCiAgInByb2ZpbGVOYW1lIiA6ICJHcmVlbnNoZWVwaXJhdGUiLAogICJzaWduYXR1cmVSZXF1aXJlZCIgOiB0cnVlLAogICJ0ZXh0dXJlcyIgOiB7CiAgICAiU0tJTiIgOiB7CiAgICAgICJ1cmwiIDogImh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvZTk2OTc0N2E1YmJjOWEzNjYxZmRlNjhkMzY5YWNmZmNhNTRjOWY5YjE5Zjk0ZGFhMzg3OTk3MDc5NjYyOTI0NCIKICAgIH0KICB9Cn0=";
    }

}
