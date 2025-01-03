package me.zero.skyblock.user;

import me.zero.skyblock.main.SkyblockGame;
import org.bukkit.configuration.file.YamlConfiguration;

import java.io.File;

public class Config extends YamlConfiguration
{
    private final SkyblockGame plugin;
    private final File file;

    public Config(File parent, String name)
    {
        this.plugin = SkyblockGame.getPlugin(SkyblockGame.class);
        this.file = new File(parent, name);

        if (!file.exists())
        {
            options().copyDefaults(true);
            plugin.saveResource(name, false);
        }
        load();
    }

    public Config(String name)
    {
        this(SkyblockGame.getPlugin(SkyblockGame.class).getDataFolder(), name);
    }

    public void load()
    {
        try
        {
            super.load(file);
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }

    public void save()
    {
        try
        {
            super.save(file);
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}