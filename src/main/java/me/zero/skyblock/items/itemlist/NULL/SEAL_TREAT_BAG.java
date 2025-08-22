package me.zero.skyblock.items.itemlist.NULL;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SEAL_TREAT_BAG extends SItem implements ItemStatistics, SkullItem {

    @Override
    public String getName() {
        return "Seal's Treat Bag";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "SEAL_TREAT_BAG"; 
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
        return Rarity.UNCOMMON;
    }

    @Override
    public String getTexture() {
        return "ewogICJ0aW1lc3RhbXAiIDogMTczNjQyNzYxODU1MSwKICAicHJvZmlsZUlkIiA6ICI2OTE1MGMxMTk3M2E0MGViOGExNjZiNTY5OThmNWEzMiIsCiAgInByb2ZpbGVOYW1lIiA6ICJMeXgyIiwKICAic2lnbmF0dXJlUmVxdWlyZWQiIDogdHJ1ZSwKICAidGV4dHVyZXMiIDogewogICAgIlNLSU4iIDogewogICAgICAidXJsIiA6ICJodHRwOi8vdGV4dHVyZXMubWluZWNyYWZ0Lm5ldC90ZXh0dXJlLzI0YmRiMDlhNDVkMTc3MTQ5ZDI5ZTRlMGZkOWNjY2ZkNGMyYmMxMTAxNzVkOTZjYmExZDVkOTNlNTI2Y2M4MGYiCiAgICB9CiAgfQp9";
    }

}
