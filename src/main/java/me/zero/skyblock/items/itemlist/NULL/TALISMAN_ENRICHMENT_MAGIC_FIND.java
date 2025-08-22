package me.zero.skyblock.items.itemlist.NULL;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TALISMAN_ENRICHMENT_MAGIC_FIND extends SItem implements ItemStatistics, SkullItem {

    @Override
    public String getName() {
        return "Magic Find Enrichment";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "TALISMAN_ENRICHMENT_MAGIC_FIND"; 
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
        return Rarity.SPECIAL;
    }

    @Override
    public boolean isEnchanted() {
        return true;
    }

    @Override
    public String getTexture() {
        return "ewogICJ0aW1lc3RhbXAiIDogMTcyMDA0MDEzMzI0OCwKICAicHJvZmlsZUlkIiA6ICJiYWI0NjQ1NzRmMjY0MGRhYmFlNmUzZTBjM2I4MzFjZiIsCiAgInByb2ZpbGVOYW1lIiA6ICJtb3N0d2FsbCIsCiAgInNpZ25hdHVyZVJlcXVpcmVkIiA6IHRydWUsCiAgInRleHR1cmVzIiA6IHsKICAgICJTS0lOIiA6IHsKICAgICAgInVybCIgOiAiaHR0cDovL3RleHR1cmVzLm1pbmVjcmFmdC5uZXQvdGV4dHVyZS9hZDNiNGEzMGFlZGM4MDQwODE1Nzc4Zjc3OGE3Mzk1OTA5YzRjY2NlNmZkNTVjNmUzZTQ3YWI1ZGE1MzE5NTJiIiwKICAgICAgIm1ldGFkYXRhIiA6IHsKICAgICAgICAibW9kZWwiIDogInNsaW0iCiAgICAgIH0KICAgIH0KICB9Cn0=";
    }

}
