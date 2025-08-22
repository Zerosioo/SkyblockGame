package me.zero.skyblock.items.itemlist.NULL;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class EGG_PAINTING_STATION extends SItem implements ItemStatistics, SkullItem {

    @Override
    public String getName() {
        return "Egg Painting Station";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "EGG_PAINTING_STATION"; 
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
    public String getTexture() {
        return "ewogICJ0aW1lc3RhbXAiIDogMTYxNDI3ODQwNjg2MywKICAicHJvZmlsZUlkIiA6ICJmMjc0YzRkNjI1MDQ0ZTQxOGVmYmYwNmM3NWIyMDIxMyIsCiAgInByb2ZpbGVOYW1lIiA6ICJIeXBpZ3NlbCIsCiAgInNpZ25hdHVyZVJlcXVpcmVkIiA6IHRydWUsCiAgInRleHR1cmVzIiA6IHsKICAgICJTS0lOIiA6IHsKICAgICAgInVybCIgOiAiaHR0cDovL3RleHR1cmVzLm1pbmVjcmFmdC5uZXQvdGV4dHVyZS9kYWU4NGYxNDc4Y2I0YjNiNDg3MTdjMzI1Y2I0NGIzN2Q2YWM2NzliOWM3MzQxNDZkMmJjNDU4NWZmZWM1OTFjIgogICAgfQogIH0KfQ==";
    }

}
