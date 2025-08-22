package me.zero.skyblock.items.itemlist.NULL;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BUILDER_MELON extends SItem implements ItemStatistics, SkullItem, Sellable {

    @Override
    public String getName() {
        return "Melon";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "BUILDER_MELON"; 
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
        return Rarity.COMMON;
    }

    @Override
    public int getPrice() {
        return 10;
    }

    @Override
    public String getTexture() {
        return "eyJ0aW1lc3RhbXAiOjE1NzE2NjQ5NzQwOTQsInByb2ZpbGVJZCI6ImRlNTcxYTEwMmNiODQ4ODA4ZmU3YzlmNDQ5NmVjZGFkIiwicHJvZmlsZU5hbWUiOiJNSEZfTWluZXNraW4iLCJzaWduYXR1cmVSZXF1aXJlZCI6dHJ1ZSwidGV4dHVyZXMiOnsiU0tJTiI6eyJ1cmwiOiJodHRwOi8vdGV4dHVyZXMubWluZWNyYWZ0Lm5ldC90ZXh0dXJlLzU1YzcyYzJlODM4YzY5NmYxOGJkYmEyOGZmMDQxNTU5MDRhMzRmMjhjZmQ3Mjk4ZjU5ZmI0NDA0ZTJlNjE2YTIiLCJtZXRhZGF0YSI6eyJtb2RlbCI6InNsaW0ifX19fQ==";
    }

}
