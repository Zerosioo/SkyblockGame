package me.zero.skyblock.items.itemlist.COSMETIC;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BEACH_BALL_BARN_SKIN extends SItem implements ItemStatistics, SkullItem {

    @Override
    public String getName() {
        return "Beach Ball Barn Skin";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "BEACH_BALL_BARN_SKIN"; 
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
        return ItemType.COSMETIC;
    }

    @Override
    public Rarity getRarity() {
        return Rarity.LEGENDARY;
    }

    @Override
    public String getTexture() {
        return "ewogICJ0aW1lc3RhbXAiIDogMTcxOTMzMzYyODIyOCwKICAicHJvZmlsZUlkIiA6ICI2NGVkZjMxNTljZGY0ODBmYTZmY2UzYzA0NzlmNzUwYyIsCiAgInByb2ZpbGVOYW1lIiA6ICJnYW1lc2t5MTIzNCIsCiAgInNpZ25hdHVyZVJlcXVpcmVkIiA6IHRydWUsCiAgInRleHR1cmVzIiA6IHsKICAgICJTS0lOIiA6IHsKICAgICAgInVybCIgOiAiaHR0cDovL3RleHR1cmVzLm1pbmVjcmFmdC5uZXQvdGV4dHVyZS9kMjA1NzA1N2I3MDk1Y2RkOGE2MGE1YzRlZGVjMmNkN2YxZmQ1ZDY0NzllYmVkMGFkZDRjZTExNWEzMzM4YzJmIgogICAgfQogIH0KfQ==";
    }

}
