package me.zero.skyblock.items.itemlist.ACCESSORY;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DULL_SHARK_TOOTH_NECKLACE extends SItem implements ItemStatistics, SkullItem {

    @Override
    public String getName() {
        return "Dull Shark Tooth Necklace";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "DULL_SHARK_TOOTH_NECKLACE"; 
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
        return Rarity.UNCOMMON;
    }

    @Override
    public int getStrength() {
        return 4;
    }

    @Override
    public String getTexture() {
        return "ewogICJ0aW1lc3RhbXAiIDogMTU5ODI1MjgyMDkwNywKICAicHJvZmlsZUlkIiA6ICIyYzEwNjRmY2Q5MTc0MjgyODRlM2JmN2ZhYTdlM2UxYSIsCiAgInByb2ZpbGVOYW1lIiA6ICJOYWVtZSIsCiAgInNpZ25hdHVyZVJlcXVpcmVkIiA6IHRydWUsCiAgInRleHR1cmVzIiA6IHsKICAgICJTS0lOIiA6IHsKICAgICAgInVybCIgOiAiaHR0cDovL3RleHR1cmVzLm1pbmVjcmFmdC5uZXQvdGV4dHVyZS9mM2FiM2FhMWFkZTc0OTE1ZGFjZDI5ODYxMzkwNDM2MWMxODg3N2VlYmZhODFkOWY5MzYzMDlmMjcxZTEzODlhIgogICAgfQogIH0KfQ==";
    }

}
