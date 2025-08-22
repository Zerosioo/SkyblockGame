package me.zero.skyblock.items.itemlist.HELMET;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class VAMPIRE_MASK extends SItem implements ItemStatistics, SkullItem, Sellable {

    @Override
    public String getName() {
        return "Vampire Mask";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "VAMPIRE_MASK"; 
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
        return Rarity.RARE;
    }

    @Override
    public Gamestage getGamestage() {
        return Gamestage.SKILLED;
    }

    @Override
    public int getPrice() {
        return 10;
    }

    @Override
    public int getDefense() {
        return 111;
    }

    @Override
    public String getTexture() {
        return "eyJ0aW1lc3RhbXAiOjE1MjMyODI2OTkyNTAsInByb2ZpbGVJZCI6IjNlMjZiMDk3MWFjZDRjNmQ5MzVjNmFkYjE1YjYyMDNhIiwicHJvZmlsZU5hbWUiOiJOYWhlbGUiLCJzaWduYXR1cmVSZXF1aXJlZCI6dHJ1ZSwidGV4dHVyZXMiOnsiU0tJTiI6eyJ1cmwiOiJodHRwOi8vdGV4dHVyZXMubWluZWNyYWZ0Lm5ldC90ZXh0dXJlLzhkNDQ3NTZlMGI0ZWNlOGQ3NDYyOTZhM2Q1ZTI5N2UxNDE1ZjRiYTE3NjQ3ZmZlMjI4Mzg1MzgzZDE2MWE5In19fQ==";
    }

}
