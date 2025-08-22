package me.zero.skyblock.items.itemlist.NULL;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class REINDEER_PLUSH extends SItem implements ItemStatistics, SkullItem {

    @Override
    public String getName() {
        return "Reindeer Plush";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "REINDEER_PLUSH"; 
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
        return "ewogICJ0aW1lc3RhbXAiIDogMTYzNTQ0Njg0MDYxMiwKICAicHJvZmlsZUlkIiA6ICJmMjc0YzRkNjI1MDQ0ZTQxOGVmYmYwNmM3NWIyMDIxMyIsCiAgInByb2ZpbGVOYW1lIiA6ICJIeXBpZ3NlbCIsCiAgInNpZ25hdHVyZVJlcXVpcmVkIiA6IHRydWUsCiAgInRleHR1cmVzIiA6IHsKICAgICJTS0lOIiA6IHsKICAgICAgInVybCIgOiAiaHR0cDovL3RleHR1cmVzLm1pbmVjcmFmdC5uZXQvdGV4dHVyZS9hNWExMDljNzQ2MDk0ZDVkZWIxYjZmYjExODlmZWRmNzA5MTJhNzI3YjY5MmRmMWIwN2IyNzQzOGRhMTg1OGIwIgogICAgfQogIH0KfQ==";
    }

}
