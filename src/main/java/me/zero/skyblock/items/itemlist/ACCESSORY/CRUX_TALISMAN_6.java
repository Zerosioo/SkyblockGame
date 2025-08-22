package me.zero.skyblock.items.itemlist.ACCESSORY;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CRUX_TALISMAN_6 extends SItem implements ItemStatistics, SkullItem {

    @Override
    public String getName() {
        return "Crux Chronomicon";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "CRUX_TALISMAN_6"; 
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
        return Rarity.MYTHIC;
    }

    @Override
    public String getTexture() {
        return "ewogICJ0aW1lc3RhbXAiIDogMTY4NDM1MzQ3MTcxMCwKICAicHJvZmlsZUlkIiA6ICIwNDNkZWIzOGIyNjE0MTg1YTIzYzU4ZmI2YTc5ZWZkYyIsCiAgInByb2ZpbGVOYW1lIiA6ICJWaXRhbFNpZ256MiIsCiAgInNpZ25hdHVyZVJlcXVpcmVkIiA6IHRydWUsCiAgInRleHR1cmVzIiA6IHsKICAgICJTS0lOIiA6IHsKICAgICAgInVybCIgOiAiaHR0cDovL3RleHR1cmVzLm1pbmVjcmFmdC5uZXQvdGV4dHVyZS9kM2FkNTU3OWY2YTcxNTkxZTYxNWNjNTUxMzAxZDI0ZTQ0MzJjMGExN2RkNGE0ZmM0ZGRkZmYwZDI3NjQxZGM2IiwKICAgICAgIm1ldGFkYXRhIiA6IHsKICAgICAgICAibW9kZWwiIDogInNsaW0iCiAgICAgIH0KICAgIH0KICB9Cn0=";
    }

}
