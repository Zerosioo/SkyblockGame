package me.zero.skyblock.items.itemlist.REFORGE_STONE;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TOIL_LOG extends SItem implements ItemStatistics, SkullItem, Sellable {

    @Override
    public String getName() {
        return "Toil Log";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "TOIL_LOG"; 
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
        return ItemType.REFORGE_STONE;
    }

    @Override
    public Rarity getRarity() {
        return Rarity.EPIC;
    }

    @Override
    public int getPrice() {
        return 1;
    }

    @Override
    public String getTexture() {
        return "eyJ0aW1lc3RhbXAiOjE1NTczMzQ4MzQ3MzEsInByb2ZpbGVJZCI6ImU3NTMyNjk3ZTgwZjQ1NmU5ZjNhZjZiODIzNWU5YTgxIiwicHJvZmlsZU5hbWUiOiJNaW5lQWx0c19NU2tpbl8xIiwic2lnbmF0dXJlUmVxdWlyZWQiOnRydWUsInRleHR1cmVzIjp7IlNLSU4iOnsidXJsIjoiaHR0cDovL3RleHR1cmVzLm1pbmVjcmFmdC5uZXQvdGV4dHVyZS8yYWUzYjRiYWYzYWVjNTUzYzFmNGY0OGZmODNjYWY2NzVkZDU3YTRlNDY0ZTRkMjg0OGNlMzFmOGEyN2IyZjc1In19fQ==";
    }

}
