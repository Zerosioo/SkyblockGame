package me.zero.skyblock.items.itemlist.NULL;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GAME_ANNIHILATOR extends SItem implements ItemStatistics, SkullItem, Museum {

    @Override
    public String getName() {
        return "Game Annihilator";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "GAME_ANNIHILATOR"; 
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
        return Rarity.VERY_SPECIAL;
    }

    @Override
    public boolean isMuseum() {
        return true;
    }

    @Override
    public Soulbound getSoulbound() {
        return Soulbound.COOP;
    }

    @Override
    public String getTexture() {
        return "ewogICJ0aW1lc3RhbXAiIDogMTYwMTc2Nzk1NDgyMCwKICAicHJvZmlsZUlkIiA6ICJhMjk1ODZmYmU1ZDk0Nzk2OWZjOGQ4ZGE0NzlhNDNlZSIsCiAgInByb2ZpbGVOYW1lIiA6ICJWaWVydGVsdG9hc3RpaWUiLAogICJzaWduYXR1cmVSZXF1aXJlZCIgOiB0cnVlLAogICJ0ZXh0dXJlcyIgOiB7CiAgICAiU0tJTiIgOiB7CiAgICAgICJ1cmwiIDogImh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvNzk2YTRkYWFiOWVlNDhjYmEyZDk5YjE2MDcwNTE2Mjg0YTY1YWZiMGIyNmU4NzNhNTRjOGZkZTYwM2MwZGE3NiIKICAgIH0KICB9Cn0=";
    }

}
