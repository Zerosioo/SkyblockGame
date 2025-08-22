package me.zero.skyblock.items.itemlist.NECKLACE;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DIVAN_PENDANT extends SItem implements ItemStatistics, SkullItem {

    @Override
    public String getName() {
        return "Pendant of Divan";
    }

    @Override
    public List<String> getLore() {
        return new ArrayList(Arrays.asList("§8§oAn item","§8§otreasured by the","§8§ogreatest Dwarf","§8§owho ever lived.","§8§oWhy would he","§8§oleave it behind?")); 
    }

    @Override
    public String getId() {
        return "DIVAN_PENDANT"; 
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
        return ItemType.NECKLACE;
    }

    @Override
    public Rarity getRarity() {
        return Rarity.LEGENDARY;
    }

    @Override
    public Gamestage getGamestage() {
        return Gamestage.MASTER;
    }

    @Override
    public int getMiningFortune() {
        return 25;
    }

    @Override
    public int getMiningSpeed() {
        return 100;
    }

    @Override
    public String getTexture() {
        return "ewogICJ0aW1lc3RhbXAiIDogMTcwOTA2MTI2MjE1NywKICAicHJvZmlsZUlkIiA6ICI2ZjhlYWI1MTVmNTc0MmRhOWYxZDYzMzY1ODAxMDU4YyIsCiAgInByb2ZpbGVOYW1lIiA6ICJDaW5kZXJGb3hfMjAwNiIsCiAgInNpZ25hdHVyZVJlcXVpcmVkIiA6IHRydWUsCiAgInRleHR1cmVzIiA6IHsKICAgICJTS0lOIiA6IHsKICAgICAgInVybCIgOiAiaHR0cDovL3RleHR1cmVzLm1pbmVjcmFmdC5uZXQvdGV4dHVyZS81YWM3MTM0ZmI1YWJmMGE0OGM5ZTk5Y2I3OWQyY2Y3NTk4YzljZTI4NTkxMWMxOTMxZDQ1ZjgyODhiOGEyMGJjIgogICAgfQogIH0KfQ==";
    }

}
