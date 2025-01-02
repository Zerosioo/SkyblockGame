package me.zero.skyblock.npcs.hub.museum;

import me.zero.mortar.npc.MortarNPC;
import me.zero.mortar.npc.NPCInteractionEvent;
import me.zero.mortar.npc.NPCMeta;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import java.util.Arrays;
public class MadameEleanorQGoldsworthIII extends MortarNPC {
    public MadameEleanorQGoldsworthIII() {
        super(new NPCMeta() {
            @Override
            public String getName() {
                return "MadameEleanorQGoldsworthIII";
            }
            @Override
            public int getId() {
                return 9730072;
            }
            @Override
            public String getSignature() {
                return "VnhMZ2a55oTztZzmxmmkoTQ8vmKUFyh1QUFBLHeVGB6AsaFeWhef+NLUtftoWAf64m78I+OkmIQcexSHtCLZm6xSGitEcx8i/TRx5X25ZsV+jHKd2jJQMMA/BFrnnfawvV6KZ7zqbc7m/5Uv4aOHZxcYt/EBJyNiDBpqhEGDX/Ulo34Ti87JTHp5lT4qG1pmND9FQw4T/1JNdJTI+Wlxw2Ux9k2tRloDAUtyb9YDwYjMn27Ua49eYtVv3tFawuibXFtIj0u/Ni88PF25zAU2kE+1i3dtmj6htQ/Nzgc8gaFB/cETHD997D4/DkpPPnCPL1sd8iO63ncma5aFxvaBwAh97bGIwNUrsJJy2AtYlluD3PHrIIukKCuN+v37+Tn8KM9AbYVVfpJ6Z1Xot+s3BClWuzo4+sAvfBER6QiOvCYuSBjlGxCagSEIaBkxc6YIFhVs5Wa1ijpPcebB+HROePr2lQNkRFjiA4QYDprZJLm6HeGpXAhHtKAEb/D965sYe1EY3zDSPB33ZdO/Yq0u5oq+jyzAIurmS/oHWbMJ8VPWF39jUzc7ykSosEUDwOt1N6bO67pOB7Axjkt/45zJiYgAiU9XOEAsfkeSQcHKeJve3yKKizs0j6nPXGsF9z+mYwVokYLFbisanum6GtXHmhCNNJEkHbX6cgOid5V0I4U=";
            }
            @Override
            public String getTexture() {
                return "ewogICJ0aW1lc3RhbXAiIDogMTYzNTE2OTIwNTU3NywKICAicHJvZmlsZUlkIiA6ICI5MThhMDI5NTU5ZGQ0Y2U2YjE2ZjdhNWQ1M2VmYjQxMiIsCiAgInByb2ZpbGVOYW1lIiA6ICJCZWV2ZWxvcGVyIiwKICAic2lnbmF0dXJlUmVxdWlyZWQiIDogdHJ1ZSwKICAidGV4dHVyZXMiIDogewogICAgIlNLSU4iIDogewogICAgICAidXJsIiA6ICJodHRwOi8vdGV4dHVyZXMubWluZWNyYWZ0Lm5ldC90ZXh0dXJlL2I3ZTBmYzhkZjkwNjdkMzkzYzk3N2YxZjM0MDI1NjM0MjIzZGIxNDVlOTQwM2RjMzJjMzExODg5ZTMzNjU5NjUiCiAgICB9CiAgfQp9";
            }
            @Override
            public String getDisplayName() {
                return "§bMadame Eleanor Q. GoldsworthIII";
            }
            @Override
            public String getWorldName() {
                return "world";
            }
            @Override
            public double getX() {
                return -63.5D;
            }
            @Override
            public double getY() {
                return 77D;
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