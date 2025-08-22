package me.zero.skyblock.items.itemlist.REFORGE_STONE;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DRAGON_HORN extends SItem implements ItemStatistics, SkullItem, Sellable {

    @Override
    public String getName() {
        return "Dragon Horn";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "DRAGON_HORN"; 
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
        return ItemType.REFORGE_STONE;
    }

    @Override
    public Rarity getRarity() {
        return Rarity.EPIC;
    }

    @Override
    public int getPrice() {
        return 1;
    }

    @Override
    public String getTexture() {
        return "ewogICJ0aW1lc3RhbXAiIDogMTY0MTA0NTU0MDE5NSwKICAicHJvZmlsZUlkIiA6ICJkODAwZDI4MDlmNTE0ZjkxODk4YTU4MWYzODE0Yzc5OSIsCiAgInByb2ZpbGVOYW1lIiA6ICJ0aGVCTFJ4eCIsCiAgInNpZ25hdHVyZVJlcXVpcmVkIiA6IHRydWUsCiAgInRleHR1cmVzIiA6IHsKICAgICJTS0lOIiA6IHsKICAgICAgInVybCIgOiAiaHR0cDovL3RleHR1cmVzLm1pbmVjcmFmdC5uZXQvdGV4dHVyZS84NzQ0YzgxMDk5YzFhZWJmMjBmNjc3ZmFlZDI0Y2FjZTUyMGEyOTRjZjQ2YmRlYjZhMjU3ZjQzNmEzMjNhMWQ4IgogICAgfQogIH0KfQ==";
    }

}
