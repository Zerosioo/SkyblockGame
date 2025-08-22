package me.zero.skyblock.items.itemlist.NULL;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DUNGEON_WIZARD_CRYSTAL extends SItem implements ItemStatistics, SkullItem {

    @Override
    public String getName() {
        return "Wizard's Crystal";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "DUNGEON_WIZARD_CRYSTAL"; 
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
    public boolean isDungeonItem() {
      	return true;
    }

    @Override
    public String getTexture() {
        return "eyJ0aW1lc3RhbXAiOjE1NjY4NzMxNDA0NTMsInByb2ZpbGVJZCI6IjQ0MDNkYzU0NzViYzRiMTVhNTQ4Y2ZkYTZiMGViN2Q5IiwicHJvZmlsZU5hbWUiOiJHR0dhbWVyc1lUIiwic2lnbmF0dXJlUmVxdWlyZWQiOnRydWUsInRleHR1cmVzIjp7IlNLSU4iOnsidXJsIjoiaHR0cDovL3RleHR1cmVzLm1pbmVjcmFmdC5uZXQvdGV4dHVyZS9mOGNlNmI3ZTMzODFhYjcxNWZlZmU2MWI5ZmRjOTRlZmMxMmFjNDI4MGI1ZTA3NTA4MTg0OGYyYjJjNDVhNGNjIn19fQ==";
    }

}
