package me.zero.skyblock.items.itemlist.NULL;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class STEAMED_CHOCOLATE_FISH extends SItem implements ItemStatistics, SkullItem {

    @Override
    public String getName() {
        return "Fish Chocolat à la Vapeur";
    }

    @Override
    public List<String> getLore() {
        return new ArrayList(Arrays.asList("§8§oSavory fish with","§8§oa chocolate","§8§otwist. Mwah!","§8§oC'est","§8§omagnifique, no?")); 
    }

    @Override
    public String getId() {
        return "STEAMED_CHOCOLATE_FISH"; 
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
    public String getTexture() {
        return "ewogICJ0aW1lc3RhbXAiIDogMTcxNDk1OTAwNzUwOSwKICAicHJvZmlsZUlkIiA6ICJiZmMyODE3ZWRhZWM0OWY5YTVmMWVkNTdjODZhMGFjOSIsCiAgInByb2ZpbGVOYW1lIiA6ICJFYm95UmV6YSIsCiAgInNpZ25hdHVyZVJlcXVpcmVkIiA6IHRydWUsCiAgInRleHR1cmVzIiA6IHsKICAgICJTS0lOIiA6IHsKICAgICAgInVybCIgOiAiaHR0cDovL3RleHR1cmVzLm1pbmVjcmFmdC5uZXQvdGV4dHVyZS80MjJiMGU1ZmFhOTdjYTEwOWNkNDVmMWZiYTJkODRjYTJiOWI2MDFkZTUwYjQ3ZjRhZGQyZDgzNWFhMzYwZjc4IgogICAgfQogIH0KfQ==";
    }

}
