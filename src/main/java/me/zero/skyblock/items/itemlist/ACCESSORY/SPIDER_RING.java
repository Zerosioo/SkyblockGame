package me.zero.skyblock.items.itemlist.ACCESSORY;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SPIDER_RING extends SItem implements ItemStatistics, SkullItem {

    @Override
    public String getName() {
        return "Spider Ring";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "SPIDER_RING"; 
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
    public String getTexture() {
        return "ewogICJ0aW1lc3RhbXAiIDogMTcyMDA0MTk0ODQ2OSwKICAicHJvZmlsZUlkIiA6ICJiNzQ4YWExODk3ZGU0Y2RiYjFhNTI1YjVjMjM3ZDc2MiIsCiAgInByb2ZpbGVOYW1lIiA6ICJUaXhpOCIsCiAgInNpZ25hdHVyZVJlcXVpcmVkIiA6IHRydWUsCiAgInRleHR1cmVzIiA6IHsKICAgICJTS0lOIiA6IHsKICAgICAgInVybCIgOiAiaHR0cDovL3RleHR1cmVzLm1pbmVjcmFmdC5uZXQvdGV4dHVyZS82MDRhZGEyMjEyYTM4ZTY3YjZkYmFkMmQxNTZlZTExMGM1NDZkYmZkNzE2NWI3ZjUwYjhlYzE3ZmYyMjRkYmE1IgogICAgfQogIH0KfQ==";
    }

}
