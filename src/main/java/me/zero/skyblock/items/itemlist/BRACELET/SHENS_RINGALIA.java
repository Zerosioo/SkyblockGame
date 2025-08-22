package me.zero.skyblock.items.itemlist.BRACELET;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SHENS_RINGALIA extends SItem implements ItemStatistics, SkullItem {

    @Override
    public String getName() {
        return "Shen's Ringalia";
    }

    @Override
    public List<String> getLore() {
        return new ArrayList(Arrays.asList("§7§oNo matter the","§7§oplace or when,","§7§oanyone marked by","§7§oShen will gain","§7§ocontrol.")); 
    }

    @Override
    public String getId() {
        return "SHENS_RINGALIA"; 
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
        return ItemType.BRACELET;
    }

    @Override
    public Rarity getRarity() {
        return Rarity.LEGENDARY;
    }

    @Override
    public Soulbound getSoulbound() {
        return Soulbound.SOLO;
    }

    @Override
    public String getTexture() {
        return "ewogICJ0aW1lc3RhbXAiIDogMTczMjEzNjgyNzM1NCwKICAicHJvZmlsZUlkIiA6ICI1MWI4MjcxNDE5YWE0NDA5YTFhNmU1OTcwYTc1MzgyNSIsCiAgInByb2ZpbGVOYW1lIiA6ICJYRHJha2U5OSIsCiAgInNpZ25hdHVyZVJlcXVpcmVkIiA6IHRydWUsCiAgInRleHR1cmVzIiA6IHsKICAgICJTS0lOIiA6IHsKICAgICAgInVybCIgOiAiaHR0cDovL3RleHR1cmVzLm1pbmVjcmFmdC5uZXQvdGV4dHVyZS9jZWJhZmIxMGUyOTliNDJjYzE3NzViZDMyYjI2NzM2OTNiNzlmNjdmYjM2ZTBiZmNjY2U0YWJmMjQxZDI1NTZmIgogICAgfQogIH0KfQ==";
    }

}
