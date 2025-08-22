package me.zero.skyblock.items.itemlist.ACCESSORY;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class COMBO_MANIA_TALISMAN extends SItem implements ItemStatistics, SkullItem {

    @Override
    public String getName() {
        return "Combo Mania";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "COMBO_MANIA_TALISMAN"; 
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
        return Rarity.UNCOMMON;
    }

    @Override
    public String getTexture() {
        return "ewogICJ0aW1lc3RhbXAiIDogMTczMjU5MDYwNTIxNiwKICAicHJvZmlsZUlkIiA6ICI5NDczNjdlMTE1N2Q0ZjQzYTZmYmY0MGQwOTY3MjY3MyIsCiAgInByb2ZpbGVOYW1lIiA6ICJhbmFyY2h5MHBsYXllciIsCiAgInNpZ25hdHVyZVJlcXVpcmVkIiA6IHRydWUsCiAgInRleHR1cmVzIiA6IHsKICAgICJTS0lOIiA6IHsKICAgICAgInVybCIgOiAiaHR0cDovL3RleHR1cmVzLm1pbmVjcmFmdC5uZXQvdGV4dHVyZS81M2ZmNTVmMWI4YjI4MjMxY2VlMzY1M2M5NDgxNDA5ZDIyYzU5NzhhZWRmOWEyNDcwMTFjMzE2MGMyYjM2ZDI5IgogICAgfQogIH0KfQ==";
    }

}
