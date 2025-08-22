package me.zero.skyblock.items.itemlist.NULL;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SLUDGE_JUICE extends SItem implements ItemStatistics, SkullItem {

    @Override
    public String getName() {
        return "Sludge Juice";
    }

    @Override
    public List<String> getLore() {
        return new ArrayList(Arrays.asList("§7A green viscous","§7substance highly","§7valued by the","§7Kalhuiki Tribe for","§7its stickiness.")); 
    }

    @Override
    public String getId() {
        return "SLUDGE_JUICE"; 
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
        return "ewogICJ0aW1lc3RhbXAiIDogMTYxOTE4MzcwNjY1OSwKICAicHJvZmlsZUlkIiA6ICIyMWUzNjdkNzI1Y2Y0ZTNiYjI2OTJjNGEzMDBhNGRlYiIsCiAgInByb2ZpbGVOYW1lIiA6ICJHZXlzZXJNQyIsCiAgInNpZ25hdHVyZVJlcXVpcmVkIiA6IHRydWUsCiAgInRleHR1cmVzIiA6IHsKICAgICJTS0lOIiA6IHsKICAgICAgInVybCIgOiAiaHR0cDovL3RleHR1cmVzLm1pbmVjcmFmdC5uZXQvdGV4dHVyZS9lMDFjZTY4ODQyMDc0ZGRlMDUzMTg1YjIxOGUzNGVlMzI1OWNiMzZhYzQ3MWQ4MDk5OGY5Y2IwMWYzMmU1MWM3IgogICAgfQogIH0KfQ==";
    }

}
