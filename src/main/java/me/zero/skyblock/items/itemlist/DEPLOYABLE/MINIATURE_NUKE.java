package me.zero.skyblock.items.itemlist.DEPLOYABLE;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MINIATURE_NUKE extends SItem implements ItemStatistics, SkullItem {

    @Override
    public String getName() {
        return "Miniature Nuke";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "MINIATURE_NUKE"; 
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
        return ItemType.DEPLOYABLE;
    }

    @Override
    public Rarity getRarity() {
        return Rarity.SPECIAL;
    }

    @Override
    public String getTexture() {
        return "ewogICJ0aW1lc3RhbXAiIDogMTY2MDQ4NzMyNjMxNSwKICAicHJvZmlsZUlkIiA6ICJlM2I0NDVjODQ3ZjU0OGZiOGM4ZmEzZjFmN2VmYmE4ZSIsCiAgInByb2ZpbGVOYW1lIiA6ICJNaW5pRGlnZ2VyVGVzdCIsCiAgInNpZ25hdHVyZVJlcXVpcmVkIiA6IHRydWUsCiAgInRleHR1cmVzIiA6IHsKICAgICJTS0lOIiA6IHsKICAgICAgInVybCIgOiAiaHR0cDovL3RleHR1cmVzLm1pbmVjcmFmdC5uZXQvdGV4dHVyZS85MDk4NzhiN2VjMjM5YmMxNTg2ZTIyMGI2YzEzMzdkMjI2MjY4ZWQ5OWQxMWZmZWMwMmRmZTNlNjBjY2I3MDYwIgogICAgfQogIH0KfQ==";
    }

}
