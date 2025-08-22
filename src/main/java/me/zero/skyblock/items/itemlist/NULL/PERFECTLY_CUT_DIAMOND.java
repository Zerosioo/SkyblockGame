package me.zero.skyblock.items.itemlist.NULL;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PERFECTLY_CUT_DIAMOND extends SItem implements ItemStatistics, SkullItem {

    @Override
    public String getName() {
        return "Perfectly Cut Diamond";
    }

    @Override
    public List<String> getLore() {
        return new ArrayList(Arrays.asList("An outstanding find.","While few are known","to exist, even fewer","have been","successfully","retrieved.","","§6Used in an anvil","§6to upgrade Perfect","§6Armor to Tier","§6XIII.")); 
    }

    @Override
    public String getId() {
        return "PERFECTLY_CUT_DIAMOND"; 
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
        return Rarity.LEGENDARY;
    }

    @Override
    public String getTexture() {
        return "ewogICJ0aW1lc3RhbXAiIDogMTY5NjI5MTUzMzQzMywKICAicHJvZmlsZUlkIiA6ICIwZjlmYzU0MDQxZjk0NzEyOWQxYmEzODg1YmQ3N2M4NyIsCiAgInByb2ZpbGVOYW1lIiA6ICI4MTE5NGJheiIsCiAgInNpZ25hdHVyZVJlcXVpcmVkIiA6IHRydWUsCiAgInRleHR1cmVzIiA6IHsKICAgICJTS0lOIiA6IHsKICAgICAgInVybCIgOiAiaHR0cDovL3RleHR1cmVzLm1pbmVjcmFmdC5uZXQvdGV4dHVyZS9iZGI3ZmMyYjY5YmNkNDI5YWJmZDFjZWIxYWVhMTBjZWJmMTc0OWE4MDY4MGM2M2NkOGI2MGYzYTRjN2U0ZmZkIiwKICAgICAgIm1ldGFkYXRhIiA6IHsKICAgICAgICAibW9kZWwiIDogInNsaW0iCiAgICAgIH0KICAgIH0KICB9Cn0=";
    }

}
