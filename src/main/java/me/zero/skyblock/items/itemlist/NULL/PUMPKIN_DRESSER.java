package me.zero.skyblock.items.itemlist.NULL;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PUMPKIN_DRESSER extends SItem implements ItemStatistics, SkullItem {

    @Override
    public String getName() {
        return "Pumpkin Dresser";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "PUMPKIN_DRESSER"; 
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
    public String getTexture() {
        return "ewogICJ0aW1lc3RhbXAiIDogMTY2NjM4NjQxMzg1MywKICAicHJvZmlsZUlkIiA6ICI4NDIzMzM5MTYwMjY0NjBiOWQ1MGFjZWU3MThiMjkxNyIsCiAgInByb2ZpbGVOYW1lIiA6ICJmaXJlc2xpbmdlciIsCiAgInNpZ25hdHVyZVJlcXVpcmVkIiA6IHRydWUsCiAgInRleHR1cmVzIiA6IHsKICAgICJTS0lOIiA6IHsKICAgICAgInVybCIgOiAiaHR0cDovL3RleHR1cmVzLm1pbmVjcmFmdC5uZXQvdGV4dHVyZS9jMmIyODEzZjNkYzkzM2EwZjdlM2FiODg0ODJhZGRlYzk4OThlYjUyYTg5MzU4NjZkNTJjNTY5NGM1NmZmYWY5IgogICAgfQogIH0KfQ==";
    }

}
