package me.zero.skyblock.items.itemlist.HELMET;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class INFERNAL_AURORA_HELMET extends SItem implements ItemStatistics, SkullItem {

    @Override
    public String getName() {
        return "Infernal Aurora Helmet";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "INFERNAL_AURORA_HELMET"; 
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
        return ItemType.HELMET;
    }

    @Override
    public Rarity getRarity() {
        return Rarity.LEGENDARY;
    }

    @Override
    public int getHealth() {
        return 403;
    }

    @Override
    public int getDefense() {
        return 126;
    }

    @Override
    public int getIntelligence() {
        return 479;
    }

    @Override
    public double getAbilityDamage() {
        return 40.0;
    }

    @Override
    public String getTexture() {
        return "ewogICJ0aW1lc3RhbXAiIDogMTY0NTUwNDQ1MDU0MCwKICAicHJvZmlsZUlkIiA6ICJjNTZlMjI0MmNiZWY0MWE2ODdlMzI2MGRjMGNmOTM2MSIsCiAgInByb2ZpbGVOYW1lIiA6ICJMSlI3MzEwMCIsCiAgInNpZ25hdHVyZVJlcXVpcmVkIiA6IHRydWUsCiAgInRleHR1cmVzIiA6IHsKICAgICJTS0lOIiA6IHsKICAgICAgInVybCIgOiAiaHR0cDovL3RleHR1cmVzLm1pbmVjcmFmdC5uZXQvdGV4dHVyZS8yY2MzZWE1MzQ1YzI4OGMyNGYxYWE3ZGQ4ZmM2MzI5NTU5N2QzZmIzNzRlMzE0ZjYwNTY0MGI4ZGVhMDZmZTNmIgogICAgfQogIH0KfQ==";
    }

}
