package me.zero.skyblock.items.itemlist.NULL;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TALISMAN_ENRICHMENT_FEROCITY extends SItem implements ItemStatistics, SkullItem {

    @Override
    public String getName() {
        return "Ferocity Enrichment";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "TALISMAN_ENRICHMENT_FEROCITY"; 
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
        return Rarity.SPECIAL;
    }

    @Override
    public boolean isEnchanted() {
        return true;
    }

    @Override
    public String getTexture() {
        return "ewogICJ0aW1lc3RhbXAiIDogMTcyMDA0MDE0MzczNywKICAicHJvZmlsZUlkIiA6ICI4NzczZWRiODZmYWQ0MTczOGFiYWJhNTUxMWM3MDcwZSIsCiAgInByb2ZpbGVOYW1lIiA6ICJjb3NtaWNwb3RhdG9lcyIsCiAgInNpZ25hdHVyZVJlcXVpcmVkIiA6IHRydWUsCiAgInRleHR1cmVzIiA6IHsKICAgICJTS0lOIiA6IHsKICAgICAgInVybCIgOiAiaHR0cDovL3RleHR1cmVzLm1pbmVjcmFmdC5uZXQvdGV4dHVyZS9mMWU4NzcxNzE5YWJkZWIxMWI4NjRjMDEwNGIzYmQ3ZmM1ZDI2ZDIxZjBmMGQ4YWI0N2QxM2U2NWNiNzRjNDAiLAogICAgICAibWV0YWRhdGEiIDogewogICAgICAgICJtb2RlbCIgOiAic2xpbSIKICAgICAgfQogICAgfQogIH0KfQ==";
    }

}
