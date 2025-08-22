package me.zero.skyblock.items.itemlist.ACCESSORY;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class POCKET_ESPRESSO_MACHINE extends SItem implements ItemStatistics, SkullItem {

    @Override
    public String getName() {
        return "Pocket Espresso Machine";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "POCKET_ESPRESSO_MACHINE"; 
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
        return ItemType.ACCESSORY;
    }

    @Override
    public Rarity getRarity() {
        return Rarity.COMMON;
    }

    @Override
    public String getTexture() {
        return "ewogICJ0aW1lc3RhbXAiIDogMTY5Mzc3MTY1NDc2MCwKICAicHJvZmlsZUlkIiA6ICJkN2Y4OTAyMWMxNmQ0ZjFhODg3ODQyNDQyZjc3NGI0ZiIsCiAgInByb2ZpbGVOYW1lIiA6ICJQYW5kYXRvSG9wZSIsCiAgInNpZ25hdHVyZVJlcXVpcmVkIiA6IHRydWUsCiAgInRleHR1cmVzIiA6IHsKICAgICJTS0lOIiA6IHsKICAgICAgInVybCIgOiAiaHR0cDovL3RleHR1cmVzLm1pbmVjcmFmdC5uZXQvdGV4dHVyZS82NjYwNzBjZTAzYTU0NWVlNGQyNjNiY2YyN2YzNjMzOGQyNDlkN2NiN2EyMzc2ZjkyYzE2NzNhZTEzNGUwNGI2IgogICAgfQogIH0KfQ==";
    }

}
