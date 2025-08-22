package me.zero.skyblock.items.itemlist.PORTAL;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DARK_AUCTION_PORTAL extends SItem implements ItemStatistics, SkullItem {

    @Override
    public String getName() {
        return "Portal to the Dark Auction";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "DARK_AUCTION_PORTAL"; 
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
        return ItemType.PORTAL;
    }

    @Override
    public Rarity getRarity() {
        return Rarity.COMMON;
    }

    @Override
    public String getTexture() {
        return "ewogICJ0aW1lc3RhbXAiIDogMTYwNjMzMzIyNzk2OCwKICAicHJvZmlsZUlkIiA6ICIyZTZjZTU3MDUzMTE0ZmRiYjc1OWM4NTJkY2VlOWU2MSIsCiAgInByb2ZpbGVOYW1lIiA6ICI3T2ZDbHVicyIsCiAgInNpZ25hdHVyZVJlcXVpcmVkIiA6IHRydWUsCiAgInRleHR1cmVzIiA6IHsKICAgICJTS0lOIiA6IHsKICAgICAgInVybCIgOiAiaHR0cDovL3RleHR1cmVzLm1pbmVjcmFmdC5uZXQvdGV4dHVyZS83YWI4Mzg1OGViYzhlZTg1YzNlNTRhYjEzYWFiZmNjMWVmMmFkNDQ2ZDZhOTAwZTQ3MWMzZjMzYjc4OTA2YTViIgogICAgfQogIH0KfQ==";
    }

}
