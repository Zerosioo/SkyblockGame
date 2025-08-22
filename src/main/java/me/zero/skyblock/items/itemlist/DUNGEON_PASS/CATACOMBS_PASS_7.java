package me.zero.skyblock.items.itemlist.DUNGEON_PASS;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CATACOMBS_PASS_7 extends SItem implements ItemStatistics, SkullItem {

    @Override
    public String getName() {
        return "Catacombs Pass VII";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "CATACOMBS_PASS_7"; 
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
        return ItemType.DUNGEON_PASS;
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
    public String getTexture() {
        return "ewogICJ0aW1lc3RhbXAiIDogMTcxOTg3MjMxODIzNywKICAicHJvZmlsZUlkIiA6ICIyMmNhZTExMTU4MzA0MjU5OGQ3Nzc2ZGI4YzlhZjZmNiIsCiAgInByb2ZpbGVOYW1lIiA6ICJHcmFuZ2VyVGhlRG9nIiwKICAic2lnbmF0dXJlUmVxdWlyZWQiIDogdHJ1ZSwKICAidGV4dHVyZXMiIDogewogICAgIlNLSU4iIDogewogICAgICAidXJsIiA6ICJodHRwOi8vdGV4dHVyZXMubWluZWNyYWZ0Lm5ldC90ZXh0dXJlLzc2OTY1ZTNmZDYxOWRlNmIwYTdjZTE2NzMwNzI1MjBhOTM2MDM3OGUxY2I4YzE5ZDRiYWYwYzg2NzY5ZDM3NjQiLAogICAgICAibWV0YWRhdGEiIDogewogICAgICAgICJtb2RlbCIgOiAic2xpbSIKICAgICAgfQogICAgfQogIH0KfQ==";
    }

}
