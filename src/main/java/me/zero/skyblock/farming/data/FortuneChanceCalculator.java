package me.zero.skyblock.farming.data;

import java.util.Random;

public class FortuneChanceCalculator {
    private static final Random random = new Random();

    public static int calculateDrop(int baseAmount, double chance) {
        int extra = 0;
        for (int i = 0; i < baseAmount; i++) {
            if (random.nextDouble() < chance) {
                extra++;
            }
        }
        return baseAmount + extra;
    }
}
