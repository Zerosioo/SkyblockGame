package me.zero.skyblock.items.itemlist.ACCESSORY;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SPEED_ARTIFACT extends SItem implements ItemStatistics, SkullItem, Sellable {

    @Override
    public String getName() {
        return "Speed Artifact";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "SPEED_ARTIFACT"; 
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
    public int getPrice() {
        return 1400000;
    }

    @Override
    public int getSpeed() {
        return 5;
    }

    @Override
    public String getTexture() {
        return "ewogICJ0aW1lc3RhbXAiIDogMTU5MDA4OTk4MjM0MiwKICAicHJvZmlsZUlkIiA6ICJjOTU4YTRiMWY4OGU0ZGVjOTI3NGVlMGQ3Nzg2ZGFkYSIsCiAgInByb2ZpbGVOYW1lIiA6ICJBbHNvRGN0ciIsCiAgInNpZ25hdHVyZVJlcXVpcmVkIiA6IHRydWUsCiAgInRleHR1cmVzIiA6IHsKICAgICJTS0lOIiA6IHsKICAgICAgInVybCIgOiAiaHR0cDovL3RleHR1cmVzLm1pbmVjcmFmdC5uZXQvdGV4dHVyZS9mMDY3MDZlZWNiMmQ1NThhY2UyN2FiZGEwYjBiN2I4MDFkMzZkMTdkZDdhODkwYTk1MjBkYmU1MjIzNzRmOGE2IgogICAgfQogIH0KfQ==";
    }

}
