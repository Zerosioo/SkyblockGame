package me.zero.skyblock.items.itemlist.NULL;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class EPOCH_CAKE_DARK_GREEN extends SItem implements ItemStatistics, SkullItem, Museum {

    @Override
    public String getName() {
        return "Undead Century Cake";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "EPOCH_CAKE_DARK_GREEN"; 
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
        return Rarity.UNCOMMON;
    }

    @Override
    public boolean isMuseum() {
        return true;
    }

    @Override
    public String getTexture() {
        return "ewogICJ0aW1lc3RhbXAiIDogMTY5MjgwNDA3NTczNSwKICAicHJvZmlsZUlkIiA6ICIwYmM5ZDc3YmQ1YTA0NWMzOTY4MWUzYTRhNDIzODZlMyIsCiAgInByb2ZpbGVOYW1lIiA6ICJWaXRvcmlpaW5oYSIsCiAgInNpZ25hdHVyZVJlcXVpcmVkIiA6IHRydWUsCiAgInRleHR1cmVzIiA6IHsKICAgICJTS0lOIiA6IHsKICAgICAgInVybCIgOiAiaHR0cDovL3RleHR1cmVzLm1pbmVjcmFmdC5uZXQvdGV4dHVyZS9jMzgzMGQyMzVjOWRlNzAzOTQ2ODY0YzI4MWY0MmY5ZDQ1NjQ3NjkxZWUzNTNmYmJiMDcyMjcxNzcwNmI4YmRhIiwKICAgICAgIm1ldGFkYXRhIiA6IHsKICAgICAgICAibW9kZWwiIDogInNsaW0iCiAgICAgIH0KICAgIH0KICB9Cn0=";
    }

}
