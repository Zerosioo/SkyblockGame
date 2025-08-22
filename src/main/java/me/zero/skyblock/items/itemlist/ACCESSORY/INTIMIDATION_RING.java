package me.zero.skyblock.items.itemlist.ACCESSORY;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class INTIMIDATION_RING extends SItem implements ItemStatistics, SkullItem {

    @Override
    public String getName() {
        return "Intimidation Ring";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "INTIMIDATION_RING"; 
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
        return Rarity.UNCOMMON;
    }

    @Override
    public String getTexture() {
        return "ewogICJ0aW1lc3RhbXAiIDogMTY5NzUyMDEyNjQ4NSwKICAicHJvZmlsZUlkIiA6ICIyMDhhMWJkNzAxMzg0ZDE0YTA1NjU4MTkyNzhmMGExNCIsCiAgInByb2ZpbGVOYW1lIiA6ICJab3JndWl0byIsCiAgInNpZ25hdHVyZVJlcXVpcmVkIiA6IHRydWUsCiAgInRleHR1cmVzIiA6IHsKICAgICJTS0lOIiA6IHsKICAgICAgInVybCIgOiAiaHR0cDovL3RleHR1cmVzLm1pbmVjcmFmdC5uZXQvdGV4dHVyZS80MWZiYzUwMTBlODA0N2ViYzBiZmQ1Yjc2MzVhYjU0NzcyZDhmZDVhMjgwOTlhZWViYzhhZTI0MDdmMDI2YjA4IiwKICAgICAgIm1ldGFkYXRhIiA6IHsKICAgICAgICAibW9kZWwiIDogInNsaW0iCiAgICAgIH0KICAgIH0KICB9Cn0=";
    }

}
