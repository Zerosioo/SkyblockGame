package me.zero.skyblock.items.itemlist.NULL;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ARMOR_SHOWCASE extends SItem implements ItemStatistics, SkullItem {

    @Override
    public String getName() {
        return "Armor Stand";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "ARMOR_SHOWCASE"; 
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
    public String getTexture() {
        return "ewogICJ0aW1lc3RhbXAiIDogMTcyMDA0NDE1Nzg0MSwKICAicHJvZmlsZUlkIiA6ICI4ZTFjZTM2ZGE2Mzk0ZjgwOTFmZjZjYTZiZTNhZTA5NSIsCiAgInByb2ZpbGVOYW1lIiA6ICJGdWxsY3JlbiIsCiAgInNpZ25hdHVyZVJlcXVpcmVkIiA6IHRydWUsCiAgInRleHR1cmVzIiA6IHsKICAgICJTS0lOIiA6IHsKICAgICAgInVybCIgOiAiaHR0cDovL3RleHR1cmVzLm1pbmVjcmFmdC5uZXQvdGV4dHVyZS83MGY1MGVhNDY2NDRiZWRmOGRmYTUzYWY5NzdmOGMyMDZlN2YzZWU0ZTBmYWFlNmU1YzgyNzhkNzdjMjA3YWQ3IiwKICAgICAgIm1ldGFkYXRhIiA6IHsKICAgICAgICAibW9kZWwiIDogInNsaW0iCiAgICAgIH0KICAgIH0KICB9Cn0=";
    }

}
