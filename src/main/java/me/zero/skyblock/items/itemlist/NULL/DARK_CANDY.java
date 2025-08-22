package me.zero.skyblock.items.itemlist.NULL;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DARK_CANDY extends SItem implements ItemStatistics, SkullItem {

    @Override
    public String getName() {
        return "Dark Candy";
    }

    @Override
    public List<String> getLore() {
        return new ArrayList(Arrays.asList("§7Can be brought to","§7§cVargul the","§cUnearthed §7at the","§7back of the Hub","§7island during the","§7§5Great Spook§7.")); 
    }

    @Override
    public String getId() {
        return "DARK_CANDY"; 
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
    public String getTexture() {
        return "ewogICJ0aW1lc3RhbXAiIDogMTYzNTEyMjkwMDI5NSwKICAicHJvZmlsZUlkIiA6ICI4ODBiZWMwYTE0MmM0YzRlYTJlZjliMTFiMTBkNWNiNyIsCiAgInByb2ZpbGVOYW1lIiA6ICJmZ2FiIiwKICAic2lnbmF0dXJlUmVxdWlyZWQiIDogdHJ1ZSwKICAidGV4dHVyZXMiIDogewogICAgIlNLSU4iIDogewogICAgICAidXJsIiA6ICJodHRwOi8vdGV4dHVyZXMubWluZWNyYWZ0Lm5ldC90ZXh0dXJlLzdjODY2ZTQyMzk1NTE0MjhmOWM4MTRkOWRjMTFlNzAwMmUwNDNiODdmNTkwZjFmZGNiNGZmNmJiNDk3YjhlMTgiCiAgICB9CiAgfQp9";
    }

}
