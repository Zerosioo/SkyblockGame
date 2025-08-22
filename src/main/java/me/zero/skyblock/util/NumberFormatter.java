package me.zero.skyblock.util;

import java.text.DecimalFormat;

public class NumberFormatter {

    private static final DecimalFormat oneDecimal = new DecimalFormat("#.#");
    private static final DecimalFormat noDecimal = new DecimalFormat("#");

    public static String format(long number) {
        if (number >= 1_000_000_000_000L) {
            return formatUnit(number, 1_000_000_000_000L, "t");
        } else if (number >= 1_000_000_000) {
            return formatUnit(number, 1_000_000_000L, "b");
        } else if (number >= 1_000_000) {
            return formatUnit(number, 1_000_000L, "m");
        } else if (number >= 1_000) {
            return formatUnit(number, 1_000L, "k");
        } else {
            return String.valueOf(number);
        }
    }

    private static String formatUnit(long number, long divisor, String suffix) {
        double value = (double) number / divisor;
        if (value % 1 == 0) {
            return noDecimal.format(value) + suffix;
        } else {
            return oneDecimal.format(value) + suffix;
        }
    }

    public static String format(double number) {
        return format((long) number);
    }
}
