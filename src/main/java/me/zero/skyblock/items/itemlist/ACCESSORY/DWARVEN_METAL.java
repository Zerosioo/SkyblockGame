package me.zero.skyblock.items.itemlist.ACCESSORY;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DWARVEN_METAL extends SItem implements ItemStatistics, SkullItem {

    @Override
    public String getName() {
        return "Dwarven Metal Talisman";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "DWARVEN_METAL"; 
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
        return "ewogICJ0aW1lc3RhbXAiIDogMTcwOTA2MTQ1NjAxNSwKICAicHJvZmlsZUlkIiA6ICJlNzhjY2YyNjMxZTY0MjJkOGY1YzE3ZTliZGQ3N2RjOCIsCiAgInByb2ZpbGVOYW1lIiA6ICJEQU5JRUwxOTB5IiwKICAic2lnbmF0dXJlUmVxdWlyZWQiIDogdHJ1ZSwKICAidGV4dHVyZXMiIDogewogICAgIlNLSU4iIDogewogICAgICAidXJsIiA6ICJodHRwOi8vdGV4dHVyZXMubWluZWNyYWZ0Lm5ldC90ZXh0dXJlLzRjMDFkOTljZmRkYzg3NGNiZjY4YzZhZjdjYzU5OWRlMDRlYzEwZjFlM2RkNWVhNzc5Nzk1Y2ZjZTc3YzdlMjMiLAogICAgICAibWV0YWRhdGEiIDogewogICAgICAgICJtb2RlbCIgOiAic2xpbSIKICAgICAgfQogICAgfQogIH0KfQ==";
    }

}
