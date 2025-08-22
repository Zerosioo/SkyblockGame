package me.zero.skyblock.items.itemlist.DUNGEON_PASS;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CATACOMBS_PASS_0 extends SItem implements ItemStatistics, SkullItem {

    @Override
    public String getName() {
        return "Catacombs Pass 0";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "CATACOMBS_PASS_0"; 
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
        return ItemType.DUNGEON_PASS;
    }

    @Override
    public Rarity getRarity() {
        return Rarity.UNCOMMON;
    }

    @Override
    public boolean isDungeonItem() {
      	return true;
    }

    @Override
    public String getTexture() {
        return "ewogICJ0aW1lc3RhbXAiIDogMTcyMDA0NDAxMDc3MCwKICAicHJvZmlsZUlkIiA6ICI5YzYwYzU3MzRmMDY0YjVkOWE1OTdlNjBjMjI3NjllMiIsCiAgInByb2ZpbGVOYW1lIiA6ICJFcmlja05vb2IwNiIsCiAgInNpZ25hdHVyZVJlcXVpcmVkIiA6IHRydWUsCiAgInRleHR1cmVzIiA6IHsKICAgICJTS0lOIiA6IHsKICAgICAgInVybCIgOiAiaHR0cDovL3RleHR1cmVzLm1pbmVjcmFmdC5uZXQvdGV4dHVyZS8zNWMzMDI0ZjRkOWQxMmRkZjU5NTliNmFlYTNjODEwZjVlZTg1MTc2YWFiMWIyZTdmNDYyYWExYzE5NGMzNDJiIiwKICAgICAgIm1ldGFkYXRhIiA6IHsKICAgICAgICAibW9kZWwiIDogInNsaW0iCiAgICAgIH0KICAgIH0KICB9Cn0=";
    }

}
