package me.zero.skyblock.items.itemlist.HELMET;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MENDER_CROWN extends SItem implements ItemStatistics, SkullItem {

    @Override
    public String getName() {
        return "Mender Crown";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "MENDER_CROWN"; 
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
        return ItemType.HELMET;
    }

    @Override
    public Rarity getRarity() {
        return Rarity.EPIC;
    }

    @Override
    public boolean isDungeonItem() {
      	return true;
    }

    @Override
    public Gamestage getGamestage() {
        return Gamestage.SKILLED;
    }

    @Override
    public DungeonType getDungeonType() {
        return DungeonType.CATACOMBS;
    }

    @Override
    public int getGearScore() {
        return 30;
    }

    @Override
    public int getHealth() {
        return 270;
    }

    @Override
    public String getTexture() {
        return "ewogICJ0aW1lc3RhbXAiIDogMTcxOTg2Mjg1NDkzOSwKICAicHJvZmlsZUlkIiA6ICJmNmYxY2IxMmYzNDU0MDRlYjZlNjU2NGE2ZDlmMjU2NyIsCiAgInByb2ZpbGVOYW1lIiA6ICJBdXJlbGl1c0dlbWluaSIsCiAgInNpZ25hdHVyZVJlcXVpcmVkIiA6IHRydWUsCiAgInRleHR1cmVzIiA6IHsKICAgICJTS0lOIiA6IHsKICAgICAgInVybCIgOiAiaHR0cDovL3RleHR1cmVzLm1pbmVjcmFmdC5uZXQvdGV4dHVyZS82YzdlMTA3MGQxMjU4MWJkNDhlODBmNTkwNTRlOTI0MTJlNDUzYTYyN2VkMjk4OGIzYTVhMzVmZDVjNzA4ZTBkIgogICAgfQogIH0KfQ==";
    }

}
