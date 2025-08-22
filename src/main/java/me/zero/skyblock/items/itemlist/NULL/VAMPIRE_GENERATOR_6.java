package me.zero.skyblock.items.itemlist.NULL;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class VAMPIRE_GENERATOR_6 extends SItem implements ItemStatistics, SkullItem {

    @Override
    public String getName() {
        return "Vampire Minion VI";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "VAMPIRE_GENERATOR_6"; 
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
        return "ewogICJ0aW1lc3RhbXAiIDogMTY4MzU0NDM5MjE0NSwKICAicHJvZmlsZUlkIiA6ICJhMzdlOGYyM2MyMTk0NjJiYjY3ZWUxY2I5OTM2YWY2NiIsCiAgInByb2ZpbGVOYW1lIiA6ICJEb29yYWxleSIsCiAgInNpZ25hdHVyZVJlcXVpcmVkIiA6IHRydWUsCiAgInRleHR1cmVzIiA6IHsKICAgICJTS0lOIiA6IHsKICAgICAgInVybCIgOiAiaHR0cDovL3RleHR1cmVzLm1pbmVjcmFmdC5uZXQvdGV4dHVyZS9iYjg0ZmRkMTQxMGE3OTE4ZTEzYWViYTI5NjNkNGQ1NWNkOGViY2Y0NTFiNGRiNTRmMjFhZTdkNWMyZjNjNTkyIgogICAgfQogIH0KfQ==";
    }

}
