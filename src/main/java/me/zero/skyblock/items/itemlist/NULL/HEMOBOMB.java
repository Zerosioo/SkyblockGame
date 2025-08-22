package me.zero.skyblock.items.itemlist.NULL;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class HEMOBOMB extends SItem implements ItemStatistics, SkullItem, Sellable {

    @Override
    public String getName() {
        return "Hemobomb";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "HEMOBOMB"; 
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
        return 240000;
    }

    @Override
    public String getTexture() {
        return "ewogICJ0aW1lc3RhbXAiIDogMTY2MDQ4NzMyNjMxNSwKICAicHJvZmlsZUlkIiA6ICJlM2I0NDVjODQ3ZjU0OGZiOGM4ZmEzZjFmN2VmYmE4ZSIsCiAgInByb2ZpbGVOYW1lIiA6ICJNaW5pRGlnZ2VyVGVzdCIsCiAgInNpZ25hdHVyZVJlcXVpcmVkIiA6IHRydWUsCiAgInRleHR1cmVzIiA6IHsKICAgICJTS0lOIiA6IHsKICAgICAgInVybCIgOiAiaHR0cDovL3RleHR1cmVzLm1pbmVjcmFmdC5uZXQvdGV4dHVyZS85MDk4NzhiN2VjMjM5YmMxNTg2ZTIyMGI2YzEzMzdkMjI2MjY4ZWQ5OWQxMWZmZWMwMmRmZTNlNjBjY2I3MDYwIgogICAgfQogIH0KfQ==";
    }

}
