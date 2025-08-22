package me.zero.skyblock.items.itemlist.NECKLACE;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LOTUS_NECKLACE extends SItem implements ItemStatistics, SkullItem, Sellable {

    @Override
    public String getName() {
        return "Lotus Necklace";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "LOTUS_NECKLACE"; 
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
        return ItemType.NECKLACE;
    }

    @Override
    public Rarity getRarity() {
        return Rarity.RARE;
    }

    @Override
    public Gamestage getGamestage() {
        return Gamestage.INTERMEDIATE;
    }

    @Override
    public int getPrice() {
        return 100;
    }

    @Override
    public int getFarmingFortune() {
        return 5;
    }

    @Override
    public String getTexture() {
        return "ewogICJ0aW1lc3RhbXAiIDogMTY2MjUwMjgxMTAyMiwKICAicHJvZmlsZUlkIiA6ICIzOTVkZTJlYjVjNjU0ZmRkOWQ2NDAwY2JhNmNmNjFhNyIsCiAgInByb2ZpbGVOYW1lIiA6ICJzcGFyZXN0ZXZlIiwKICAic2lnbmF0dXJlUmVxdWlyZWQiIDogdHJ1ZSwKICAidGV4dHVyZXMiIDogewogICAgIlNLSU4iIDogewogICAgICAidXJsIiA6ICJodHRwOi8vdGV4dHVyZXMubWluZWNyYWZ0Lm5ldC90ZXh0dXJlL2FkODNhYTI1YzExYWNmY2U3NDQyZmYwMTI5ZmQ3MGJiNDJjYTBkZTYzYmEyMTE1MTY5OTY2Y2MzNTFmMTcxNmIiCiAgICB9CiAgfQp9";
    }

}
