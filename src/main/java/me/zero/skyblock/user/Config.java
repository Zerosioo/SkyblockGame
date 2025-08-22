package me.zero.skyblock.user;

import me.zero.skyblock.main.SkyblockGame;
import org.bukkit.configuration.ConfigurationSection;
import org.bukkit.configuration.file.YamlConfiguration;

import java.io.File;

public class Config extends YamlConfiguration {

    private final SkyblockGame plugin;
    private final File file;

    public Config(File parent, String name) {
        this.plugin = SkyblockGame.getPlugin(SkyblockGame.class);
        this.file = new File(parent, name);

        if (!file.exists()) {
            options().copyDefaults(true);
            plugin.saveResource(name, false);
        }
        load();
    }

    public Config(String name) {
        this(SkyblockGame.getPlugin(SkyblockGame.class).getDataFolder(), name);
    }

    public void load() {
        try {
            super.load(file);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void save() {
        try {
            super.save(file);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // Dot path support
    public Object getValue(String path) {
        String[] parts = path.split("\\.");
        ConfigurationSection section = this;

        for (int i = 0; i < parts.length - 1; i++) {
            if (!section.isConfigurationSection(parts[i])) {
                return null;
            }
            section = section.getConfigurationSection(parts[i]);
        }
        return section.get(parts[parts.length - 1]);
    }

    public void setValue(String path, Object value) {
        String[] parts = path.split("\\.");
        ConfigurationSection section = this;

        for (int i = 0; i < parts.length - 1; i++) {
            if (!section.isConfigurationSection(parts[i])) {
                section = section.createSection(parts[i]);
            } else {
                section = section.getConfigurationSection(parts[i]);
            }
        }

        section.set(parts[parts.length - 1], value);
    }

    public String getString(String path) {
        Object val = getValue(path);
        return val != null ? val.toString() : null;
    }

    public int getInt(String path) {
        Object val = getValue(path);
        return val instanceof Number ? ((Number) val).intValue() : 0;
    }

    public long getLong(String path) {
        Object val = getValue(path);
        return val instanceof Number ? ((Number) val).longValue() : 0L;
    }

    public boolean getBoolean(String path) {
        Object val = getValue(path);
        return val instanceof Boolean ? (Boolean) val : false;
    }

    public boolean contains(String path) {
        return getValue(path) != null;
    }

    public ConfigurationSection getConfigurationSection(String path) {
        Object val = getValue(path);
        return val instanceof ConfigurationSection ? (ConfigurationSection) val : null;
    }

    public void set(String path, Object value) {
        setValue(path, value);
    }
}
