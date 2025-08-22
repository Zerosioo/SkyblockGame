package me.zero.skyblock.items.itemlist.ACCESSORY;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ODGERS_DIAMOND_TOOTH extends SItem implements ItemStatistics, SkullItem {

    @Override
    public String getName() {
        return "Odger's Diamond Tooth";
    }

    @Override
    public List<String> getLore() {
        return new ArrayList(Arrays.asList("§7§oA perfectly fine","§7§otooth, besides","§7§oits radiant","§7§obrightness...")); 
    }

    @Override
    public String getId() {
        return "ODGERS_DIAMOND_TOOTH"; 
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
        return Rarity.EPIC;
    }

    @Override
    public Soulbound getSoulbound() {
        return Soulbound.SOLO;
    }

    @Override
    public String getTexture() {
        return "ewogICJ0aW1lc3RhbXAiIDogMTY0Mzg4NjI2NDEzNywKICAicHJvZmlsZUlkIiA6ICIyM2YxYTU5ZjQ2OWI0M2RkYmRiNTM3YmZlYzEwNDcxZiIsCiAgInByb2ZpbGVOYW1lIiA6ICIyODA3IiwKICAic2lnbmF0dXJlUmVxdWlyZWQiIDogdHJ1ZSwKICAidGV4dHVyZXMiIDogewogICAgIlNLSU4iIDogewogICAgICAidXJsIiA6ICJodHRwOi8vdGV4dHVyZXMubWluZWNyYWZ0Lm5ldC90ZXh0dXJlL2EyNjgwYTI4OTYyZTlhZDJkNDg3MmQwNmZiYTJjYzYwODI0ZmJiMmQwODI0ZTQyZDk1ODU3NWI3NTYzODg0YWEiCiAgICB9CiAgfQp9";
    }

}
