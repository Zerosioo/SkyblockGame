package me.zero.skyblock.items.itemlist.NULL;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TITANOBOA_SHED extends SItem implements ItemStatistics, SkullItem, Sellable {

    @Override
    public String getName() {
        return "Titanoboa Shed";
    }

    @Override
    public List<String> getLore() {
        return new ArrayList(Arrays.asList("§7A massive set of","§7discarded snake","§7skin. There's so","§7much of it that","§7it's hard to lift.")); 
    }

    @Override
    public String getId() {
        return "TITANOBOA_SHED"; 
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
    public int getPrice() {
        return 500000;
    }

    @Override
    public String getTexture() {
        return "ewogICJ0aW1lc3RhbXAiIDogMTczOTg4ODEyOTA3OCwKICAicHJvZmlsZUlkIiA6ICI1MzgyNzM1OGIzOTc0ZmJiOTg0OTY5MWM5Yzg3NTA1YiIsCiAgInByb2ZpbGVOYW1lIiA6ICJPdmVyQmlnYm95MTIzIiwKICAic2lnbmF0dXJlUmVxdWlyZWQiIDogdHJ1ZSwKICAidGV4dHVyZXMiIDogewogICAgIlNLSU4iIDogewogICAgICAidXJsIiA6ICJodHRwOi8vdGV4dHVyZXMubWluZWNyYWZ0Lm5ldC90ZXh0dXJlL2Y3ZDMzNzkxM2QzMDFjZTM1MmQzN2EyOGZlMTNhN2M2ZmFlNDA4MzBmMjAzZmEyNWZiNTFiZDkzMWIzMzdiMWYiLAogICAgICAibWV0YWRhdGEiIDogewogICAgICAgICJtb2RlbCIgOiAic2xpbSIKICAgICAgfQogICAgfQogIH0KfQ==";
    }

}
