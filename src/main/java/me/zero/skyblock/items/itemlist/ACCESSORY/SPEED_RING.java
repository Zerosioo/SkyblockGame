package me.zero.skyblock.items.itemlist.ACCESSORY;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SPEED_RING extends SItem implements ItemStatistics, SkullItem, Sellable {

    @Override
    public String getName() {
        return "Speed Ring";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "SPEED_RING"; 
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
        return Rarity.UNCOMMON;
    }

    @Override
    public int getPrice() {
        return 18000;
    }

    @Override
    public int getSpeed() {
        return 3;
    }

    @Override
    public String getTexture() {
        return "ewogICJ0aW1lc3RhbXAiIDogMTU5MDA5MDE0NzQ3OSwKICAicHJvZmlsZUlkIiA6ICJjOTU4YTRiMWY4OGU0ZGVjOTI3NGVlMGQ3Nzg2ZGFkYSIsCiAgInByb2ZpbGVOYW1lIiA6ICJBbHNvRGN0ciIsCiAgInNpZ25hdHVyZVJlcXVpcmVkIiA6IHRydWUsCiAgInRleHR1cmVzIiA6IHsKICAgICJTS0lOIiA6IHsKICAgICAgInVybCIgOiAiaHR0cDovL3RleHR1cmVzLm1pbmVjcmFmdC5uZXQvdGV4dHVyZS9jMmRhNDBhOTFmOGZhN2UxY2JkZDkzNGRhOTJhNzY2OGRjOTVkNzViNTdjOWM4MGEzODFjNWUxNzhjZWU2YmE3IgogICAgfQogIH0KfQ==";
    }

}
