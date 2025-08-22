package me.zero.skyblock.items.itemlist.NULL;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class HOTSPOT_WATER_ORB extends SItem implements ItemStatistics, SkullItem {

    @Override
    public String getName() {
        return "Hotspot Water Orb";
    }

    @Override
    public List<String> getLore() {
        return new ArrayList(Arrays.asList("Radiating some weird","energy.","","§8Probably safe to","§8hold?")); 
    }

    @Override
    public String getId() {
        return "HOTSPOT_WATER_ORB"; 
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
        return "ewogICJ0aW1lc3RhbXAiIDogMTc0MTE5MTYwNDY3NiwKICAicHJvZmlsZUlkIiA6ICJjYmNkNDQzZGE1NTI0OGU3ODM3NWNmZjYwMmQzZWI0NyIsCiAgInByb2ZpbGVOYW1lIiA6ICJPX1JlaSIsCiAgInNpZ25hdHVyZVJlcXVpcmVkIiA6IHRydWUsCiAgInRleHR1cmVzIiA6IHsKICAgICJTS0lOIiA6IHsKICAgICAgInVybCIgOiAiaHR0cDovL3RleHR1cmVzLm1pbmVjcmFmdC5uZXQvdGV4dHVyZS80MTZjNWQ5MDA3MDg4ZjE3YTRkYjUyZGZlMjg2YjllMWExN2ZhMTQ1NDA4NzlhNGY1ZjNmYTIxMWEzMmEwN2IiLAogICAgICAibWV0YWRhdGEiIDogewogICAgICAgICJtb2RlbCIgOiAic2xpbSIKICAgICAgfQogICAgfQogIH0KfQ==";
    }

}
