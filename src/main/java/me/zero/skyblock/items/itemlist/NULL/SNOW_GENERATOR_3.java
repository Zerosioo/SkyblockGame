package me.zero.skyblock.items.itemlist.NULL;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SNOW_GENERATOR_3 extends SItem implements ItemStatistics, SkullItem {

    @Override
    public String getName() {
        return "Snow Minion III";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "SNOW_GENERATOR_3"; 
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
        return "eyJ0aW1lc3RhbXAiOjE1NzY1MTMzMTIwNDgsInByb2ZpbGVJZCI6IjIzZjFhNTlmNDY5YjQzZGRiZGI1MzdiZmVjMTA0NzFmIiwicHJvZmlsZU5hbWUiOiIyODA3Iiwic2lnbmF0dXJlUmVxdWlyZWQiOnRydWUsInRleHR1cmVzIjp7IlNLSU4iOnsidXJsIjoiaHR0cDovL3RleHR1cmVzLm1pbmVjcmFmdC5uZXQvdGV4dHVyZS80ZTEzODYyZDFkMGM1MmQyNzJlY2UxMDllOTIzYWY2MmFlZGViYjEzYjU2YzQ3MDg1ZjQxNzUyYTVkNGQ1OWUyIn19fQ==";
    }

}
