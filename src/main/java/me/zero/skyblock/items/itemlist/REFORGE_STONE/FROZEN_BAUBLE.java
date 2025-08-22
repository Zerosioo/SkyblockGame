package me.zero.skyblock.items.itemlist.REFORGE_STONE;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FROZEN_BAUBLE extends SItem implements ItemStatistics, SkullItem, Sellable {

    @Override
    public String getName() {
        return "Frozen Bauble";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "FROZEN_BAUBLE"; 
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
        return Rarity.EPIC;
    }

    @Override
    public int getPrice() {
        return 1;
    }

    @Override
    public String getTexture() {
        return "ewogICJ0aW1lc3RhbXAiIDogMTY2NzUxNDMyODY3OSwKICAicHJvZmlsZUlkIiA6ICIwMGZiNTRiOWI4NDA0YTA0YTViMmJhMzBlYzBlYTAxMiIsCiAgInByb2ZpbGVOYW1lIiA6ICJrbGxveWQ3MCIsCiAgInNpZ25hdHVyZVJlcXVpcmVkIiA6IHRydWUsCiAgInRleHR1cmVzIiA6IHsKICAgICJTS0lOIiA6IHsKICAgICAgInVybCIgOiAiaHR0cDovL3RleHR1cmVzLm1pbmVjcmFmdC5uZXQvdGV4dHVyZS9lMGZkMTNhOTZhODI0MzA2MjFhNjVlYTk3ZTg5ODE5Y2EwYjY4YzAzNDI1MzAyNWRhMDQyOGJiY2FkNDNmZDYzIgogICAgfQogIH0KfQ==";
    }

}
