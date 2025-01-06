package me.zero.skyblock.user;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class BooleanHandler {

    private final Map<String, Boolean> booleanStates = new HashMap<>();

    // Set a boolean value
    public void setBoolean(String key, boolean value) {
        booleanStates.put(key, value);
    }

    // Get a boolean value (default to false if not present)
    public boolean getBoolean(String key) {
        return booleanStates.getOrDefault(key, false);
    }

    // Check if a key exists
    public boolean hasBoolean(String key) {
        return booleanStates.containsKey(key);
    }

    // Get all booleans
    public Map<String, Boolean> getAllBooleans() {
        return Collections.unmodifiableMap(booleanStates);
    }
}