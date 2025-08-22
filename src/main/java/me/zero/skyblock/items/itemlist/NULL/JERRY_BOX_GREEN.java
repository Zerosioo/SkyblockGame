package me.zero.skyblock.items.itemlist.NULL;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class JERRY_BOX_GREEN extends SItem implements ItemStatistics, SkullItem {

    @Override
    public String getName() {
        return "Green Jerry Box";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "JERRY_BOX_GREEN"; 
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
    public String getTexture() {
        return "ewogICJ0aW1lc3RhbXAiIDogMTYyMTc2NDYzMjI3MCwKICAicHJvZmlsZUlkIiA6ICI3NTE0NDQ4MTkxZTY0NTQ2OGM5NzM5YTZlMzk1N2JlYiIsCiAgInByb2ZpbGVOYW1lIiA6ICJUaGFua3NNb2phbmciLAogICJzaWduYXR1cmVSZXF1aXJlZCIgOiB0cnVlLAogICJ0ZXh0dXJlcyIgOiB7CiAgICAiU0tJTiIgOiB7CiAgICAgICJ1cmwiIDogImh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvZGFhZGY2M2ExODYzMmFmNzJkY2VjYzA1ZDlhNWFkYjYwYzY4YTE4ZmZiYjU4ZTM2YWM0M2IxMGNlYjkzNGE3YiIKICAgIH0KICB9Cn0=";
    }

}
