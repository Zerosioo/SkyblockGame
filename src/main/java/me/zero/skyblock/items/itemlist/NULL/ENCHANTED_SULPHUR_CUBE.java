package me.zero.skyblock.items.itemlist.NULL;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ENCHANTED_SULPHUR_CUBE extends SItem implements ItemStatistics, SkullItem, Sellable {

    @Override
    public String getName() {
        return "Enchanted Sulphur Cube";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "ENCHANTED_SULPHUR_CUBE"; 
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
    public int getPrice() {
        return 256000;
    }

    @Override
    public String getTexture() {
        return "ewogICJ0aW1lc3RhbXAiIDogMTY0Mzg4NjMzMDgyNSwKICAicHJvZmlsZUlkIiA6ICJmODJmNTQ1MDIzZDA0MTFkYmVlYzU4YWI4Y2JlMTNjNyIsCiAgInByb2ZpbGVOYW1lIiA6ICJSZXNwb25kZW50cyIsCiAgInNpZ25hdHVyZVJlcXVpcmVkIiA6IHRydWUsCiAgInRleHR1cmVzIiA6IHsKICAgICJTS0lOIiA6IHsKICAgICAgInVybCIgOiAiaHR0cDovL3RleHR1cmVzLm1pbmVjcmFmdC5uZXQvdGV4dHVyZS80ZjBjMjhkZmNmNDJkNGRiZDI3YzMzNzhmNjcxNzZjODQ4MDBiYzY5YjRjZDUzMTcwMmM5NWNhNmZiOTkwNDU4IgogICAgfQogIH0KfQ==";
    }

}
