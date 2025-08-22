package me.zero.skyblock.items.itemlist.NULL;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SINGED_POWDER extends SItem implements ItemStatistics, SkullItem, Sellable {

    @Override
    public String getName() {
        return "Singed Powder";
    }

    @Override
    public List<String> getLore() {
        return new ArrayList(Arrays.asList("§7Before she","§7mastered this","§7ingredient, the","§7§5Fireproof Witch","§5§7was but a mere","§7witch.")); 
    }

    @Override
    public String getId() {
        return "SINGED_POWDER"; 
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
    public int getPrice() {
        return 1000;
    }

    @Override
    public String getTexture() {
        return "ewogICJ0aW1lc3RhbXAiIDogMTczOTY3NTgwNzU2MCwKICAicHJvZmlsZUlkIiA6ICJjNWVmOGQ1NDIwOWY0OTdlYWYzYzA1NjA3MjZhYTMwNSIsCiAgInByb2ZpbGVOYW1lIiA6ICJNaXNoX0RheCIsCiAgInNpZ25hdHVyZVJlcXVpcmVkIiA6IHRydWUsCiAgInRleHR1cmVzIiA6IHsKICAgICJTS0lOIiA6IHsKICAgICAgInVybCIgOiAiaHR0cDovL3RleHR1cmVzLm1pbmVjcmFmdC5uZXQvdGV4dHVyZS9iM2EzNWVjMDZmNmMwYmNiM2NhNmE3YWQ3NGQ2NDkwNGE2MjczMzM5ZDc4Y2VlYmI5NzdjNDQ3NjNiYWJiNzM5IiwKICAgICAgIm1ldGFkYXRhIiA6IHsKICAgICAgICAibW9kZWwiIDogInNsaW0iCiAgICAgIH0KICAgIH0KICB9Cn0=";
    }

}
