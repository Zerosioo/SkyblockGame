package me.zero.skyblock.items.itemlist.REFORGE_STONE;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BLAZE_WAX extends SItem implements ItemStatistics, SkullItem, Sellable {

    @Override
    public String getName() {
        return "Blaze Wax";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "BLAZE_WAX"; 
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
        return ItemType.REFORGE_STONE;
    }

    @Override
    public Rarity getRarity() {
        return Rarity.RARE;
    }

    @Override
    public int getPrice() {
        return 58600;
    }

    @Override
    public String getTexture() {
        return "ewogICJ0aW1lc3RhbXAiIDogMTY0ODQ3Mzc4MDA4NSwKICAicHJvZmlsZUlkIiA6ICI1YjY2YzNkZWZhYTI0NWMzYTcwNjM3OTA3NTQ0Yjg3MCIsCiAgInByb2ZpbGVOYW1lIiA6ICJSZWFuX1JhaWNvMDgxNiIsCiAgInNpZ25hdHVyZVJlcXVpcmVkIiA6IHRydWUsCiAgInRleHR1cmVzIiA6IHsKICAgICJTS0lOIiA6IHsKICAgICAgInVybCIgOiAiaHR0cDovL3RleHR1cmVzLm1pbmVjcmFmdC5uZXQvdGV4dHVyZS9mN2JlYzM3NmVjYmVjNTRkYzY3OTVjYmNhNDkxOGUxMmIxNTNkZDM0YTA4MjdhYmM5YmE3YmU2M2FmODdjMDc4IgogICAgfQogIH0KfQ==";
    }

}
