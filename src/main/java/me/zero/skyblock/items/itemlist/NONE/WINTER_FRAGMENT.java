package me.zero.skyblock.items.itemlist.NONE;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class WINTER_FRAGMENT extends SItem implements ItemStatistics, SkullItem, Sellable {

    @Override
    public String getName() {
        return "Winter Fragment";
    }

    @Override
    public List<String> getLore() {
        return new ArrayList(Arrays.asList("A magical shard","capturing the warmth","and joy of winter","festivities.")); 
    }

    @Override
    public String getId() {
        return "WINTER_FRAGMENT"; 
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
        return ItemType.NONE;
    }

    @Override
    public Rarity getRarity() {
        return Rarity.EPIC;
    }

    @Override
    public int getPrice() {
        return 500;
    }

    @Override
    public String getTexture() {
        return "ewogICJ0aW1lc3RhbXAiIDogMTY3MzQwNDk1NDQxMiwKICAicHJvZmlsZUlkIiA6ICI3MDQ0ZDlkY2I5OGI0YzgzYWFjNjIzNjFlYTY5YmNmOSIsCiAgInByb2ZpbGVOYW1lIiA6ICJfV2F0cnlzaGthXyIsCiAgInNpZ25hdHVyZVJlcXVpcmVkIiA6IHRydWUsCiAgInRleHR1cmVzIiA6IHsKICAgICJTS0lOIiA6IHsKICAgICAgInVybCIgOiAiaHR0cDovL3RleHR1cmVzLm1pbmVjcmFmdC5uZXQvdGV4dHVyZS9lZjc0YzJlNGMwYjIyMmU0MmU4Y2RkZjNiYThmNmI1NDZjNTEwM2FkYTJjOWMxNTQ2MWFiYzNmYTNmNDI1MDkiLAogICAgICAibWV0YWRhdGEiIDogewogICAgICAgICJtb2RlbCIgOiAic2xpbSIKICAgICAgfQogICAgfQogIH0KfQ==";
    }

}
