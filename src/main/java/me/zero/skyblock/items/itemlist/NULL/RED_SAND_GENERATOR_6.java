package me.zero.skyblock.items.itemlist.NULL;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RED_SAND_GENERATOR_6 extends SItem implements ItemStatistics, SkullItem {

    @Override
    public String getName() {
        return "Red Sand Minion VI";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "RED_SAND_GENERATOR_6"; 
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
        return "ewogICJ0aW1lc3RhbXAiIDogMTYzODk2MzMwNzMyMywKICAicHJvZmlsZUlkIiA6ICJmODJmNTQ1MDIzZDA0MTFkYmVlYzU4YWI4Y2JlMTNjNyIsCiAgInByb2ZpbGVOYW1lIiA6ICJSZXNwb25kZW50cyIsCiAgInNpZ25hdHVyZVJlcXVpcmVkIiA6IHRydWUsCiAgInRleHR1cmVzIiA6IHsKICAgICJTS0lOIiA6IHsKICAgICAgInVybCIgOiAiaHR0cDovL3RleHR1cmVzLm1pbmVjcmFmdC5uZXQvdGV4dHVyZS8yNGE5Y2I3M2NhMDllNTgzOGZlY2NhZTNjZDJmYTcxOTMyN2Q3NDNmMTg5MTMwNWI2YzBhODUzOGM0ZmU5YzQxIgogICAgfQogIH0KfQ==";
    }

}
