package me.zero.skyblock.items.build;

import me.zero.skyblock.items.build.SItem;
import me.zero.skyblock.util.ReflectionUtil;
import me.zero.skyblock.util.SkyBlockLogger;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Lists {
    public static final Map<String, Class<? extends SItem>> items = new HashMap<>();

    public static void registerItems() {
        List<String> classes = ReflectionUtil.getClasses("me.zero.skyblock.items.itemlist");

        for (String className : classes) {
            try {
                Class<?> clazz = Class.forName(className);
                if (!SItem.class.isAssignableFrom(clazz)) continue;

                Class<? extends SItem> itemClass = (Class<? extends SItem>) clazz;
                String id = itemClass.getSimpleName();

                items.put(id, itemClass);
                SkyBlockLogger.print("&b[iTEM] &eLoaded &d" + id);
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }
        }
        
        SkyBlockLogger.print("&b[iTEM] &dLoaded &e" + items.size() + " &dItems!");
    }
}
