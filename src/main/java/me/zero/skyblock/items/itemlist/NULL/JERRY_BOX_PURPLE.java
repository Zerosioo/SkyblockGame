package me.zero.skyblock.items.itemlist.NULL;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class JERRY_BOX_PURPLE extends SItem implements ItemStatistics, SkullItem {

    @Override
    public String getName() {
        return "Purple Jerry Box";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "JERRY_BOX_PURPLE"; 
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
        return "ewogICJ0aW1lc3RhbXAiIDogMTcyMDA0MDA2NzUzMiwKICAicHJvZmlsZUlkIiA6ICI2NGVkZjMxNTljZGY0ODBmYTZmY2UzYzA0NzlmNzUwYyIsCiAgInByb2ZpbGVOYW1lIiA6ICJnYW1lc2t5MTIzNCIsCiAgInNpZ25hdHVyZVJlcXVpcmVkIiA6IHRydWUsCiAgInRleHR1cmVzIiA6IHsKICAgICJTS0lOIiA6IHsKICAgICAgInVybCIgOiAiaHR0cDovL3RleHR1cmVzLm1pbmVjcmFmdC5uZXQvdGV4dHVyZS9hM2Y3NWM1MjgxY2NiYjc2NzU5ZmRkNTcxMDYxMjBlYjljMWRiMTI4YjM4NmQ0MzhlMDY1OWYzMTJlYjcxNWE1IgogICAgfQogIH0KfQ==";
    }

}
