package me.zero.skyblock.items.itemlist.NULL;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class WATER_ORB extends SItem implements ItemStatistics, SkullItem, Sellable {

    @Override
    public String getName() {
        return "Water Orb";
    }

    @Override
    public List<String> getLore() {
        return new ArrayList(Arrays.asList("A perfectly smooth,","highly condensed orb","of pure fish matter.","","Used as a core","ingredient in high","level fishing","crafts.","","§8Smells like","§8fish...")); 
    }

    @Override
    public String getId() {
        return "WATER_ORB"; 
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
    public int getPrice() {
        return 3000;
    }

    @Override
    public String getTexture() {
        return "ewogICJ0aW1lc3RhbXAiIDogMTU5NTUyMjM1MDExNCwKICAicHJvZmlsZUlkIiA6ICI1OTgzZjkxY2UzY2M0MzdjYjc0ZTZlMTJmNWY0YzNlZCIsCiAgInByb2ZpbGVOYW1lIiA6ICJOaW5nYV9LaXR0eSIsCiAgInNpZ25hdHVyZVJlcXVpcmVkIiA6IHRydWUsCiAgInRleHR1cmVzIiA6IHsKICAgICJTS0lOIiA6IHsKICAgICAgInVybCIgOiAiaHR0cDovL3RleHR1cmVzLm1pbmVjcmFmdC5uZXQvdGV4dHVyZS8yNGMyMmI4ZGYwYTg1M2E0OWNiODJlOTBhNjE4ZDY1MDEyMTIyMzYxYzgzOTgwNjJmY2JhZjc0ZDU2OTZjMmE5IgogICAgfQogIH0KfQ==";
    }

}
