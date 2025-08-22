package me.zero.skyblock.items.itemlist.NULL;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SKYBLOCK_BENCH extends SItem implements ItemStatistics, SkullItem {

    @Override
    public String getName() {
        return "Dark Oak Bench";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "SKYBLOCK_BENCH"; 
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
        return Rarity.COMMON;
    }

    @Override
    public String getTexture() {
        return "ewogICJ0aW1lc3RhbXAiIDogMTcyMDA0NDA3NzkwMSwKICAicHJvZmlsZUlkIiA6ICJjOTZiOWNhZDgzNTA0MjgzYjcwNGI1NTdiNTRhYjUxYSIsCiAgInByb2ZpbGVOYW1lIiA6ICJNYXJrb3gzNiIsCiAgInNpZ25hdHVyZVJlcXVpcmVkIiA6IHRydWUsCiAgInRleHR1cmVzIiA6IHsKICAgICJTS0lOIiA6IHsKICAgICAgInVybCIgOiAiaHR0cDovL3RleHR1cmVzLm1pbmVjcmFmdC5uZXQvdGV4dHVyZS9mNTQwYjMzYTIwZGQzMDY0ODdmMjNhNGRlNTMxM2Y4MWI3NzUwYTlmM2FkNTQ5ZTUwZDJmMGEzZjA1MmEyMjc5IiwKICAgICAgIm1ldGFkYXRhIiA6IHsKICAgICAgICAibW9kZWwiIDogInNsaW0iCiAgICAgIH0KICAgIH0KICB9Cn0=";
    }

}
