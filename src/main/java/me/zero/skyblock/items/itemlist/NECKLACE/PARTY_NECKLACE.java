package me.zero.skyblock.items.itemlist.NECKLACE;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PARTY_NECKLACE extends SItem implements ItemStatistics, SkullItem {

    @Override
    public String getName() {
        return "Party Necklace";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "PARTY_NECKLACE"; 
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
        return Rarity.UNCOMMON;
    }

    @Override
    public Gamestage getGamestage() {
        return Gamestage.INTERMEDIATE;
    }

    @Override
    public String getTexture() {
        return "ewogICJ0aW1lc3RhbXAiIDogMTcxNDI0MTE3NzY5OCwKICAicHJvZmlsZUlkIiA6ICJmYjZkM2E5Zjk3MWY0ZTdlYmQ0MjE2Yjk0MjE5NDA3NCIsCiAgInByb2ZpbGVOYW1lIiA6ICJtYXJjaXhkZCIsCiAgInNpZ25hdHVyZVJlcXVpcmVkIiA6IHRydWUsCiAgInRleHR1cmVzIiA6IHsKICAgICJTS0lOIiA6IHsKICAgICAgInVybCIgOiAiaHR0cDovL3RleHR1cmVzLm1pbmVjcmFmdC5uZXQvdGV4dHVyZS9jNWUzMTNlMzBjNTNkZTE3NmU3ZjNjZmNjMjc4MjdmZDQ1ZTE3ZDBjNGI5OWM2YzFmYjUyYTcwYWIyOTM5MzI0IgogICAgfQogIH0KfQ==";
    }

}
