package me.zero.skyblock.items.itemlist.NULL;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class STUFFED_CHILI_PEPPER extends SItem implements ItemStatistics, SkullItem, Sellable {

    @Override
    public String getName() {
        return "Stuffed Chili Pepper";
    }

    @Override
    public List<String> getLore() {
        return new ArrayList(Arrays.asList("It's red hot, but","green and stuffed!")); 
    }

    @Override
    public String getId() {
        return "STUFFED_CHILI_PEPPER"; 
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
        return Rarity.RARE;
    }

    @Override
    public int getPrice() {
        return 200000;
    }

    @Override
    public String getTexture() {
        return "ewogICJ0aW1lc3RhbXAiIDogMTY1ODczMDU4NDQ2OCwKICAicHJvZmlsZUlkIiA6ICJjOWRlZTM4MDUzYjg0YzI5YjZlZjA5YjJlMDM5OTc0ZiIsCiAgInByb2ZpbGVOYW1lIiA6ICJTQVJfRGVjZW1iZXI1IiwKICAic2lnbmF0dXJlUmVxdWlyZWQiIDogdHJ1ZSwKICAidGV4dHVyZXMiIDogewogICAgIlNLSU4iIDogewogICAgICAidXJsIiA6ICJodHRwOi8vdGV4dHVyZXMubWluZWNyYWZ0Lm5ldC90ZXh0dXJlL2Y1OTlmOTU5ZjBlYmNiMWViMGYyZTU4NTJkMTIyY2E1NWJmNTI1OGZkNDYxM2FiNTBkNzJhZDhjZjVlMTI2MDMiCiAgICB9CiAgfQp9";
    }

}
