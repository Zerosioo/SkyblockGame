package me.zero.skyblock.items.itemlist.ACCESSORY;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GANACHE_CHOCOLATE_SLAB extends SItem implements ItemStatistics, SkullItem {

    @Override
    public String getName() {
        return "Ganache Chocolate Slab";
    }

    @Override
    public List<String> getLore() {
        return new ArrayList(Arrays.asList("§8§oA Factory","§8§omasterpiece -","§8§oits divine taste","§8§otranscends","§8§oreality,","§8§ooffering a","§8§oheavenly escape.")); 
    }

    @Override
    public String getId() {
        return "GANACHE_CHOCOLATE_SLAB"; 
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
        return ItemType.ACCESSORY;
    }

    @Override
    public Rarity getRarity() {
        return Rarity.EPIC;
    }

    @Override
    public String getTexture() {
        return "ewogICJ0aW1lc3RhbXAiIDogMTcxMTQ2MjQ4OTQxNywKICAicHJvZmlsZUlkIiA6ICJkNzJlNGJjZDIyZGI0NjQ4OTUxNTc0M2UyYTRmMWFjMCIsCiAgInByb2ZpbGVOYW1lIiA6ICJhdnZheSIsCiAgInNpZ25hdHVyZVJlcXVpcmVkIiA6IHRydWUsCiAgInRleHR1cmVzIiA6IHsKICAgICJTS0lOIiA6IHsKICAgICAgInVybCIgOiAiaHR0cDovL3RleHR1cmVzLm1pbmVjcmFmdC5uZXQvdGV4dHVyZS9mODk1MTIzMzFlZGZkYzI3Y2I3ZDRlODBmM2UwZGI0NjBkMDVjYWY2NmM3YzFjNDJlMGU3MTIxMzBhOWI2OTAiCiAgICB9CiAgfQp9";
    }

}
