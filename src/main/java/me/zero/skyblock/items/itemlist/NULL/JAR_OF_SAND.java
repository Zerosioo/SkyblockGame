package me.zero.skyblock.items.itemlist.NULL;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class JAR_OF_SAND extends SItem implements ItemStatistics, SkullItem {

    @Override
    public String getName() {
        return "Jar of Sand";
    }

    @Override
    public List<String> getLore() {
        return new ArrayList(Arrays.asList("§8Decoration item","§8","§8§7Obtained during","§7the §eCarnival§7","§7for placing within","§7the §aTop 500 §7in","§7§6Fruit Digging§7.")); 
    }

    @Override
    public String getId() {
        return "JAR_OF_SAND"; 
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
    public String getTexture() {
        return "ewogICJ0aW1lc3RhbXAiIDogMTcyMDA1MjQ1ODAwMCwKICAicHJvZmlsZUlkIiA6ICIyMWUzNjdkNzI1Y2Y0ZTNiYjI2OTJjNGEzMDBhNGRlYiIsCiAgInByb2ZpbGVOYW1lIiA6ICJHZXlzZXJNQyIsCiAgInNpZ25hdHVyZVJlcXVpcmVkIiA6IHRydWUsCiAgInRleHR1cmVzIiA6IHsKICAgICJTS0lOIiA6IHsKICAgICAgInVybCIgOiAiaHR0cDovL3RleHR1cmVzLm1pbmVjcmFmdC5uZXQvdGV4dHVyZS9mZmIyZWIwYjZmMWRhN2YwMThlZDMxODg3ZDNmOGNhMGVmMDdmNGM3NmZhZTFiOWEzN2UwNzdmMzg5ZGZiNGFmIiwKICAgICAgIm1ldGFkYXRhIiA6IHsKICAgICAgICAibW9kZWwiIDogInNsaW0iCiAgICAgIH0KICAgIH0KICB9Cn0=";
    }

}
