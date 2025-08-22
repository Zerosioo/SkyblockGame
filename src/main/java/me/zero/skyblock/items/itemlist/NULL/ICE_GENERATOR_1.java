package me.zero.skyblock.items.itemlist.NULL;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ICE_GENERATOR_1 extends SItem implements ItemStatistics, SkullItem {

    @Override
    public String getName() {
        return "Ice Minion I";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "ICE_GENERATOR_1"; 
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
        return "eyJ0aW1lc3RhbXAiOjE1NTk2NTkzMjk0MjcsInByb2ZpbGVJZCI6ImIwZDczMmZlMDBmNzQwN2U5ZTdmNzQ2MzAxY2Q5OGNhIiwicHJvZmlsZU5hbWUiOiJPUHBscyIsInNpZ25hdHVyZVJlcXVpcmVkIjp0cnVlLCJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvZTUwMDA2NDMyMWIxMjk3MmY4ZTU3NTA3OTNlYzFjODIzZGE0NjI3NTM1ZTlkMTJmZWFlZTc4Mzk0Yjg2ZGFiZSJ9fX0=";
    }

}
