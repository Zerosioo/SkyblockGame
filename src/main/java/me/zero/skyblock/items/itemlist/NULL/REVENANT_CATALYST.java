package me.zero.skyblock.items.itemlist.NULL;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class REVENANT_CATALYST extends SItem implements ItemStatistics, SkullItem, Sellable {

    @Override
    public String getName() {
        return "Revenant Catalyst";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "REVENANT_CATALYST"; 
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
    public int getPrice() {
        return 8000;
    }

    @Override
    public String getTexture() {
        return "eyJ0aW1lc3RhbXAiOjE1Nzg2ODE0NDkwMzMsInByb2ZpbGVJZCI6IjIyZmQ2N2IxN2U2NzQ1ZmI5MmU3NDc3MTIzNDMwNTE4IiwicHJvZmlsZU5hbWUiOiJyYWtldGVuYmVuIiwic2lnbmF0dXJlUmVxdWlyZWQiOnRydWUsInRleHR1cmVzIjp7IlNLSU4iOnsidXJsIjoiaHR0cDovL3RleHR1cmVzLm1pbmVjcmFmdC5uZXQvdGV4dHVyZS9iODhjZmFmYTVmMDNmOGFlZjA0MmExNDM3OTllOTY0MzQyZGY3NmI3YzFlYjQ2MWY2MThlMzk4Zjg0YTk5YTYzIn19fQ==";
    }

}
