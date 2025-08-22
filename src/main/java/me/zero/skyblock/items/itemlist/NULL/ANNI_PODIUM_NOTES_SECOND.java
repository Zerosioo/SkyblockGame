package me.zero.skyblock.items.itemlist.NULL;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ANNI_PODIUM_NOTES_SECOND extends SItem implements ItemStatistics, SkullItem {

    @Override
    public String getName() {
        return "10th Anniversary Podium";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "ANNI_PODIUM_NOTES_SECOND"; 
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
    public boolean isStackable() {
        return false;
    }

    @Override
    public Soulbound getSoulbound() {
        return Soulbound.COOP;
    }

    @Override
    public String getTexture() {
        return "ewogICJ0aW1lc3RhbXAiIDogMTY4MTUwMTg1MTQ2MywKICAicHJvZmlsZUlkIiA6ICJhOGJhMGY1YTFmNjQ0MTgzODZkZGI3OWExZmY5ZWRlYyIsCiAgInByb2ZpbGVOYW1lIiA6ICJDcmVlcGVyOTA3NSIsCiAgInNpZ25hdHVyZVJlcXVpcmVkIiA6IHRydWUsCiAgInRleHR1cmVzIiA6IHsKICAgICJTS0lOIiA6IHsKICAgICAgInVybCIgOiAiaHR0cDovL3RleHR1cmVzLm1pbmVjcmFmdC5uZXQvdGV4dHVyZS9iYzIyYmE1OWUxMDhlOGI0MGJmYzdiNjYxZTI5ZjMyNDBhMWU1NTI4OTY1MzFmM2YyZDNjYzZjYzliZWNlODk2IgogICAgfQogIH0KfQ==";
    }

}
