package me.zero.skyblock.items.itemlist.NECKLACE;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SYNTHESIZER_V1 extends SItem implements ItemStatistics, SkullItem, Sellable {

    @Override
    public String getName() {
        return "Synthesizer v1";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "SYNTHESIZER_V1"; 
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
        return Rarity.EPIC;
    }

    @Override
    public boolean isStackable() {
        return false;
    }

    @Override
    public Gamestage getGamestage() {
        return Gamestage.EXPERT;
    }

    @Override
    public int getPrice() {
        return 3200;
    }

    @Override
    public String getTexture() {
        return "ewogICJ0aW1lc3RhbXAiIDogMTY0ODY3MjgzMjYxNiwKICAicHJvZmlsZUlkIiA6ICIxYTc1ZTNiYmI1NTk0MTc2OTVjMmY4NTY1YzNlMDAzZCIsCiAgInByb2ZpbGVOYW1lIiA6ICJUZXJvZmFyIiwKICAic2lnbmF0dXJlUmVxdWlyZWQiIDogdHJ1ZSwKICAidGV4dHVyZXMiIDogewogICAgIlNLSU4iIDogewogICAgICAidXJsIiA6ICJodHRwOi8vdGV4dHVyZXMubWluZWNyYWZ0Lm5ldC90ZXh0dXJlLzE0OTRiYWFhYTIxNzZhMDQwMmM1MjcxZmVmZTEyMjk3YTFhNTg3N2M4ZTBiZGZkZDRiZTU4ZWRlY2Y2MmNmOGMiLAogICAgICAibWV0YWRhdGEiIDogewogICAgICAgICJtb2RlbCIgOiAic2xpbSIKICAgICAgfQogICAgfQogIH0KfQ==";
    }

}
