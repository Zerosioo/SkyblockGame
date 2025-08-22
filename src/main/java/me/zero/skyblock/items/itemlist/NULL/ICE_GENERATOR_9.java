package me.zero.skyblock.items.itemlist.NULL;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ICE_GENERATOR_9 extends SItem implements ItemStatistics, SkullItem {

    @Override
    public String getName() {
        return "Ice Minion IX";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "ICE_GENERATOR_9"; 
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
        return Rarity.RARE;
    }

    @Override
    public String getTexture() {
        return "eyJ0aW1lc3RhbXAiOjE1NTk2NTk1MTczODcsInByb2ZpbGVJZCI6IjE0MTVjOTk0M2JiYzRiMWJhMmNlMzZiN2JkMmMyM2Q1IiwicHJvZmlsZU5hbWUiOiJTZUthQm8iLCJzaWduYXR1cmVSZXF1aXJlZCI6dHJ1ZSwidGV4dHVyZXMiOnsiU0tJTiI6eyJ1cmwiOiJodHRwOi8vdGV4dHVyZXMubWluZWNyYWZ0Lm5ldC90ZXh0dXJlLzIxY2I0MjJiOWU2MzNlMDcwMDY5MmFlNTczYzVmNjNhODM4ZWJjNzcxYTIwOWE1ZTBjYzNjYmE0YzU2Zjc0NmYifX19";
    }

}
