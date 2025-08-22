package me.zero.skyblock.items.itemlist.PORTAL;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class WIZARD_TOWER_PORTAL extends SItem implements ItemStatistics, SkullItem {

    @Override
    public String getName() {
        return "Portal to The Wizard Tower";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "WIZARD_TOWER_PORTAL"; 
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
        return ItemType.PORTAL;
    }

    @Override
    public Rarity getRarity() {
        return Rarity.COMMON;
    }

    @Override
    public String getTexture() {
        return "eyJ0aW1lc3RhbXAiOjE1MzA4NzgzNzc1MjYsInByb2ZpbGVJZCI6ImQ4N2ViYjVhODhiNTQxYjBhZjVlYWE2MGI3YmNkZmM1IiwicHJvZmlsZU5hbWUiOiJLYWlvbm9uIiwic2lnbmF0dXJlUmVxdWlyZWQiOnRydWUsInRleHR1cmVzIjp7IlNLSU4iOnsidXJsIjoiaHR0cDovL3RleHR1cmVzLm1pbmVjcmFmdC5uZXQvdGV4dHVyZS8yZjY5YWIyZjRlNzM0MWFjMjYyNTk3MDgzY2EzOGFkMDFiZmJiZjg3MzBmYmZiZGQxMGNhOTBhZWUzMzdhMmRkIn19fQ==";
    }

}
