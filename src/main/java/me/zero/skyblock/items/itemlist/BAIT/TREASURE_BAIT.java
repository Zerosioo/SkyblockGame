package me.zero.skyblock.items.itemlist.BAIT;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TREASURE_BAIT extends SItem implements ItemStatistics, SkullItem, Sellable {

    @Override
    public String getName() {
        return "Treasure Bait";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "TREASURE_BAIT"; 
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
        return ItemType.BAIT;
    }

    @Override
    public Rarity getRarity() {
        return Rarity.RARE;
    }

    @Override
    public int getPrice() {
        return 500;
    }

    @Override
    public String getTexture() {
        return "ewogICJ0aW1lc3RhbXAiIDogMTczOTk4ODE1OTA0OCwKICAicHJvZmlsZUlkIiA6ICI1NjExYmE1MjFmNDM0OWYwOWE0MTI5ZTM0NjQzMDM1OSIsCiAgInByb2ZpbGVOYW1lIiA6ICJHdXlOYW1lZEthaW5lIiwKICAic2lnbmF0dXJlUmVxdWlyZWQiIDogdHJ1ZSwKICAidGV4dHVyZXMiIDogewogICAgIlNLSU4iIDogewogICAgICAidXJsIiA6ICJodHRwOi8vdGV4dHVyZXMubWluZWNyYWZ0Lm5ldC90ZXh0dXJlL2MxNjk1YzgwODU0NDQ3YjVkYjVhMGVlNmQ1N2VmMGE3ZDkxZDgxNWJkN2U2MzE4YzUxNmEzOWQxMmZlMDYzOWUiLAogICAgICAibWV0YWRhdGEiIDogewogICAgICAgICJtb2RlbCIgOiAic2xpbSIKICAgICAgfQogICAgfQogIH0KfQ==";
    }

}
