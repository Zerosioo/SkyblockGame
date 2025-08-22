package me.zero.skyblock.items.itemlist.NULL;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AATROX_BADPHONE extends SItem implements ItemStatistics, SkullItem, Museum {

    @Override
    public String getName() {
        return "Maddox Badphone";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "AATROX_BADPHONE"; 
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
        return Rarity.RARE;
    }

    @Override
    public boolean isStackable() {
        return false;
    }

    @Override
    public boolean isMuseum() {
        return true;
    }

    @Override
    public Soulbound getSoulbound() {
        return Soulbound.COOP;
    }

    @Override
    public String getTexture() {
        return "ewogICJ0aW1lc3RhbXAiIDogMTY3Njk2Njc2NDgwNywKICAicHJvZmlsZUlkIiA6ICI2ZTIyNjYxZmNlMTI0MGE0YWE4OTA0NDA0NTFiYjBiNSIsCiAgInByb2ZpbGVOYW1lIiA6ICJncnZleWFyZCIsCiAgInNpZ25hdHVyZVJlcXVpcmVkIiA6IHRydWUsCiAgInRleHR1cmVzIiA6IHsKICAgICJTS0lOIiA6IHsKICAgICAgInVybCIgOiAiaHR0cDovL3RleHR1cmVzLm1pbmVjcmFmdC5uZXQvdGV4dHVyZS9lMDQwMTI0ZjIyYTg0Mjk2NmJlYjU1YzllNjk4ZmUzYTJjOGI3MTMxOTBjMjZlMDNkMzdmNDA3NGJkNTAzMDMxIgogICAgfQogIH0KfQ==";
    }

}
