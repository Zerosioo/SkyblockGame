package me.zero.skyblock.items.itemlist.REFORGE_STONE;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RUSTY_ANCHOR extends SItem implements ItemStatistics, SkullItem, Sellable {

    @Override
    public String getName() {
        return "Rusty Anchor";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "RUSTY_ANCHOR"; 
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
        return Rarity.RARE;
    }

    @Override
    public int getPrice() {
        return 1;
    }

    @Override
    public String getTexture() {
        return "eyJ0aW1lc3RhbXAiOjE1NjM2MzU0ODUzNzQsInByb2ZpbGVJZCI6IjJkYzc3YWU3OTQ2MzQ4MDI5NDI4MGM4NDIyNzRiNTY3IiwicHJvZmlsZU5hbWUiOiJzYWR5MDYxMCIsInNpZ25hdHVyZVJlcXVpcmVkIjp0cnVlLCJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvYmZiM2M2ZTY2NTU0ODZlNzY3YTYwZDg3ODExY2E1Y2RkYzMzY2NmZjEyNjQ5YTM0Y2I2OTY4NjFhNjNjOGM1ZCJ9fX0=";
    }

}
