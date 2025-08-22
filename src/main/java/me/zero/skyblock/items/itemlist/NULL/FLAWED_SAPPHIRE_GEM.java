package me.zero.skyblock.items.itemlist.NULL;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FLAWED_SAPPHIRE_GEM extends SItem implements ItemStatistics, SkullItem, Sellable {

    @Override
    public String getName() {
        return "Flawed Sapphire Gemstone";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "FLAWED_SAPPHIRE_GEM"; 
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
        return Rarity.UNCOMMON;
    }

    @Override
    public int getPrice() {
        return 240;
    }

    @Override
    public String getTexture() {
        return "ewogICJ0aW1lc3RhbXAiIDogMTYxODA4NjIwMzYzNiwKICAicHJvZmlsZUlkIiA6ICI4OGU0YWNiYTQwOTc0YWZkYmE0ZDM1YjdlYzdmNmJmYSIsCiAgInByb2ZpbGVOYW1lIiA6ICJKb2FvMDkxNSIsCiAgInNpZ25hdHVyZVJlcXVpcmVkIiA6IHRydWUsCiAgInRleHR1cmVzIiA6IHsKICAgICJTS0lOIiA6IHsKICAgICAgInVybCIgOiAiaHR0cDovL3RleHR1cmVzLm1pbmVjcmFmdC5uZXQvdGV4dHVyZS84YTBhZjk5ZThkODcwMzE5NGE4NDdhNTUyNjhjZjVlZjRhYzRlYjNiMjRjMGVkODY1NTEzMzlkMTBiNjQ2NTI5IgogICAgfQogIH0KfQ==";
    }

}
