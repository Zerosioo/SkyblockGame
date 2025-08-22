package me.zero.skyblock.items.itemlist.HELMET;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RETRO_ENCABULATING_VISOR extends SItem implements ItemStatistics, SkullItem {

    @Override
    public String getName() {
        return "Retro-Encabulating Visor";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "RETRO_ENCABULATING_VISOR"; 
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
        return ItemType.HELMET;
    }

    @Override
    public Rarity getRarity() {
        return Rarity.MYTHIC;
    }

    @Override
    public String getTexture() {
        return "ewogICJ0aW1lc3RhbXAiIDogMTY0OTMxNDYyOTc2NSwKICAicHJvZmlsZUlkIiA6ICJlZjJlZDE2NDA4YjU0NWQyYjAwMGM5YmE2Y2Y0MTJhNCIsCiAgInByb2ZpbGVOYW1lIiA6ICJiYXNlbmVzcyIsCiAgInNpZ25hdHVyZVJlcXVpcmVkIiA6IHRydWUsCiAgInRleHR1cmVzIiA6IHsKICAgICJTS0lOIiA6IHsKICAgICAgInVybCIgOiAiaHR0cDovL3RleHR1cmVzLm1pbmVjcmFmdC5uZXQvdGV4dHVyZS82ZTIxYTMxNTEyMWRmMDE5OWFjODMxNjQyZThhNTQ2YWRiYjVlZDM2MTY1MWZmYTRkNjk0NjZkOTkyNzk2MTI4IiwKICAgICAgIm1ldGFkYXRhIiA6IHsKICAgICAgICAibW9kZWwiIDogInNsaW0iCiAgICAgIH0KICAgIH0KICB9Cn0=";
    }

}
