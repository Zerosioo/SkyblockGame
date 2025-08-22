package me.zero.skyblock.items.itemlist.CARNIVAL_MASK;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SNOWMAN_MASK extends SItem implements ItemStatistics, SkullItem {

    @Override
    public String getName() {
        return "Snowman Mask";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "SNOWMAN_MASK"; 
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
        return ItemType.CARNIVAL_MASK;
    }

    @Override
    public Rarity getRarity() {
        return Rarity.RARE;
    }

    @Override
    public boolean isStackable() {
        return false;
    }

    @Override
    public Gamestage getGamestage() {
        return Gamestage.INTERMEDIATE;
    }

    @Override
    public String getTexture() {
        return "ewogICJ0aW1lc3RhbXAiIDogMTcxNDI0NjMwMzE1MywKICAicHJvZmlsZUlkIiA6ICJlY2Q0ZTI4NjdkMmE0MTE2OTljYzlkMjMzYmM1YmEyMyIsCiAgInByb2ZpbGVOYW1lIiA6ICJSYXRlZEtub3QiLAogICJzaWduYXR1cmVSZXF1aXJlZCIgOiB0cnVlLAogICJ0ZXh0dXJlcyIgOiB7CiAgICAiU0tJTiIgOiB7CiAgICAgICJ1cmwiIDogImh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvYzMyMWMxMmQ0ZDg4MjczYWJiYTRmYTJmNWY5YTkwZjNkMTQ0NTIyOWRjN2NjYWE1NzExOTc1YzhiMGE4MzNiNyIKICAgIH0KICB9Cn0=";
    }

}
