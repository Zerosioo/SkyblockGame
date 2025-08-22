package me.zero.skyblock.items.itemlist.NULL;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PUMPKIN_BOMB extends SItem implements ItemStatistics, SkullItem, Sellable {

    @Override
    public String getName() {
        return "Blast o' Lantern";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "PUMPKIN_BOMB"; 
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
    public int getPrice() {
        return 530;
    }

    @Override
    public String getTexture() {
        return "ewogICJ0aW1lc3RhbXAiIDogMTYwMzI0ODAzNDA3OSwKICAicHJvZmlsZUlkIiA6ICJjNTBhZmE4YWJlYjk0ZTQ1OTRiZjFiNDI1YTk4MGYwMiIsCiAgInByb2ZpbGVOYW1lIiA6ICJUd29FQmFlIiwKICAic2lnbmF0dXJlUmVxdWlyZWQiIDogdHJ1ZSwKICAidGV4dHVyZXMiIDogewogICAgIlNLSU4iIDogewogICAgICAidXJsIiA6ICJodHRwOi8vdGV4dHVyZXMubWluZWNyYWZ0Lm5ldC90ZXh0dXJlLzNjNmZkNWQ5MDY4M2EwZjk1NmUyOGNkMTM0ODJmOTFiZDdjZmU1MGU1Yzg1M2Y0ZTg1ZTYyNmI1Zjk3MDFiOTMiCiAgICB9CiAgfQp9";
    }

}
