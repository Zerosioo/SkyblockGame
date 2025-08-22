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

public class Diana extends MortarNPC implements Mayor {

    public Diana() {
        super(new NPCMeta() {
            @Override public String getName() { return "Diana"; }
            @Override public int getId() { return 26222; }
            @Override public String getSignature() { return "ActkMtMlnReBeZmlIb2S4NYlWz5bNGAgmwzVZ0RYq9Xu06EApzcsTvaaFIY2jlW1200HwgGymUPy48krMpAgYjJWaW+RLW3McqjKUkdOAUJu0c6xy138u28BX9W+BXLMSv8GNLrpwuN8h7kUtl4BRL20ERsUboqOMuqttpdts82fDYexQNcHGsePJeu8GbqvPhoScyMeaD+URP++4MEPs8pYGfmvyhA26P7aEfVNpCBRRdx2vA9O86LD8/kPcH1Sn1nFgxHmbKeuZPmNUNBpKUKtRkfJw+SEu8ji/tnxAMfeu1Sfnz6oUMjAR+gE3z8XugrnIMAwrjVbLJm2mUfXx+wN65F9QsSukyyYeG5MaJzXaKOMrmwukreA0Vb7v4Z7CAXNl7dxxF9qIIsy6nfbB4rLIk2psesGgD+hJ8+Vko/wdIUzAItXGklx1OThHfaZV1RklmoodDV5gSsC2jfFX7GkjlMkw9Toleyq0ysR4/LVPj3nCpYXKJmvFWanf1mZ+pnmj/x0wrQRSKM5h9jlxCTWao+b0HKbN6igvLyCWRervMdNwDUxHgPX5dfOW1CIvrW71VMcv/SzMxSIlaFjWm9xEr5hr+V90magNRjOC4s1sndfppNN79etgCnyZw6juNBBVnblIdnn6X0SHyHls9O1mEGmKIPUOmDFiGwGG2A="; }
            @Override public String getTexture() { return "ewogICJ0aW1lc3RhbXAiIDogMTc0OTY5NDE2MDM4MywKICAicHJvZmlsZUlkIiA6ICJmZjQ3NzI5YmQwZDI0YWYwOThiMTFjMGE3ZTFiMGVlZiIsCiAgInByb2ZpbGVOYW1lIiA6ICJtYXRzY2FuIiwKICAic2lnbmF0dXJlUmVxdWlyZWQiIDogdHJ1ZSwKICAidGV4dHVyZXMiIDogewogICAgIlNLSU4iIDogewogICAgICAidXJsIiA6ICJodHRwOi8vdGV4dHVyZXMubWluZWNyYWZ0Lm5ldC90ZXh0dXJlLzgzY2MxY2Y2NzJhNGIyNTQwYmUzNDZlYWQ3OWFjMmQ5ZWQxOWQ5NWI2MDc1YmY5NWJlMGI2ZDBkYTYxMzc3YmUiCiAgICB9CiAgfQp9"; }
            @Override public String getDisplayName() { return "§2Diana"; }
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
        
        if (user.booleanHandler.getBoolean("diana_first_interaction") == false) {
        	user.booleanHandler.setBoolean("diana_first_interaction", true);	
        	
        } else {
        	NPCUtil.randomSpeak(player, "Diana", Arrays.asList(""));
        }
    }

    @Override
    public List<Perk> getPerks() {
        return Arrays.asList(
                new Perk("§dLucky!", Arrays.asList("§7Gain §d+25 ♣ Pet Luck§7.")),
                new Perk("§dMythological Ritual", Arrays.asList("§7Mayor Diana will sell the Griffin", "§7pet, which lets you find", "§2Mythological Creatures §7and tons", "§7of §eunique items§7.")),
                new Perk("§dPet XP Buff", Arrays.asList("§7Gain §d+35% §7more pet XP.")),
                new Perk("§dSharing is Caring", Arrays.asList("§7Unlocks §a2 §7more §6Exp Share §7slots in", "§7your pets menu and increases the", "§6Exp Share §7rate by §a+10%§7!"))
        );
    }

    @Override
    public MortarNPC createNPC() {
        return new Diana();
    }

    @Override
    public void onActive() {
        System.out.println("Diana has been elected.");
    }
}
