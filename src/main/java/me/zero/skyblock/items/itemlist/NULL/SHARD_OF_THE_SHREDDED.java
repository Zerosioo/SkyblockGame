package me.zero.skyblock.items.itemlist.NULL;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SHARD_OF_THE_SHREDDED extends SItem implements ItemStatistics, SkullItem {

    @Override
    public String getName() {
        return "Shard of the Shredded";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "SHARD_OF_THE_SHREDDED"; 
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
 	return null;
    }

    @Override
    public Rarity getRarity() {
        return Rarity.LEGENDARY;
    }

    @Override
    public String getTexture() {
        return "ewogICJ0aW1lc3RhbXAiIDogMTYyMjEyNDkwMzA5MSwKICAicHJvZmlsZUlkIiA6ICJiNjM2OWQ0MzMwNTU0NGIzOWE5OTBhODYyNWY5MmEwNSIsCiAgInByb2ZpbGVOYW1lIiA6ICJCb2JpbmhvXyIsCiAgInNpZ25hdHVyZVJlcXVpcmVkIiA6IHRydWUsCiAgInRleHR1cmVzIiA6IHsKICAgICJTS0lOIiA6IHsKICAgICAgInVybCIgOiAiaHR0cDovL3RleHR1cmVzLm1pbmVjcmFmdC5uZXQvdGV4dHVyZS9iMTA4NTdlODcyNzExZTdlNjkyNWM5ZWYxMTE1MzUzYjQ3ZjU4ZWYwN2ViNWMyZDU2NWYxZjg2MDIzZTdhMjg0IgogICAgfQogIH0KfQ==";
    }

}
