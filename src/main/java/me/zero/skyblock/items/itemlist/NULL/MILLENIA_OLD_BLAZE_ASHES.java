package me.zero.skyblock.items.itemlist.NULL;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MILLENIA_OLD_BLAZE_ASHES extends SItem implements ItemStatistics, SkullItem, Sellable {

    @Override
    public String getName() {
        return "Millennia-Old Blaze Ashes";
    }

    @Override
    public List<String> getLore() {
        return new ArrayList(Arrays.asList("§7§oDespite being","§7§oephemeral","§7§ocreatures, blaze","§7§oashes are","§7§oeternal.")); 
    }

    @Override
    public String getId() {
        return "MILLENIA_OLD_BLAZE_ASHES"; 
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
        return 1000;
    }

    @Override
    public String getTexture() {
        return "ewogICJ0aW1lc3RhbXAiIDogMTcyMDA0MjA3NjMxNCwKICAicHJvZmlsZUlkIiA6ICIzOThiZGM3NWVhYzQ0ZjMzYWEyMDBiMTYyNTRmMDhlOSIsCiAgInByb2ZpbGVOYW1lIiA6ICJJa2h3YW4wNTEwIiwKICAic2lnbmF0dXJlUmVxdWlyZWQiIDogdHJ1ZSwKICAidGV4dHVyZXMiIDogewogICAgIlNLSU4iIDogewogICAgICAidXJsIiA6ICJodHRwOi8vdGV4dHVyZXMubWluZWNyYWZ0Lm5ldC90ZXh0dXJlL2M1MzVmODNiZDRlMjkwZDQwMGQ1YzhjNzE4MzA4Yzc0YmU5OWYwOWE0ODlkMGMyNWVkM2QxMjE5MzJjZmZhOGUiLAogICAgICAibWV0YWRhdGEiIDogewogICAgICAgICJtb2RlbCIgOiAic2xpbSIKICAgICAgfQogICAgfQogIH0KfQ==";
    }

}
