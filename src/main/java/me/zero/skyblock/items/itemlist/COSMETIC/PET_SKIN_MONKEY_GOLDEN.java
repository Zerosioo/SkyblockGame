package me.zero.skyblock.items.itemlist.COSMETIC;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PET_SKIN_MONKEY_GOLDEN extends SItem implements ItemStatistics, SkullItem, Museum {

    @Override
    public String getName() {
        return "GoldenMonkey";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "PET_SKIN_MONKEY_GOLDEN"; 
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
        return Rarity.LEGENDARY;
    }

    @Override
    public boolean isStackable() {
        return false;
    }

    @Override
    public boolean isMuseum() {
        return true;
    }

    @Override
    public String getTexture() {
        return "ewogICJ0aW1lc3RhbXAiIDogMTYwNTk5Mzk0OTI2NCwKICAicHJvZmlsZUlkIiA6ICJjZGM5MzQ0NDAzODM0ZDdkYmRmOWUyMmVjZmM5MzBiZiIsCiAgInByb2ZpbGVOYW1lIiA6ICJSYXdMb2JzdGVycyIsCiAgInNpZ25hdHVyZVJlcXVpcmVkIiA6IHRydWUsCiAgInRleHR1cmVzIiA6IHsKICAgICJTS0lOIiA6IHsKICAgICAgInVybCIgOiAiaHR0cDovL3RleHR1cmVzLm1pbmVjcmFmdC5uZXQvdGV4dHVyZS9lOTI4MWM0ZDg3ZDY4NTI2YjA3NDlkNDM2MWU2ZWY3ODZjOGEzNTcxN2FhMDUzZGE3MDRiMWQ1MzQxMGQzN2E2IgogICAgfQogIH0KfQ==";
    }

}
