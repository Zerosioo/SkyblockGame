package me.zero.skyblock.items.itemlist.ACCESSORY;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BURNING_KUUDRA_CORE extends SItem implements ItemStatistics, SkullItem, Sellable {

    @Override
    public String getName() {
        return "Burning Kuudra Core";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "BURNING_KUUDRA_CORE"; 
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
    public int getPrice() {
        return 1;
    }

    @Override
    public String getTexture() {
        return "ewogICJ0aW1lc3RhbXAiIDogMTY0NzA0MDIzMTE0NCwKICAicHJvZmlsZUlkIiA6ICIzYzE0YmVkNDFiOGE0MDIzOGM3MDgzMTA1NzEwMTZmYiIsCiAgInByb2ZpbGVOYW1lIiA6ICJOb2Jpa28iLAogICJzaWduYXR1cmVSZXF1aXJlZCIgOiB0cnVlLAogICJ0ZXh0dXJlcyIgOiB7CiAgICAiU0tJTiIgOiB7CiAgICAgICJ1cmwiIDogImh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvMzY4NzQzNDk3ODIwYzA4NjI3ZDJjYzVlODkxYzBmOWZjMzc5M2Y3NWI2ZTQxZTE0MGFjOWIwMDdkM2I1MDVhNSIKICAgIH0KICB9Cn0=";
    }

}
