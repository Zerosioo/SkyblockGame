package me.zero.skyblock.items.itemlist.ACCESSORY;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PURPLE_GIFT_TALISMAN extends SItem implements ItemStatistics, SkullItem {

    @Override
    public String getName() {
        return "Purple Gift Talisman";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "PURPLE_GIFT_TALISMAN"; 
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
        return Rarity.EPIC;
    }

    @Override
    public String getTexture() {
        return "ewogICJ0aW1lc3RhbXAiIDogMTY2OTUxNDE3ODQzMSwKICAicHJvZmlsZUlkIiA6ICJiMDU4MTFjYTdmNDk0YTM5OTZiNDU4ZjcwMmQ2MzJiOSIsCiAgInByb2ZpbGVOYW1lIiA6ICJVeWlsIiwKICAic2lnbmF0dXJlUmVxdWlyZWQiIDogdHJ1ZSwKICAidGV4dHVyZXMiIDogewogICAgIlNLSU4iIDogewogICAgICAidXJsIiA6ICJodHRwOi8vdGV4dHVyZXMubWluZWNyYWZ0Lm5ldC90ZXh0dXJlL2U5ZTM5ZDkxYzA0YzMwY2MxZjUzMGZlZTc5OGVlZDI3OWRkZTYwZjk1YzJlMWQxNTVjMGZkZDM2MWQwOTYyZWQiCiAgICB9CiAgfQp9";
    }

}
