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

public class Aatrox extends MortarNPC implements Mayor {

    public Aatrox() {
        super(new NPCMeta() {
            @Override public String getName() { return "Aatrox"; }
            @Override public int getId() { return 11511; }
            @Override public String getSignature() { return "muEXYWKUacFyyQuWofVOuw1XJOex7YPeDAhVbQ73gPK/f2W+CWTrbtxCx22pN2gftrKhqW7tLUOzyjnuYKnHKk7FFmDpEV2BkL7k+0IvlIRvz00+Yxia07IPSNYZDbe37q0W/6FP2aBY+Ge6gbHjKCuP1/pb9DbrlkGMvIzhNAQlkjVc1Uy7vYh5Uny9YNEZduDlU/yaWk+RPvUJOPDKzcQ9wpMyKU2GMefAKO5jUTlfH90WfrMmAnuf7AnpUP2owEmGyxsiQ3wYHaVkmur54ZkbSd24+wNVmxKnNaviwzXGDD4YHShzfgszVu53b++dBDHaHXPJnOJgN5MEPlsnNap4ikOFRZ5kfthFaxcg0fILJI9tRfNMwSJiU1tk8iHbrgsC1VlHwS9WYzF1kG8BptPfQoXjEjMxSyTWgbaSssUPX82JvKgTGzQLUyGy/eyK1QWLHHJtd/HO7Q2+RArfdPjMEinkfo619qEdYWXqnZddvhaOawWhrxn/ZQAmrxuBGmywpTgwcp0fNiJ0JsSVHRd7QKl7Obbx8/SPGZY5eIUULXguLC6hjLbEDwnRZ8P4+YEQb1+XIw5xcpPA31bhBFnuuESqUfoBCzo/rMNRYnayv1Gee+1Fy13w26WJQDqO2OhIEUEdvi9uHA2uR6zHY7wIahBRMnugmjNRwkyWRT8="; }
            @Override public String getTexture() { return "ewogICJ0aW1lc3RhbXAiIDogMTYxODY2NDU5NjQwNCwKICAicHJvZmlsZUlkIiA6ICI5ZDQyNWFiOGFmZjg0MGU1OWM3NzUzZjc5Mjg5YjMyZSIsCiAgInByb2ZpbGVOYW1lIiA6ICJUb21wa2luNDIiLAogICJzaWduYXR1cmVSZXF1aXJlZCIgOiB0cnVlLAogICJ0ZXh0dXJlcyIgOiB7CiAgICAiU0tJTiIgOiB7CiAgICAgICJ1cmwiIDogImh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvYzFiZGY1MDViYjhjMGYxZjMzNjVhMDMwMzJkZTE5MzE2NjNmZjcxYzU3ZTAyMjU1OGRlMzEyYjhmMWI1YzQ0NSIKICAgIH0KICB9Cn0="; }
            @Override public String getDisplayName() { return "§cAatrox"; }
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
        
        if (user.booleanHandler.getBoolean("aatrox_first_interaction") == false) {
        	
        	speak(player, Arrays.asList("Me Aatrox.", "Maddox's my older brother.", "Maddox is the brain. I slay. If you vote for me, you slay too!"));
        	
        	user.booleanHandler.setBoolean("aatrox_first_interaction", true);	
        	return;
        } else {
        	NPCUtil.randomSpeak(player, "Aatrox", Arrays.asList("If me lose mayor, me find you.", "Why talk? just slay.", "Maddox always hiding. I know why."));
        }
    }

    @Override
    public List<Perk> getPerks() {
        return Arrays.asList(
                new Perk("§dSLASHED Pricing", Arrays.asList("§7Starting slayer quest is §ehalf", "§eprice§7.")),
                new Perk("§dSlayer XP Buff", Arrays.asList("§7Earn §d25% §7more Slayer XP.")),
                new Perk("§dPathfinder", Arrays.asList("§7Gain rare drops §d20% §7more often."))
        );
    }

    @Override
    public MortarNPC createNPC() {
        return new Aatrox();
    }

    @Override
    public void onActive() {
        System.out.println("Aatrox has been elected mayor!");
    }
}
