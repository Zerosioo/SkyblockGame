package me.zero.skyblock.items.itemlist.ACCESSORY;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SMOOTH_CHOCOLATE_BAR extends SItem implements ItemStatistics, SkullItem {

    @Override
    public String getName() {
        return "Smooth Chocolate Bar";
    }

    @Override
    public List<String> getLore() {
        return new ArrayList(Arrays.asList("§8§oCrafted in the","§8§oFactory, its","§8§osmoothness melts","§8§ohearts and","§8§otastes like a","§8§osweet escape.")); 
    }

    @Override
    public String getId() {
        return "SMOOTH_CHOCOLATE_BAR"; 
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
        return ItemType.ACCESSORY;
    }

    @Override
    public Rarity getRarity() {
        return Rarity.UNCOMMON;
    }

    @Override
    public String getTexture() {
        return "ewogICJ0aW1lc3RhbXAiIDogMTcxMTQ2MjUyOTM4NywKICAicHJvZmlsZUlkIiA6ICJjYTU4NzNhYmY0Y2U0YWUxODAxZmVmODgzNjhlMWExNiIsCiAgInByb2ZpbGVOYW1lIiA6ICJEZXRocm9uZXMiLAogICJzaWduYXR1cmVSZXF1aXJlZCIgOiB0cnVlLAogICJ0ZXh0dXJlcyIgOiB7CiAgICAiU0tJTiIgOiB7CiAgICAgICJ1cmwiIDogImh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvYTkzNzJlZmQyY2ExYTZjNmRmYzA2NmYxZWM4M2Y5NDU2NTc1YzM4NTBhMGU3ZDAxMTA5YzRmMWFmMzAwYmE4IgogICAgfQogIH0KfQ==";
    }

}
