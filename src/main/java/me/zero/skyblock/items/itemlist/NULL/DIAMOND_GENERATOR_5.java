package me.zero.skyblock.items.itemlist.NULL;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DIAMOND_GENERATOR_5 extends SItem implements ItemStatistics, SkullItem {

    @Override
    public String getName() {
        return "Diamond Minion V";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "DIAMOND_GENERATOR_5"; 
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
        return "eyJ0aW1lc3RhbXAiOjE1NTc5MzUzOTk2NTcsInByb2ZpbGVJZCI6ImZkNjBmMzZmNTg2MTRmMTJiM2NkNDdjMmQ4NTUyOTlhIiwicHJvZmlsZU5hbWUiOiJSZWFkIiwic2lnbmF0dXJlUmVxdWlyZWQiOnRydWUsInRleHR1cmVzIjp7IlNLSU4iOnsidXJsIjoiaHR0cDovL3RleHR1cmVzLm1pbmVjcmFmdC5uZXQvdGV4dHVyZS8zMjgxMmFlMDcwZmNhMzU4MjE2YWQ2Mjc4NTllMmQ2OWM2N2M4YWM3YjYzMWZmNGQ1YzU3ZWJjMzk0MzU3MDk1In19fQ==";
    }

}
