package me.zero.skyblock.items.itemlist.NULL;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MYCELIUM_GENERATOR_7 extends SItem implements ItemStatistics, SkullItem {

    @Override
    public String getName() {
        return "Mycelium Minion VII";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "MYCELIUM_GENERATOR_7"; 
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
        return "ewogICJ0aW1lc3RhbXAiIDogMTYzODk3MzI4NzY5NiwKICAicHJvZmlsZUlkIiA6ICI0M2NmNWJkNjUyMDM0YzU5ODVjMDIwYWI3NDE0OGQxYiIsCiAgInByb2ZpbGVOYW1lIiA6ICJrYW1pbDQ0NSIsCiAgInNpZ25hdHVyZVJlcXVpcmVkIiA6IHRydWUsCiAgInRleHR1cmVzIiA6IHsKICAgICJTS0lOIiA6IHsKICAgICAgInVybCIgOiAiaHR0cDovL3RleHR1cmVzLm1pbmVjcmFmdC5uZXQvdGV4dHVyZS8yNDcyYTRkMTFiYzkzZjIyNDYyNTAxMTZiNDY5MDBkZWY1YzQ3MzExODJiMzc0ZjQ0NDRjNDliMzM5MjhlMmUiCiAgICB9CiAgfQp9";
    }

}
