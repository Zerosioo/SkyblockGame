package me.zero.skyblock.items.itemlist.PORTAL;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DWARVEN_MINES_PORTAL extends SItem implements ItemStatistics, SkullItem {

    @Override
    public String getName() {
        return "Portal to the Dwarven Mines";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "DWARVEN_MINES_PORTAL"; 
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
        return ItemType.PORTAL;
    }

    @Override
    public Rarity getRarity() {
        return Rarity.COMMON;
    }

    @Override
    public String getTexture() {
        return "ewogICJ0aW1lc3RhbXAiIDogMTYxNDUxNzc3NTgxOSwKICAicHJvZmlsZUlkIiA6ICIyMWUzNjdkNzI1Y2Y0ZTNiYjI2OTJjNGEzMDBhNGRlYiIsCiAgInByb2ZpbGVOYW1lIiA6ICJHZXlzZXJNQyIsCiAgInNpZ25hdHVyZVJlcXVpcmVkIiA6IHRydWUsCiAgInRleHR1cmVzIiA6IHsKICAgICJTS0lOIiA6IHsKICAgICAgInVybCIgOiAiaHR0cDovL3RleHR1cmVzLm1pbmVjcmFmdC5uZXQvdGV4dHVyZS82YjIwYjIzYzFhYTJiZTAyNzBmMDE2YjRjOTBkNmVlNmI4MzMwYTE3Y2ZlZjg3ODY5ZDZhZDYwYjJmZmJmM2I1IgogICAgfQogIH0KfQ==";
    }

}
