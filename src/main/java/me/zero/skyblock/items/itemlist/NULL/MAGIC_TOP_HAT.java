package me.zero.skyblock.items.itemlist.NULL;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MAGIC_TOP_HAT extends SItem implements ItemStatistics, SkullItem {

    @Override
    public String getName() {
        return "Magic Top Hat";
    }

    @Override
    public List<String> getLore() {
        return new ArrayList(Arrays.asList("§8§oA hat so","§8§ocharming, even","§8§orabbits wish to","§8§ocall it home.")); 
    }

    @Override
    public String getId() {
        return "MAGIC_TOP_HAT"; 
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
    public String getTexture() {
        return "ewogICJ0aW1lc3RhbXAiIDogMTcwODMxMDQxMDcyNSwKICAicHJvZmlsZUlkIiA6ICI2NGY0MGFiNzFmM2E0NGZiYjg0N2I5ZWFhOWZjNDRlNSIsCiAgInByb2ZpbGVOYW1lIiA6ICJvZGF2aWRjZXNhciIsCiAgInNpZ25hdHVyZVJlcXVpcmVkIiA6IHRydWUsCiAgInRleHR1cmVzIiA6IHsKICAgICJTS0lOIiA6IHsKICAgICAgInVybCIgOiAiaHR0cDovL3RleHR1cmVzLm1pbmVjcmFmdC5uZXQvdGV4dHVyZS83MTVjNWM5ZjI3OWIxMTY0ZWNkNWU2N2UxNDQ3ODgwMjE4NGJiMDMwMzFkMWE5ZmYzNWU0NmI4NjNhOWMwNmJjIgogICAgfQogIH0KfQ==";
    }

}
