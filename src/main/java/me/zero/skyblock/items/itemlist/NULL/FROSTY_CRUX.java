package me.zero.skyblock.items.itemlist.NULL;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FROSTY_CRUX extends SItem implements ItemStatistics, SkullItem {

    @Override
    public String getName() {
        return "Frosty Crux";
    }

    @Override
    public List<String> getLore() {
        return new ArrayList(Arrays.asList("The illest of the","chillest.")); 
    }

    @Override
    public String getId() {
        return "FROSTY_CRUX"; 
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
    public String getTexture() {
        return "ewogICJ0aW1lc3RhbXAiIDogMTY3NTM2NDIxNTU2OSwKICAicHJvZmlsZUlkIiA6ICJlOWRlMDE0NjExZDI0NGY5OTVjNmNiMjhkMDk5MWExNSIsCiAgInByb2ZpbGVOYW1lIiA6ICJFbGl6YWJldGhUcnVzcyIsCiAgInNpZ25hdHVyZVJlcXVpcmVkIiA6IHRydWUsCiAgInRleHR1cmVzIiA6IHsKICAgICJTS0lOIiA6IHsKICAgICAgInVybCIgOiAiaHR0cDovL3RleHR1cmVzLm1pbmVjcmFmdC5uZXQvdGV4dHVyZS9lOGU4OWVjNTkyMjljZjUyYmQwY2ZkNWY3OWY3Yjc3NjhiNGM0OTZjMGU4NzE4NGI3OGIyZjdjNjY4NTYxOTliIiwKICAgICAgIm1ldGFkYXRhIiA6IHsKICAgICAgICAibW9kZWwiIDogInNsaW0iCiAgICAgIH0KICAgIH0KICB9Cn0=";
    }

}
