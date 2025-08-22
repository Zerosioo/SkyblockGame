package me.zero.skyblock.items.itemlist.ACCESSORY;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BEASTMASTER_CREST_UNCOMMON extends SItem implements ItemStatistics, SkullItem {

    @Override
    public String getName() {
        return "Beastmaster Crest";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "BEASTMASTER_CREST_UNCOMMON"; 
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
    public String getTexture() {
        return "eyJ0aW1lc3RhbXAiOjE0NjQwNDA4OTY2ODksInByb2ZpbGVJZCI6ImIwZDRiMjhiYzFkNzQ4ODlhZjBlODY2MWNlZTk2YWFiIiwicHJvZmlsZU5hbWUiOiJJbnZlbnRpdmVHYW1lcyIsInNpZ25hdHVyZVJlcXVpcmVkIjp0cnVlLCJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvNTM0MTU2NjdkZTNmYjg5YzVmNDBjODgwYzM5ZTQ5NzFhMGNhYTdmM2E5ZDJjOGY3MTJiYTM3ZmFkY2VlIn19fQ==";
    }

}
