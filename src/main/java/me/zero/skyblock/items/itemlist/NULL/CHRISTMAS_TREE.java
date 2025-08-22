package me.zero.skyblock.items.itemlist.NULL;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CHRISTMAS_TREE extends SItem implements ItemStatistics, SkullItem {

    @Override
    public String getName() {
        return "Christmas Tree";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "CHRISTMAS_TREE"; 
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
        return "ewogICJ0aW1lc3RhbXAiIDogMTYwNTAzMjQ4MDQ2MywKICAicHJvZmlsZUlkIiA6ICJhYzczNzMyYmEzZTY0M2IxODE2ZDA2MDQ0M2U3ODhkOCIsCiAgInByb2ZpbGVOYW1lIiA6ICJUZXhXYXJkIiwKICAic2lnbmF0dXJlUmVxdWlyZWQiIDogdHJ1ZSwKICAidGV4dHVyZXMiIDogewogICAgIlNLSU4iIDogewogICAgICAidXJsIiA6ICJodHRwOi8vdGV4dHVyZXMubWluZWNyYWZ0Lm5ldC90ZXh0dXJlLzIxNWJhMzFjZGUyNjcxYjhmMTc2ZGU2YTlmZmQwMDgwMzVmMDU5MGQ2M2VlMjQwYmU2ZTg5MjFjZDIwMzdhNDUiCiAgICB9CiAgfQp9";
    }

}
