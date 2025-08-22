package me.zero.skyblock.items.itemlist.ACCESSORY;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FIERY_KUUDRA_CORE extends SItem implements ItemStatistics, SkullItem, Sellable {

    @Override
    public String getName() {
        return "Fiery Kuudra Core";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "FIERY_KUUDRA_CORE"; 
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
    public int getPrice() {
        return 1;
    }

    @Override
    public String getTexture() {
        return "ewogICJ0aW1lc3RhbXAiIDogMTY0NzA0MDI0NTQ3NiwKICAicHJvZmlsZUlkIiA6ICI3MzY0ODFkZmY2ZGY0NWUwOTA0ODg0ZjNiMWExMjY1NSIsCiAgInByb2ZpbGVOYW1lIiA6ICJUd2lsaWdodFFBUSIsCiAgInNpZ25hdHVyZVJlcXVpcmVkIiA6IHRydWUsCiAgInRleHR1cmVzIiA6IHsKICAgICJTS0lOIiA6IHsKICAgICAgInVybCIgOiAiaHR0cDovL3RleHR1cmVzLm1pbmVjcmFmdC5uZXQvdGV4dHVyZS8yMDBjMTY3MzhjMzcyNDg0NjI4Y2ExNWNmN2IwNzMxYjgxMGJkMzE0MmUwN2MxMDUzYjVlM2RhNmI2ZTUyM2NhIgogICAgfQogIH0KfQ==";
    }

}
