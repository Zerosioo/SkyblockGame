package me.zero.skyblock.items.itemlist.CARNIVAL_MASK;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PARROT_MASK extends SItem implements ItemStatistics, SkullItem {

    @Override
    public String getName() {
        return "Parrot Mask";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "PARROT_MASK"; 
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
        return ItemType.CARNIVAL_MASK;
    }

    @Override
    public Rarity getRarity() {
        return Rarity.RARE;
    }

    @Override
    public boolean isStackable() {
        return false;
    }

    @Override
    public Gamestage getGamestage() {
        return Gamestage.INTERMEDIATE;
    }

    @Override
    public String getTexture() {
        return "ewogICJ0aW1lc3RhbXAiIDogMTcxNDI0NjI2NDM0OCwKICAicHJvZmlsZUlkIiA6ICJmYjZkM2E5Zjk3MWY0ZTdlYmQ0MjE2Yjk0MjE5NDA3NCIsCiAgInByb2ZpbGVOYW1lIiA6ICJtYXJjaXhkZCIsCiAgInNpZ25hdHVyZVJlcXVpcmVkIiA6IHRydWUsCiAgInRleHR1cmVzIiA6IHsKICAgICJTS0lOIiA6IHsKICAgICAgInVybCIgOiAiaHR0cDovL3RleHR1cmVzLm1pbmVjcmFmdC5uZXQvdGV4dHVyZS84NGI0M2ZhMzAwMThiMjc5NGNiODJjM2VhYzhhODllODdiMWEyMzA4MGZjZTgwYzUyMjQ2ZTMxYzUzOTQ3YzBkIgogICAgfQogIH0KfQ==";
    }

}
