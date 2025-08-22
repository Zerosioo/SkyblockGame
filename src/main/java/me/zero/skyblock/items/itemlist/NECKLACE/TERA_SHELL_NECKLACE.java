package me.zero.skyblock.items.itemlist.NECKLACE;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TERA_SHELL_NECKLACE extends SItem implements ItemStatistics, SkullItem {

    @Override
    public String getName() {
        return "Tera Shell Necklace";
    }

    @Override
    public List<String> getLore() {
        return new ArrayList(Arrays.asList("You can no longer","catch §6Trophy Fish","§6§7while wearing","§7this Necklace.","§7","§7§8§oTelling Trophy","§8§oFish to pound","§8§osand somehow","§8§oelicits their","§8§odeepest, darkest","§8§ofears.")); 
    }

    @Override
    public String getId() {
        return "TERA_SHELL_NECKLACE"; 
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
        return ItemType.NECKLACE;
    }

    @Override
    public Rarity getRarity() {
        return Rarity.EPIC;
    }

    @Override
    public boolean isStackable() {
        return false;
    }

    @Override
    public Gamestage getGamestage() {
        return Gamestage.EXPERT;
    }

    @Override
    public int getHealth() {
        return 80;
    }

    @Override
    public int getDefense() {
        return 30;
    }

    @Override
    public int getIntelligence() {
        return 20;
    }

    @Override
    public String getTexture() {
        return "ewogICJ0aW1lc3RhbXAiIDogMTczMzc1Mzk3NTExOSwKICAicHJvZmlsZUlkIiA6ICI3MmY5MTdjNWQyNDU0OTk0YjlmYzQ1YjVhM2YyMjIzMCIsCiAgInByb2ZpbGVOYW1lIiA6ICJUaGF0X0d1eV9Jc19NZSIsCiAgInNpZ25hdHVyZVJlcXVpcmVkIiA6IHRydWUsCiAgInRleHR1cmVzIiA6IHsKICAgICJTS0lOIiA6IHsKICAgICAgInVybCIgOiAiaHR0cDovL3RleHR1cmVzLm1pbmVjcmFmdC5uZXQvdGV4dHVyZS83YzUwMGFkYjA3YTczNGZjNGNjZDg0MDEwYWVlYjRjMGQwMjhjNTE3NGIyNjE5Y2Y2Njc1NzBjZWQ1NzE1Y2QiLAogICAgICAibWV0YWRhdGEiIDogewogICAgICAgICJtb2RlbCIgOiAic2xpbSIKICAgICAgfQogICAgfQogIH0KfQ==";
    }

}
