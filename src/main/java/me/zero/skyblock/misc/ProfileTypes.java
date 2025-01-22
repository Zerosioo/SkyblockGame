package me.zero.skyblock.misc;

import java.util.Random;
import java.util.UUID;

public class ProfileTypes {
    private static final String[] PROFILE_NAMES = {
            "Zucchini", "Papaya", "Watermelon", "Pineapple",
            "Lemon", "Apple", "Banana", "Orange", "Pear",
            "Coconuts", "Cherry", "Strawberry", "Raspberry",
            "Kiwi", "Mango", "Pomegranate", "Grape",
            "Avocado", "Tomato", "Cucumber", "Carrot",
            "Potato", "Onion", "Garlic", "Celery",
            "Broccoli", "Cauliflower", "Spinach", "Asparagus"
    };

    /**
     * Returns a random profile name from the predefined list.
     * @return A random profile name.
     */
    public static String getRandomProfileName() {
        return PROFILE_NAMES[new Random().nextInt(PROFILE_NAMES.length)];
    }

    /**
     * Generates a random UUID.
     * @return A random UUID.
     */
    public static UUID getRandomProfileID() {
        return UUID.randomUUID();
    }
}
