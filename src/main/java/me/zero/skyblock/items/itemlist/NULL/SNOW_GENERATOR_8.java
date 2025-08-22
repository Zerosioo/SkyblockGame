package me.zero.skyblock.items.itemlist.NULL;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SNOW_GENERATOR_8 extends SItem implements ItemStatistics, SkullItem {

    @Override
    public String getName() {
        return "Snow Minion VIII";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "SNOW_GENERATOR_8"; 
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
        return "eyJ0aW1lc3RhbXAiOjE1NzY1MTM0MTEyNTMsInByb2ZpbGVJZCI6IjkxOGEwMjk1NTlkZDRjZTZiMTZmN2E1ZDUzZWZiNDEyIiwicHJvZmlsZU5hbWUiOiJCZWV2ZWxvcGVyIiwic2lnbmF0dXJlUmVxdWlyZWQiOnRydWUsInRleHR1cmVzIjp7IlNLSU4iOnsidXJsIjoiaHR0cDovL3RleHR1cmVzLm1pbmVjcmFmdC5uZXQvdGV4dHVyZS85ZjUzMjIxYjFiMmU0MGE5N2E3YTEwZmI0NzcxMGU2MWJkZDg0ZTE1MDUyZGQ4MTdkYTJmODk3ODMyNDgzNzVlIn19fQ==";
    }

}
