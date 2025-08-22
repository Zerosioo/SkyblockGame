package me.zero.skyblock.items.itemlist.NULL;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GLACITE_JEWEL extends SItem implements ItemStatistics, SkullItem, Sellable {

    @Override
    public String getName() {
        return "Glacite Jewel";
    }

    @Override
    public List<String> getLore() {
        return new ArrayList(Arrays.asList("§7§oIt is said that","§7§othere is a lost","§7§ovillage made of","§7§oGlacite, deep","§7§ounder the","§7§oDwarven Mines.")); 
    }

    @Override
    public String getId() {
        return "GLACITE_JEWEL"; 
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
        return 2000;
    }

    @Override
    public String getTexture() {
        return "ewogICJ0aW1lc3RhbXAiIDogMTYxMDYzMjIyMzMzNSwKICAicHJvZmlsZUlkIiA6ICI2ZmU4OTUxZDVhY2M0NDc3OWI2ZmYxMmU3YzFlOTQ2MyIsCiAgInByb2ZpbGVOYW1lIiA6ICJlcGhlbXJhIiwKICAic2lnbmF0dXJlUmVxdWlyZWQiIDogdHJ1ZSwKICAidGV4dHVyZXMiIDogewogICAgIlNLSU4iIDogewogICAgICAidXJsIiA6ICJodHRwOi8vdGV4dHVyZXMubWluZWNyYWZ0Lm5ldC90ZXh0dXJlL2U4MGUyYzIwNmYwNmI0MTYzZGVlNjc4MTYyYjJkN2EzZWQ2YjIwYzY0MTlmZWM0NGY5MWY2ZGQwMDFhMTJhMzkiCiAgICB9CiAgfQp9";
    }

}
