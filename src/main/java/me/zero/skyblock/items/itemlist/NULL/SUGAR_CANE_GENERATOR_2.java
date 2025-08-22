package me.zero.skyblock.items.itemlist.NULL;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SUGAR_CANE_GENERATOR_2 extends SItem implements ItemStatistics, SkullItem {

    @Override
    public String getName() {
        return "Sugar Cane Minion II";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "SUGAR_CANE_GENERATOR_2"; 
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
        return "eyJ0aW1lc3RhbXAiOjE1NTc5NDQ1MDIyNjUsInByb2ZpbGVJZCI6IjU3MGIwNWJhMjZmMzRhOGViZmRiODBlY2JjZDdlNjIwIiwicHJvZmlsZU5hbWUiOiJMb3JkU29ubnkiLCJzaWduYXR1cmVSZXF1aXJlZCI6dHJ1ZSwidGV4dHVyZXMiOnsiU0tJTiI6eyJ1cmwiOiJodHRwOi8vdGV4dHVyZXMubWluZWNyYWZ0Lm5ldC90ZXh0dXJlLzMwODYzZTJjMWZkY2U0NGJjMzU4NTZjMjVjMDM5MTY0ODQ1NDU2ZmYxNTI1NzI5ZDk5M2YwZjQwZWRlMGYyNTcifX19";
    }

}
