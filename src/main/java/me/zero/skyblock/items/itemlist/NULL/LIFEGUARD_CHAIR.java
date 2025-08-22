package me.zero.skyblock.items.itemlist.NULL;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LIFEGUARD_CHAIR extends SItem implements ItemStatistics, SkullItem {

    @Override
    public String getName() {
        return "Lifeguard Chair";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "LIFEGUARD_CHAIR"; 
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
        return Rarity.EPIC;
    }

    @Override
    public String getTexture() {
        return "eyJ0aW1lc3RhbXAiOjE1MjMzNjgxMzM4MDMsInByb2ZpbGVJZCI6ImUzYjQ0NWM4NDdmNTQ4ZmI4YzhmYTNmMWY3ZWZiYThlIiwicHJvZmlsZU5hbWUiOiJNaW5pRGlnZ2VyVGVzdCIsInNpZ25hdHVyZVJlcXVpcmVkIjp0cnVlLCJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvYzNiZGU0MzExMWY2OWE3ZmRhNmVjNmZhZjIyNjNjODI3OTYxZjM5MGQ3YzYxNjNlZDEyMzEwMzVkMWIwYjkifX19";
    }

}
