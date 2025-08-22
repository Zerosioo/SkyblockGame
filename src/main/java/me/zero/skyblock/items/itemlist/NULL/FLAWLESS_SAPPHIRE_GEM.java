package me.zero.skyblock.items.itemlist.NULL;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FLAWLESS_SAPPHIRE_GEM extends SItem implements ItemStatistics, SkullItem {

    @Override
    public String getName() {
        return "Flawless Sapphire Gemstone";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "FLAWLESS_SAPPHIRE_GEM"; 
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
        return "ewogICJ0aW1lc3RhbXAiIDogMTYxODA4NjIzMjc2OSwKICAicHJvZmlsZUlkIiA6ICI5MWZlMTk2ODdjOTA0NjU2YWExZmMwNTk4NmRkM2ZlNyIsCiAgInByb2ZpbGVOYW1lIiA6ICJoaGphYnJpcyIsCiAgInNpZ25hdHVyZVJlcXVpcmVkIiA6IHRydWUsCiAgInRleHR1cmVzIiA6IHsKICAgICJTS0lOIiA6IHsKICAgICAgInVybCIgOiAiaHR0cDovL3RleHR1cmVzLm1pbmVjcmFmdC5uZXQvdGV4dHVyZS85NTdjZmE5Yzc1YmE1ODQ2NDVlZTJhZjZkOTg2N2Q3NjdkZGVhNDY2N2NkZmM3MmRjMTA2MWRkMTk3NWNhN2QwIgogICAgfQogIH0KfQ==";
    }

}
