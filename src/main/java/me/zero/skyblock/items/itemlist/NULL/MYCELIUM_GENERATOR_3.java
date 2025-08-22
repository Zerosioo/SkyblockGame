package me.zero.skyblock.items.itemlist.NULL;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MYCELIUM_GENERATOR_3 extends SItem implements ItemStatistics, SkullItem {

    @Override
    public String getName() {
        return "Mycelium Minion III";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "MYCELIUM_GENERATOR_3"; 
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
        return "ewogICJ0aW1lc3RhbXAiIDogMTYzODk3MzIxODM5MiwKICAicHJvZmlsZUlkIiA6ICJiMGQ0YjI4YmMxZDc0ODg5YWYwZTg2NjFjZWU5NmFhYiIsCiAgInByb2ZpbGVOYW1lIiA6ICJNaW5lU2tpbl9vcmciLAogICJzaWduYXR1cmVSZXF1aXJlZCIgOiB0cnVlLAogICJ0ZXh0dXJlcyIgOiB7CiAgICAiU0tJTiIgOiB7CiAgICAgICJ1cmwiIDogImh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvNWU4NTdiZGRjYTlmMTRkNjZhZTRjM2E5MDk0NDdkNTk3OGY0NDNkYjk3ZTMyZWZiNmZkZTI5YjRhNDFkNGQ0MCIKICAgIH0KICB9Cn0=";
    }

}
