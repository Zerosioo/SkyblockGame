package me.zero.skyblock.items.itemlist.ACCESSORY;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CAMPFIRE_TALISMAN_6 extends SItem implements ItemStatistics, SkullItem {

    @Override
    public String getName() {
        return "Campfire Adept Badge";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "CAMPFIRE_TALISMAN_6"; 
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
        return ItemType.ACCESSORY;
    }

    @Override
    public Rarity getRarity() {
        return Rarity.UNCOMMON;
    }

    @Override
    public Soulbound getSoulbound() {
        return Soulbound.COOP;
    }

    @Override
    public String getTexture() {
        return "ewogICJ0aW1lc3RhbXAiIDogMTcxOTQ2NjM4NTkxMywKICAicHJvZmlsZUlkIiA6ICJlNGUxYmY5NzMwZWI0NDRhYmIyOGIxODgxN2Q0M2YzZSIsCiAgInByb2ZpbGVOYW1lIiA6ICJNSU1PR0FNRVMwMzIxIiwKICAic2lnbmF0dXJlUmVxdWlyZWQiIDogdHJ1ZSwKICAidGV4dHVyZXMiIDogewogICAgIlNLSU4iIDogewogICAgICAidXJsIiA6ICJodHRwOi8vdGV4dHVyZXMubWluZWNyYWZ0Lm5ldC90ZXh0dXJlL2RmNmM4ZDJmMjgwYjdjYmNmN2I4NzM1MjY3ODE5ZTE5M2FkYjEyMGI1NTJkNjAwOWVhYWExODQwYjhjNDlhMmMiCiAgICB9CiAgfQp9";
    }

}
