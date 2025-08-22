package me.zero.skyblock.items.itemlist.NECKLACE;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class VANQUISHED_MAGMA_NECKLACE extends SItem implements ItemStatistics, SkullItem, Sellable {

    @Override
    public String getName() {
        return "Vanquished Magma Necklace";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "VANQUISHED_MAGMA_NECKLACE"; 
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
        return Rarity.EPIC;
    }

    @Override
    public Gamestage getGamestage() {
        return Gamestage.EXPERT;
    }

    @Override
    public int getPrice() {
        return 243965;
    }

    @Override
    public int getHealth() {
        return 20;
    }

    @Override
    public String getTexture() {
        return "ewogICJ0aW1lc3RhbXAiIDogMTY0ODQ5NDM1MjU3OSwKICAicHJvZmlsZUlkIiA6ICJmMTkyZGU3MDUzMTQ0ODcxOTAwMjQ1MmIzZWE3MzA3NCIsCiAgInByb2ZpbGVOYW1lIiA6ICJOZVhvU2V0IiwKICAic2lnbmF0dXJlUmVxdWlyZWQiIDogdHJ1ZSwKICAidGV4dHVyZXMiIDogewogICAgIlNLSU4iIDogewogICAgICAidXJsIiA6ICJodHRwOi8vdGV4dHVyZXMubWluZWNyYWZ0Lm5ldC90ZXh0dXJlL2NiZDg2N2IxOTZhZTViN2QwYTE4OGIwYzFmODMxZTA1MmMxZGI0NzhiYTlkYmE0YjFjODUwNjcwMGM0MTFmNWEiCiAgICB9CiAgfQp9";
    }

}
