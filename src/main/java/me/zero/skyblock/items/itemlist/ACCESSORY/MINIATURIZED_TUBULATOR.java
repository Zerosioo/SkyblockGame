package me.zero.skyblock.items.itemlist.ACCESSORY;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MINIATURIZED_TUBULATOR extends SItem implements ItemStatistics, SkullItem {

    @Override
    public String getName() {
        return "Miniaturized Tubulator";
    }

    @Override
    public List<String> getLore() {
        return new ArrayList(Arrays.asList("Don't hate the","player, hate the","game. - Ice T")); 
    }

    @Override
    public String getId() {
        return "MINIATURIZED_TUBULATOR"; 
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
    public Soulbound getSoulbound() {
        return Soulbound.SOLO;
    }

    @Override
    public int getHealth() {
        return 1;
    }

    @Override
    public String getTexture() {
        return "ewogICJ0aW1lc3RhbXAiIDogMTcyMDA0MjQyNzc1MCwKICAicHJvZmlsZUlkIiA6ICI1MjhlYzVmMmEzZmM0MDA0YjYwY2IwOTA5Y2JiMjdjYiIsCiAgInByb2ZpbGVOYW1lIiA6ICJQdWxpenppIiwKICAic2lnbmF0dXJlUmVxdWlyZWQiIDogdHJ1ZSwKICAidGV4dHVyZXMiIDogewogICAgIlNLSU4iIDogewogICAgICAidXJsIiA6ICJodHRwOi8vdGV4dHVyZXMubWluZWNyYWZ0Lm5ldC90ZXh0dXJlL2JkYzc5MTMyMjljYjJlODk4MDcxYjBjMmJjOGYxM2JkOGRiYTY5ZGJkY2NhZjRkMWRhNjQzYWI3MjZiOTI1YWYiLAogICAgICAibWV0YWRhdGEiIDogewogICAgICAgICJtb2RlbCIgOiAic2xpbSIKICAgICAgfQogICAgfQogIH0KfQ==";
    }

}
