package me.zero.skyblock.items.itemlist.NULL;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class REVIVE_PERK_ITEM extends SItem implements ItemStatistics, SkullItem {

    @Override
    public String getName() {
        return "Revive Dead";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "REVIVE_PERK_ITEM"; 
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
        return Rarity.SPECIAL;
    }

    @Override
    public boolean isEnchanted() {
        return true;
    }

    @Override
    public String getTexture() {
        return "ewogICJ0aW1lc3RhbXAiIDogMTcxNjQ4NDg1OTA4MCwKICAicHJvZmlsZUlkIiA6ICIzMjNiYjlkYzkwZWU0Nzk5YjUxYzE3NjRmZDRhNjI3OSIsCiAgInByb2ZpbGVOYW1lIiA6ICJOcGllIiwKICAic2lnbmF0dXJlUmVxdWlyZWQiIDogdHJ1ZSwKICAidGV4dHVyZXMiIDogewogICAgIlNLSU4iIDogewogICAgICAidXJsIiA6ICJodHRwOi8vdGV4dHVyZXMubWluZWNyYWZ0Lm5ldC90ZXh0dXJlLzViNGEzNzU1ZjgyNWI5YjFjOTdhMzhkMWNiZTBmMjBkMTQ5NmIwYTViZjY2YzkzY2JlOTYwOGY2NjZmMGZmZWIiCiAgICB9CiAgfQp9";
    }

}
