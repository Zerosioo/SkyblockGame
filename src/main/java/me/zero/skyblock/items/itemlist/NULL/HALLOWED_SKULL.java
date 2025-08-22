package me.zero.skyblock.items.itemlist.NULL;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class HALLOWED_SKULL extends SItem implements ItemStatistics, SkullItem, Sellable {

    @Override
    public String getName() {
        return "Hallowed Skull";
    }

    @Override
    public List<String> getLore() {
        return new ArrayList(Arrays.asList("§7§oIncredibly","§7§oheavy. Put one","§7§oon each side of","§7§oa stick and you","§7§ojust crafted","§7§oyourself very","§7§ostylish","§7§odumbbells.")); 
    }

    @Override
    public String getId() {
        return "HALLOWED_SKULL"; 
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
    public int getPrice() {
        return 500;
    }

    @Override
    public String getTexture() {
        return "ewogICJ0aW1lc3RhbXAiIDogMTYzOTUxMzAzMDU1NywKICAicHJvZmlsZUlkIiA6ICIwZWQ2MDFlMDhjZTM0YjRkYWUxZmI4MDljZmEwNTM5NiIsCiAgInByb2ZpbGVOYW1lIiA6ICJOZWVkTW9yZUFjY291bnRzIiwKICAic2lnbmF0dXJlUmVxdWlyZWQiIDogdHJ1ZSwKICAidGV4dHVyZXMiIDogewogICAgIlNLSU4iIDogewogICAgICAidXJsIiA6ICJodHRwOi8vdGV4dHVyZXMubWluZWNyYWZ0Lm5ldC90ZXh0dXJlL2U1ZDkyZTg5ZTQ3MzdkY2ZhZTVlNTcxYzc2Zjc2MDRhN2FiN2M5ZTAzZjc4YzE4MjE3MWQxMDk1NzE0MTU2ZDEiLAogICAgICAibWV0YWRhdGEiIDogewogICAgICAgICJtb2RlbCIgOiAic2xpbSIKICAgICAgfQogICAgfQogIH0KfQ==";
    }

}
