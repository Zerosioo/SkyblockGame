package me.zero.skyblock.npcs.park;

import me.zero.mortar.npc.MortarNPC;
import me.zero.mortar.npc.NPCInteractionEvent;
import me.zero.mortar.npc.NPCMeta;
import org.bukkit.ChatColor;
import java.util.Arrays;
public class OldShamanNyko extends MortarNPC {
    public OldShamanNyko() {
        super(new NPCMeta() {
            @Override
            public String getName() {
                return "OldShamanNyko";
            }
            @Override
            public int getId() {
                return 107;
            }
            @Override
            public String getSignature() {
                return "Zo9L07AXB7AKKs2nB8lD0i0MI/25dJHggoJjFZOxGT+5NKu/WCgmLNQj3Dtv5G39R8t5LRUObxpbIIKOivqP926MRQkjKicd3xe0DDUp8I/MZAr9lqs8rqSI+1ZmFSVodJCRWe10UK3wMblGsrq5zqu/wDfTwPIH1AUY+yNeQmpeS6WryMOx8KuGOpJ/uTj1izQN7HLPPZrKUeZRB09UTvKLaUvVgwbEb0E67535BJAqJcin7qcnA6o4Xzv7aGRfjXbUiKhabGREmKcSj2Xf17NrnVV9meQwAyG1FRdm49cpoi522QEhjLmp2I+ecM3cQPSLc9vpa6dbik9tuox9qeXy0EnSsLbTWZFmkQ6z5v+XVZByV5nntG1iNZZdqOwJL605NsxGOpcTpx9qeliYbSaTX8dumxR/LrRpMpWGsX00sKVqQhk3PnP7nxZCY5LEpJhfAqBplZZsRlYWI+Q5xpOA+p/B6SBNb4vH/sWdPO0ZUD+kdwALwqmeZLijtMKkZu+DrQCcY9Rz/0e+4NmZ4Tprz+BRodlNCZy2iTCoNSGr75P8+eO9BRbU74wAA8LWmSFshq2XwYR/f4dBOc7oO2aQ/kYfmXi75YNyjcvgVPZMCR8MqjnhC271HoiK8idO7pkEfRecjirvPFC4m3TLXeSFHa6N73rdt1w72nFydIs=";
            }
            @Override
            public String getTexture() {
                return "ewogICJ0aW1lc3RhbXAiIDogMTY1Mzk3MTg0ODY2OSwKICAicHJvZmlsZUlkIiA6ICIzOTVkZTJlYjVjNjU0ZmRkOWQ2NDAwY2JhNmNmNjFhNyIsCiAgInByb2ZpbGVOYW1lIiA6ICJzcGFyZXN0ZXZlIiwKICAic2lnbmF0dXJlUmVxdWlyZWQiIDogdHJ1ZSwKICAidGV4dHVyZXMiIDogewogICAgIlNLSU4iIDogewogICAgICAidXJsIiA6ICJodHRwOi8vdGV4dHVyZXMubWluZWNyYWZ0Lm5ldC90ZXh0dXJlLzU3YTUxNzg2NWI4MjBhNDQ1MWNkM2NjNjc2NWYzNzBmZDA1MjJiNjQ4OWM5Yzk0ZmIzNDVmZGVlMjY4OTQ1MWEiCiAgICB9CiAgfQp9";
            }
            @Override
            public String getDisplayName() {
                return "Old Shaman Nyko";
            }
            @Override
            public String getWorldName() {
                return "world";
            }
            @Override
            public double getX() {
                return -379.5D;
            }
            @Override
            public double getY() {
                return 60D;
            }
            @Override
            public double getZ() {
                return 36.5D;
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

     
    }
}