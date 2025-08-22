package me.zero.skyblock.items.itemlist.NULL;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class KUUDRA_SHOP_ITEM extends SItem implements ItemStatistics, SkullItem {

    @Override
    public String getName() {
        return "Open Shop";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "KUUDRA_SHOP_ITEM"; 
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
        return Rarity.SPECIAL;
    }

    @Override
    public String getTexture() {
        return "ewogICJ0aW1lc3RhbXAiIDogMTYyMDM5NTcwMzU4NywKICAicHJvZmlsZUlkIiA6ICI2OTBkMDM2OGM2NTE0OGM5ODZjMzEwN2FjMmRjNjFlYyIsCiAgInByb2ZpbGVOYW1lIiA6ICJ5emZyXzciLAogICJzaWduYXR1cmVSZXF1aXJlZCIgOiB0cnVlLAogICJ0ZXh0dXJlcyIgOiB7CiAgICAiU0tJTiIgOiB7CiAgICAgICJ1cmwiIDogImh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvNmY4MTIzMDE5M2NlZGRjNGU4NzVlZGZhZTU0ODg2MDA3YjBhYzc5ZTZlYjBjYjBmY2QxMzExNDA3ZDdiZmI4OCIKICAgIH0KICB9Cn0=";
    }

}
