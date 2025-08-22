package me.zero.skyblock.items.itemlist.NULL;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MUMMY_CANDLE extends SItem implements ItemStatistics, SkullItem {

    @Override
    public String getName() {
        return "Mummy Candle";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "MUMMY_CANDLE"; 
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
        return Rarity.RARE;
    }

    @Override
    public String getTexture() {
        return "eyJ0aW1lc3RhbXAiOjE0ODM4NjQ2NjkyMDgsInByb2ZpbGVJZCI6IjcxZmZhMzg5ZGEwYTQ1YTZiMDM4NDM3YjQ1YTcyNWU3IiwicHJvZmlsZU5hbWUiOiJNdW1teSIsInNpZ25hdHVyZVJlcXVpcmVkIjp0cnVlLCJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvM2U5MWU5NTgyMmZlOThjYzVhNTY1OGU4MjRiMWI4Y2YxNGQ0ZGU5MmYwZTFhZjI0ODE1MzcyNDM1YzllYWI2In19fQ==";
    }

}
