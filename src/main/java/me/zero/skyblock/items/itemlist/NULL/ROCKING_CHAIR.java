package me.zero.skyblock.items.itemlist.NULL;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ROCKING_CHAIR extends SItem implements ItemStatistics, SkullItem {

    @Override
    public String getName() {
        return "Rocking Chair";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "ROCKING_CHAIR"; 
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
        return "ewogICJ0aW1lc3RhbXAiIDogMTY2NzQyMDAzMDUxMywKICAicHJvZmlsZUlkIiA6ICIxMTI2MTc3NTNhNTM0MjJkYTU1YmI0ODg1NjY4NTMxMiIsCiAgInByb2ZpbGVOYW1lIiA6ICJEaWFtb25kX0JveUJFIiwKICAic2lnbmF0dXJlUmVxdWlyZWQiIDogdHJ1ZSwKICAidGV4dHVyZXMiIDogewogICAgIlNLSU4iIDogewogICAgICAidXJsIiA6ICJodHRwOi8vdGV4dHVyZXMubWluZWNyYWZ0Lm5ldC90ZXh0dXJlLzMwMGZjNzJlOTBiNzQ4ZGMyOTM2YzQwOTNkNjJhMjJmZWY5YzkzN2VmODNjNzBjYTc2YmNkNTAwYjQ0MjFjMGIiCiAgICB9CiAgfQp9";
    }

}
