package me.zero.skyblock.items.itemlist.ACCESSORY;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CANDY_RING extends SItem implements ItemStatistics, SkullItem {

    @Override
    public String getName() {
        return "Candy Ring";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "CANDY_RING"; 
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
        return Rarity.RARE;
    }

    @Override
    public String getTexture() {
        return "eyJ0aW1lc3RhbXAiOjE1NzE2OTY3MTQ4MTUsInByb2ZpbGVJZCI6IjVkZTZlMTg0YWY4ZDQ5OGFiYmRlMDU1ZTUwNjUzMzE2IiwicHJvZmlsZU5hbWUiOiJBc3Nhc2luSmlhbmVyMjUiLCJzaWduYXR1cmVSZXF1aXJlZCI6dHJ1ZSwidGV4dHVyZXMiOnsiU0tJTiI6eyJ1cmwiOiJodHRwOi8vdGV4dHVyZXMubWluZWNyYWZ0Lm5ldC90ZXh0dXJlLzE4YzBkNzAzNGE3ZGFjMzBlMmI1MmMwMGVlZWMwZWNhNTVmZTY4OGQyNWZhZjRlZmQ5YzBhMDdkY2U5ZWFmMzAiLCJtZXRhZGF0YSI6eyJtb2RlbCI6InNsaW0ifX19fQ==";
    }

}
