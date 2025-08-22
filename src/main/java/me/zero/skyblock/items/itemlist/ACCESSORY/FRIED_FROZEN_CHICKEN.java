package me.zero.skyblock.items.itemlist.ACCESSORY;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FRIED_FROZEN_CHICKEN extends SItem implements ItemStatistics, SkullItem {

    @Override
    public String getName() {
        return "Fried Frozen Chicken";
    }

    @Override
    public List<String> getLore() {
        return new ArrayList(Arrays.asList("§8§oFried Frozen?!","§8§oThere is no such","§8§othing!")); 
    }

    @Override
    public String getId() {
        return "FRIED_FROZEN_CHICKEN"; 
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
        return Rarity.EPIC;
    }

    @Override
    public Soulbound getSoulbound() {
        return Soulbound.SOLO;
    }

    @Override
    public String getTexture() {
        return "ewogICJ0aW1lc3RhbXAiIDogMTczOTY2NjM2NDgyNCwKICAicHJvZmlsZUlkIiA6ICI1OWJlOTUyY2EyNjc0OWE4OTM1YmQ5MGQxNmMyN2M4OCIsCiAgInByb2ZpbGVOYW1lIiA6ICJUaGVQZW5zcGlubmV1ciIsCiAgInNpZ25hdHVyZVJlcXVpcmVkIiA6IHRydWUsCiAgInRleHR1cmVzIiA6IHsKICAgICJTS0lOIiA6IHsKICAgICAgInVybCIgOiAiaHR0cDovL3RleHR1cmVzLm1pbmVjcmFmdC5uZXQvdGV4dHVyZS9hZGYzMDExNmYyNTRmNjAxNjdjZWU0MTM3MTIyNzgzZDJiNGE0Y2NjMzYzNzMwNzdkNTA3MzUyNDI0MDQ1Y2U0IiwKICAgICAgIm1ldGFkYXRhIiA6IHsKICAgICAgICAibW9kZWwiIDogInNsaW0iCiAgICAgIH0KICAgIH0KICB9Cn0=";
    }

}
