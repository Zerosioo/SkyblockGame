package me.zero.skyblock.items.itemlist.NULL;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GARDEN_SACK extends SItem implements ItemStatistics, SkullItem {

    @Override
    public String getName() {
        return "Garden Sack";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "GARDEN_SACK"; 
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
    public boolean isStackable() {
        return false;
    }

    @Override
    public String getTexture() {
        return "ewogICJ0aW1lc3RhbXAiIDogMTY5OTM2ODc2Nzk4OCwKICAicHJvZmlsZUlkIiA6ICJiZDNhNWRmY2ZkZjg0NDczOTViZDJiZmUwNGY0YzAzMiIsCiAgInByb2ZpbGVOYW1lIiA6ICJwcmVja3Jhc25vIiwKICAic2lnbmF0dXJlUmVxdWlyZWQiIDogdHJ1ZSwKICAidGV4dHVyZXMiIDogewogICAgIlNLSU4iIDogewogICAgICAidXJsIiA6ICJodHRwOi8vdGV4dHVyZXMubWluZWNyYWZ0Lm5ldC90ZXh0dXJlLzE4NDcxMmVjYmYxYzZjZTlkZTEyMzBiZmEwNTgzMWFhM2M1ZDBlZTlkMWJhNTlkZWVmN2EzMWNhZmQ3ZDhlZjMiLAogICAgICAibWV0YWRhdGEiIDogewogICAgICAgICJtb2RlbCIgOiAic2xpbSIKICAgICAgfQogICAgfQogIH0KfQ==";
    }

}
