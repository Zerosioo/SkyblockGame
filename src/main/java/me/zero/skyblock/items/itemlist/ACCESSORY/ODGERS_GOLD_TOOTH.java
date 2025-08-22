package me.zero.skyblock.items.itemlist.ACCESSORY;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ODGERS_GOLD_TOOTH extends SItem implements ItemStatistics, SkullItem {

    @Override
    public String getName() {
        return "Odger's Gold Tooth";
    }

    @Override
    public List<String> getLore() {
        return new ArrayList(Arrays.asList("§7§oA perfectly fine","§7§otooth, besides","§7§oits weight...")); 
    }

    @Override
    public String getId() {
        return "ODGERS_GOLD_TOOTH"; 
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
        return Rarity.RARE;
    }

    @Override
    public Soulbound getSoulbound() {
        return Soulbound.SOLO;
    }

    @Override
    public String getTexture() {
        return "ewogICJ0aW1lc3RhbXAiIDogMTY0Mzg4NjI0Nzc1NiwKICAicHJvZmlsZUlkIiA6ICJiMGQ3MzJmZTAwZjc0MDdlOWU3Zjc0NjMwMWNkOThjYSIsCiAgInByb2ZpbGVOYW1lIiA6ICJPUHBscyIsCiAgInNpZ25hdHVyZVJlcXVpcmVkIiA6IHRydWUsCiAgInRleHR1cmVzIiA6IHsKICAgICJTS0lOIiA6IHsKICAgICAgInVybCIgOiAiaHR0cDovL3RleHR1cmVzLm1pbmVjcmFmdC5uZXQvdGV4dHVyZS80MjAyNDkwMTAyNDYzNmYxYzA3NGU2NTYyMjg1ZjRjYzlmZDNkYTI4ODVkNDAxMGNlZTUyY2MwNjk2ZDJmOTZhIgogICAgfQogIH0KfQ==";
    }

}
