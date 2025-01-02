package me.zero.skyblock.npcs.hub.museum;

import me.zero.mortar.npc.MortarNPC;
import me.zero.mortar.npc.NPCInteractionEvent;
import me.zero.mortar.npc.NPCMeta;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import java.util.Arrays;
public class Curator extends MortarNPC {
    public Curator() {
        super(new NPCMeta() {
            @Override
            public String getName() {
                return "Curator";
            }
            @Override
            public int getId() {
                return 97302;
            }
            @Override
            public String getSignature() {
                return "JQaG6dLgLgiEl6c/86bGPlXmXe8Lr2/NV1hPJOVGCHh037TQlcl9OyqOwhn2ofL4ITLS/HTnaX6GiIbDxVaeYPzD+M5hZDTZtgP10QmKLvQirhnRZ84YvyP+eOm7XB5BZj6IfE4yGLAO7ag85zjvUDpOivrna6KPrCMBodWsyafJ4dk8GLf3okyaVTV9y8O7/BwG8R2x2HSZ5nJ9/sFYYynRnx6tDpTN20OLdyZ9wlWOrahoFEQotgfMVhHNm85Ds2EU/Iyo8ngjPgl7shVtRqonD4qDNbS/i9ICNFzKTDqWGW82Wjmi0b5Hd7AG6Pzmlc0lXBwG5wIB53xJjHX5zpucj8rYdTQdV3F+a4uYyWVw0KLmxpapFTVtWhWdOUzK1Le8dKW8dvi8MnP4m0hn30Iad9BqMmg/ko1aGZhkvUv4IhjWSaYvSWMx16rJj8CZZzhjdLCRgyb1XPAZaHr26gZzgSiHnivb97gQIH4ML3MOjtbCGaLTirADSUovALDrlHB8RofFG3mQVzoTF7LSJIXKgpkRi000AJIabrBkW36SiJySTPpaEG/Flme/886bjtU0A31S2vjM19CjgXsXlvPRRbmS94pyLfoLYc23VlmZoaqrAdFDdMkXQYZ354VQeYJ0o82LCPNRoreLiZPa7AQtPrhh+tQVlz4olVqJB10=";
            }
            @Override
            public String getTexture() {
                return "ewogICJ0aW1lc3RhbXAiIDogMTYzNTE2OTQwMTIwOSwKICAicHJvZmlsZUlkIiA6ICIxNzhmMTJkYWMzNTQ0ZjRhYjExNzkyZDc1MDkzY2JmYyIsCiAgInByb2ZpbGVOYW1lIiA6ICJzaWxlbnRkZXRydWN0aW9uIiwKICAic2lnbmF0dXJlUmVxdWlyZWQiIDogdHJ1ZSwKICAidGV4dHVyZXMiIDogewogICAgIlNLSU4iIDogewogICAgICAidXJsIiA6ICJodHRwOi8vdGV4dHVyZXMubWluZWNyYWZ0Lm5ldC90ZXh0dXJlL2ZmMjJiMDM0ZDM3MjFkMWZhZDcwODI4ZTM3NTkyNWJhNDFiNWY5NTI4NzNjZDlmYzZkYmJlMWU4MGJlN2JlYjUiCiAgICB9CiAgfQp9";
            }
            @Override
            public String getDisplayName() {
                return "§bCurator";
            }
            @Override
            public String getWorldName() {
                return "world";
            }
            @Override
            public double getX() {
                return -27.5D;
            }
            @Override
            public double getY() {
                return 63D;
            }
            @Override
            public double getZ() {
                return 84.5D;
            }
            @Override
            public float getYaw() {
                return -89.8F;
            }
            @Override
            public float getPitch() {
                return 0.2F;
            }
            @Override
            public boolean canLook() {
                return true;
            }
        });
    }
    @Override
    public void onInteract(NPCInteractionEvent event) {
      
      Player player = event.getPlayer();
      
      player.sendMessage("§cThis Museum is temporarily disabled. Check back again later!");
      
      
    }
}