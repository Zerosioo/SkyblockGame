package me.zero.skyblock.items.itemlist.HELMET;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MASTIFF_HELMET extends SItem implements ItemStatistics, SkullItem {

    @Override
    public String getName() {
        return "Mastiff Crown";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "MASTIFF_HELMET"; 
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
        return Rarity.EPIC;
    }

    @Override
    public Gamestage getGamestage() {
        return Gamestage.SKILLED;
    }

    @Override
    public int getHealth() {
        return 500;
    }

    @Override
    public int getDefense() {
        return -1000000;
    }

    @Override
    public int getIntelligence() {
        return 125;
    }

    @Override
    public String getTexture() {
        return "eyJ0aW1lc3RhbXAiOjE1MzcwODc0Mzg4MTMsInByb2ZpbGVJZCI6ImNhYjI4ODVkMTUxNjQ1OTNhZmI2MDkwODJlOTE2NmU3IiwicHJvZmlsZU5hbWUiOiJGYW5jeV9MdWR3aWciLCJzaWduYXR1cmVSZXF1aXJlZCI6dHJ1ZSwidGV4dHVyZXMiOnsiU0tJTiI6eyJ1cmwiOiJodHRwOi8vdGV4dHVyZXMubWluZWNyYWZ0Lm5ldC90ZXh0dXJlLzMyODU5NTBmZDY3ODU4ZTc2YzQzOWIwYjViODdjNjlhNmM1MmE0ZGY5MzZlMjI0ZDg0M2IxNGMyMjU2NTk0OWUifX19";
    }

}
