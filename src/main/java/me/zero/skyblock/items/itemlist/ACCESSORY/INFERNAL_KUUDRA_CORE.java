package me.zero.skyblock.items.itemlist.ACCESSORY;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class INFERNAL_KUUDRA_CORE extends SItem implements ItemStatistics, SkullItem, Sellable {

    @Override
    public String getName() {
        return "Infernal Kuudra Core";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "INFERNAL_KUUDRA_CORE"; 
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
        return Rarity.LEGENDARY;
    }

    @Override
    public int getPrice() {
        return 1;
    }

    @Override
    public String getTexture() {
        return "ewogICJ0aW1lc3RhbXAiIDogMTY0NzA0MDIwMjI1OCwKICAicHJvZmlsZUlkIiA6ICJkNDg1NWJhYWMzYjM0Mjk1YWJmYjBlZjFiYWIyYzBkOCIsCiAgInByb2ZpbGVOYW1lIiA6ICJUb21pYXRhIiwKICAic2lnbmF0dXJlUmVxdWlyZWQiIDogdHJ1ZSwKICAidGV4dHVyZXMiIDogewogICAgIlNLSU4iIDogewogICAgICAidXJsIiA6ICJodHRwOi8vdGV4dHVyZXMubWluZWNyYWZ0Lm5ldC90ZXh0dXJlL2VjZTI1Mjk2M2E1MTg4Y2VmOGVkZTlkODUyM2JkOTFkMjg0YTc4NWI0MThiMzllZWMyOWE5MWFlYTA3YzYxZTIiCiAgICB9CiAgfQp9";
    }

}
