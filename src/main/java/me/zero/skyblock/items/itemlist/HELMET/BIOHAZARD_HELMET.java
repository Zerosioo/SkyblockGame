package me.zero.skyblock.items.itemlist.HELMET;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BIOHAZARD_HELMET extends SItem implements ItemStatistics, SkullItem {

    @Override
    public String getName() {
        return "Biohazard Helmet";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "BIOHAZARD_HELMET"; 
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
        return Rarity.UNCOMMON;
    }

    @Override
    public Gamestage getGamestage() {
        return Gamestage.AMATEUR;
    }

    @Override
    public String getTexture() {
        return "ewogICJ0aW1lc3RhbXAiIDogMTcyNzE4ODgwOTg0MCwKICAicHJvZmlsZUlkIiA6ICJjMTJkMmY5ZWJhZGI0ZTllYTIxZmM2M2M3YWY3M2E5NSIsCiAgInByb2ZpbGVOYW1lIiA6ICJEcmVhbXlOZW9uIiwKICAic2lnbmF0dXJlUmVxdWlyZWQiIDogdHJ1ZSwKICAidGV4dHVyZXMiIDogewogICAgIlNLSU4iIDogewogICAgICAidXJsIiA6ICJodHRwOi8vdGV4dHVyZXMubWluZWNyYWZ0Lm5ldC90ZXh0dXJlLzNlODc2NTQ3ZjNkOTQ2YjcwZTA2ZmI2YjE4Yzc2ZTA5M2FmOTNmYjg5OWZkODQzNTM2ODA5MTI5NjAyOWQwNzgiLAogICAgICAibWV0YWRhdGEiIDogewogICAgICAgICJtb2RlbCIgOiAic2xpbSIKICAgICAgfQogICAgfQogIH0KfQ==";
    }

}
