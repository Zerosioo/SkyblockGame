package me.zero.skyblock.items.itemlist.NULL;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ENCHANTED_BOOK_BUNDLE_THE_ONE extends SItem implements ItemStatistics, SkullItem, Sellable {

    @Override
    public String getName() {
        return "Enchanted Book Bundle";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "ENCHANTED_BOOK_BUNDLE_THE_ONE"; 
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
    public boolean isStackable() {
        return false;
    }

    @Override
    public Soulbound getSoulbound() {
        return Soulbound.SOLO;
    }

    @Override
    public int getPrice() {
        return 90000;
    }

    @Override
    public String getTexture() {
        return "eyJ0aW1lc3RhbXAiOjE1MTgyODU4NTc4NDQsInByb2ZpbGVJZCI6IjdkYTJhYjNhOTNjYTQ4ZWU4MzA0OGFmYzNiODBlNjhlIiwicHJvZmlsZU5hbWUiOiJHb2xkYXBmZWwiLCJzaWduYXR1cmVSZXF1aXJlZCI6dHJ1ZSwidGV4dHVyZXMiOnsiU0tJTiI6eyJ1cmwiOiJodHRwOi8vdGV4dHVyZXMubWluZWNyYWZ0Lm5ldC90ZXh0dXJlL2U1YmUyMmI1ZDRhODc1ZDc3ZGYzZjc3MTBmZjQ1NzhlZjI3OTM5YTk2ODRjYmRiM2QzMWQ5NzNmMTY2ODQ5In19fQ==";
    }

}
