package me.zero.skyblock.items.itemlist.ACCESSORY;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BLOOD_DONOR_TALISMAN extends SItem implements ItemStatistics, SkullItem, Sellable {

    @Override
    public String getName() {
        return "Blood Donor Talisman";
    }

    @Override
    public List<String> getLore() {
        return new ArrayList(Arrays.asList("Do your part bro.")); 
    }

    @Override
    public String getId() {
        return "BLOOD_DONOR_TALISMAN"; 
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
        return ItemType.ACCESSORY;
    }

    @Override
    public Rarity getRarity() {
        return Rarity.COMMON;
    }

    @Override
    public int getPrice() {
        return 800;
    }

    @Override
    public int getHealthRegeneration() {
        return 1;
    }

    @Override
    public String getTexture() {
        return "eyJ0aW1lc3RhbXAiOjE1ODUzMTE2MTEzNjAsInByb2ZpbGVJZCI6IjkxOGEwMjk1NTlkZDRjZTZiMTZmN2E1ZDUzZWZiNDEyIiwicHJvZmlsZU5hbWUiOiJCZWV2ZWxvcGVyIiwic2lnbmF0dXJlUmVxdWlyZWQiOnRydWUsInRleHR1cmVzIjp7IlNLSU4iOnsidXJsIjoiaHR0cDovL3RleHR1cmVzLm1pbmVjcmFmdC5uZXQvdGV4dHVyZS80NDYzZTUzMzRlY2Q5YjNiOTg2ZjZlOWNiMDRkYmEzYjY0M2E2M2YzOWU5MzRlYWQ3NmVjZTUxOGY4MmY4NjUifX19";
    }

}
