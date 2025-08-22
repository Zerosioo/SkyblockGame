package me.zero.skyblock.items.itemlist.HELMET;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class NUTCRACKER_HELMET extends SItem implements ItemStatistics, SkullItem, Sellable {

    @Override
    public String getName() {
        return "Nutcracker Helmet";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "NUTCRACKER_HELMET"; 
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
        return ItemType.HELMET;
    }

    @Override
    public Rarity getRarity() {
        return Rarity.LEGENDARY;
    }

    @Override
    public Gamestage getGamestage() {
        return Gamestage.SKILLED;
    }

    @Override
    public int getPrice() {
        return 1000;
    }

    @Override
    public int getSeaCreatureChance() {
        return 1;
    }

    @Override
    public String getTexture() {
        return "eyJ0aW1lc3RhbXAiOjE0OTQ5NjQ1NzMzMzgsInByb2ZpbGVJZCI6IjM4OTVkMzFjYTZjMDRjMTg4NWIzOGNlNTk5ZWQ4MGZmIiwicHJvZmlsZU5hbWUiOiJTaXJvdG9wIiwic2lnbmF0dXJlUmVxdWlyZWQiOnRydWUsInRleHR1cmVzIjp7IlNLSU4iOnsibWV0YWRhdGEiOnsibW9kZWwiOiJzbGltIn0sInVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvYzI0MDdlNjZjODFiMTQ0M2MyZTdkZmM0ZDY1ODNlYjE5YzYyMmZhMjJmMzRmYmY5OWZlNmM0NWY3NmEifX19";
    }

}
