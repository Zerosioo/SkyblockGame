package me.zero.mortar;

import me.zero.mortar.npc.NPCRegistry;
import org.bukkit.plugin.java.JavaPlugin;

public class MortarLibrary {
    private static MortarLibrary library;

    private JavaPlugin plugin;
    private NPCRegistry npcRegistry;

    public static MortarLibrary link(JavaPlugin plugin) {
        MortarLibrary lib = new MortarLibrary();

        lib.plugin = plugin;
        
        lib.npcRegistry = new NPCRegistry();

        library = lib;

        return lib;
    }
    
    public static MortarLibrary getLibrary() {
    	return library;
    }
    
    public JavaPlugin getPlugin() {
    	return plugin;
    }
    
    public NPCRegistry getNpcRegistry() {
    	return npcRegistry;
    }
}
