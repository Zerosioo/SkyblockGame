package me.zero.skyblock.items.itemlist.COSMETIC;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GREEN_EGG extends SItem implements ItemStatistics, SkullItem {

    @Override
    public String getName() {
        return "Green Egged Skin";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "GREEN_EGG"; 
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
        return ItemType.COSMETIC;
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
        return "ewogICJ0aW1lc3RhbXAiIDogMTYxNzQwODA1MDc5NCwKICAicHJvZmlsZUlkIiA6ICIxYWZhZjc2NWI1ZGY0NjA3YmY3ZjY1ZGYzYWIwODhhOCIsCiAgInByb2ZpbGVOYW1lIiA6ICJMb3lfQmxvb2RBbmdlbCIsCiAgInNpZ25hdHVyZVJlcXVpcmVkIiA6IHRydWUsCiAgInRleHR1cmVzIiA6IHsKICAgICJTS0lOIiA6IHsKICAgICAgInVybCIgOiAiaHR0cDovL3RleHR1cmVzLm1pbmVjcmFmdC5uZXQvdGV4dHVyZS84Yjg4ZTg0ZGQyM2U5NTE1M2M5YTdjMjFhZTliYTMzZmJlZjg1Y2I3NzA0Zjk3NjE2Y2QxMjI2ODE2NGM2MDhlIgogICAgfQogIH0KfQ==";
    }

}
