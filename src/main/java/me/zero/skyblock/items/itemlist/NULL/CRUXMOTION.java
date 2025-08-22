package me.zero.skyblock.items.itemlist.NULL;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CRUXMOTION extends SItem implements ItemStatistics, SkullItem {

    @Override
    public String getName() {
        return "Cruxmotion";
    }

    @Override
    public List<String> getLore() {
        return new ArrayList(Arrays.asList("Ultimately, it's","life that is weird.")); 
    }

    @Override
    public String getId() {
        return "CRUXMOTION"; 
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
        return "ewogICJ0aW1lc3RhbXAiIDogMTYxOTI2ODM5NjI2MSwKICAicHJvZmlsZUlkIiA6ICI4MmM2MDZjNWM2NTI0Yjc5OGI5MWExMmQzYTYxNjk3NyIsCiAgInByb2ZpbGVOYW1lIiA6ICJOb3ROb3RvcmlvdXNOZW1vIiwKICAic2lnbmF0dXJlUmVxdWlyZWQiIDogdHJ1ZSwKICAidGV4dHVyZXMiIDogewogICAgIlNLSU4iIDogewogICAgICAidXJsIiA6ICJodHRwOi8vdGV4dHVyZXMubWluZWNyYWZ0Lm5ldC90ZXh0dXJlLzFlODJhMTBhN2RhMjNlM2UxYjE5NTQ1MjlkNDNkODViYzE5NmE5NTFmNWM1Y2FjYTI0NDQyMWE2ZTNiMDVmIgogICAgfQogIH0KfQ==";
    }

}
