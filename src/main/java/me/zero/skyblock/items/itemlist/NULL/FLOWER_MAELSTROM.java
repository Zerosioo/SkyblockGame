package me.zero.skyblock.items.itemlist.NULL;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FLOWER_MAELSTROM extends SItem implements ItemStatistics, SkullItem {

    @Override
    public String getName() {
        return "§cFlower Maelstrom";
    }

    @Override
    public List<String> getLore() {
        return new ArrayList(Arrays.asList("§7§oA handcrafted","§7§obouquet made","§7§owith love and","§7§osome of the","§7§ofinest flowers","§7§oaround.")); 
    }

    @Override
    public String getId() {
        return "FLOWER_MAELSTROM"; 
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
        return Rarity.EPIC;
    }

    @Override
    public Soulbound getSoulbound() {
        return Soulbound.COOP;
    }

    @Override
    public String getTexture() {
        return "eyJ0aW1lc3RhbXAiOjE1MTgyMDY2MTI4MDgsInByb2ZpbGVJZCI6ImMxZWQ5N2Q0ZDE2NzQyYzI5OGI1ODFiZmRiODhhMjFmIiwicHJvZmlsZU5hbWUiOiJ5b2xvX21hdGlzIiwic2lnbmF0dXJlUmVxdWlyZWQiOnRydWUsInRleHR1cmVzIjp7IlNLSU4iOnsidXJsIjoiaHR0cDovL3RleHR1cmVzLm1pbmVjcmFmdC5uZXQvdGV4dHVyZS9iY2IyZjEyY2Y0ZjM0YThhZGZlM2Q3NWI3ZmY0ODliOTFhYmEzYzhiMTk5NTIxM2ZhNDYxZDY4NDkwYTUxIn19fQ==";
    }

}
