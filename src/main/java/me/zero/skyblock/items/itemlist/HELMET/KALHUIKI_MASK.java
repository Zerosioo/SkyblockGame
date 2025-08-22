package me.zero.skyblock.items.itemlist.HELMET;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class KALHUIKI_MASK extends SItem implements ItemStatistics, SkullItem {

    @Override
    public String getName() {
        return "Kalhuiki Mask";
    }

    @Override
    public List<String> getLore() {
        return new ArrayList(Arrays.asList("§7A ceremonial mask","§7worn by the","§7members of the","§7Kalhuiki Tribe.","§7","§7§7While wearing","§7this mask, members","§7of the Kalhuiki","§7Tribe will not","§7attack you!")); 
    }

    @Override
    public String getId() {
        return "KALHUIKI_MASK"; 
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
        return ItemType.HELMET;
    }

    @Override
    public Rarity getRarity() {
        return Rarity.COMMON;
    }

    @Override
    public Gamestage getGamestage() {
        return Gamestage.SKILLED;
    }

    @Override
    public String getTexture() {
        return "ewogICJ0aW1lc3RhbXAiIDogMTYxOTE4MzY4ODY1MSwKICAicHJvZmlsZUlkIiA6ICI3MzgyZGRmYmU0ODU0NTVjODI1ZjkwMGY4OGZkMzJmOCIsCiAgInByb2ZpbGVOYW1lIiA6ICJJb3lhbCIsCiAgInNpZ25hdHVyZVJlcXVpcmVkIiA6IHRydWUsCiAgInRleHR1cmVzIiA6IHsKICAgICJTS0lOIiA6IHsKICAgICAgInVybCIgOiAiaHR0cDovL3RleHR1cmVzLm1pbmVjcmFmdC5uZXQvdGV4dHVyZS9kNjU4NzA2MTliMGMyZGI4MjI0NzlkMmNiMzgyMTI2YmQ3OTljNTgyMzc4YjViMWRmOTNlNzViN2QwMTU1MWI3IgogICAgfQogIH0KfQ==";
    }

}
