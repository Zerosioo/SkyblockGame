package me.zero.skyblock.items.itemlist.NULL;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PUMPKIN_CRAFTING_TABLE extends SItem implements ItemStatistics, SkullItem {

    @Override
    public String getName() {
        return "Pumpkin Crafting Table";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "PUMPKIN_CRAFTING_TABLE"; 
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
        return "ewogICJ0aW1lc3RhbXAiIDogMTYzMzgwOTA1ODQ2MCwKICAicHJvZmlsZUlkIiA6ICJiN2ZkYmU2N2NkMDA0NjgzYjlmYTllM2UxNzczODI1NCIsCiAgInByb2ZpbGVOYW1lIiA6ICJDVUNGTDE0IiwKICAic2lnbmF0dXJlUmVxdWlyZWQiIDogdHJ1ZSwKICAidGV4dHVyZXMiIDogewogICAgIlNLSU4iIDogewogICAgICAidXJsIiA6ICJodHRwOi8vdGV4dHVyZXMubWluZWNyYWZ0Lm5ldC90ZXh0dXJlLzYzZmNkYzhkODdiNDUwMTkxMjNjMGIyN2RiNDc4YmFlYjE3Y2IxMDg3YWFlM2ExYjFkMDU5MTJmZWQ3NTQyYTkiCiAgICB9CiAgfQp9";
    }

}
