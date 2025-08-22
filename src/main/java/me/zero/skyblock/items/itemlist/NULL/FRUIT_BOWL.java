package me.zero.skyblock.items.itemlist.NULL;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FRUIT_BOWL extends SItem implements ItemStatistics, SkullItem {

    @Override
    public String getName() {
        return "Fruit Bowl";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "FRUIT_BOWL"; 
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
    public String getTexture() {
        return "ewogICJ0aW1lc3RhbXAiIDogMTY4NzEzMzM3MTU2NywKICAicHJvZmlsZUlkIiA6ICI3NmRjOWY4OTI3Y2Q0NzY5OWQ2NmYzYjBjZTZlOTRmYSIsCiAgInByb2ZpbGVOYW1lIiA6ICJJQW1Ob3REcnVuayIsCiAgInNpZ25hdHVyZVJlcXVpcmVkIiA6IHRydWUsCiAgInRleHR1cmVzIiA6IHsKICAgICJTS0lOIiA6IHsKICAgICAgInVybCIgOiAiaHR0cDovL3RleHR1cmVzLm1pbmVjcmFmdC5uZXQvdGV4dHVyZS85YTE4YWY2NjVmODY1MmYxYmUzYWRjYjdkNzZlNmVlNjQzOWQyMGFlMDE4ZTllZGNjZTM4OTRiZjUxMzUwZWFkIgogICAgfQogIH0KfQ==";
    }

}
