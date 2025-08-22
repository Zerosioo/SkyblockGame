package me.zero.skyblock.items.itemlist.NULL;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CHAIN_END_TIMES extends SItem implements ItemStatistics, SkullItem, Sellable {

    @Override
    public String getName() {
        return "Chain of the End Times";
    }

    @Override
    public List<String> getLore() {
        return new ArrayList(Arrays.asList("§8§oChains capable","§8§oof reshaping the","§8§overy fiber of","§8§oreality, should","§8§othey be left","§8§ounchallenged.","§8§oAnd you wish to","§8§ouse them","§8§oto...get rarer","§8§oTrophy Fish?")); 
    }

    @Override
    public String getId() {
        return "CHAIN_END_TIMES"; 
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
        return Rarity.LEGENDARY;
    }

    @Override
    public int getPrice() {
        return 1000000;
    }

    @Override
    public String getTexture() {
        return "ewogICJ0aW1lc3RhbXAiIDogMTczOTY2NDM4ODI2NCwKICAicHJvZmlsZUlkIiA6ICJlZGUyYzdhMGFjNjM0MTNiYjA5ZDNmMGJlZTllYzhlYyIsCiAgInByb2ZpbGVOYW1lIiA6ICJ0aGVEZXZKYWRlIiwKICAic2lnbmF0dXJlUmVxdWlyZWQiIDogdHJ1ZSwKICAidGV4dHVyZXMiIDogewogICAgIlNLSU4iIDogewogICAgICAidXJsIiA6ICJodHRwOi8vdGV4dHVyZXMubWluZWNyYWZ0Lm5ldC90ZXh0dXJlLzkzZDliYzYyOTRlY2I4NWQ5YzRhZjY2MTM2MDI3ZmFmNjc0MTNmMWRiYWJiZTFiNmRmZWUyODkwODNmYzIwNDkiLAogICAgICAibWV0YWRhdGEiIDogewogICAgICAgICJtb2RlbCIgOiAic2xpbSIKICAgICAgfQogICAgfQogIH0KfQ==";
    }

}
