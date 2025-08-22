package me.zero.skyblock.items.itemlist.PORTAL;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FORAGING_3_PORTAL extends SItem implements ItemStatistics, SkullItem {

    @Override
    public String getName() {
        return "Portal to Jungle Island";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "FORAGING_3_PORTAL"; 
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
        return ItemType.PORTAL;
    }

    @Override
    public Rarity getRarity() {
        return Rarity.COMMON;
    }

    @Override
    public String getTexture() {
        return "eyJ0aW1lc3RhbXAiOjE1MTc5ODAxMDIxNDcsInByb2ZpbGVJZCI6ImFkMWM2Yjk1YTA5ODRmNTE4MWJhOTgyMzY0OTllM2JkIiwicHJvZmlsZU5hbWUiOiJGdXJrYW5iejAwIiwic2lnbmF0dXJlUmVxdWlyZWQiOnRydWUsInRleHR1cmVzIjp7IlNLSU4iOnsidXJsIjoiaHR0cDovL3RleHR1cmVzLm1pbmVjcmFmdC5uZXQvdGV4dHVyZS8xY2VmYzE5MzgwNjgzMDE1ZTQ3YzY2NmU1OTI2YjE1ZWU1N2FiMzMxOTJmNmE3ZTQyOTI0NGNkZmZjYzI2MiJ9fX0=";
    }

}
