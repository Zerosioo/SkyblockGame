package me.zero.skyblock.items.itemlist.NULL;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BUNNY extends SItem implements ItemStatistics, SkullItem {

    @Override
    public String getName() {
        return "Bunny";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "BUNNY"; 
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
        return "eyJ0aW1lc3RhbXAiOjE0ODEwNDgxNjY0NjQsInByb2ZpbGVJZCI6ImZiZWMxMWQ0ODBhNzRjMWM5ZGUzNDEzNmExNmYxZGUwIiwicHJvZmlsZU5hbWUiOiJNSEZfUmFiYml0Iiwic2lnbmF0dXJlUmVxdWlyZWQiOnRydWUsInRleHR1cmVzIjp7IlNLSU4iOnsidXJsIjoiaHR0cDovL3RleHR1cmVzLm1pbmVjcmFmdC5uZXQvdGV4dHVyZS9jZWMyNDJlNjY3YWVlNDQ0OTI0MTNlZjQ2MWI4MTBjYWMzNTZiNzRkODcxOGU1Y2VjMWY4OTJhNmI0M2U1ZTEifX19";
    }

}
