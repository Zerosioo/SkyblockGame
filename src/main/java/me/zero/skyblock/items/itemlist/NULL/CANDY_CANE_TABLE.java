package me.zero.skyblock.items.itemlist.NULL;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CANDY_CANE_TABLE extends SItem implements ItemStatistics, SkullItem {

    @Override
    public String getName() {
        return "Candy Cane Table";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "CANDY_CANE_TABLE"; 
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
        return "ewogICJ0aW1lc3RhbXAiIDogMTYzODkwMDc5OTUzNSwKICAicHJvZmlsZUlkIiA6ICJkODAwZDI4MDlmNTE0ZjkxODk4YTU4MWYzODE0Yzc5OSIsCiAgInByb2ZpbGVOYW1lIiA6ICJ0aGVCTFJ4eCIsCiAgInNpZ25hdHVyZVJlcXVpcmVkIiA6IHRydWUsCiAgInRleHR1cmVzIiA6IHsKICAgICJTS0lOIiA6IHsKICAgICAgInVybCIgOiAiaHR0cDovL3RleHR1cmVzLm1pbmVjcmFmdC5uZXQvdGV4dHVyZS8yN2M3MTQwZGFkOTBlMzAxYWE1OGE0NjRjYTg0MWM5Nzg1ZGNlMmUwYjNjZDIyMzc4ZGQzYmIwYTM1ZTc0NzNiIgogICAgfQogIH0KfQ==";
    }

}
