package me.zero.skyblock.items.itemlist.ACCESSORY;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BLOOD_DONOR_ARTIFACT extends SItem implements ItemStatistics, SkullItem, Sellable {

    @Override
    public String getName() {
        return "Blood Donor Artifact";
    }

    @Override
    public List<String> getLore() {
        return new ArrayList(Arrays.asList("The human body","produces 2-3 million","red blood cells per","SECOND.")); 
    }

    @Override
    public String getId() {
        return "BLOOD_DONOR_ARTIFACT"; 
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
        return Rarity.RARE;
    }

    @Override
    public int getPrice() {
        return 10000;
    }

    @Override
    public int getHealthRegeneration() {
        return 3;
    }

    @Override
    public int getRiftManaRegeneration() {
        return 10;
    }

    @Override
    public String getTexture() {
        return "ewogICJ0aW1lc3RhbXAiIDogMTcyMDA0MjMxNDE2MCwKICAicHJvZmlsZUlkIiA6ICJiNzRlYjViMTc5OTc0YzZjODk3ZTgwNTM4Y2M1NmYwMSIsCiAgInByb2ZpbGVOYW1lIiA6ICJQYW5kYUNoYW4yOCIsCiAgInNpZ25hdHVyZVJlcXVpcmVkIiA6IHRydWUsCiAgInRleHR1cmVzIiA6IHsKICAgICJTS0lOIiA6IHsKICAgICAgInVybCIgOiAiaHR0cDovL3RleHR1cmVzLm1pbmVjcmFmdC5uZXQvdGV4dHVyZS9mZjdiYjk3NDgwYzEwZmRmZWI4ZmFlOTM5MjllNWVlYjRmMDQ5MWQ4Y2NhNzBlZDAwYjQ1ZTNmYjJiNzRmNmM1IgogICAgfQogIH0KfQ==";
    }

}
