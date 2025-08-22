package me.zero.skyblock.items.itemlist.ACCESSORY;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PESTHUNTER_ARTIFACT extends SItem implements ItemStatistics, SkullItem {

    @Override
    public String getName() {
        return "Pesthunter Artifact";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "PESTHUNTER_ARTIFACT"; 
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
        return Rarity.EPIC;
    }

    @Override
    public String getTexture() {
        return "ewogICJ0aW1lc3RhbXAiIDogMTY5OTU4Njk4NjYzMiwKICAicHJvZmlsZUlkIiA6ICJkMjdhNDM3YmI2OWQ0N2E0OTY4NjU1OGFhYzA4NzA1OCIsCiAgInByb2ZpbGVOYW1lIiA6ICJEYWx5bmthYSIsCiAgInNpZ25hdHVyZVJlcXVpcmVkIiA6IHRydWUsCiAgInRleHR1cmVzIiA6IHsKICAgICJTS0lOIiA6IHsKICAgICAgInVybCIgOiAiaHR0cDovL3RleHR1cmVzLm1pbmVjcmFmdC5uZXQvdGV4dHVyZS9iM2FlZmQ4YmNhMjM2ZDMxNTkyMGQ1M2JlYTFmZTQ4OTJjOGYxZjMwOGQ2ZDU3NjMwNjc3ZjA1OWEzYjAyOTNmIgogICAgfQogIH0KfQ==";
    }

}
