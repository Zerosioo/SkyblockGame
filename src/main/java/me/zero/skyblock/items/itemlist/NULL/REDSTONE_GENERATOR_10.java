package me.zero.skyblock.items.itemlist.NULL;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class REDSTONE_GENERATOR_10 extends SItem implements ItemStatistics, SkullItem {

    @Override
    public String getName() {
        return "Redstone Minion X";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "REDSTONE_GENERATOR_10"; 
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
        return "eyJ0aW1lc3RhbXAiOjE1NTc5NDYxNzc1NjgsInByb2ZpbGVJZCI6ImRkZWQ1NmUxZWY4YjQwZmU4YWQxNjI5MjBmN2FlY2RhIiwicHJvZmlsZU5hbWUiOiJEaXNjb3JkQXBwIiwic2lnbmF0dXJlUmVxdWlyZWQiOnRydWUsInRleHR1cmVzIjp7IlNLSU4iOnsidXJsIjoiaHR0cDovL3RleHR1cmVzLm1pbmVjcmFmdC5uZXQvdGV4dHVyZS82NTg4YmVkNDEzNmM5NWRkOTYxYjU0YTA2MzA3YjI0ODk3MjZiYmZlNGZkYTQxY2VlOGFiMmM1N2ZhMzZmMjkxIn19fQ==";
    }

}
