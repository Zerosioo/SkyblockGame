package me.zero.skyblock.items.itemlist.CONSUMABLE;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DWARVEN_OS_BLOCK_BRAN extends SItem implements ItemStatistics, SkullItem {

    @Override
    public String getName() {
        return "Dwarven O's Block Bran";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "DWARVEN_OS_BLOCK_BRAN"; 
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
        return ItemType.CONSUMABLE;
    }

    @Override
    public Rarity getRarity() {
        return Rarity.RARE;
    }

    @Override
    public boolean isStackable() {
        return false;
    }

    @Override
    public String getTexture() {
        return "ewogICJ0aW1lc3RhbXAiIDogMTcxNjQ5MTE0NDQzMSwKICAicHJvZmlsZUlkIiA6ICJhMmI1ZjhlM2MxZDI0ZmUzYTlkMzNiZTFhNzEzYTUwYiIsCiAgInByb2ZpbGVOYW1lIiA6ICJOYXBpb0dvZCIsCiAgInNpZ25hdHVyZVJlcXVpcmVkIiA6IHRydWUsCiAgInRleHR1cmVzIiA6IHsKICAgICJTS0lOIiA6IHsKICAgICAgInVybCIgOiAiaHR0cDovL3RleHR1cmVzLm1pbmVjcmFmdC5uZXQvdGV4dHVyZS80ZjZiZGRiYTFlM2QwMTRmYzc1ZTcwZTI3MjIzY2EzMGNiZmE0Mjk5MGQ0NDhkOWE5NDBlNTAwYTY0MzViZWMiCiAgICB9CiAgfQp9";
    }

}
