package me.zero.skyblock.items.itemlist.NULL;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LIFE_PRESERVER extends SItem implements ItemStatistics, SkullItem {

    @Override
    public String getName() {
        return "Life Preserver";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "LIFE_PRESERVER"; 
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
    public String getTexture() {
        return "ewogICJ0aW1lc3RhbXAiIDogMTY1MDg4ODc5MzM1OCwKICAicHJvZmlsZUlkIiA6ICJjNzQ1Mzc4MDY5MzY0ODg2ODkwNzRkOTQ3ZjBlOTlmNCIsCiAgInByb2ZpbGVOYW1lIiA6ICJjdWN1bWkwNyIsCiAgInNpZ25hdHVyZVJlcXVpcmVkIiA6IHRydWUsCiAgInRleHR1cmVzIiA6IHsKICAgICJTS0lOIiA6IHsKICAgICAgInVybCIgOiAiaHR0cDovL3RleHR1cmVzLm1pbmVjcmFmdC5uZXQvdGV4dHVyZS80MTU4ODRkMTM0MzNmYmQxYWEwNGQ4MTVmMTlmNDA2MDdlNmIxOGI1YzQxZmQzMWJiMWNkMTBiMTJjM2U2Y2NlIgogICAgfQogIH0KfQ==";
    }

}
