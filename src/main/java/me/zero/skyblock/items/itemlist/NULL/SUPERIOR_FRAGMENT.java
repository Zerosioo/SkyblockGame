package me.zero.skyblock.items.itemlist.NULL;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SUPERIOR_FRAGMENT extends SItem implements ItemStatistics, SkullItem {

    @Override
    public String getName() {
        return "Superior Dragon Fragment";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "SUPERIOR_FRAGMENT"; 
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
        return "ewogICJ0aW1lc3RhbXAiIDogMTYxMzYxMzg4MDk0MCwKICAicHJvZmlsZUlkIiA6ICJjMDI0Y2M0YTQwMzc0YWFjYTk2ZTE2Y2MwODM1ZDE4MCIsCiAgInByb2ZpbGVOYW1lIiA6ICJHZW9yZ2VOb0ZvdW5kIiwKICAic2lnbmF0dXJlUmVxdWlyZWQiIDogdHJ1ZSwKICAidGV4dHVyZXMiIDogewogICAgIlNLSU4iIDogewogICAgICAidXJsIiA6ICJodHRwOi8vdGV4dHVyZXMubWluZWNyYWZ0Lm5ldC90ZXh0dXJlLzZmODliMTUwYmU5YzRjNTI0OWYzNTVmNjhlYTBjNDM5MTMwMGE5YmUxZjI2MGQ3NTBmYzM1YTE4MTdhZDc5NmUiLAogICAgICAibWV0YWRhdGEiIDogewogICAgICAgICJtb2RlbCIgOiAic2xpbSIKICAgICAgfQogICAgfQogIH0KfQ==";
    }

}
