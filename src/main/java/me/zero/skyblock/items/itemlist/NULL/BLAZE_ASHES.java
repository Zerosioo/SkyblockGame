package me.zero.skyblock.items.itemlist.NULL;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BLAZE_ASHES extends SItem implements ItemStatistics, SkullItem, Sellable {

    @Override
    public String getName() {
        return "Blaze Ashes";
    }

    @Override
    public List<String> getLore() {
        return new ArrayList(Arrays.asList("§7§oBlazes are","§7§oephemeral","§7§ocreatures,","§7§oconstantly","§7§oconsuming","§7§othemselves.","§7§oTheir ashes are","§7§osaid to bring","§7§ogood fortune.")); 
    }

    @Override
    public String getId() {
        return "BLAZE_ASHES"; 
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
        return Rarity.UNCOMMON;
    }

    @Override
    public int getPrice() {
        return 50;
    }

    @Override
    public String getTexture() {
        return "ewogICJ0aW1lc3RhbXAiIDogMTY0MjQ0MTYzODA1NSwKICAicHJvZmlsZUlkIiA6ICIzZjM4YmViZGYwMWQ0MjNkYWI4MjczZjUwNGFiNGEyNyIsCiAgInByb2ZpbGVOYW1lIiA6ICJjazM0Nzk0MjM1NzUzNzMxIiwKICAic2lnbmF0dXJlUmVxdWlyZWQiIDogdHJ1ZSwKICAidGV4dHVyZXMiIDogewogICAgIlNLSU4iIDogewogICAgICAidXJsIiA6ICJodHRwOi8vdGV4dHVyZXMubWluZWNyYWZ0Lm5ldC90ZXh0dXJlLzcxZTAyOWE4ZWVlYTgwYmEzYTI3NDA3YTlmMGYyMjZiNWVjMjNjMzU2ZDMyMzUzN2RlNDgyNjk2MGY0ZDRlNzgiLAogICAgICAibWV0YWRhdGEiIDogewogICAgICAgICJtb2RlbCIgOiAic2xpbSIKICAgICAgfQogICAgfQogIH0KfQ==";
    }

}
