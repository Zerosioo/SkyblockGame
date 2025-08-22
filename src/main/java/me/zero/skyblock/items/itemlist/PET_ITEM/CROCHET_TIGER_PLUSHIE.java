package me.zero.skyblock.items.itemlist.PET_ITEM;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CROCHET_TIGER_PLUSHIE extends SItem implements ItemStatistics, SkullItem {

    @Override
    public String getName() {
        return "Crochet Tiger Plushie";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "CROCHET_TIGER_PLUSHIE"; 
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
        return ItemType.PET_ITEM;
    }

    @Override
    public Rarity getRarity() {
        return Rarity.EPIC;
    }

    @Override
    public String getTexture() {
        return "ewogICJ0aW1lc3RhbXAiIDogMTU5MDcxNDc3MjE0NiwKICAicHJvZmlsZUlkIiA6ICIyMWUzNjdkNzI1Y2Y0ZTNiYjI2OTJjNGEzMDBhNGRlYiIsCiAgInByb2ZpbGVOYW1lIiA6ICJHZXlzZXJNQyIsCiAgInNpZ25hdHVyZVJlcXVpcmVkIiA6IHRydWUsCiAgInRleHR1cmVzIiA6IHsKICAgICJTS0lOIiA6IHsKICAgICAgInVybCIgOiAiaHR0cDovL3RleHR1cmVzLm1pbmVjcmFmdC5uZXQvdGV4dHVyZS9mNjZmYjRkOWU2YWUwYzVlNjFlYzZiOTEzMWUwMTVmYjg5NzkyODUyZTE5NWU5Njg2NDY2MmJhNDIyZWYyNmUyIgogICAgfQogIH0KfQ==";
    }

}
