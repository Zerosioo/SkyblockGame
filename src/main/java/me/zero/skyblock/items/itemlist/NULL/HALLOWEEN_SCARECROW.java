package me.zero.skyblock.items.itemlist.NULL;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class HALLOWEEN_SCARECROW extends SItem implements ItemStatistics, SkullItem {

    @Override
    public String getName() {
        return "Halloween Scarecrow";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "HALLOWEEN_SCARECROW"; 
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
        return "ewogICJ0aW1lc3RhbXAiIDogMTY2MzUyNjg4MzExNywKICAicHJvZmlsZUlkIiA6ICI0NmY3N2NjNmQ2MjU0NjEzYjc2NmYyZDRmMDM2MzZhNiIsCiAgInByb2ZpbGVOYW1lIiA6ICJNaXNzV29sZiIsCiAgInNpZ25hdHVyZVJlcXVpcmVkIiA6IHRydWUsCiAgInRleHR1cmVzIiA6IHsKICAgICJTS0lOIiA6IHsKICAgICAgInVybCIgOiAiaHR0cDovL3RleHR1cmVzLm1pbmVjcmFmdC5uZXQvdGV4dHVyZS81MjU0ZjMzN2NkNjQzOTc5NzNhNmVlMTAzMjgzNWFkMWNmNDg2MWU3N2JkNmZhYWYwMDhjYjI2NjlmYjY4NWQ2IgogICAgfQogIH0KfQ==";
    }

}
