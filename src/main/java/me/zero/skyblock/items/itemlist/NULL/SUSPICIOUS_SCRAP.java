package me.zero.skyblock.items.itemlist.NULL;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SUSPICIOUS_SCRAP extends SItem implements ItemStatistics, SkullItem {

    @Override
    public String getName() {
        return "Suspicious Scrap";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "SUSPICIOUS_SCRAP"; 
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
        return Rarity.RARE;
    }

    @Override
    public String getTexture() {
        return "ewogICJ0aW1lc3RhbXAiIDogMTcwOTI3NjQwNjQ2MywKICAicHJvZmlsZUlkIiA6ICI0MmIwOTMyZDUwMWI0MWQ1YTM4YjEwOTcxYTYwYmYxMyIsCiAgInByb2ZpbGVOYW1lIiA6ICJBaXJib2x0MDc4IiwKICAic2lnbmF0dXJlUmVxdWlyZWQiIDogdHJ1ZSwKICAidGV4dHVyZXMiIDogewogICAgIlNLSU4iIDogewogICAgICAidXJsIiA6ICJodHRwOi8vdGV4dHVyZXMubWluZWNyYWZ0Lm5ldC90ZXh0dXJlLzMyNDI3ZDAyNmVlOGU4M2Y3NDQyMjc3MmJhZDBhYWU0NGExNmVlY2U3MDg5MDFmYzIwNmE1MWY0NzIwZjcxZWYiLAogICAgICAibWV0YWRhdGEiIDogewogICAgICAgICJtb2RlbCIgOiAic2xpbSIKICAgICAgfQogICAgfQogIH0KfQ==";
    }

}
