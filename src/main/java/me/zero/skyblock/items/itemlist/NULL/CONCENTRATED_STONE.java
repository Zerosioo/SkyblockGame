package me.zero.skyblock.items.itemlist.NULL;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CONCENTRATED_STONE extends SItem implements ItemStatistics, SkullItem, Sellable {

    @Override
    public String getName() {
        return "Concentrated Stone";
    }

    @Override
    public List<String> getLore() {
        return new ArrayList(Arrays.asList("§7The purest form of","§7stone. How can","§7something so","§7simple, be so","§7heavy?")); 
    }

    @Override
    public String getId() {
        return "CONCENTRATED_STONE"; 
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
        return "ewogICJ0aW1lc3RhbXAiIDogMTYxOTExMjE3NzM4NCwKICAicHJvZmlsZUlkIiA6ICJjNjc3MGJjZWMzZjE0ODA3ODc4MTU0NWRhMGFmMDI1NCIsCiAgInByb2ZpbGVOYW1lIiA6ICJDVUNGTDE2IiwKICAic2lnbmF0dXJlUmVxdWlyZWQiIDogdHJ1ZSwKICAidGV4dHVyZXMiIDogewogICAgIlNLSU4iIDogewogICAgICAidXJsIiA6ICJodHRwOi8vdGV4dHVyZXMubWluZWNyYWZ0Lm5ldC90ZXh0dXJlLzhjODYzN2JjMDYyOGY1NzEwZjg1YjhkMDY3OWNjMmMxOWFmZTBlMTA4OWIyNDhiNmZkYjY3ZjY4N2FlODFkYzIiLAogICAgICAibWV0YWRhdGEiIDogewogICAgICAgICJtb2RlbCIgOiAic2xpbSIKICAgICAgfQogICAgfQogIH0KfQ==";
    }

}
