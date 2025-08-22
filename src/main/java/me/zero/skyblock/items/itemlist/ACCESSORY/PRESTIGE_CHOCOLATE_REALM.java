package me.zero.skyblock.items.itemlist.ACCESSORY;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PRESTIGE_CHOCOLATE_REALM extends SItem implements ItemStatistics, SkullItem {

    @Override
    public String getName() {
        return "Prestige Chocolate Realm";
    }

    @Override
    public List<String> getLore() {
        return new ArrayList(Arrays.asList("§8§oThe Factory's","§8§opinnacle","§8§ocreation - its","§8§oepic taste","§8§oshatters","§8§oexpectations,","§8§ooffering a taste","§8§oof utopia.")); 
    }

    @Override
    public String getId() {
        return "PRESTIGE_CHOCOLATE_REALM"; 
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
        return Rarity.LEGENDARY;
    }

    @Override
    public String getTexture() {
        return "ewogICJ0aW1lc3RhbXAiIDogMTcxMTQ2MjQ2NTczMiwKICAicHJvZmlsZUlkIiA6ICIzMTdkODc2MjZjYWM0Mjk0ODBiOTI4NGE4Y2ZjMWRlOSIsCiAgInByb2ZpbGVOYW1lIiA6ICJOaWFtb1IzMjAiLAogICJzaWduYXR1cmVSZXF1aXJlZCIgOiB0cnVlLAogICJ0ZXh0dXJlcyIgOiB7CiAgICAiU0tJTiIgOiB7CiAgICAgICJ1cmwiIDogImh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvYWYxOWNlZWFiZjJlY2IwMjA2MTBiOGFhYmM5Mjk5MjY0ZmE2NzAwNDhjMDEwYzk2OTljZTY4N2ZjOWJmMzUxZSIKICAgIH0KICB9Cn0=";
    }

}
