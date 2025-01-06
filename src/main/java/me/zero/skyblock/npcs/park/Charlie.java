package me.zero.skyblock.npcs.park;

import me.zero.mortar.npc.MortarNPC;
import me.zero.mortar.npc.NPCInteractionEvent;
import me.zero.mortar.npc.NPCMeta;
import me.zero.skyblock.inventory.GUI;
import me.zero.skyblock.inventory.inventories.reward.CharlieGUI;
import me.zero.skyblock.user.*;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;

import java.util.Arrays;

public class Charlie extends MortarNPC {
    public Charlie() {
        super(new NPCMeta() {
            @Override
            public String getName() {
                return "charlie";
            }
            @Override
            public int getId() {
                return 101;
            }
            @Override
            public String getSignature() {
                return "dTrton6UI0R9CDeAWj5ewX9fmWH8cs3JFFQ57Gxhf9TQivDFYvvtVNOzn3b/RLJfm2Lh/iUWoMAAt3tdUgqrMbqe8VUVVe8Btu/luut2GpotyxU/sX09CphQuGvBLpXf6fNu/WhePmSyaiCFDOySoeZf3HOnPQLsLTBT879d3b9Z2bBPFFjIT/x02G0hgIusqLjjWqLuQ56fdChKuAQPB1gRel61spdeX2zvDAHlsyqk2u3kJUZIoGCzlUDgSkHXBIcKcwHS2vbgxpBJ+n9LwMiB9NfeciKVpXUGC2gfF2FTYGb4yWKWdkd5LNeiAIB7AVriHlU+R64JmHAStAwDV0A/iw0LKRqWBw/8+U0IHjvKWKSnF58O5V098xDfxgufSLbj9J4Mp9AB1DTQ8GSqfOKkh8UokdwzrIaCw9cfabYGWuZUvvXzfujslIrorS2gWkiXyphbze/bYFL/L3gH7NA7ftr6SEUyrE3VUiuS+TV2jmjuzYwCqC0hjR8pG8CSmLQUGYEDOk93fJMVypudovu7ds2KWJYSkpb/1P5/kxMhu2rT3BC/VzOmq8Va7zd9DQAKrDdIxKOfsTGLT2e91VOUIoYJg0rPvQUvknscx/zmOtjTHokbA4tn2s5oKQNt50YWJDbhVShUWF/OsZ0Ijj86ElThFtgPwu3DnVPX9sw=";
            }
            @Override
            public String getTexture() {
                return "ewogICJ0aW1lc3RhbXAiIDogMTYxMTk4Njg5Mzk3MCwKICAicHJvZmlsZUlkIiA6ICI5ZDEzZjcyMTcxM2E0N2U0OTAwZTMyZGVkNjBjNDY3MyIsCiAgInByb2ZpbGVOYW1lIiA6ICJUYWxvZGFvIiwKICAic2lnbmF0dXJlUmVxdWlyZWQiIDogdHJ1ZSwKICAidGV4dHVyZXMiIDogewogICAgIlNLSU4iIDogewogICAgICAidXJsIiA6ICJodHRwOi8vdGV4dHVyZXMubWluZWNyYWZ0Lm5ldC90ZXh0dXJlL2IyYjEyYTgxNGNlZDhhZjAyY2RkZjI5YTM3ZTdmMzAxMWU0MzBlOGExOGIzOGI3MDZmMjdjNmJkMzE2NTBiNjUiCiAgICB9CiAgfQp9";
            }
            @Override
            public String getDisplayName() {
                return "Charlie";
            }
            @Override
            public String getWorldName() {
                return "world";
            }
            @Override
            public double getX() {
                return -286.5D;
            }
            @Override
            public double getY() {
                return 82D;
            }
            @Override
            public double getZ() {
                return -17.5D;
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
    	User user = User.getUser(player.getUniqueId());
    	
    	if (user.booleanHandler.getBoolean("isInSkyblock") == false) {
    // Do something if "isInSkyblock" is explicitly false
    player.sendMessage("Player is not in Skyblock. Initializing... §c§lTHIS IS JUST A TEST");
    user.booleanHandler.setBoolean("isInSkyblock", true); 
        }

     new CharlieGUI().open(player);
    }
}