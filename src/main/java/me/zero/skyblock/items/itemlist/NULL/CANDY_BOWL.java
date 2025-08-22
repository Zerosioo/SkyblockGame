package me.zero.skyblock.items.itemlist.NULL;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CANDY_BOWL extends SItem implements ItemStatistics, SkullItem {

    @Override
    public String getName() {
        return "Candy Bowl";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "CANDY_BOWL"; 
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
        return Rarity.COMMON;
    }

    @Override
    public String getTexture() {
        return "ewogICJ0aW1lc3RhbXAiIDogMTY0NDc2NjYzOTgxMCwKICAicHJvZmlsZUlkIiA6ICIzYTE3NmIzMGZlY2M0Nzc4OGY4ZTg1OThmODFhN2YyZiIsCiAgInByb2ZpbGVOYW1lIiA6ICIxX0JJR1pfMSIsCiAgInNpZ25hdHVyZVJlcXVpcmVkIiA6IHRydWUsCiAgInRleHR1cmVzIiA6IHsKICAgICJTS0lOIiA6IHsKICAgICAgInVybCIgOiAiaHR0cDovL3RleHR1cmVzLm1pbmVjcmFmdC5uZXQvdGV4dHVyZS81MjZmOTVhZDA5MzIyZDVkOTc3YTVjN2JjMGQ2ZTRkZjRlMmJkNTMyNTMyZTc2ODUwYWVhN2YxNDJmZjBiZmM2IgogICAgfQogIH0KfQ==";
    }

}
