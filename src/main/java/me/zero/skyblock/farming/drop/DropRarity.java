package me.zero.skyblock.farming.drop;

public enum DropRarity {
    UNCOMMON("UNCOMMON DROP", "§a"),
    RARE("RARE DROP", "§b"),
    LEGENDARY("LEGENDARY DROP", "§6");

    private final String title;
    private final String color;

    DropRarity(String title, String color) {
        this.title = title;
        this.color = color;
    }

    public String getTitle() { return title; }
    public String getColor() { return color; }
}
