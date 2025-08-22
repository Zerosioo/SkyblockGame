package me.zero.skyblock.items.itemlist.ACCESSORY;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class WHITE_GIFT_TALISMAN extends SItem implements ItemStatistics, SkullItem {

    @Override
    public String getName() {
        return "White Gift Talisman";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "WHITE_GIFT_TALISMAN"; 
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
        return Rarity.COMMON;
    }

    @Override
    public String getTexture() {
        return "ewogICJ0aW1lc3RhbXAiIDogMTY2OTUxNDE5NTI3NCwKICAicHJvZmlsZUlkIiA6ICI3NmRjOWY4OTI3Y2Q0NzY5OWQ2NmYzYjBjZTZlOTRmYSIsCiAgInByb2ZpbGVOYW1lIiA6ICJJQW1Ob3REcnVuayIsCiAgInNpZ25hdHVyZVJlcXVpcmVkIiA6IHRydWUsCiAgInRleHR1cmVzIiA6IHsKICAgICJTS0lOIiA6IHsKICAgICAgInVybCIgOiAiaHR0cDovL3RleHR1cmVzLm1pbmVjcmFmdC5uZXQvdGV4dHVyZS9lNDdiMzdlNjdhODkxNTliZjRhY2M0YTQ0ZDQzMjhmNGVmYzAxODE2MDUxNDIyODhlNWVlZDFhYjhhZWQ5MTNjIgogICAgfQogIH0KfQ==";
    }

}
