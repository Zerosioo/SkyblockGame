package me.zero.skyblock.items.itemlist.ACCESSORY;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class HONED_SHARK_TOOTH_NECKLACE extends SItem implements ItemStatistics, SkullItem {

    @Override
    public String getName() {
        return "Honed Shark Tooth Necklace";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "HONED_SHARK_TOOTH_NECKLACE"; 
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
        return ItemType.ACCESSORY;
    }

    @Override
    public Rarity getRarity() {
        return Rarity.RARE;
    }

    @Override
    public int getStrength() {
        return 6;
    }

    @Override
    public String getTexture() {
        return "ewogICJ0aW1lc3RhbXAiIDogMTU5ODI1Mjg0NTA1NywKICAicHJvZmlsZUlkIiA6ICJmNWQwYjFhZTQxNmU0YTE5ODEyMTRmZGQzMWU3MzA1YiIsCiAgInByb2ZpbGVOYW1lIiA6ICJDYXRjaFRoZVdhdmUxMCIsCiAgInNpZ25hdHVyZVJlcXVpcmVkIiA6IHRydWUsCiAgInRleHR1cmVzIiA6IHsKICAgICJTS0lOIiA6IHsKICAgICAgInVybCIgOiAiaHR0cDovL3RleHR1cmVzLm1pbmVjcmFmdC5uZXQvdGV4dHVyZS9lNmIxMjA5MzhkODNiZjQ5ZGRhYjNhNzg2NjZhMGJmMzdhM2RlN2I0NmI5ZDk3Yjk4NGRhM2JlNjJjZTNlNWUzIgogICAgfQogIH0KfQ==";
    }

}
