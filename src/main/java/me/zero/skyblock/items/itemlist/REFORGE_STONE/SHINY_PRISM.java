package me.zero.skyblock.items.itemlist.REFORGE_STONE;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SHINY_PRISM extends SItem implements ItemStatistics, SkullItem, Sellable {

    @Override
    public String getName() {
        return "Shiny Prism";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "SHINY_PRISM"; 
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
        return ItemType.REFORGE_STONE;
    }

    @Override
    public Rarity getRarity() {
        return Rarity.RARE;
    }

    @Override
    public int getPrice() {
        return 13800;
    }

    @Override
    public String getTexture() {
        return "ewogICJ0aW1lc3RhbXAiIDogMTY0ODQ3Mzc0NTgxMSwKICAicHJvZmlsZUlkIiA6ICJmMTA0NzMxZjljYTU0NmI0OTkzNjM4NTlkZWY5N2NjNiIsCiAgInByb2ZpbGVOYW1lIiA6ICJ6aWFkODciLAogICJzaWduYXR1cmVSZXF1aXJlZCIgOiB0cnVlLAogICJ0ZXh0dXJlcyIgOiB7CiAgICAiU0tJTiIgOiB7CiAgICAgICJ1cmwiIDogImh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvNWE4NjY1MmY5ZmFiNTNkZjM5NjdlZjExMGY1NzAxMTY2NmNmODBkMjNlMGM5OGQ0YTllYTZjODcwMWJhNTBkZSIKICAgIH0KICB9Cn0=";
    }

}
