package me.zero.skyblock.items.itemlist.PORTAL;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FORAGING_4_PORTAL extends SItem implements ItemStatistics, SkullItem {

    @Override
    public String getName() {
        return "Portal to Savanna Woodland";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "FORAGING_4_PORTAL"; 
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
        return ItemType.PORTAL;
    }

    @Override
    public Rarity getRarity() {
        return Rarity.COMMON;
    }

    @Override
    public String getTexture() {
        return "eyJ0aW1lc3RhbXAiOjE1MTc5Nzk3Mzg0MjMsInByb2ZpbGVJZCI6ImIwZDczMmZlMDBmNzQwN2U5ZTdmNzQ2MzAxY2Q5OGNhIiwicHJvZmlsZU5hbWUiOiJPUHBscyIsInNpZ25hdHVyZVJlcXVpcmVkIjp0cnVlLCJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvOTZhM2JiYTJiN2EyYjRmYTQ2OTQ1YjE0NzE3NzdhYmU0NTk5Njk1NTQ1MjI5ZTc4MjI1OWFlZDQxZDYifX19";
    }

}
