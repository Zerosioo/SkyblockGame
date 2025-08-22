package me.zero.skyblock.items.itemlist.REFORGE_STONE;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FLOWERING_BOUQUET extends SItem implements ItemStatistics, SkullItem, Sellable {

    @Override
    public String getName() {
        return "Flowering Bouquet";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "FLOWERING_BOUQUET"; 
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
        return ItemType.REFORGE_STONE;
    }

    @Override
    public Rarity getRarity() {
        return Rarity.RARE;
    }

    @Override
    public int getPrice() {
        return 1;
    }

    @Override
    public String getTexture() {
        return "ewogICJ0aW1lc3RhbXAiIDogMTY3ODgyMjIwMjcwMSwKICAicHJvZmlsZUlkIiA6ICI5ZWEyMTQ0NGFiNjI0MWZkYjg5YjE2NDFhNDg2MGZiZiIsCiAgInByb2ZpbGVOYW1lIiA6ICI3QUJDSE9VTiIsCiAgInNpZ25hdHVyZVJlcXVpcmVkIiA6IHRydWUsCiAgInRleHR1cmVzIiA6IHsKICAgICJTS0lOIiA6IHsKICAgICAgInVybCIgOiAiaHR0cDovL3RleHR1cmVzLm1pbmVjcmFmdC5uZXQvdGV4dHVyZS9mOWZjZmFjMmNlNTczY2EzNTEyMmE1MTdlNDMxMTc4Y2E3YmY4OWQwNzkzYWY3NjVmZGY3Zjk0OWM0ZGQwYjhlIgogICAgfQogIH0KfQ==";
    }

}
