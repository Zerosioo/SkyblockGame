package me.zero.skyblock.items.itemlist.NULL;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CREEPER_GENERATOR_5 extends SItem implements ItemStatistics, SkullItem {

    @Override
    public String getName() {
        return "Creeper Minion V";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "CREEPER_GENERATOR_5"; 
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
        return "eyJ0aW1lc3RhbXAiOjE1NTc5MzUwNTc3MDMsInByb2ZpbGVJZCI6IjkxZjA0ZmU5MGYzNjQzYjU4ZjIwZTMzNzVmODZkMzllIiwicHJvZmlsZU5hbWUiOiJTdG9ybVN0b3JteSIsInNpZ25hdHVyZVJlcXVpcmVkIjp0cnVlLCJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvNjU0YmRlOWEyNmUzNTA5NGUzNDM4NTQwYzIyNWNmZmE3NjkwYzFkNDQ1NjI1MWRhMzBjYzk5MGZmOTIxY2MzNiJ9fX0=";
    }

}
