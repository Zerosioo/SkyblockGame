package me.zero.skyblock.mayors;

import java.util.List;

public class Perk {

    private final String title;
    private final List<String> description;

    public Perk(String title, List<String> description) {
        this.title = title;
        this.description = description;
    }

    public String getTitle() {
        return title;
    }

    public List<String> getDescription() {
        return description;
    }
}
