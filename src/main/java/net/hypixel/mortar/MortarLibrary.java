package me.zero.mortar;

import lombok.Getter;

import me.zero.mortar.npc.NPCRegistry;
import org.bukkit.plugin.java.JavaPlugin;

public class MortarLibrary {
    @Getter
    private static MortarLibrary library;

    @Getter
    private JavaPlugin plugin;
    @Getter
    private NPCRegistry npcRegistry;

    public static MortarLibrary link(JavaPlugin plugin) {
        MortarLibrary lib = new MortarLibrary();

        lib.plugin = plugin;
        
        lib.npcRegistry = new NPCRegistry();

        library = lib;

        return lib;
    }


}
