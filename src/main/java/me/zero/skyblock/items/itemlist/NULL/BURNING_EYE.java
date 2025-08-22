package me.zero.skyblock.items.itemlist.NULL;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BURNING_EYE extends SItem implements ItemStatistics, SkullItem, Sellable {

    @Override
    public String getName() {
        return "Burning Eye";
    }

    @Override
    public List<String> getLore() {
        return new ArrayList(Arrays.asList("§7§oProbably the","§7§osingle most","§7§oregrettable","§7§oeffect of","§7§oSulphur on the","§7§oisland's fauna.","§7§oYou can't kill a","§7§ospider with fire","§7§oif it's already","§7§oburning.")); 
    }

    @Override
    public String getId() {
        return "BURNING_EYE"; 
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
        return 1000;
    }

    @Override
    public String getTexture() {
        return "eyJ0aW1lc3RhbXAiOjE1ODQ1OTYxMjEyMTIsInByb2ZpbGVJZCI6IjIzZjFhNTlmNDY5YjQzZGRiZGI1MzdiZmVjMTA0NzFmIiwicHJvZmlsZU5hbWUiOiIyODA3Iiwic2lnbmF0dXJlUmVxdWlyZWQiOnRydWUsInRleHR1cmVzIjp7IlNLSU4iOnsidXJsIjoiaHR0cDovL3RleHR1cmVzLm1pbmVjcmFmdC5uZXQvdGV4dHVyZS84Mjg3YjM5N2RhZjk1MTZhMGJkNzZmNWYxYjdiZjk3OTUxNWRmM2Q1ZDgzM2UwNjM1ZmE2OGIzN2VlMDgyMjEyIn19fQ==";
    }

}
