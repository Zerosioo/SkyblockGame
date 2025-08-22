package me.zero.skyblock.items.itemlist.ACCESSORY;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TEST_BUCKET_PLEASE_IGNORE extends SItem implements ItemStatistics, SkullItem {

    @Override
    public String getName() {
        return "Test Bucket Please Ignore";
    }

    @Override
    public List<String> getLore() {
        return new ArrayList(Arrays.asList("Was it all a test?")); 
    }

    @Override
    public String getId() {
        return "TEST_BUCKET_PLEASE_IGNORE"; 
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
        return ItemType.ACCESSORY;
    }

    @Override
    public Rarity getRarity() {
        return Rarity.UNCOMMON;
    }

    @Override
    public Soulbound getSoulbound() {
        return Soulbound.SOLO;
    }

    @Override
    public String getTexture() {
        return "ewogICJ0aW1lc3RhbXAiIDogMTcyMDA0MjM3OTYxOCwKICAicHJvZmlsZUlkIiA6ICI3Mjc2ZThmYzVkNjE0ODNjYmMwN2IxYjIzNjI3MDA4ZSIsCiAgInByb2ZpbGVOYW1lIiA6ICJXYWJvV2ViaSIsCiAgInNpZ25hdHVyZVJlcXVpcmVkIiA6IHRydWUsCiAgInRleHR1cmVzIiA6IHsKICAgICJTS0lOIiA6IHsKICAgICAgInVybCIgOiAiaHR0cDovL3RleHR1cmVzLm1pbmVjcmFmdC5uZXQvdGV4dHVyZS8yMTQzMmZkNGM4Zjg1YzgwOWE4MWI3NjEwMTRjN2FkZDJiZDlhNDY1MzI0NjdhNWY2NzJlNmJiZDVjYTdhMGJjIgogICAgfQogIH0KfQ==";
    }

}
