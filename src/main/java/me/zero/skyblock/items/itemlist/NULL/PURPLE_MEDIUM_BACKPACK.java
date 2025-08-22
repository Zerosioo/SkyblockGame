package me.zero.skyblock.items.itemlist.NULL;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PURPLE_MEDIUM_BACKPACK extends SItem implements ItemStatistics, SkullItem {

    @Override
    public String getName() {
        return "Medium Backpack";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "PURPLE_MEDIUM_BACKPACK"; 
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
    public String getTexture() {
        return "ewogICJ0aW1lc3RhbXAiIDogMTcxOTU0MDYzNDkwMywKICAicHJvZmlsZUlkIiA6ICI5YzYwYzU3MzRmMDY0YjVkOWE1OTdlNjBjMjI3NjllMiIsCiAgInByb2ZpbGVOYW1lIiA6ICJFcmlja05vb2IwNiIsCiAgInNpZ25hdHVyZVJlcXVpcmVkIiA6IHRydWUsCiAgInRleHR1cmVzIiA6IHsKICAgICJTS0lOIiA6IHsKICAgICAgInVybCIgOiAiaHR0cDovL3RleHR1cmVzLm1pbmVjcmFmdC5uZXQvdGV4dHVyZS8yM2MzOWM0Yzk3ZjM0ZmUzOWY4N2VjNTZmZmM3NzE2NTI0YmI5NjZiNDM3YWQ0NTYwOWJlMGNhZGVhNDI3MGMzIiwKICAgICAgIm1ldGFkYXRhIiA6IHsKICAgICAgICAibW9kZWwiIDogInNsaW0iCiAgICAgIH0KICAgIH0KICB9Cn0=";
    }

}
