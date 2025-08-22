package me.zero.skyblock.items.itemlist.NULL;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class IRON_GENERATOR_7 extends SItem implements ItemStatistics, SkullItem {

    @Override
    public String getName() {
        return "Iron Minion VII";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "IRON_GENERATOR_7"; 
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
        return "eyJ0aW1lc3RhbXAiOjE1NTc5MzcyOTgxMzIsInByb2ZpbGVJZCI6ImNiZGViZGRjODNhNTQ0OWFiZDFiOThhNzBjY2E0ZDhlIiwicHJvZmlsZU5hbWUiOiJDaGVja2lkb2lzIiwic2lnbmF0dXJlUmVxdWlyZWQiOnRydWUsInRleHR1cmVzIjp7IlNLSU4iOnsidXJsIjoiaHR0cDovL3RleHR1cmVzLm1pbmVjcmFmdC5uZXQvdGV4dHVyZS9mNThlNjYxN2NlZmU1MmVlYWNiOWQzZjdmNDI0ZDUyZTRhZTFiOGU4Zjc3NWMwYmZkNjA0NWM5OTM4Nzg1MWFiIn19fQ==";
    }

}
