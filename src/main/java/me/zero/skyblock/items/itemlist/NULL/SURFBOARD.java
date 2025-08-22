package me.zero.skyblock.items.itemlist.NULL;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SURFBOARD extends SItem implements ItemStatistics, SkullItem {

    @Override
    public String getName() {
        return "Surfboard";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "SURFBOARD"; 
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
        return Rarity.EPIC;
    }

    @Override
    public String getTexture() {
        return "ewogICJ0aW1lc3RhbXAiIDogMTU5MjA5NzAzNjI1NywKICAicHJvZmlsZUlkIiA6ICJhNmE3MzI2NjZhZTI0YjIwYWQyNmIzYWZkZWZjNmM1MCIsCiAgInByb2ZpbGVOYW1lIiA6ICJNeXN0aWNHYW1lck1hbiIsCiAgInNpZ25hdHVyZVJlcXVpcmVkIiA6IHRydWUsCiAgInRleHR1cmVzIiA6IHsKICAgICJTS0lOIiA6IHsKICAgICAgInVybCIgOiAiaHR0cDovL3RleHR1cmVzLm1pbmVjcmFmdC5uZXQvdGV4dHVyZS9iMjIzOWNjZWM0YzkzYzE2YTcxMDk5NDEwMTRkZjA2MWNiM2UzNzA4NjY2ODhiMTUyOTFiZmQ4NDI1MjFlODYxIgogICAgfQogIH0KfQ==";
    }

}
