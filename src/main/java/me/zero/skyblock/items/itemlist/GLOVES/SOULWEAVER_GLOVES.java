package me.zero.skyblock.items.itemlist.GLOVES;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SOULWEAVER_GLOVES extends SItem implements ItemStatistics, SkullItem {

    @Override
    public String getName() {
        return "Soulweaver Gloves";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "SOULWEAVER_GLOVES"; 
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
        return ItemType.GLOVES;
    }

    @Override
    public Rarity getRarity() {
        return Rarity.EPIC;
    }

    @Override
    public boolean isDungeonItem() {
      	return true;
    }

    @Override
    public Gamestage getGamestage() {
        return Gamestage.SKILLED;
    }

    @Override
    public DungeonType getDungeonType() {
        return DungeonType.CATACOMBS;
    }

    @Override
    public String getTexture() {
        return "ewogICJ0aW1lc3RhbXAiIDogMTY5MjI5ODIyMjY4MywKICAicHJvZmlsZUlkIiA6ICI4NzE3ZGFhNmM3OTU0NzE2YmJlYWQ0MDRkYzg0NDQzZSIsCiAgInByb2ZpbGVOYW1lIiA6ICJTa3VsbDAwMDAiLAogICJzaWduYXR1cmVSZXF1aXJlZCIgOiB0cnVlLAogICJ0ZXh0dXJlcyIgOiB7CiAgICAiU0tJTiIgOiB7CiAgICAgICJ1cmwiIDogImh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvYTUyMjg2NzcyMTJiZTQzZWFhZDIzZDQ3ZWQ4NDNlMTVmYjFlNjgzODQ1OTRjMDliNThiMjNmODI0MjdlNTQ5YSIKICAgIH0KICB9Cn0=";
    }

}
