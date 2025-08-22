package me.zero.skyblock.items.itemlist.NULL;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DEEPTERROR_MIXIN extends SItem implements ItemStatistics, SkullItem {

    @Override
    public String getName() {
        return "Deepterror Mixin";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "DEEPTERROR_MIXIN"; 
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
    public boolean isStackable() {
        return false;
    }

    @Override
    public String getTexture() {
        return "ewogICJ0aW1lc3RhbXAiIDogMTY2NTY3Mjg3MDAyMCwKICAicHJvZmlsZUlkIiA6ICI0M2NmNWJkNjUyMDM0YzU5ODVjMDIwYWI3NDE0OGQxYiIsCiAgInByb2ZpbGVOYW1lIiA6ICJrYW1pbDQ0NSIsCiAgInNpZ25hdHVyZVJlcXVpcmVkIiA6IHRydWUsCiAgInRleHR1cmVzIiA6IHsKICAgICJTS0lOIiA6IHsKICAgICAgInVybCIgOiAiaHR0cDovL3RleHR1cmVzLm1pbmVjcmFmdC5uZXQvdGV4dHVyZS81YjhlYzllNzJhMjk2MmQ5YzEyYjc4NTNhYWM4NzIxNzcwODQwZjUxNDVjZGZlMWU0N2E1ODBmZDhiZDdmMTM2IiwKICAgICAgIm1ldGFkYXRhIiA6IHsKICAgICAgICAibW9kZWwiIDogInNsaW0iCiAgICAgIH0KICAgIH0KICB9Cn0=";
    }

}
