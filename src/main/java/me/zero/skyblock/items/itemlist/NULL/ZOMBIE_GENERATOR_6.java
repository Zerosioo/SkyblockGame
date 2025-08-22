package me.zero.skyblock.items.itemlist.NULL;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ZOMBIE_GENERATOR_6 extends SItem implements ItemStatistics, SkullItem {

    @Override
    public String getName() {
        return "Zombie Minion VI";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "ZOMBIE_GENERATOR_6"; 
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
        return "eyJ0aW1lc3RhbXAiOjE1NTc5MzYzMDM0NDIsInByb2ZpbGVJZCI6ImZkNjBmMzZmNTg2MTRmMTJiM2NkNDdjMmQ4NTUyOTlhIiwicHJvZmlsZU5hbWUiOiJSZWFkIiwic2lnbmF0dXJlUmVxdWlyZWQiOnRydWUsInRleHR1cmVzIjp7IlNLSU4iOnsidXJsIjoiaHR0cDovL3RleHR1cmVzLm1pbmVjcmFmdC5uZXQvdGV4dHVyZS9hOGMzYWI0MmQzMjdmYTAxMjcxZjlmMTk5NThjNzdlMGRlZTlmZGU1NzQxNWY4NzM3ODM3MzdhMWU4M2Y0ZTg2In19fQ==";
    }

}
