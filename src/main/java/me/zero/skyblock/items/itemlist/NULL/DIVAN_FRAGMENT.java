package me.zero.skyblock.items.itemlist.NULL;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DIVAN_FRAGMENT extends SItem implements ItemStatistics, SkullItem {

    @Override
    public String getName() {
        return "Divan Fragment";
    }

    @Override
    public List<String> getLore() {
        return new ArrayList(Arrays.asList("§7§oOne of the","§7§ogreatest alloys","§7§onaturally found","§7§oin the Crystal","§7§oHollows, named","§7§oafter the first","§7§oDwarf to find","§7§othem.")); 
    }

    @Override
    public String getId() {
        return "DIVAN_FRAGMENT"; 
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
        return "ewogICJ0aW1lc3RhbXAiIDogMTYyNDU0NjIxODEyMSwKICAicHJvZmlsZUlkIiA6ICJiYzRlZGZiNWYzNmM0OGE3YWM5ZjFhMzlkYzIzZjRmOCIsCiAgInByb2ZpbGVOYW1lIiA6ICI4YWNhNjgwYjIyNDYxMzQwIiwKICAic2lnbmF0dXJlUmVxdWlyZWQiIDogdHJ1ZSwKICAidGV4dHVyZXMiIDogewogICAgIlNLSU4iIDogewogICAgICAidXJsIiA6ICJodHRwOi8vdGV4dHVyZXMubWluZWNyYWZ0Lm5ldC90ZXh0dXJlLzYzMzg0NGYwM2M5MmQ4MjUwM2M5Y2Q1NjdhNTFmZGE0NzQwNGZhNTNmMjE2ZmFkNDczZjE2YWM4M2E5NzMxNGYiCiAgICB9CiAgfQp9";
    }

}
