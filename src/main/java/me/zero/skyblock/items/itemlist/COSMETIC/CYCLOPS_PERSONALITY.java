package me.zero.skyblock.items.itemlist.COSMETIC;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CYCLOPS_PERSONALITY extends SItem implements ItemStatistics, SkullItem, Museum {

    @Override
    public String getName() {
        return "Cyclops Minion Skin";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "CYCLOPS_PERSONALITY"; 
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
        return ItemType.COSMETIC;
    }

    @Override
    public Rarity getRarity() {
        return Rarity.COMMON;
    }

    @Override
    public boolean isMuseum() {
        return true;
    }

    @Override
    public String getTexture() {
        return "ewogICJ0aW1lc3RhbXAiIDogMTYzMzcyOTEyNTYyMCwKICAicHJvZmlsZUlkIiA6ICI3NWQ3OTQxMjI0OTM0OTI4YTE1Njc3NjYyODhjN2I1ZCIsCiAgInByb2ZpbGVOYW1lIiA6ICJNYWdpY01hamVzdGljIiwKICAic2lnbmF0dXJlUmVxdWlyZWQiIDogdHJ1ZSwKICAidGV4dHVyZXMiIDogewogICAgIlNLSU4iIDogewogICAgICAidXJsIiA6ICJodHRwOi8vdGV4dHVyZXMubWluZWNyYWZ0Lm5ldC90ZXh0dXJlLzc0M2Q4Zjc3NDQwMTlmMjNiN2ZkNjRiY2JjOGEyYTE2ZjhhYzIxZWVkZDExODY1ZDk3YjZiNmMxOTBmYjFhZjAiCiAgICB9CiAgfQp9";
    }

}
