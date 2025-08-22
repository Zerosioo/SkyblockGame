package me.zero.skyblock.items.itemlist.ACCESSORY;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GOLD_GIFT_TALISMAN extends SItem implements ItemStatistics, SkullItem {

    @Override
    public String getName() {
        return "Gold Gift Talisman";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "GOLD_GIFT_TALISMAN"; 
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
        return ItemType.ACCESSORY;
    }

    @Override
    public Rarity getRarity() {
        return Rarity.LEGENDARY;
    }

    @Override
    public String getTexture() {
        return "ewogICJ0aW1lc3RhbXAiIDogMTY2OTUxNDE0NjQyNywKICAicHJvZmlsZUlkIiA6ICIxMzdmMjg3MjUwOTE0ZmI4YjA0ZTYwYjg4MWUwZWE2YiIsCiAgInByb2ZpbGVOYW1lIiA6ICJub3JtYWxpc2luZyIsCiAgInNpZ25hdHVyZVJlcXVpcmVkIiA6IHRydWUsCiAgInRleHR1cmVzIiA6IHsKICAgICJTS0lOIiA6IHsKICAgICAgInVybCIgOiAiaHR0cDovL3RleHR1cmVzLm1pbmVjcmFmdC5uZXQvdGV4dHVyZS9hYmQ5ODc5MmRkOTJkOTcxOTg5NDM0MWFjOTAxMmE1ODRjNDQyODU1OGZkMmM3MTJmNzhlNWYwZDRkYTg1NDcwIgogICAgfQogIH0KfQ==";
    }

}
