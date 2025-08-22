package me.zero.skyblock.items.itemlist.NULL;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class VOIDLING_GENERATOR_2 extends SItem implements ItemStatistics, SkullItem {

    @Override
    public String getName() {
        return "Voidling Minion II";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "VOIDLING_GENERATOR_2"; 
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
        return "ewogICJ0aW1lc3RhbXAiIDogMTYyMTk0MDU5NDc0OSwKICAicHJvZmlsZUlkIiA6ICI5MWZlMTk2ODdjOTA0NjU2YWExZmMwNTk4NmRkM2ZlNyIsCiAgInByb2ZpbGVOYW1lIiA6ICJoaGphYnJpcyIsCiAgInNpZ25hdHVyZVJlcXVpcmVkIiA6IHRydWUsCiAgInRleHR1cmVzIiA6IHsKICAgICJTS0lOIiA6IHsKICAgICAgInVybCIgOiAiaHR0cDovL3RleHR1cmVzLm1pbmVjcmFmdC5uZXQvdGV4dHVyZS9iYzQ5NGFmNmI0NTk4MGNiMmIwMzUwMDdjMjVlMWI0ZTE2OTM3MWM0MTBmZTVkMjcwOGRhYTRmNjk1NjY4ZmQyIgogICAgfQogIH0KfQ==";
    }

}
