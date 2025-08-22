package me.zero.skyblock.items.itemlist.COSMETIC;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SAND_CASTLE_BARN_SKIN extends SItem implements ItemStatistics, SkullItem {

    @Override
    public String getName() {
        return "Sand Castle Barn Skin";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "SAND_CASTLE_BARN_SKIN"; 
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
    public String getTexture() {
        return "ewogICJ0aW1lc3RhbXAiIDogMTcxOTMzMzY0MjE3NCwKICAicHJvZmlsZUlkIiA6ICIzZDU1OGQ3Y2NmZjk0ODdkYWE1MzhkMjM4NGE3OWFkZCIsCiAgInByb2ZpbGVOYW1lIiA6ICJDcnlwdGljTG9zZXIxMyIsCiAgInNpZ25hdHVyZVJlcXVpcmVkIiA6IHRydWUsCiAgInRleHR1cmVzIiA6IHsKICAgICJTS0lOIiA6IHsKICAgICAgInVybCIgOiAiaHR0cDovL3RleHR1cmVzLm1pbmVjcmFmdC5uZXQvdGV4dHVyZS9jODU0M2M5NjFjYzUzMWI5MDZjZTRmYTQ1YzNjNGZjZWE3MmQ3MDI5MWQ1MTdlMDFmMTRkNDkwNWE2ODYxMzliIgogICAgfQogIH0KfQ==";
    }

}
