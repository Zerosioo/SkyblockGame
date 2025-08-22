package me.zero.skyblock.items.itemlist.REFORGE_STONE;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DRAGON_CLAW extends SItem implements ItemStatistics, SkullItem, Sellable {

    @Override
    public String getName() {
        return "Dragon Claw";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "DRAGON_CLAW"; 
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
        return 1;
    }

    @Override
    public String getTexture() {
        return "ewogICJ0aW1lc3RhbXAiIDogMTY0MTA2MTU0NTE1NSwKICAicHJvZmlsZUlkIiA6ICJkOWQyZTg3ZjI1M2Q0NGI3YmYxMDc3OTZhZGRmODI2ZSIsCiAgInByb2ZpbGVOYW1lIiA6ICJIYWNrR2lybCIsCiAgInNpZ25hdHVyZVJlcXVpcmVkIiA6IHRydWUsCiAgInRleHR1cmVzIiA6IHsKICAgICJTS0lOIiA6IHsKICAgICAgInVybCIgOiAiaHR0cDovL3RleHR1cmVzLm1pbmVjcmFmdC5uZXQvdGV4dHVyZS8yYjdmOWY0ODcyNmU1MjViMGQ5YTA4NjgxNzhjMzIzMzQ3NGVlNGVkM2RhM2Y3NjE5ODU3NDQ5ZDQxYTBjNjNhIgogICAgfQogIH0KfQ==";
    }

}
