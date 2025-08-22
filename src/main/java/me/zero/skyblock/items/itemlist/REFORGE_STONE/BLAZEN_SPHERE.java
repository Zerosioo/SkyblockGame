package me.zero.skyblock.items.itemlist.REFORGE_STONE;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BLAZEN_SPHERE extends SItem implements ItemStatistics, SkullItem {

    @Override
    public String getName() {
        return "Blazen Sphere";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "BLAZEN_SPHERE"; 
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
        return ItemType.REFORGE_STONE;
    }

    @Override
    public Rarity getRarity() {
        return Rarity.RARE;
    }

    @Override
    public String getTexture() {
        return "ewogICJ0aW1lc3RhbXAiIDogMTYyNjQ1ODU1MTcxMiwKICAicHJvZmlsZUlkIiA6ICJjNmE2N2QwMmY4MGM0MjhmODYyNmQ5MjhlOTNjN2FjNyIsCiAgInByb2ZpbGVOYW1lIiA6ICJHaW92YW5uaVdpamF5YSIsCiAgInNpZ25hdHVyZVJlcXVpcmVkIiA6IHRydWUsCiAgInRleHR1cmVzIiA6IHsKICAgICJTS0lOIiA6IHsKICAgICAgInVybCIgOiAiaHR0cDovL3RleHR1cmVzLm1pbmVjcmFmdC5uZXQvdGV4dHVyZS9iNzI2NWRlYTUzODNhMDVjN2M1YzFiMmE1OTVkMDNmODU4OTEzNWUzN2E3MTBjMzkzNWQ3YmNjNWJlMWI0NWVhIgogICAgfQogIH0KfQ==";
    }

}
