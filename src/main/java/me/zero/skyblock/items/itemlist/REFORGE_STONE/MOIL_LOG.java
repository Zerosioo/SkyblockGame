package me.zero.skyblock.items.itemlist.REFORGE_STONE;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MOIL_LOG extends SItem implements ItemStatistics, SkullItem, Sellable {

    @Override
    public String getName() {
        return "Moil Log";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "MOIL_LOG"; 
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
        return Rarity.UNCOMMON;
    }

    @Override
    public int getPrice() {
        return 1;
    }

    @Override
    public String getTexture() {
        return "eyJ0aW1lc3RhbXAiOjE1NTczMzQ4NjM2NjIsInByb2ZpbGVJZCI6IjkxZjA0ZmU5MGYzNjQzYjU4ZjIwZTMzNzVmODZkMzllIiwicHJvZmlsZU5hbWUiOiJTdG9ybVN0b3JteSIsInNpZ25hdHVyZVJlcXVpcmVkIjp0cnVlLCJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvNzM5MWU4NzNkZmMyODFmZWM1MzBjYTllY2JlYjk0NzEwZmNkMTdiNTA4NGE5N2I4OGZiMjcwMDY3MWYxN2I4ZiJ9fX0=";
    }

}
