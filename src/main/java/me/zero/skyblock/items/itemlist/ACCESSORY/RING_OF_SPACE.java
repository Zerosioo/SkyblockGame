package me.zero.skyblock.items.itemlist.ACCESSORY;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RING_OF_SPACE extends SItem implements ItemStatistics, SkullItem {

    @Override
    public String getName() {
        return "Ring of Space";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "RING_OF_SPACE"; 
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
        return Rarity.RARE;
    }

    @Override
    public String getTexture() {
        return "ewogICJ0aW1lc3RhbXAiIDogMTcyMDA0MjU4NDk0OSwKICAicHJvZmlsZUlkIiA6ICJiYWI0NjQ1NzRmMjY0MGRhYmFlNmUzZTBjM2I4MzFjZiIsCiAgInByb2ZpbGVOYW1lIiA6ICJtb3N0d2FsbCIsCiAgInNpZ25hdHVyZVJlcXVpcmVkIiA6IHRydWUsCiAgInRleHR1cmVzIiA6IHsKICAgICJTS0lOIiA6IHsKICAgICAgInVybCIgOiAiaHR0cDovL3RleHR1cmVzLm1pbmVjcmFmdC5uZXQvdGV4dHVyZS80YzFmZTVlNDE4N2I0ZmEwNWQ1NWI2YTQ4ODdhZjQ4YjIzMzFiZGIwYWNiNDE1MjBkNGZkOWRjOGRmOWNiNTljIiwKICAgICAgIm1ldGFkYXRhIiA6IHsKICAgICAgICAibW9kZWwiIDogInNsaW0iCiAgICAgIH0KICAgIH0KICB9Cn0=";
    }

}
