package me.zero.skyblock.items.itemlist.ACCESSORY;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RICH_CHOCOLATE_CHUNK extends SItem implements ItemStatistics, SkullItem {

    @Override
    public String getName() {
        return "Rich Chocolate Chunk";
    }

    @Override
    public List<String> getLore() {
        return new ArrayList(Arrays.asList("§8§oFrom the","§8§oFactory's secret","§8§oreserves, its","§8§orich flavor is a","§8§odeep dive into","§8§oindulgence.")); 
    }

    @Override
    public String getId() {
        return "RICH_CHOCOLATE_CHUNK"; 
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
        return Rarity.RARE;
    }

    @Override
    public String getTexture() {
        return "ewogICJ0aW1lc3RhbXAiIDogMTcxMTQ2MjUxMDg3MSwKICAicHJvZmlsZUlkIiA6ICJkNWMyZjNmZWY2NjM0ZDk4OGFmMmJjMDkwNGEzMzAzNSIsCiAgInByb2ZpbGVOYW1lIiA6ICJCTU1HQSIsCiAgInNpZ25hdHVyZVJlcXVpcmVkIiA6IHRydWUsCiAgInRleHR1cmVzIiA6IHsKICAgICJTS0lOIiA6IHsKICAgICAgInVybCIgOiAiaHR0cDovL3RleHR1cmVzLm1pbmVjcmFmdC5uZXQvdGV4dHVyZS82Zjk0MjcxNzM2NGMwZmVjZjdhZDExYmFjOGNkOThkZDdhZDRkYmQ3MmUzZDNjZTJiNTdlYjQ4NzEzODI0ZmYiCiAgICB9CiAgfQp9";
    }

}
