package me.zero.skyblock.util;

import java.util.Random;

public class ChanceUtil {

    private static final Random random = new Random();

    /**
     * 
     * @param chance - percentage chance (0 to 100)
     * @return true if the chance succeeds, false otherwise
     */
    public static boolean check(double chance) {
        if (chance <= 0) return false;
        if (chance >= 100) return true;
        return random.nextDouble() * 100 < chance;
    }
}
