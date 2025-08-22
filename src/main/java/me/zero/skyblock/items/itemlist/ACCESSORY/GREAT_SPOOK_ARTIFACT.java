package me.zero.skyblock.items.itemlist.ACCESSORY;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GREAT_SPOOK_ARTIFACT extends SItem implements ItemStatistics, SkullItem, Museum {

    @Override
    public String getName() {
        return "Great Spook Artifact";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "GREAT_SPOOK_ARTIFACT"; 
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
    public boolean isMuseum() {
        return true;
    }

    @Override
    public String getTexture() {
        return "ewogICJ0aW1lc3RhbXAiIDogMTY2Mzk1OTY1MDI2OSwKICAicHJvZmlsZUlkIiA6ICIwMzdlNzQwNGMyMjk0OTIxOTdkZjBlZWJmYWIyNTNjMiIsCiAgInByb2ZpbGVOYW1lIiA6ICJMX0FfWl9FX1JfIiwKICAic2lnbmF0dXJlUmVxdWlyZWQiIDogdHJ1ZSwKICAidGV4dHVyZXMiIDogewogICAgIlNLSU4iIDogewogICAgICAidXJsIiA6ICJodHRwOi8vdGV4dHVyZXMubWluZWNyYWZ0Lm5ldC90ZXh0dXJlL2E4OWNjMWVkZTc1NTcwOWRlYmI3ZDFmZTdhYjgxMjlhYzg5MDE3ODhkOGQ4NjEzYjAzZWFjMTU3YzIzY2M0OWMiLAogICAgICAibWV0YWRhdGEiIDogewogICAgICAgICJtb2RlbCIgOiAic2xpbSIKICAgICAgfQogICAgfQogIH0KfQ==";
    }

}
