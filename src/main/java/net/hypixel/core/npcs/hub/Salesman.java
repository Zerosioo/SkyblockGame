package me.zero.skyblock.npcs.hub;

import me.zero.mortar.npc.MortarNPC;
import me.zero.mortar.npc.NPCInteractionEvent;
import me.zero.mortar.npc.NPCMeta;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import java.util.Arrays;
import me.zero.skyblock.inventory.GUI;

public class Salesman extends MortarNPC {
    public Salesman() {
        super(new NPCMeta() {
            @Override
            public String getName() {
                return "Salesman";
            }
            @Override
            public int getId() {
                return 297965886;
            }
            @Override
            public String getSignature() {
                return "An0m5cBB5hWscrIDH1AXvhyptwZMLTeDUwoSPSna5a/n5D2cn1sYOuDs0RjXxirFBfy/F2fRERQCgh3dhajQ92YLnRyG+ejwPo+Rv/6OcxJRtwFomj/cA6XIvrEB4eZkroSCMQxqlYVbhEN0VKVqaOaGUs2bWgsCxVY1r8dsN0Fefcv5Pqa9nAVnZv3Aa65VRuZ1ruAkt2GECAmDrGBKMBcG8f4qKwFkmKPL8vZlF7AptdJ1HqVVPOfG2p2mSiCOQvrRNbrX5KDZoDN61q9nlHK7JeenVte7vlzBIs/tghJWmAjKRPHwbPmZ8hBRzZM02UhyuZkjWy1F+oTegssVW0jLwQ6TU0XhCE9kRzoBjLbfXBzNlRqshKK82cpO8V/Khu9/deN9F6gPoIOr/wIHBVm5D8ByCyVqcOFhLf8M+EZivpda9K3Ofbe/lnihnwvgg3vOzQCbZjuTrYBd4cGcEEqVW9uIQBzUZmmiHhwWS8cLukLPgRtF7i+lvvriCTztPrjMAULL13D3VWBrYDOzAUnHn6Ll9MC3C5ugATzFLpILVjOQ2PHq0HaTnyv5+EtmDv/Z2DOovxS9EXjD8DeEv8D+N5AiC47gJ/quk3Ld33uk5+6g44g+hp9HYf6gRp5Pbfw4PDP9TrelCDzEuUeSDulNl7vTVdeweHip1Lr4WpI=";
            }
            @Override
            public String getTexture() {
                return "ewogICJ0aW1lc3RhbXAiIDogMTYxMjAwMzQwOTA4MSwKICAicHJvZmlsZUlkIiA6ICI1ZWE0ODg2NTg2OWI0Y2ZhOWRjNTg5YmFlZWQwNzM5MCIsCiAgInByb2ZpbGVOYW1lIiA6ICJfUllOMF8iLAogICJzaWduYXR1cmVSZXF1aXJlZCIgOiB0cnVlLAogICJ0ZXh0dXJlcyIgOiB7CiAgICAiU0tJTiIgOiB7CiAgICAgICJ1cmwiIDogImh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvNTBjMTJjYjFkYWE4MmUyOWYyODkwYTRkYjg5M2I1YzdjYmRkNTViMWNmYmI2ZjM1YmMzODI3YTcxOTZmMWQ4MiIKICAgIH0KICB9Cn0=";
            }
            @Override
            public String getDisplayName() {
                return "§bSalesman";
            }
            @Override
            public String getWorldName() {
                return "world";
            }
            @Override
            public double getX() {
                return 7.5D;
            }
            @Override
            public double getY() {
                return 70D;
            }
            @Override
            public double getZ() {
                return -85.5D;
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
      
      speak(event.getPlayer(), Arrays.asList(
                "§fThank you for supporting the server and allowing us to maintain SkyBlock!",
                "§fIf you want to support us, head over to the SkyblockGame Store at §bstore.SkyblockGame.net"
                
        ));
      
    }
}