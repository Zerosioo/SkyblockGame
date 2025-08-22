package me.zero.skyblock.items.itemlist.HELMET;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SEA_ARCHER_HELMET extends SItem implements ItemStatistics, SkullItem, Sellable {

    @Override
    public String getName() {
        return "Sea Archer Helmet";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "SEA_ARCHER_HELMET"; 
    }

    @Override
    public Material getMaterial() {
        return Material.SKULL_ITEM;
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
    public int getPrice() {
        return 50;
    }

    @Override
    public int getHealth() {
        return 20;
    }

    @Override
    public int getDefense() {
        return 20;
    }

    @Override
    public String getTexture() {
        return "eyJ0aW1lc3RhbXAiOjE1NDAwMzY4MjY2NzIsInByb2ZpbGVJZCI6ImEyNjBjZDUyNjFmMzRhZDY4N2UxMTI4NzFlNjM2ZTIwIiwicHJvZmlsZU5hbWUiOiJTaHlOZW9zIiwic2lnbmF0dXJlUmVxdWlyZWQiOnRydWUsInRleHR1cmVzIjp7IlNLSU4iOnsidXJsIjoiaHR0cDovL3RleHR1cmVzLm1pbmVjcmFmdC5uZXQvdGV4dHVyZS80OTg3MWZiZGE4MWU2ZDRmZjZhNWU4YTkyOTg1ZmI0YzdlNGZiM2QxNGVjZTc2YjA3NzQ0ZjY1NGE5NThiNmEzIiwibWV0YWRhdGEiOnsibW9kZWwiOiJzbGltIn19fX0=";
    }

}
