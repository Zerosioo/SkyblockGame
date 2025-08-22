package me.zero.skyblock.items.itemlist.ACCESSORY;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RED_CLAW_ARTIFACT extends SItem implements ItemStatistics, SkullItem {

    @Override
    public String getName() {
        return "Red Claw Artifact";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "RED_CLAW_ARTIFACT"; 
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
    public int getCritDamage() {
        return 5;
    }

    @Override
    public String getTexture() {
        return "ewogICJ0aW1lc3RhbXAiIDogMTYwMjAzOTI1Njg2MSwKICAicHJvZmlsZUlkIiA6ICI5ZDEzZjcyMTcxM2E0N2U0OTAwZTMyZGVkNjBjNDY3MyIsCiAgInByb2ZpbGVOYW1lIiA6ICJUYWxvZGFvIiwKICAic2lnbmF0dXJlUmVxdWlyZWQiIDogdHJ1ZSwKICAidGV4dHVyZXMiIDogewogICAgIlNLSU4iIDogewogICAgICAidXJsIiA6ICJodHRwOi8vdGV4dHVyZXMubWluZWNyYWZ0Lm5ldC90ZXh0dXJlL2NhZjU5YjhhYTBmODM1NDZlZjBkMTc4Y2NmODdlN2VkODhjZjc4NThjYWFlNzliMzYzM2NiZDc1YjY1MDUyNWYiCiAgICB9CiAgfQp9";
    }

}
