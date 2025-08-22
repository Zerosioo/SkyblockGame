package me.zero.skyblock.items.itemlist.HELMET;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GOLEM_HAT extends SItem implements ItemStatistics, SkullItem, Sellable, Museum {

    @Override
    public String getName() {
        return "Golem Hat";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "GOLEM_HAT"; 
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
        return ItemType.HELMET;
    }

    @Override
    public Rarity getRarity() {
        return Rarity.COMMON;
    }

    @Override
    public boolean isMuseum() {
        return true;
    }

    @Override
    public int getPrice() {
        return 100;
    }

    @Override
    public String getTexture() {
        return "eyJ0aW1lc3RhbXAiOjE0OTg2ODk3NjgzNTAsInByb2ZpbGVJZCI6Ijc1N2Y5MGIyMjM0NDRiOGQ4ZGFjODI0MjMyZTJjZWNlIiwicHJvZmlsZU5hbWUiOiJNSEZfR29sZW0iLCJzaWduYXR1cmVSZXF1aXJlZCI6dHJ1ZSwidGV4dHVyZXMiOnsiU0tJTiI6eyJ1cmwiOiJodHRwOi8vdGV4dHVyZXMubWluZWNyYWZ0Lm5ldC90ZXh0dXJlLzg5MDkxZDc5ZWEwZjU5ZWY3ZWY5NGQ3YmJhNmU1ZjE3ZjJmN2Q0NTcyYzQ0ZjkwZjc2YzQ4MTlhNzE0In19fQ==";
    }

}
