package me.zero.skyblock.items.itemlist.NULL;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class POTATO_GENERATOR_7 extends SItem implements ItemStatistics, SkullItem {

    @Override
    public String getName() {
        return "Potato Minion VII";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "POTATO_GENERATOR_7"; 
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
        return "eyJ0aW1lc3RhbXAiOjE1NTc5NDY4MDA5NzMsInByb2ZpbGVJZCI6ImU3NmYwZDlhZjc4MjQyYzM5NDY2ZDY3MjE3MzBmNDUzIiwicHJvZmlsZU5hbWUiOiJLbGxscmFoIiwic2lnbmF0dXJlUmVxdWlyZWQiOnRydWUsInRleHR1cmVzIjp7IlNLSU4iOnsidXJsIjoiaHR0cDovL3RleHR1cmVzLm1pbmVjcmFmdC5uZXQvdGV4dHVyZS82YTE4MTJlNGY1OGYxZWM0NmM2MDg1MjFmYzVmNTFlYjJlNjUzYmJjNGU0M2NkOWU4OWRmZjg4ZThjNzc3ZSJ9fX0=";
    }

}
