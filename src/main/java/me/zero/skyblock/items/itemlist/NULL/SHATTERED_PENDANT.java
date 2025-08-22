package me.zero.skyblock.items.itemlist.NULL;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SHATTERED_PENDANT extends SItem implements ItemStatistics, SkullItem {

    @Override
    public String getName() {
        return "Shattered Locket";
    }

    @Override
    public List<String> getLore() {
        return new ArrayList(Arrays.asList("A dainty piece of","jewelry covered in a","thick coat of","glacite. The frosty","layer obscures the","details of the","photograph nestled","within.")); 
    }

    @Override
    public String getId() {
        return "SHATTERED_PENDANT"; 
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
        return Rarity.LEGENDARY;
    }

    @Override
    public String getTexture() {
        return "ewogICJ0aW1lc3RhbXAiIDogMTcwOTI0MjcyMDI4OSwKICAicHJvZmlsZUlkIiA6ICJlZjVjZjkzYWFhMTY0ZTMyODQ4NDYxYjIzNGQ1YWJhNiIsCiAgInByb2ZpbGVOYW1lIiA6ICJfXzciLAogICJzaWduYXR1cmVSZXF1aXJlZCIgOiB0cnVlLAogICJ0ZXh0dXJlcyIgOiB7CiAgICAiU0tJTiIgOiB7CiAgICAgICJ1cmwiIDogImh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvZDE4NWEzZGRhZGUyY2RhZGY0MDRjOTE0NTczMzE3NjRmYWRjOTIwYTIxNDIxOTdmOTk1OTEwNjg2ZThiZDY4OCIsCiAgICAgICJtZXRhZGF0YSIgOiB7CiAgICAgICAgIm1vZGVsIiA6ICJzbGltIgogICAgICB9CiAgICB9CiAgfQp9";
    }

}
