package me.zero.skyblock.items.itemlist.MEMENTO;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BURNING_COINS extends SItem implements ItemStatistics, SkullItem {

    @Override
    public String getName() {
        return "Coins on Fire!";
    }

    @Override
    public List<String> getLore() {
        return new ArrayList(Arrays.asList("§8It's about sending","§8a message...")); 
    }

    @Override
    public String getId() {
        return "BURNING_COINS"; 
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
        return ItemType.MEMENTO;
    }

    @Override
    public Rarity getRarity() {
        return Rarity.SPECIAL;
    }

    @Override
    public String getTexture() {
        return "ewogICJ0aW1lc3RhbXAiIDogMTY4MjM4NjgxNjMyOCwKICAicHJvZmlsZUlkIiA6ICJkYjJmMTJhMmU5MTI0ZThiODZjZmQyNzU2MDk1N2JhNCIsCiAgInByb2ZpbGVOYW1lIiA6ICJDYWxpYnJlcyIsCiAgInNpZ25hdHVyZVJlcXVpcmVkIiA6IHRydWUsCiAgInRleHR1cmVzIiA6IHsKICAgICJTS0lOIiA6IHsKICAgICAgInVybCIgOiAiaHR0cDovL3RleHR1cmVzLm1pbmVjcmFmdC5uZXQvdGV4dHVyZS81M2U5N2ZhYjQ3NTNiNzViYTViMGMwMzhiZWQzNzdiMTYyYmEyOGI3YTVlMjkwYWJmZDAxOGE1NTgxYWM1Mzg4IgogICAgfQogIH0KfQ==";
    }

}
