package me.zero.skyblock.items.itemlist.NULL;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LANTERN extends SItem implements ItemStatistics, SkullItem {

    @Override
    public String getName() {
        return "Lantern";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "LANTERN"; 
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
        return "ewogICJ0aW1lc3RhbXAiIDogMTY3OTE1MDYzMDgxOSwKICAicHJvZmlsZUlkIiA6ICI0MWNlOThmMDllMzU0NGVjYjE4ZTYwYThlODEyOGEyOCIsCiAgInByb2ZpbGVOYW1lIiA6ICJNb25zdGVySGl0IiwKICAic2lnbmF0dXJlUmVxdWlyZWQiIDogdHJ1ZSwKICAidGV4dHVyZXMiIDogewogICAgIlNLSU4iIDogewogICAgICAidXJsIiA6ICJodHRwOi8vdGV4dHVyZXMubWluZWNyYWZ0Lm5ldC90ZXh0dXJlLzE2ZTU2ODJiNGEwZTVhZjUyMzdmYjk5NjA5ODNjNjIzZWFiMDRlYzAxYjkwMTQ3YzRkZjRjOTBhN2JlNjY0ZDUiCiAgICB9CiAgfQp9";
    }

}
