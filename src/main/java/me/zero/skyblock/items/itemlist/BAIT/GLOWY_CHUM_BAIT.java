package me.zero.skyblock.items.itemlist.BAIT;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GLOWY_CHUM_BAIT extends SItem implements ItemStatistics, SkullItem, Sellable {

    @Override
    public String getName() {
        return "Glowy Chum Bait";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "GLOWY_CHUM_BAIT"; 
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
        return ItemType.BAIT;
    }

    @Override
    public Rarity getRarity() {
        return Rarity.UNCOMMON;
    }

    @Override
    public int getPrice() {
        return 25;
    }

    @Override
    public String getTexture() {
        return "ewogICJ0aW1lc3RhbXAiIDogMTY2MTgwMDk0NzQxOSwKICAicHJvZmlsZUlkIiA6ICIzNmMxODk4ZjlhZGE0NjZlYjk0ZDFmZWFmMjQ0MTkxMyIsCiAgInByb2ZpbGVOYW1lIiA6ICJMdW5haWFuIiwKICAic2lnbmF0dXJlUmVxdWlyZWQiIDogdHJ1ZSwKICAidGV4dHVyZXMiIDogewogICAgIlNLSU4iIDogewogICAgICAidXJsIiA6ICJodHRwOi8vdGV4dHVyZXMubWluZWNyYWZ0Lm5ldC90ZXh0dXJlL2RmZGMxZWVkNjg0ZGQ4MDVlYWU5NmQxMzJlM2RhNTNkNjQyNjdkNzM2MTM4OGQ1ZTJjNjdmNTk2OTg3MWU3MWQiLAogICAgICAibWV0YWRhdGEiIDogewogICAgICAgICJtb2RlbCIgOiAic2xpbSIKICAgICAgfQogICAgfQogIH0KfQ==";
    }

}
