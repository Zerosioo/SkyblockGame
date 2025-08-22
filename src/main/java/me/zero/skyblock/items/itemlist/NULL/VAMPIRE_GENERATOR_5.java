package me.zero.skyblock.items.itemlist.NULL;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class VAMPIRE_GENERATOR_5 extends SItem implements ItemStatistics, SkullItem {

    @Override
    public String getName() {
        return "Vampire Minion V";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "VAMPIRE_GENERATOR_5"; 
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
        return "ewogICJ0aW1lc3RhbXAiIDogMTY4MzU0NDM0NjQ3OCwKICAicHJvZmlsZUlkIiA6ICIwYzE1OTI3Yjc4OTY0MTA3OTA5MWQyMjkxN2U0NmIyYyIsCiAgInByb2ZpbGVOYW1lIiA6ICJZb3VBcmVTY2FyeSIsCiAgInNpZ25hdHVyZVJlcXVpcmVkIiA6IHRydWUsCiAgInRleHR1cmVzIiA6IHsKICAgICJTS0lOIiA6IHsKICAgICAgInVybCIgOiAiaHR0cDovL3RleHR1cmVzLm1pbmVjcmFmdC5uZXQvdGV4dHVyZS85ZGRmYWNmOTllNzdmOTZjMTE3MjZiOWE4YjY1MDM4N2JhOTZmMTFkY2EzZjdkZjUzNmM1MjdlNzRmMjA0OGQzIgogICAgfQogIH0KfQ==";
    }

}
