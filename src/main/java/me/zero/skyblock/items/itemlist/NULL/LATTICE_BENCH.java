package me.zero.skyblock.items.itemlist.NULL;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LATTICE_BENCH extends SItem implements ItemStatistics, SkullItem {

    @Override
    public String getName() {
        return "Lattice Bench";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "LATTICE_BENCH"; 
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
    public String getTexture() {
        return "ewogICJ0aW1lc3RhbXAiIDogMTYwODQxMzc0NDQwNSwKICAicHJvZmlsZUlkIiA6ICIxYWZhZjc2NWI1ZGY0NjA3YmY3ZjY1ZGYzYWIwODhhOCIsCiAgInByb2ZpbGVOYW1lIiA6ICJMb3lfQmxvb2RBbmdlbCIsCiAgInNpZ25hdHVyZVJlcXVpcmVkIiA6IHRydWUsCiAgInRleHR1cmVzIiA6IHsKICAgICJTS0lOIiA6IHsKICAgICAgInVybCIgOiAiaHR0cDovL3RleHR1cmVzLm1pbmVjcmFmdC5uZXQvdGV4dHVyZS85ZDUzM2ViMjA4NWFhNDczMmEyNzZkMWM2ZTVhMGU1ZTNjNWI0ZDY3ZTAxMzJiNWNjNzUzZDdmMDE1MjNhZGYzIgogICAgfQogIH0KfQ==";
    }

}
