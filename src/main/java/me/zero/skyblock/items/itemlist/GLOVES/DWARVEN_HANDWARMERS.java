package me.zero.skyblock.items.itemlist.GLOVES;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DWARVEN_HANDWARMERS extends SItem implements ItemStatistics, SkullItem, Sellable {

    @Override
    public String getName() {
        return "Dwarven Handwarmers";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "DWARVEN_HANDWARMERS"; 
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
        return 2500;
    }

    @Override
    public int getMiningFortune() {
        return 30;
    }

    @Override
    public int getMiningSpeed() {
        return 45;
    }

    @Override
    public String getTexture() {
        return "ewogICJ0aW1lc3RhbXAiIDogMTcwOTA2MTI0Njg1MywKICAicHJvZmlsZUlkIiA6ICJjYTU4NzNhYmY0Y2U0YWUxODAxZmVmODgzNjhlMWExNiIsCiAgInByb2ZpbGVOYW1lIiA6ICJEZXRocm9uZXMiLAogICJzaWduYXR1cmVSZXF1aXJlZCIgOiB0cnVlLAogICJ0ZXh0dXJlcyIgOiB7CiAgICAiU0tJTiIgOiB7CiAgICAgICJ1cmwiIDogImh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvYzMwMWQ5ZjliNmYxOGRkZWVjYzU3YjUyMjkxNmNjNzU2NmMzOTdkNjQ5ZjIzYzMxOGUzZjVlZjY3Y2JjZjI2NiIKICAgIH0KICB9Cn0=";
    }

}
