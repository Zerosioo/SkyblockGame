package me.zero.skyblock.items.itemlist.NULL;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PLACEABLE_FAIRY_SOUL_RIFT extends SItem implements ItemStatistics, SkullItem {

    @Override
    public String getName() {
        return "Placeable Fairy Soul";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "PLACEABLE_FAIRY_SOUL_RIFT"; 
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
        return Rarity.EPIC;
    }

    @Override
    public boolean isStackable() {
        return false;
    }

    @Override
    public String getTexture() {
        return "eyJ0aW1lc3RhbXAiOjE1ODY2NjcxNjgzNzksInByb2ZpbGVJZCI6ImJlY2RkYjI4YTJjODQ5YjRhOWIwOTIyYTU4MDUxNDIwIiwicHJvZmlsZU5hbWUiOiJTdFR2Iiwic2lnbmF0dXJlUmVxdWlyZWQiOnRydWUsInRleHR1cmVzIjp7IlNLSU4iOnsidXJsIjoiaHR0cDovL3RleHR1cmVzLm1pbmVjcmFmdC5uZXQvdGV4dHVyZS8yOTllYTEyMGJkODNkMGM4MWEzYzQ2MjdmNWJjZTFiMTJmYjAzYmNiNTc3NzljNjNkY2M3N2UzZjRhZThhNzkzIn19fQ==";
    }

}
