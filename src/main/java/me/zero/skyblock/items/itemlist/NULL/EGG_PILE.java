package me.zero.skyblock.items.itemlist.NULL;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class EGG_PILE extends SItem implements ItemStatistics, SkullItem {

    @Override
    public String getName() {
        return "Egg Pile";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "EGG_PILE"; 
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
    public String getTexture() {
        return "eyJ0aW1lc3RhbXAiOjE1MjE3MzUzNTQ1OTEsInByb2ZpbGVJZCI6ImRhNzQ2NWVkMjljYjRkZTA5MzRkOTIwMTc0NDkxMzU1IiwicHJvZmlsZU5hbWUiOiJEYW5jaW5nRG9nZ29fIiwic2lnbmF0dXJlUmVxdWlyZWQiOnRydWUsInRleHR1cmVzIjp7IlNLSU4iOnsidXJsIjoiaHR0cDovL3RleHR1cmVzLm1pbmVjcmFmdC5uZXQvdGV4dHVyZS9lZWIzMzUxODJkYjVmM2JlODBmY2NmNmVhYmU1OTlmNDEwN2Q0ZmYwZTlmNDRmMzQxNzRjZWZhNmUyYjU3NjgifX19";
    }

}
