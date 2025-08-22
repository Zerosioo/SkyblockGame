package me.zero.skyblock.items.itemlist.NULL;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SOLVED_PRISM extends SItem implements ItemStatistics, SkullItem {

    @Override
    public String getName() {
        return "§bSolved Rubix Prism";
    }

    @Override
    public List<String> getLore() {
        return new ArrayList(Arrays.asList("§7§oIt took hard","§7§owork and","§7§opatience, but","§7§othat's what love","§7§ois all about!")); 
    }

    @Override
    public String getId() {
        return "SOLVED_PRISM"; 
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
    public Soulbound getSoulbound() {
        return Soulbound.COOP;
    }

    @Override
    public String getTexture() {
        return "ewogICJ0aW1lc3RhbXAiIDogMTU5MDE5MjA2MDMwMywKICAicHJvZmlsZUlkIiA6ICIyYzEwNjRmY2Q5MTc0MjgyODRlM2JmN2ZhYTdlM2UxYSIsCiAgInByb2ZpbGVOYW1lIiA6ICJOYWVtZSIsCiAgInNpZ25hdHVyZVJlcXVpcmVkIiA6IHRydWUsCiAgInRleHR1cmVzIiA6IHsKICAgICJTS0lOIiA6IHsKICAgICAgInVybCIgOiAiaHR0cDovL3RleHR1cmVzLm1pbmVjcmFmdC5uZXQvdGV4dHVyZS80NWZmMTcyZTZkNWRhYjdlMTg1M2E1M2FmOTA4ODFjYzQ3ZWVkN2Q0ZTQxYzM1M2ZkNjM2OGI0YzgyMjRkMTk4IgogICAgfQogIH0KfQ==";
    }

}
