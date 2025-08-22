package me.zero.skyblock.items.itemlist.NULL;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class EPOCH_CAKE_BROWN extends SItem implements ItemStatistics, SkullItem, Museum {

    @Override
    public String getName() {
        return "Chocolate Century Cake";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "EPOCH_CAKE_BROWN"; 
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
    public boolean isMuseum() {
        return true;
    }

    @Override
    public String getTexture() {
        return "ewogICJ0aW1lc3RhbXAiIDogMTY0Nzk1NDY4MzMwMCwKICAicHJvZmlsZUlkIiA6ICJlMmVkYTM1YjMzZGU0M2UxOTVhZmRkNDgxNzQ4ZDlhOSIsCiAgInByb2ZpbGVOYW1lIiA6ICJDaGFsa19SaWNlR0kiLAogICJzaWduYXR1cmVSZXF1aXJlZCIgOiB0cnVlLAogICJ0ZXh0dXJlcyIgOiB7CiAgICAiU0tJTiIgOiB7CiAgICAgICJ1cmwiIDogImh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvYjIzN2NkZmQ3ZDNmMjBlMGY1YjY5N2EyMGM4NTMyNGZiYjdiY2Q0MDllNjUzMzM3Y2NkNWE5Y2U4Y2NhZmMxZCIKICAgIH0KICB9Cn0=";
    }

}
