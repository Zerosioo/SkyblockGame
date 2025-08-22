package me.zero.skyblock.items.itemlist.MEMENTO;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CENTURY_MEMENTO_YELLOW extends SItem implements ItemStatistics, SkullItem {

    @Override
    public String getName() {
        return "Cake Slice of the Century";
    }

    @Override
    public List<String> getLore() {
        return new ArrayList(Arrays.asList("Taste of lemon","cheesecake.")); 
    }

    @Override
    public String getId() {
        return "CENTURY_MEMENTO_YELLOW"; 
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
        return ItemType.MEMENTO;
    }

    @Override
    public Rarity getRarity() {
        return Rarity.SPECIAL;
    }

    @Override
    public boolean isStackable() {
        return false;
    }

    @Override
    public String getTexture() {
        return "ewogICJ0aW1lc3RhbXAiIDogMTY5MzQzMTU2MjI4OCwKICAicHJvZmlsZUlkIiA6ICIxYmY4ZjBiZDRkZjc0Njg1ODQwNjU2NDc2ZGU0NmNmMyIsCiAgInByb2ZpbGVOYW1lIiA6ICJDcnV6YWRhMjIiLAogICJzaWduYXR1cmVSZXF1aXJlZCIgOiB0cnVlLAogICJ0ZXh0dXJlcyIgOiB7CiAgICAiU0tJTiIgOiB7CiAgICAgICJ1cmwiIDogImh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvYjU4YzA0Nzg3OGY1YzZjOTM1NDQwOTVmNzQ4Zjk2ZTdhZGU0NGZhZDU3NDM4MTQ4YTBhMWJiNTVlZWNlNjkiLAogICAgICAibWV0YWRhdGEiIDogewogICAgICAgICJtb2RlbCIgOiAic2xpbSIKICAgICAgfQogICAgfQogIH0KfQ==";
    }

}
