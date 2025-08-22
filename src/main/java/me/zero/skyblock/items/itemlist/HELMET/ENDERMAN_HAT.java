package me.zero.skyblock.items.itemlist.HELMET;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ENDERMAN_HAT extends SItem implements ItemStatistics, SkullItem, Sellable {

    @Override
    public String getName() {
        return "Enderman Hat";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "ENDERMAN_HAT"; 
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
        return ItemType.HELMET;
    }

    @Override
    public Rarity getRarity() {
        return Rarity.COMMON;
    }

    @Override
    public int getPrice() {
        return 50;
    }

    @Override
    public int getStrength() {
        return 30;
    }

    @Override
    public String getTexture() {
        return "eyJ0aW1lc3RhbXAiOjE1MDMzMDY1MjY5OTAsInByb2ZpbGVJZCI6IjQwZmZiMzcyMTJmNjQ2NzhiM2YyMjE3NmJmNTZkZDRiIiwicHJvZmlsZU5hbWUiOiJNSEZfRW5kZXJtYW4iLCJzaWduYXR1cmVSZXF1aXJlZCI6dHJ1ZSwidGV4dHVyZXMiOnsiU0tJTiI6eyJ1cmwiOiJodHRwOi8vdGV4dHVyZXMubWluZWNyYWZ0Lm5ldC90ZXh0dXJlLzdhNTliYjBhN2EzMjk2NWIzZDkwZDhlYWZhODk5ZDE4MzVmNDI0NTA5ZWFkZDRlNmI3MDlhZGE1MGI5Y2YifX19";
    }

}
