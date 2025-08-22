package me.zero.skyblock.items.itemlist.NULL;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FAKE_NEUROSCIENCE_DEGREE extends SItem implements ItemStatistics, SkullItem {

    @Override
    public String getName() {
        return "Fake Neuroscience Degree";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "FAKE_NEUROSCIENCE_DEGREE"; 
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
        return Rarity.RARE;
    }

    @Override
    public boolean isStackable() {
        return false;
    }

    @Override
    public Soulbound getSoulbound() {
        return Soulbound.SOLO;
    }

    @Override
    public String getTexture() {
        return "ewogICJ0aW1lc3RhbXAiIDogMTY0MTQ4NzkwNTk3NCwKICAicHJvZmlsZUlkIiA6ICIyMWUzNjdkNzI1Y2Y0ZTNiYjI2OTJjNGEzMDBhNGRlYiIsCiAgInByb2ZpbGVOYW1lIiA6ICJHZXlzZXJNQyIsCiAgInNpZ25hdHVyZVJlcXVpcmVkIiA6IHRydWUsCiAgInRleHR1cmVzIiA6IHsKICAgICJTS0lOIiA6IHsKICAgICAgInVybCIgOiAiaHR0cDovL3RleHR1cmVzLm1pbmVjcmFmdC5uZXQvdGV4dHVyZS9kNzc4MzI4MmUxNzEzNjJjZDM2ZTQzZGZlN2IxYjBkNmM2ZTlkYTQyY2I1NTMzZDI5MmE5NTc5YTY0NDU3MDk1IgogICAgfQogIH0KfQ==";
    }

}
