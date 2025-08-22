package me.zero.skyblock.npcs.mayors;

import me.zero.mortar.npc.MortarNPC;
import me.zero.mortar.npc.NPCInteractionEvent;
import me.zero.mortar.npc.NPCMeta;
import me.zero.skyblock.mayors.Mayor;
import me.zero.skyblock.mayors.Perk;
import me.zero.skyblock.user.User;
import me.zero.skyblock.util.NPCUtil;

import java.util.Arrays;
import java.util.List;

import org.bukkit.entity.Player;

public class Cole extends MortarNPC implements Mayor {

    public Cole() {
        super(new NPCMeta() {
            @Override public String getName() { return "Cole"; }
            @Override public int getId() { return 44474; }
            @Override public String getSignature() { return "WyW8Lhm0VJo5+Gc3DMIuL9OkdOS0+RmXmSqlhBiNPHS+V+L9wHW2e0+QM6guc2cDolir7/TLKsPAIwCVqldqHBJPhQcvFW7Jssrxm4OK9DM7WOxLGTSLEGEEF5xjsexs6LfOWsVhg81QTYHM+2WlGbDUIJkRv32w4jBVAbkxaT1jgkgaz2CCAjsSfiL2fdpBxjWqZBdj3SaUtiw+Fvm5SFwe1zfcPtXimw4jG/MwPvRsgokM9yKvfUQO+XIFqIrcMB7hIA8yK1GISJXaHs39bfTQSgN0FjrVrP6/soru2a/6I/xhxjXJ08lvm0NpBITegs35/kTwIaGdDzHnFjWoIgVzz/9Z7ty6lcyVJLAU28hf6eyoes9NffzEooZa98kIjAg7Yft5pD0fqySqOJ8bMDe4q6rh2aFfyhweftKX4Aokut3BCF4j/K78HLMaaYSwg3axUaRlPtD3H2VcmgZyW/HdKlGKF7eaHEiv+BGijo8XNsy80s57NmCbTB8YOtrD7+KaUwXTvId5ZkvrPgHvgcsySmrfIs2jgcBvGDXj6PTyE3LNSdcFa+pq8jS62plREaltXY8v8/5HTHM2r+iD89+jeeeSGux7RM6bzBedUjnwOPjsZhaZpMujZ7GMM/UVA+NQXsUI6zlf/fPZX7WxY4VO16twO6Nkta9rdX/0RX4="; }
            @Override public String getTexture() { return "ewogICJ0aW1lc3RhbXAiIDogMTYyMjc4MTIzODYwNiwKICAicHJvZmlsZUlkIiA6ICJiNWRkZTVmODJlYjM0OTkzYmMwN2Q0MGFiNWY2ODYyMyIsCiAgInByb2ZpbGVOYW1lIiA6ICJsdXhlbWFuIiwKICAic2lnbmF0dXJlUmVxdWlyZWQiIDogdHJ1ZSwKICAidGV4dHVyZXMiIDogewogICAgIlNLSU4iIDogewogICAgICAidXJsIiA6ICJodHRwOi8vdGV4dHVyZXMubWluZWNyYWZ0Lm5ldC90ZXh0dXJlLzE2NDIyZGUwODg0ODk1MmQxY2JlYWQ2NmJiYmFkNmYwNzE5MWJkY2M5NTJmM2QxMDM2YWViMGMyMjkzOGYzOWIiCiAgICB9CiAgfQp9"; }
            @Override public String getDisplayName() { return "§bCole"; }
            @Override public String getWorldName() { return "world"; }
            @Override public double getX() { return 0; }
            @Override public double getY() { return 0; }
            @Override public double getZ() { return 0; }
            @Override public float getYaw() { return 0; }
            @Override public float getPitch() { return 0; }
            @Override public boolean canLook() { return true; }
        });
    }

    @Override
    public void onInteract(NPCInteractionEvent event) {
        Player player = event.getPlayer();
        User user = User.getUser(player.getUniqueId());
        
        if (user.booleanHandler.getBoolean("cole_first_interaction") == false) {
        	user.booleanHandler.setBoolean("cole_first_interaction", true);	
        	speak(player, Arrays.asList("Oi, mining is tough, but has t'be done!", "I'm not different than yu' pal, I just work twice as hard!", "I'll revolutionize mining, watch me!"));
        } else {
        	NPCUtil.randomSpeak(player, "Cole", Arrays.asList("Some people mine to forget, I mine to remember.", "A good pickaxe, is a swinging pickaxe!", "Nothin' is more satisfying, than a full inventory after a day of work!"));
        }
    }

    @Override
    public List<Perk> getPerks() {
        return Arrays.asList(
                new Perk("§dProspection", Arrays.asList("§7Mining minions work §a25% §7faster.")),
                new Perk("§dMining XP Buff", Arrays.asList("§7Get §3+60☯ Mining Wisdom §7on public", "§7islands.")),
                new Perk("§dMining Fiesta", Arrays.asList("§7Schedules 5 §6Mining Fiestas", "§7throughout the year! During these", "§7events gain §3+75☯ Mining Wisdom§7,", "§7collect §9Refined Mineral §7and §5Glossy", "§5Gemstone§7, and earn §d2x drops §7from", "§7mining!")),
         new Perk("§dMolten Forge", Arrays.asList("§7Decrease the time it takes to", "§6forge items by §d25%§7.")));
    }

    @Override
    public MortarNPC createNPC() {
        return new Cole();
    }

    @Override
    public void onActive() {
        System.out.println("Cole has been elected.");
    }
}
