package me.zero.skyblock.items.itemlist.NULL;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class REDSTONE_CHEST extends SItem implements ItemStatistics, SkullItem {

    @Override
    public String getName() {
        return "Redstone Chest+";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "REDSTONE_CHEST"; 
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
        return "ewogICJ0aW1lc3RhbXAiIDogMTY0NDc2NjYyMzE3OCwKICAicHJvZmlsZUlkIiA6ICJmNWQwYjFhZTQxNmU0YTE5ODEyMTRmZGQzMWU3MzA1YiIsCiAgInByb2ZpbGVOYW1lIiA6ICJDYXRjaFRoZVdhdmUxMCIsCiAgInNpZ25hdHVyZVJlcXVpcmVkIiA6IHRydWUsCiAgInRleHR1cmVzIiA6IHsKICAgICJTS0lOIiA6IHsKICAgICAgInVybCIgOiAiaHR0cDovL3RleHR1cmVzLm1pbmVjcmFmdC5uZXQvdGV4dHVyZS82OGMxNWZiZTY3Mjg4MThkNTY1ZTk3YTkyZGVjOWI0NjdlYmQyMDI1ZDg2NzFkM2JjNzdhY2I5ODAxZWU5ZmJjIgogICAgfQogIH0KfQ==";
    }

}
