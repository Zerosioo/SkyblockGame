package me.zero.skyblock.items.itemlist.NULL;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class IRON_GENERATOR_8 extends SItem implements ItemStatistics, SkullItem {

    @Override
    public String getName() {
        return "Iron Minion VIII";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "IRON_GENERATOR_8"; 
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
        return "eyJ0aW1lc3RhbXAiOjE1NTc5MzczMTI3ODQsInByb2ZpbGVJZCI6ImU3NTMyNjk3ZTgwZjQ1NmU5ZjNhZjZiODIzNWU5YTgxIiwicHJvZmlsZU5hbWUiOiJNaW5lQWx0c19NU2tpbl8xIiwic2lnbmF0dXJlUmVxdWlyZWQiOnRydWUsInRleHR1cmVzIjp7IlNLSU4iOnsidXJsIjoiaHR0cDovL3RleHR1cmVzLm1pbmVjcmFmdC5uZXQvdGV4dHVyZS83ZTVlYTU3ZjBmYjFmNThhNjg3NDZiNWE2ZTkzYjg0OTE1MjhkMDliYTA3YjU4NmI3M2E0M2FlMDU2MzhhZDBjIn19fQ==";
    }

}
