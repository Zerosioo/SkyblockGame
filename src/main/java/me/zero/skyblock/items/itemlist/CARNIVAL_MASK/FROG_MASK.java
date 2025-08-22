package me.zero.skyblock.items.itemlist.CARNIVAL_MASK;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FROG_MASK extends SItem implements ItemStatistics, SkullItem {

    @Override
    public String getName() {
        return "Frog Mask";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "FROG_MASK"; 
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
        return Rarity.EPIC;
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
    public int getForagingFortune() {
        return 7;
    }

    @Override
    public String getTexture() {
        return "ewogICJ0aW1lc3RhbXAiIDogMTcxNDI0NjI0NzQ1NywKICAicHJvZmlsZUlkIiA6ICJmOTEyM2ZjOGQzMzg0OWMwOWFlMzk5YjQ2NDljZDRjZSIsCiAgInByb2ZpbGVOYW1lIiA6ICJab2VfX01heSIsCiAgInNpZ25hdHVyZVJlcXVpcmVkIiA6IHRydWUsCiAgInRleHR1cmVzIiA6IHsKICAgICJTS0lOIiA6IHsKICAgICAgInVybCIgOiAiaHR0cDovL3RleHR1cmVzLm1pbmVjcmFmdC5uZXQvdGV4dHVyZS84NzUyMmExZWFkZjg5OTZmNDJhOGQyZTVmYjBjYTliZmIzYWI0ODNkM2ZiYWY2OGVmMjlhNDJkZThjZWY3NGM1IgogICAgfQogIH0KfQ==";
    }

}
