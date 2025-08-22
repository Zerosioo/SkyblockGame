package me.zero.skyblock.items.itemlist.NULL;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MYCELIUM_GENERATOR_4 extends SItem implements ItemStatistics, SkullItem {

    @Override
    public String getName() {
        return "Mycelium Minion IV";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "MYCELIUM_GENERATOR_4"; 
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
    public String getTexture() {
        return "ewogICJ0aW1lc3RhbXAiIDogMTYzODk3MzIzMzYwNCwKICAicHJvZmlsZUlkIiA6ICJlNzkzYjJjYTdhMmY0MTI2YTA5ODA5MmQ3Yzk5NDE3YiIsCiAgInByb2ZpbGVOYW1lIiA6ICJUaGVfSG9zdGVyX01hbiIsCiAgInNpZ25hdHVyZVJlcXVpcmVkIiA6IHRydWUsCiAgInRleHR1cmVzIiA6IHsKICAgICJTS0lOIiA6IHsKICAgICAgInVybCIgOiAiaHR0cDovL3RleHR1cmVzLm1pbmVjcmFmdC5uZXQvdGV4dHVyZS81ODNkN2Q1ZTUyMzQyMDkxYWRkNWIwYWU0OTkyYzY1ZDU5OWFkNTZmOWQ5NzlmNzNiMTBkNjhmMDlkMjBkZGJjIgogICAgfQogIH0KfQ==";
    }

}
