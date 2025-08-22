package me.zero.skyblock.items.build;

public interface SkullItem {

    default boolean isURL() {
        return false;
    }

    String getTexture();
}