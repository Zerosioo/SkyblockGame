package me.zero.skyblock.items.itemlist.HELMET;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class EMPEROR_HEAD extends SItem implements ItemStatistics, SkullItem {

    @Override
    public String getName() {
        return "Emperor Head";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "EMPEROR_HEAD"; 
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
        return Rarity.UNCOMMON;
    }

    @Override
    public String getTexture() {
        return "eyJ0aW1lc3RhbXAiOjE1ODY3MzY5MDMzNTEsInByb2ZpbGVJZCI6IjczODJkZGZiZTQ4NTQ1NWM4MjVmOTAwZjg4ZmQzMmY4IiwicHJvZmlsZU5hbWUiOiJZYU9PUCIsInNpZ25hdHVyZVJlcXVpcmVkIjp0cnVlLCJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvNDZjMTViNTI3ZTQ4NzIyNDljOTE3OTc0MzU1MjFjYjc3NjUxYjU2N2U1NzUxODMwNGY1ZjEzMWU0OWRlZDY1MiJ9fX0=";
    }

}
