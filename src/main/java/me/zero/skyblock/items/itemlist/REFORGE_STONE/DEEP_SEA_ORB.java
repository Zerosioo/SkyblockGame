package me.zero.skyblock.items.itemlist.REFORGE_STONE;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DEEP_SEA_ORB extends SItem implements ItemStatistics, SkullItem, Sellable {

    @Override
    public String getName() {
        return "Deep Sea Orb";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "DEEP_SEA_ORB"; 
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
        return ItemType.REFORGE_STONE;
    }

    @Override
    public Rarity getRarity() {
        return Rarity.EPIC;
    }

    @Override
    public int getPrice() {
        return 1;
    }

    @Override
    public String getTexture() {
        return "eyJ0aW1lc3RhbXAiOjE1NzE3MDYzNjIxNjAsInByb2ZpbGVJZCI6ImRlNTcxYTEwMmNiODQ4ODA4ZmU3YzlmNDQ5NmVjZGFkIiwicHJvZmlsZU5hbWUiOiJNSEZfTWluZXNraW4iLCJzaWduYXR1cmVSZXF1aXJlZCI6dHJ1ZSwidGV4dHVyZXMiOnsiU0tJTiI6eyJ1cmwiOiJodHRwOi8vdGV4dHVyZXMubWluZWNyYWZ0Lm5ldC90ZXh0dXJlL2ZkZjc2MjJlODU1NGQ4NzNlZGM4MTZjNDNkNmI0YTNkNWRjNTc2Mjc4MTNlMzQ4ODI0NjVmZTQxYWUxYmI5ZTcifX19";
    }

}
