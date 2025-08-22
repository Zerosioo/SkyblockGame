package me.zero.skyblock.items.itemlist.NULL;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SHEEP_GENERATOR_6 extends SItem implements ItemStatistics, SkullItem {

    @Override
    public String getName() {
        return "Sheep Minion VI";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "SHEEP_GENERATOR_6"; 
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
        return "eyJ0aW1lc3RhbXAiOjE1NTc5NDU3MjUwOTUsInByb2ZpbGVJZCI6ImU3NTMyNjk3ZTgwZjQ1NmU5ZjNhZjZiODIzNWU5YTgxIiwicHJvZmlsZU5hbWUiOiJNaW5lQWx0c19NU2tpbl8xIiwic2lnbmF0dXJlUmVxdWlyZWQiOnRydWUsInRleHR1cmVzIjp7IlNLSU4iOnsidXJsIjoiaHR0cDovL3RleHR1cmVzLm1pbmVjcmFmdC5uZXQvdGV4dHVyZS9hZWE0OWFjNGU4Zjg4YmJmMDMyMWI1NWVkMjY0ZGYwZDUyNzk1MmNlNDljMzg3ZmRlYmRlZGM1ZDY0NDczNzYifX19";
    }

}
