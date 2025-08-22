package me.zero.skyblock.items.itemlist.NULL;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BOOPFISH_HELMET extends SItem implements ItemStatistics, SkullItem {

    @Override
    public String getName() {
        return "Boopfish Helmet";
    }

    @Override
    public List<String> getLore() {
        return new ArrayList(Arrays.asList("It doesn't do","anything... yet!")); 
    }

    @Override
    public String getId() {
        return "BOOPFISH_HELMET"; 
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
        return "ewogICJ0aW1lc3RhbXAiIDogMTcyMDA0MDg2MzIzNSwKICAicHJvZmlsZUlkIiA6ICIwNTAzNzZmZjAxY2I0OGVjOTUwM2NhMjhjMWU2MzlkMSIsCiAgInByb2ZpbGVOYW1lIiA6ICJKb25haDU1OTAiLAogICJzaWduYXR1cmVSZXF1aXJlZCIgOiB0cnVlLAogICJ0ZXh0dXJlcyIgOiB7CiAgICAiU0tJTiIgOiB7CiAgICAgICJ1cmwiIDogImh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvYzI2NzdiNzk0NjYzYzkyNzNlZmM4NGY2Y2I0ZTJiMzM5MjUxZGU4NGU0NWUxZjAxZDNkNDk4MmZhN2MzZGQxNyIKICAgIH0KICB9Cn0=";
    }

}
