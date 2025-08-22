package me.zero.skyblock.items.itemlist.NULL;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class KUUDRA_WASHING_MACHINE extends SItem implements ItemStatistics, SkullItem, Sellable {

    @Override
    public String getName() {
        return "Kuudra Washing Machine";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "KUUDRA_WASHING_MACHINE"; 
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
    public boolean isStackable() {
        return false;
    }

    @Override
    public int getPrice() {
        return 1;
    }

    @Override
    public String getTexture() {
        return "ewogICJ0aW1lc3RhbXAiIDogMTYwMzQ2ODAzODI0NSwKICAicHJvZmlsZUlkIiA6ICI1NjY3NWIyMjMyZjA0ZWUwODkxNzllOWM5MjA2Y2ZlOCIsCiAgInByb2ZpbGVOYW1lIiA6ICJUaGVJbmRyYSIsCiAgInNpZ25hdHVyZVJlcXVpcmVkIiA6IHRydWUsCiAgInRleHR1cmVzIiA6IHsKICAgICJTS0lOIiA6IHsKICAgICAgInVybCIgOiAiaHR0cDovL3RleHR1cmVzLm1pbmVjcmFmdC5uZXQvdGV4dHVyZS9jN2RlNjNkNDAxZjg1ZWVkOGE1ZTA4Y2ZhNmNiMjkwYzQwYjExYTdjNzJiNTc5YjJmMDZlOGJiNGE4YTdjMDk5IgogICAgfQogIH0KfQ==";
    }

}
