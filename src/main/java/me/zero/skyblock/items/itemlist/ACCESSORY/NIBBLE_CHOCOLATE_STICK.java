package me.zero.skyblock.items.itemlist.ACCESSORY;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class NIBBLE_CHOCOLATE_STICK extends SItem implements ItemStatistics, SkullItem {

    @Override
    public String getName() {
        return "Nibble Chocolate Stick";
    }

    @Override
    public List<String> getLore() {
        return new ArrayList(Arrays.asList("§8§oA delightful","§8§otreat from the","§8§oFactory. Its","§8§ocrisp taste","§8§osparks joy with","§8§oevery bite.")); 
    }

    @Override
    public String getId() {
        return "NIBBLE_CHOCOLATE_STICK"; 
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
        return "ewogICJ0aW1lc3RhbXAiIDogMTcxMTQ2MjU0NzI5MCwKICAicHJvZmlsZUlkIiA6ICI2OGVmMmM5NTc5NjM0MjE4YjYwNTM5YWVlOTU3NWJiNSIsCiAgInByb2ZpbGVOYW1lIiA6ICJUaGVNdWx0aUFjb3VudCIsCiAgInNpZ25hdHVyZVJlcXVpcmVkIiA6IHRydWUsCiAgInRleHR1cmVzIiA6IHsKICAgICJTS0lOIiA6IHsKICAgICAgInVybCIgOiAiaHR0cDovL3RleHR1cmVzLm1pbmVjcmFmdC5uZXQvdGV4dHVyZS84ODgxODhkNjI5MDhhZjZlMTE0ZjczYTEwOWUxNWFjN2YxZmFkZWQzOWFiZDZhMjA1NDAzNGVjNWNjNzBjNzI3IgogICAgfQogIH0KfQ==";
    }

}
