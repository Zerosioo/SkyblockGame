package me.zero.skyblock.items.itemlist.NULL;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TIGHTLY_TIED_HAY_BALE extends SItem implements ItemStatistics, SkullItem {

    @Override
    public String getName() {
        return "Tightly-Tied Hay Bale";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "TIGHTLY_TIED_HAY_BALE"; 
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
    public Soulbound getSoulbound() {
        return Soulbound.COOP;
    }

    @Override
    public String getTexture() {
        return "ewogICJ0aW1lc3RhbXAiIDogMTYwNjI2MDYzNDUzMywKICAicHJvZmlsZUlkIiA6ICJiYjdjY2E3MTA0MzQ0NDEyOGQzMDg5ZTEzYmRmYWI1OSIsCiAgInByb2ZpbGVOYW1lIiA6ICJsYXVyZW5jaW8zMDMiLAogICJzaWduYXR1cmVSZXF1aXJlZCIgOiB0cnVlLAogICJ0ZXh0dXJlcyIgOiB7CiAgICAiU0tJTiIgOiB7CiAgICAgICJ1cmwiIDogImh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvNmQyNWM1YTQ4Y2RhZWZlYzhkZWRkNTNmNjQzYmMzMGEyMTBmNTFhOWUyZmY0MDU5NzVkMGY4YjQzMjE4ODM3YSIKICAgIH0KICB9Cn0=";
    }

}
