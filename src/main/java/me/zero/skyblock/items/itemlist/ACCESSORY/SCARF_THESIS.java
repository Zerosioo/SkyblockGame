package me.zero.skyblock.items.itemlist.ACCESSORY;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SCARF_THESIS extends SItem implements ItemStatistics, SkullItem, Sellable {

    @Override
    public String getName() {
        return "Scarf's Thesis";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "SCARF_THESIS"; 
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
    public boolean isDungeonItem() {
      	return true;
    }

    @Override
    public int getPrice() {
        return 1000;
    }

    @Override
    public int getRiftTime() {
        return 11;
    }

    @Override
    public String getTexture() {
        return "eyJ0aW1lc3RhbXAiOjE0ODA5NTcyNzM0MTksInByb2ZpbGVJZCI6IjNlMjZiMDk3MWFjZDRjNmQ5MzVjNmFkYjE1YjYyMDNhIiwicHJvZmlsZU5hbWUiOiJOYWhlbGUiLCJzaWduYXR1cmVSZXF1aXJlZCI6dHJ1ZSwidGV4dHVyZXMiOnsiU0tJTiI6eyJ1cmwiOiJodHRwOi8vdGV4dHVyZXMubWluZWNyYWZ0Lm5ldC90ZXh0dXJlLzhjZTRjODdlYjRkZGUyNzQ1OWUzZTdmODU5MjFlN2U1N2IxMTE5OTI2MGNhYTVjZTYzZjEzOWVlM2QxODhjIn19fQ==";
    }

}
