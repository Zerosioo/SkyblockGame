package me.zero.skyblock.items.itemlist.NULL;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class REDSTONE_GENERATOR_1 extends SItem implements ItemStatistics, SkullItem {

    @Override
    public String getName() {
        return "Redstone Minion I";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "REDSTONE_GENERATOR_1"; 
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
        return "eyJ0aW1lc3RhbXAiOjE1NTc5MjAxMDg2NDUsInByb2ZpbGVJZCI6Ijc1MTQ0NDgxOTFlNjQ1NDY4Yzk3MzlhNmUzOTU3YmViIiwicHJvZmlsZU5hbWUiOiJUaGFua3NNb2phbmciLCJzaWduYXR1cmVSZXF1aXJlZCI6dHJ1ZSwidGV4dHVyZXMiOnsiU0tJTiI6eyJ1cmwiOiJodHRwOi8vdGV4dHVyZXMubWluZWNyYWZ0Lm5ldC90ZXh0dXJlLzFlZGVmY2YxYTg5ZDY4N2EwYTRlY2YxNTg5OTc3YWYxZTUyMGZjNjczYzQ4YTA0MzRiZTQyNjYxMmU4ZmFhNjcifX19";
    }

}
