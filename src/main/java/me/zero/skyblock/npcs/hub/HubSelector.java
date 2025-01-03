package me.zero.skyblock.npcs.hub;

import me.zero.mortar.npc.MortarNPC;
import me.zero.mortar.npc.NPCInteractionEvent;
import me.zero.mortar.npc.NPCMeta;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import java.util.Arrays;
import me.zero.skyblock.inventory.GUI;
import me.zero.skyblock.inventory.inventories.npcmenus.HubSelectorGUI;

public class HubSelector extends MortarNPC {
    public HubSelector() {
        super(new NPCMeta() {
            @Override
            public String getName() {
                return "HubSelector";
            }
            @Override
            public int getId() {
                return 29709658;
            }
            @Override
            public String getSignature() {
                return "yGPTZDewV5jFB/WRbL58bu6WjeRJ9cEm6mR0iAr3F3xNO0L+n17+l5jNUYPdEZyuQDAq+7WdcbXwg5BxGv7pwpKSvlkhG7jQnbAzp0vjiB50/d1fMSIuZyYiGrMgnYwelyb/Pf+MbvBXicft53lecOVoP0ba1W4HsxKI1ItVaZvraN+cgUviWSuztDOQQcdkfpL1OOfTdSxoFFXhMpPbSxCyfKx1UovPNCeH1+UZDNrtZbYYUyUJ9mJUhX789V/XTcuCGx0MjQ/xLsxca6nm/xmY33xWjRZiETFLT+dfv8jYzUi8f5FIHHtK0cGJHLQy+ljwnE12T73aNpYR5LBxF6PDYeWG4DM2nssgA1FYwppAkmlJULzzFYI/IVRd8kfjRYDuCGg81Eg1L7Nzbjh/GNlPziHX2YXbD0fOgPaq38TT2/fFjfanIqCakAsiFBtGBqiD5aGQfpxIHSvnrq/J3pgskp0E5IZaJkU2UDsUGFh4mqS+cZoGhZokAOA3ivjU/5veKeG1EUXBlCHOHTPseWEYsSnezfIIqXnHcTJenoub1exiztVxUus/fUMajRpRPTF4qTvTpkG3Ora/kbJI73NZqiinJzFXrcGWoibcsyo07JtGPkGkBsp9z9ZiYyIhZ2Oft7xHlf84flKty3Pkjvxd2MxoYV02cmLUK+bYvYU=";
            }
            @Override
            public String getTexture() {
                return "ewogICJ0aW1lc3RhbXAiIDogMTY4MTkxMjM0MzUzNywKICAicHJvZmlsZUlkIiA6ICIwZDZjODU0ODA3ZGQ0NWZkYmMxZDEyMzY2OGY1ZWQwZiIsCiAgInByb2ZpbGVOYW1lIiA6ICJXcWxmZnhJcmt0IiwKICAic2lnbmF0dXJlUmVxdWlyZWQiIDogdHJ1ZSwKICAidGV4dHVyZXMiIDogewogICAgIlNLSU4iIDogewogICAgICAidXJsIiA6ICJodHRwOi8vdGV4dHVyZXMubWluZWNyYWZ0Lm5ldC90ZXh0dXJlLzUzMTRkMjc4NDRlYWRlYTU1MDM1ZTM1MDU3NWExOWVhMGU0NGMxNTVlMDhiZGNhYTEwOTFlYTExNDNiNmVkODMiCiAgICB9CiAgfQp9";
            }
            @Override
            public String getDisplayName() {
                return "Hub Selector";
            }
            @Override
            public String getWorldName() {
                return "world";
            }
            @Override
            public double getX() {
                return -9.5D;
            }
            @Override
            public double getY() {
                return 70D;
            }
            @Override
            public double getZ() {
                return -67.5D;
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
      
      new HubSelectorGUI().open(event.getPlayer());
      
    }
}