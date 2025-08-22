package me.zero.skyblock.items.itemlist.CARNIVAL_MASK;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ARMADILLO_MASK extends SItem implements ItemStatistics, SkullItem {

    @Override
    public String getName() {
        return "Armadillo Mask";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "ARMADILLO_MASK"; 
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
        return "ewogICJ0aW1lc3RhbXAiIDogMTcxNDI0NjIwMjU0NSwKICAicHJvZmlsZUlkIiA6ICIyNDc2OWQ0ODM1MDU0N2JmYjg4OThiZTJlYzQ5ODZiMyIsCiAgInByb2ZpbGVOYW1lIiA6ICJBaXJidXNfQTM4TyIsCiAgInNpZ25hdHVyZVJlcXVpcmVkIiA6IHRydWUsCiAgInRleHR1cmVzIiA6IHsKICAgICJTS0lOIiA6IHsKICAgICAgInVybCIgOiAiaHR0cDovL3RleHR1cmVzLm1pbmVjcmFmdC5uZXQvdGV4dHVyZS85MjU5YTM0MmJlNGYxMzk5MzM0YzlhNDBlYzI1MDBiODFkMWU3M2FmZThmMjk2ZmU3NjcxMjVkZWRlYzM4ZTRmIgogICAgfQogIH0KfQ==";
    }

}
