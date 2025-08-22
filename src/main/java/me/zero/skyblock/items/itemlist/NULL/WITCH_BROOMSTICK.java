package me.zero.skyblock.items.itemlist.NULL;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class WITCH_BROOMSTICK extends SItem implements ItemStatistics, SkullItem {

    @Override
    public String getName() {
        return "Witch's Broomstick";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "WITCH_BROOMSTICK"; 
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
        return Rarity.EPIC;
    }

    @Override
    public String getTexture() {
        return "ewogICJ0aW1lc3RhbXAiIDogMTcwODQzNjc4Mzg5NSwKICAicHJvZmlsZUlkIiA6ICJiOThjNGFkOGM2MjY0NGYxOWUzYzhhZTE0ZThhMDI1OSIsCiAgInByb2ZpbGVOYW1lIiA6ICJ5cnRlZGR5IiwKICAic2lnbmF0dXJlUmVxdWlyZWQiIDogdHJ1ZSwKICAidGV4dHVyZXMiIDogewogICAgIlNLSU4iIDogewogICAgICAidXJsIiA6ICJodHRwOi8vdGV4dHVyZXMubWluZWNyYWZ0Lm5ldC90ZXh0dXJlL2JkMmNhOGMyZDUzN2NkNThlODFkOWYwNWI4MDIyYzc5NDBiY2U2MDkxYzZkMDVjNmIyNmNmYjgyYjBjNmI5MGQiCiAgICB9CiAgfQp9";
    }

}
