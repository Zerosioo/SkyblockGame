package me.zero.skyblock.items.itemlist.COSMETIC;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class KILLER_PERSONALITY extends SItem implements ItemStatistics, SkullItem, Museum {

    @Override
    public String getName() {
        return "Killer Minion Skin";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "KILLER_PERSONALITY"; 
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
        return ItemType.COSMETIC;
    }

    @Override
    public Rarity getRarity() {
        return Rarity.COMMON;
    }

    @Override
    public boolean isMuseum() {
        return true;
    }

    @Override
    public String getTexture() {
        return "ewogICJ0aW1lc3RhbXAiIDogMTYxNzEyMDU1NjU5MSwKICAicHJvZmlsZUlkIiA6ICJjOTAzOGQzZjRiMTg0M2JiYjUwNTU5ZGE3MWFjMTk2MiIsCiAgInByb2ZpbGVOYW1lIiA6ICJUQk5SY29vbGNhdCIsCiAgInNpZ25hdHVyZVJlcXVpcmVkIiA6IHRydWUsCiAgInRleHR1cmVzIiA6IHsKICAgICJTS0lOIiA6IHsKICAgICAgInVybCIgOiAiaHR0cDovL3RleHR1cmVzLm1pbmVjcmFmdC5uZXQvdGV4dHVyZS84MjBjMzA2Y2ZlNGM3MmY5ZDg3MGNlYzQ3Zjk1YWM0ZjUxMDNmMjBjOTY2ZDkyMDRhNjc2MDIyYjQ2MDI4NmI3IgogICAgfQogIH0KfQ==";
    }

}
