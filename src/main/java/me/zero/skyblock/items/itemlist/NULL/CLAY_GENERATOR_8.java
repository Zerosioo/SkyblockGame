package me.zero.skyblock.items.itemlist.NULL;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CLAY_GENERATOR_8 extends SItem implements ItemStatistics, SkullItem {

    @Override
    public String getName() {
        return "Clay Minion VIII";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "CLAY_GENERATOR_8"; 
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
        return "eyJ0aW1lc3RhbXAiOjE1NTc5MzQyMzQzNjYsInByb2ZpbGVJZCI6ImZkNjBmMzZmNTg2MTRmMTJiM2NkNDdjMmQ4NTUyOTlhIiwicHJvZmlsZU5hbWUiOiJSZWFkIiwic2lnbmF0dXJlUmVxdWlyZWQiOnRydWUsInRleHR1cmVzIjp7IlNLSU4iOnsidXJsIjoiaHR0cDovL3RleHR1cmVzLm1pbmVjcmFmdC5uZXQvdGV4dHVyZS9mMGVjNmM1MTBlOGM3MjYyN2VmZDMwMTFiYjNkY2Y1YWQzM2Q2YjYxNjJmYTdmY2JkNDZkNjYxZGIwMmIyZTY4In19fQ==";
    }

}
