package me.zero.skyblock.items.itemlist.ACCESSORY;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BAT_PERSON_RING extends SItem implements ItemStatistics, SkullItem {

    @Override
    public String getName() {
        return "Bat Person Ring";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "BAT_PERSON_RING"; 
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
        return "ewogICJ0aW1lc3RhbXAiIDogMTcyMDA0MzgyMjU4NywKICAicHJvZmlsZUlkIiA6ICI1MzgyNzM1OGIzOTc0ZmJiOTg0OTY5MWM5Yzg3NTA1YiIsCiAgInByb2ZpbGVOYW1lIiA6ICJPdmVyQmlnYm95MTIzIiwKICAic2lnbmF0dXJlUmVxdWlyZWQiIDogdHJ1ZSwKICAidGV4dHVyZXMiIDogewogICAgIlNLSU4iIDogewogICAgICAidXJsIiA6ICJodHRwOi8vdGV4dHVyZXMubWluZWNyYWZ0Lm5ldC90ZXh0dXJlL2I0NDUxZWNmMjU4NGEzNmRlNDI5NzAzMWM2ZDg1Mjk3N2QzZTI0OWU4NWEzZjBhZGQ5NjdmY2Q3ZDZiZGU5NTMiLAogICAgICAibWV0YWRhdGEiIDogewogICAgICAgICJtb2RlbCIgOiAic2xpbSIKICAgICAgfQogICAgfQogIH0KfQ==";
    }

}
