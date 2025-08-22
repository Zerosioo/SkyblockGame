package me.zero.skyblock.items.itemlist.ACCESSORY;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MASTER_SKULL_TIER_5 extends SItem implements ItemStatistics, SkullItem {

    @Override
    public String getName() {
        return "Master Skull - Tier 5";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "MASTER_SKULL_TIER_5"; 
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
        return Rarity.RARE;
    }

    @Override
    public boolean isDungeonItem() {
      	return true;
    }

    @Override
    public String getTexture() {
        return "ewogICJ0aW1lc3RhbXAiIDogMTY0NTg2MzU5NDY5MCwKICAicHJvZmlsZUlkIiA6ICI1YjY2YzNkZWZhYTI0NWMzYTcwNjM3OTA3NTQ0Yjg3MCIsCiAgInByb2ZpbGVOYW1lIiA6ICJSZWFuX1JhaWNvMDgxNiIsCiAgInNpZ25hdHVyZVJlcXVpcmVkIiA6IHRydWUsCiAgInRleHR1cmVzIiA6IHsKICAgICJTS0lOIiA6IHsKICAgICAgInVybCIgOiAiaHR0cDovL3RleHR1cmVzLm1pbmVjcmFmdC5uZXQvdGV4dHVyZS85MTBmOWYxMDg1ZDQwNzE0MWViNzc2MTdhNGFiZGFhYTA4ZDhhZjMzYjk2MDIwMGZlOGMxMjZjMWQxNDQ1NjgyIgogICAgfQogIH0KfQ==";
    }

}
