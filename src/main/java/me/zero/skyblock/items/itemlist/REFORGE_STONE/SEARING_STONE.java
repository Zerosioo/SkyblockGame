package me.zero.skyblock.items.itemlist.REFORGE_STONE;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SEARING_STONE extends SItem implements ItemStatistics, SkullItem, Sellable {

    @Override
    public String getName() {
        return "Searing Stone";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "SEARING_STONE"; 
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
        return ItemType.REFORGE_STONE;
    }

    @Override
    public Rarity getRarity() {
        return Rarity.RARE;
    }

    @Override
    public int getPrice() {
        return 35650;
    }

    @Override
    public String getTexture() {
        return "ewogICJ0aW1lc3RhbXAiIDogMTY0ODQ3MzgwMDQ1MCwKICAicHJvZmlsZUlkIiA6ICJmMjc0YzRkNjI1MDQ0ZTQxOGVmYmYwNmM3NWIyMDIxMyIsCiAgInByb2ZpbGVOYW1lIiA6ICJIeXBpZ3NlbCIsCiAgInNpZ25hdHVyZVJlcXVpcmVkIiA6IHRydWUsCiAgInRleHR1cmVzIiA6IHsKICAgICJTS0lOIiA6IHsKICAgICAgInVybCIgOiAiaHR0cDovL3RleHR1cmVzLm1pbmVjcmFmdC5uZXQvdGV4dHVyZS8yZTAwNzRjNjk4NzRjYzRmMjhjNTI2ZGE5YmUwMjI1ZTg1OGI1MzBjM2NkZTRhMWI0ZWYwZmM4NjdjNWIzY2MzIgogICAgfQogIH0KfQ==";
    }

}
