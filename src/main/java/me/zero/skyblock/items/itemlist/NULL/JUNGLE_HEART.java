package me.zero.skyblock.items.itemlist.NULL;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class JUNGLE_HEART extends SItem implements ItemStatistics, SkullItem, Museum {

    @Override
    public String getName() {
        return "Jungle Heart";
    }

    @Override
    public List<String> getLore() {
        return new ArrayList(Arrays.asList("§7Found in the","§7deepest layers of","§7the Jungle Temple.")); 
    }

    @Override
    public String getId() {
        return "JUNGLE_HEART"; 
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
        return Rarity.LEGENDARY;
    }

    @Override
    public boolean isMuseum() {
        return true;
    }

    @Override
    public String getTexture() {
        return "ewogICJ0aW1lc3RhbXAiIDogMTY5MTA2NzYyOTI3OSwKICAicHJvZmlsZUlkIiA6ICI0NmY3N2NjNmQ2MjU0NjEzYjc2NmYyZDRmMDM2MzZhNiIsCiAgInByb2ZpbGVOYW1lIiA6ICJNaXNzV29sZiIsCiAgInNpZ25hdHVyZVJlcXVpcmVkIiA6IHRydWUsCiAgInRleHR1cmVzIiA6IHsKICAgICJTS0lOIiA6IHsKICAgICAgInVybCIgOiAiaHR0cDovL3RleHR1cmVzLm1pbmVjcmFmdC5uZXQvdGV4dHVyZS8xNGFkZWEwZDgyMjYzZDIzMzM4NDdlYzM0ODgyMTRjYTI1MjM2NDIzYjg2NTdiYjgyZTA4ZWJjMzRiZDcwODgyIiwKICAgICAgIm1ldGFkYXRhIiA6IHsKICAgICAgICAibW9kZWwiIDogInNsaW0iCiAgICAgIH0KICAgIH0KICB9Cn0=";
    }

}
