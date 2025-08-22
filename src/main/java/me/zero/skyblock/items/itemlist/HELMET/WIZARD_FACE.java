package me.zero.skyblock.items.itemlist.HELMET;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class WIZARD_FACE extends SItem implements ItemStatistics, SkullItem {

    @Override
    public String getName() {
        return "Wizard Face";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "WIZARD_FACE"; 
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
        return ItemType.HELMET;
    }

    @Override
    public Rarity getRarity() {
        return Rarity.MYTHIC;
    }

    @Override
    public Soulbound getSoulbound() {
        return Soulbound.SOLO;
    }

    @Override
    public String getTexture() {
        return "ewogICJ0aW1lc3RhbXAiIDogMTY3OTU1NDg4NzMzMiwKICAicHJvZmlsZUlkIiA6ICJkNzU2OTc4MWUyYjY0OWIyYjVlMjVlYTJhNDZkOGQxOSIsCiAgInByb2ZpbGVOYW1lIiA6ICJEckthcGRvciIsCiAgInNpZ25hdHVyZVJlcXVpcmVkIiA6IHRydWUsCiAgInRleHR1cmVzIiA6IHsKICAgICJTS0lOIiA6IHsKICAgICAgInVybCIgOiAiaHR0cDovL3RleHR1cmVzLm1pbmVjcmFmdC5uZXQvdGV4dHVyZS80M2I3OTdhZTAxM2QyYjg4MmRiMzE2MzQ2NWI5MTJmMDNkNTdjODJkNDRkZjA0ODZkZjAzMmU3YmFiODY0NzlhIgogICAgfQogIH0KfQ==";
    }

}
