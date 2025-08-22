package me.zero.skyblock.items.itemlist.NULL;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class INFERNO_VERTEX extends SItem implements ItemStatistics, SkullItem {

    @Override
    public String getName() {
        return "Inferno Vertex";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "INFERNO_VERTEX"; 
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
        return "ewogICJ0aW1lc3RhbXAiIDogMTY5NjAyNDQ4MDQxOCwKICAicHJvZmlsZUlkIiA6ICI3MDQ0ZDlkY2I5OGI0YzgzYWFjNjIzNjFlYTY5YmNmOSIsCiAgInByb2ZpbGVOYW1lIiA6ICJfV2F0cnlzaGthXyIsCiAgInNpZ25hdHVyZVJlcXVpcmVkIiA6IHRydWUsCiAgInRleHR1cmVzIiA6IHsKICAgICJTS0lOIiA6IHsKICAgICAgInVybCIgOiAiaHR0cDovL3RleHR1cmVzLm1pbmVjcmFmdC5uZXQvdGV4dHVyZS9hZTIyMWJiNzMzMTcyMjA3MzE1YWNlZGNjNWM5OTgzNmE2Mzk4NjJhMzcyN2RhNmQ1ZGYzNmI4NTFmYzE5MWM0IgogICAgfQogIH0KfQ==";
    }

}
