package me.zero.skyblock.items.itemlist.ACCESSORY;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GENERAL_MEDALLION extends SItem implements ItemStatistics, SkullItem {

    @Override
    public String getName() {
        return "General's Medallion";
    }

    @Override
    public List<String> getLore() {
        return new ArrayList(Arrays.asList("§8§oOnce worn","§8§oproudly, now","§8§ocovered in filth","§8§oand soot.")); 
    }

    @Override
    public String getId() {
        return "GENERAL_MEDALLION"; 
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
        return ItemType.ACCESSORY;
    }

    @Override
    public Rarity getRarity() {
        return Rarity.RARE;
    }

    @Override
    public boolean isDungeonItem() {
      	return true;
    }

    @Override
    public String getTexture() {
        return "ewogICJ0aW1lc3RhbXAiIDogMTY5MzkyNDgzOTY1OCwKICAicHJvZmlsZUlkIiA6ICIzOTdlMmY5OTAyNmI0NjI1OTcyNTM1OTNjODgyZjRmMyIsCiAgInByb2ZpbGVOYW1lIiA6ICJ4WnlkdWVMeCIsCiAgInNpZ25hdHVyZVJlcXVpcmVkIiA6IHRydWUsCiAgInRleHR1cmVzIiA6IHsKICAgICJTS0lOIiA6IHsKICAgICAgInVybCIgOiAiaHR0cDovL3RleHR1cmVzLm1pbmVjcmFmdC5uZXQvdGV4dHVyZS9mNzkxMzJjZWRiOWQ3ODQzOTVkYWRlN2NiZTBlZDk0ZTEyZjA1NWE4ZGNjMzMxYWYzY2U3MGY1ODgzMmVkOTA5IiwKICAgICAgIm1ldGFkYXRhIiA6IHsKICAgICAgICAibW9kZWwiIDogInNsaW0iCiAgICAgIH0KICAgIH0KICB9Cn0=";
    }

}
