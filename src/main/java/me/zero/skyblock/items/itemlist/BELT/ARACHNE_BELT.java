package me.zero.skyblock.items.itemlist.BELT;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ARACHNE_BELT extends SItem implements ItemStatistics, SkullItem, Sellable {

    @Override
    public String getName() {
        return "Arachne's Belt";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "ARACHNE_BELT"; 
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
        return Rarity.RARE;
    }

    @Override
    public Soulbound getSoulbound() {
        return Soulbound.COOP;
    }

    @Override
    public Gamestage getGamestage() {
        return Gamestage.INTERMEDIATE;
    }

    @Override
    public int getPrice() {
        return 2000;
    }

    @Override
    public String getTexture() {
        return "ewogICJ0aW1lc3RhbXAiIDogMTY2NzkxOTY5OTk5MywKICAicHJvZmlsZUlkIiA6ICIyMDZlMWZkYjI5Yzk0NGYxOTQ5OTg4NzAwNTQxMGQ2NyIsCiAgInByb2ZpbGVOYW1lIiA6ICJoNHlsMzMiLAogICJzaWduYXR1cmVSZXF1aXJlZCIgOiB0cnVlLAogICJ0ZXh0dXJlcyIgOiB7CiAgICAiU0tJTiIgOiB7CiAgICAgICJ1cmwiIDogImh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvZTEyN2EyYzk5YzYwNTAwNzk4ZmI1ODgyNjY4N2IzNDU2ZWJlMzVjMTgwZjUwNmMxZTgzMzg2MzgxNzgzMGY4MSIKICAgIH0KICB9Cn0=";
    }

}
