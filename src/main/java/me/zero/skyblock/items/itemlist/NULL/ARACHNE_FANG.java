package me.zero.skyblock.items.itemlist.NULL;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ARACHNE_FANG extends SItem implements ItemStatistics, SkullItem, Sellable {

    @Override
    public String getName() {
        return "Arachne's Fang";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "ARACHNE_FANG"; 
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
        return Rarity.UNCOMMON;
    }

    @Override
    public int getPrice() {
        return 500;
    }

    @Override
    public String getTexture() {
        return "ewogICJ0aW1lc3RhbXAiIDogMTY2NzgzMjY3OTEwNywKICAicHJvZmlsZUlkIiA6ICI3MDQ0ZDlkY2I5OGI0YzgzYWFjNjIzNjFlYTY5YmNmOSIsCiAgInByb2ZpbGVOYW1lIiA6ICJfV2F0cnlzaGthXyIsCiAgInNpZ25hdHVyZVJlcXVpcmVkIiA6IHRydWUsCiAgInRleHR1cmVzIiA6IHsKICAgICJTS0lOIiA6IHsKICAgICAgInVybCIgOiAiaHR0cDovL3RleHR1cmVzLm1pbmVjcmFmdC5uZXQvdGV4dHVyZS9iMDk3ZDA4YWRhOGJkZTY5MjI4MzQ1YjZkMTA1NjVjODU0ZjdhZTlkMjQ0YTEyODlmMWJmOWYyZTg0OTQ1NTgwIgogICAgfQogIH0KfQ==";
    }

}
