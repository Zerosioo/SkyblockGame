package me.zero.skyblock.items.itemlist.NULL;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class VOLTA extends SItem implements ItemStatistics, SkullItem, Sellable {

    @Override
    public String getName() {
        return "Volta";
    }

    @Override
    public List<String> getLore() {
        return new ArrayList(Arrays.asList("§7§oBzzzt")); 
    }

    @Override
    public String getId() {
        return "VOLTA"; 
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
    public int getPrice() {
        return 1111;
    }

    @Override
    public String getTexture() {
        return "ewogICJ0aW1lc3RhbXAiIDogMTYxMDY0MjE1MzExNCwKICAicHJvZmlsZUlkIiA6ICI5ZDEzZjcyMTcxM2E0N2U0OTAwZTMyZGVkNjBjNDY3MyIsCiAgInByb2ZpbGVOYW1lIiA6ICJUYWxvZGFvIiwKICAic2lnbmF0dXJlUmVxdWlyZWQiIDogdHJ1ZSwKICAidGV4dHVyZXMiIDogewogICAgIlNLSU4iIDogewogICAgICAidXJsIiA6ICJodHRwOi8vdGV4dHVyZXMubWluZWNyYWZ0Lm5ldC90ZXh0dXJlLzYzYTQwNWZiMjg2ZGJiMzJlOWIzOTA4ZjYwOTQ4ZjAyMDczMDZjODI1ZTYzYWM5ZTYyNmVkMWRiYjJmN2EyYmUiCiAgICB9CiAgfQp9";
    }

}
