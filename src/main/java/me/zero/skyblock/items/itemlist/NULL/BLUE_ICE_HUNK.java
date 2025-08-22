package me.zero.skyblock.items.itemlist.NULL;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BLUE_ICE_HUNK extends SItem implements ItemStatistics, SkullItem {

    @Override
    public String getName() {
        return "Hunk of Blue Ice";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "BLUE_ICE_HUNK"; 
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
        return Rarity.RARE;
    }

    @Override
    public String getTexture() {
        return "ewogICJ0aW1lc3RhbXAiIDogMTYwNDY4NDYzNTc4MiwKICAicHJvZmlsZUlkIiA6ICI5MWYwNGZlOTBmMzY0M2I1OGYyMGUzMzc1Zjg2ZDM5ZSIsCiAgInByb2ZpbGVOYW1lIiA6ICJTdG9ybVN0b3JteSIsCiAgInNpZ25hdHVyZVJlcXVpcmVkIiA6IHRydWUsCiAgInRleHR1cmVzIiA6IHsKICAgICJTS0lOIiA6IHsKICAgICAgInVybCIgOiAiaHR0cDovL3RleHR1cmVzLm1pbmVjcmFmdC5uZXQvdGV4dHVyZS8yMDk5YjFlOWY0MTIxMzI1MWQwYzlmOTliNDUwN2JlOTU5ODk2Y2Q1OTU0ZDZkNmI4MGZmNWQ1MjRlNmE5NTViIgogICAgfQogIH0KfQ==";
    }

}
