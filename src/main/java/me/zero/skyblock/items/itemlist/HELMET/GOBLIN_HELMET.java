package me.zero.skyblock.items.itemlist.HELMET;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GOBLIN_HELMET extends SItem implements ItemStatistics, SkullItem, Sellable {

    @Override
    public String getName() {
        return "Goblin Helmet";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "GOBLIN_HELMET"; 
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
        return ItemType.HELMET;
    }

    @Override
    public Rarity getRarity() {
        return Rarity.RARE;
    }

    @Override
    public Gamestage getGamestage() {
        return Gamestage.INTERMEDIATE;
    }

    @Override
    public int getPrice() {
        return 1500;
    }

    @Override
    public int getHealth() {
        return 70;
    }

    @Override
    public int getIntelligence() {
        return -1;
    }

    @Override
    public int getMiningFortune() {
        return 4;
    }

    @Override
    public int getMiningSpeed() {
        return 10;
    }

    @Override
    public String getTexture() {
        return "ewogICJ0aW1lc3RhbXAiIDogMTU5NTI4NDQ1ODc4NSwKICAicHJvZmlsZUlkIiA6ICI3NTE0NDQ4MTkxZTY0NTQ2OGM5NzM5YTZlMzk1N2JlYiIsCiAgInByb2ZpbGVOYW1lIiA6ICJUaGFua3NNb2phbmciLAogICJzaWduYXR1cmVSZXF1aXJlZCIgOiB0cnVlLAogICJ0ZXh0dXJlcyIgOiB7CiAgICAiU0tJTiIgOiB7CiAgICAgICJ1cmwiIDogImh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvODJjYmI4MDBjZTBiZDllYTRjZWNjMGVjY2UzYzk1MjhjZGVmMzk2ZjNmZDc3OWEyODdkYzZkNWNiOTllMjM5NCIKICAgIH0KICB9Cn0=";
    }

}
