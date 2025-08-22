package me.zero.skyblock.items.itemlist.HELMET;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TITAN_HELMET extends SItem implements ItemStatistics, SkullItem, Sellable {

    @Override
    public String getName() {
        return "Titan's Helmet";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "TITAN_HELMET"; 
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
        return Rarity.UNOBTAINABLE;
    }

    @Override
    public int getPrice() {
        return 50000;
    }

    @Override
    public int getStrength() {
        return 10;
    }

    @Override
    public int getHealth() {
        return 150;
    }

    @Override
    public int getDefense() {
        return 100;
    }

    @Override
    public int getIntelligence() {
        return 50;
    }

    @Override
    public String getTexture() {
        return "eyJ0aW1lc3RhbXAiOjE1MTI0MzQ0MjIzODEsInByb2ZpbGVJZCI6IjA2MzU0OGY3Y2JkMzQ1ZTJiZDBiYTZmNGE2OGJhMTg2IiwicHJvZmlsZU5hbWUiOiJHb2dldGEiLCJzaWduYXR1cmVSZXF1aXJlZCI6dHJ1ZSwidGV4dHVyZXMiOnsiU0tJTiI6eyJ1cmwiOiJodHRwOi8vdGV4dHVyZXMubWluZWNyYWZ0Lm5ldC90ZXh0dXJlL2RlODZlMGIyOTNkZWY1YzI1NzMzODQzYmJlNjc3OWNjZGE3NzU5MGUxMzIyNGEyZGI2Mjc2YWQ4MjNlZDU1ZSJ9fX0=";
    }

}
