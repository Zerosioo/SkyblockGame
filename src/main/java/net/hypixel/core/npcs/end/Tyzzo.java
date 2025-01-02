package me.zero.skyblock.npcs.end;

import me.zero.mortar.npc.MortarNPC;
import me.zero.mortar.npc.NPCInteractionEvent;
import me.zero.mortar.npc.NPCMeta;
import org.bukkit.ChatColor;
import java.util.Arrays;
public class Tyzzo extends MortarNPC {
    public Tyzzo() {
        super(new NPCMeta() {
            @Override
            public String getName() {
                return "Tyzzo";
            }
            @Override
            public int getId() {
                return 101;
            }
            @Override
            public String getSignature() {
                return "xYjwt7oig5Wodq2DR29gueBjIggrzLWdCbMtyP65yVjEH4y7moFYb0O6TCxFrlZH7G65cWhEzfU/Q+qRhZAz2GUrHGl3oxhsH8IKZfi8cD+XdBoPN8Ut3owgmdPcihoyTPvY5hcpGEaERbg5WiOQ4+1IP3FI5pBB8xB/MhZqhxhLkmcC99h7Z7iA3APoQ+VyOfSqJAzHw2L6O8XWUSWTNs0XHLuX+aNxGJWYb3evt0nk+x4ijpmWpGzazKYPaXRYDZ0FeDMF8jYIhUlQHQ3qqbX6Y4K9EqxxIR7JhYjQ1cjWdYgYDrSpihPSc1EE+WfCLr1AKQ/1xlSocPWzZ/zXq06qua9kJ7n3/ogy+IHVR88g18UEwnIFp6K1P1lI9GX/6N6T5o4+hd3CkX7nB8spvVzqo0VkHs/s10boeKR2uSMjmT1k8AE91WkjeR0lCJqhhKOYDFUf/w+afsKX6Tw+xdot9+ZRLSKsr/mtHFwU8qTxYSMRdqJhmJTc2nOgrtnBFYExVtbsHKrHaL/d7aAPUoPFouKpY18ztc6YOD47O7u7KszaXVxqt+oqJuShzKMWaTcOHVQ23yF3mJjaTg7QJKLdvfJW87J5uIp/TBH1roSHhIsNUaCuz5KSD0F5/vNFz3zG/JnhQpZ8kgifYBjWmv/6uUexG3bRMnv/Rd2fGEM=";
            }
            @Override
            public String getTexture() {
                return "ewogICJ0aW1lc3RhbXAiIDogMTYxOTM2MDM4MDc1NSwKICAicHJvZmlsZUlkIiA6ICI0ZjU2ZTg2ODk2OGU0ZWEwYmNjM2M2NzRlNzQ3ODdjOCIsCiAgInByb2ZpbGVOYW1lIiA6ICJDVUNGTDE1IiwKICAic2lnbmF0dXJlUmVxdWlyZWQiIDogdHJ1ZSwKICAidGV4dHVyZXMiIDogewogICAgIlNLSU4iIDogewogICAgICAidXJsIiA6ICJodHRwOi8vdGV4dHVyZXMubWluZWNyYWZ0Lm5ldC90ZXh0dXJlLzYzYzRlZGQxYzI3ZGIzMTYyZTkyZjg3MDgxMGZjZTM2NDZkY2JmOGVmNWViYjQ2ZjJkZGFkNWQ4ODQyNWUyZWUiCiAgICB9CiAgfQp9";
            }
            @Override
            public String getDisplayName() {
                return "Tyzzo";
            }
            @Override
            public String getWorldName() {
                return "world";
            }
            @Override
            public double getX() {
                return -597.5D;
            }
            @Override
            public double getY() {
                return 5D;
            }
            @Override
            public double getZ() {
                return -272.5D;
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