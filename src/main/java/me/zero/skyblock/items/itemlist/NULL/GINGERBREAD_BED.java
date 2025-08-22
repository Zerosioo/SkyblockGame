package me.zero.skyblock.items.itemlist.NULL;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GINGERBREAD_BED extends SItem implements ItemStatistics, SkullItem {

    @Override
    public String getName() {
        return "Gingerbread Bed";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "GINGERBREAD_BED"; 
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
        return Rarity.EPIC;
    }

    @Override
    public String getTexture() {
        return "ewogICJ0aW1lc3RhbXAiIDogMTczMDMwNjYzNjUyNCwKICAicHJvZmlsZUlkIiA6ICIyYThjZTE5ZWY3Mjg0NTBjYjY2YmEyNzNhNzVmNjI1MSIsCiAgInByb2ZpbGVOYW1lIiA6ICJYRDROVDNfNjY2IiwKICAic2lnbmF0dXJlUmVxdWlyZWQiIDogdHJ1ZSwKICAidGV4dHVyZXMiIDogewogICAgIlNLSU4iIDogewogICAgICAidXJsIiA6ICJodHRwOi8vdGV4dHVyZXMubWluZWNyYWZ0Lm5ldC90ZXh0dXJlLzRiZjJjMDFhY2I4MzRmMTEzNjEzYWZmYzU2MzY1ZGZkZWY5NTQyODliZmRlNjVkM2EzYzQyNDQzYjAxZjMyOTEiCiAgICB9CiAgfQp9";
    }

}
