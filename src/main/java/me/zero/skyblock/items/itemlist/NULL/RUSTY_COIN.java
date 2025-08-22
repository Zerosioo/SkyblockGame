package me.zero.skyblock.items.itemlist.NULL;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RUSTY_COIN extends SItem implements ItemStatistics, SkullItem, Sellable {

    @Override
    public String getName() {
        return "Rusty Coin";
    }

    @Override
    public List<String> getLore() {
        return new ArrayList(Arrays.asList("§8§oCompletely","§8§ocovered in","§8§ocopious amounts","§8§oof rust and","§8§ogrime.")); 
    }

    @Override
    public String getId() {
        return "RUSTY_COIN"; 
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
        return Rarity.UNCOMMON;
    }

    @Override
    public int getPrice() {
        return 1000;
    }

    @Override
    public String getTexture() {
        return "ewogICJ0aW1lc3RhbXAiIDogMTc0MDMyMTg4NTAzMywKICAicHJvZmlsZUlkIiA6ICJiODU0NWMxMDlhZjE0ZGRjYmY4ZjhmZjg4ZTU2NzI4OSIsCiAgInByb2ZpbGVOYW1lIiA6ICJQdGFrb3B5c2tDWiIsCiAgInNpZ25hdHVyZVJlcXVpcmVkIiA6IHRydWUsCiAgInRleHR1cmVzIiA6IHsKICAgICJTS0lOIiA6IHsKICAgICAgInVybCIgOiAiaHR0cDovL3RleHR1cmVzLm1pbmVjcmFmdC5uZXQvdGV4dHVyZS9lMzkzNzBhMzcyZTIyMzU3M2U2NzZjZGI1MTc5YTAxMTU4Zjg1YmFlMDY4NGYzM2I0ZThjYjBlNjM5MjI0NGM4IiwKICAgICAgIm1ldGFkYXRhIiA6IHsKICAgICAgICAibW9kZWwiIDogInNsaW0iCiAgICAgIH0KICAgIH0KICB9Cn0=";
    }

}
