package me.zero.skyblock.mayors;

import java.util.ArrayList;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;

import me.zero.skyblock.main.SkyblockGame;
import me.zero.skyblock.main.SkyblockYear;
import me.zero.skyblock.util.ChatUtil;

public class MayorBroadcasts {
	public static void onVoteCastOrChange(Player player, Boolean artifactOfControl, String mayorname, String famerank, int vote, String votePercentage, String totalVotes) {
		ArrayList<String> hoverText = new ArrayList<>();
        hoverText.add("§eIncrease your §bFame Rank §eby");
        hoverText.add("§espending §bBits §e& §aGems §ein the Community Shop!");
		
		player.sendMessage("§d-----------------------------------------------------");
		player.sendMessage("§eYou voted for/changed your vote to " + mayorname + " §ein the §bYear " + SkyblockYear.getCurrentYear() + " Elections§e!");
		
		if (!artifactOfControl) {
		ChatUtil.sendClickableMessage(player, "§eAs a §b" + famerank + "§e, your vote counts for §a" + vote + "§e.", hoverText, null);
		} else {
			ChatUtil.sendClickableMessage(player, "§eAs a §b" + famerank + "§e, your vote counts for §a" + vote * 2 + "§e. §8(doubled by Artifact of Control)§f.", hoverText, null);
		}
		
		player.sendMessage("§d" + mayorname + " §enow has §d" + votePercentage + "% §eof votes with §d" + totalVotes + " votes§e!");
		player.sendMessage("§d-----------------------------------------------------");
	}
	
	public static void onElectionEnd(String mayor, String minister, String totalVotes) {
		
		Bukkit.broadcastMessage("");
		Bukkit.broadcastMessage("§d§k§lk §e§lEvent: §bMayor Elections " + SkyblockYear.getCurrentYear() + "! §d§k§lk");
		Bukkit.broadcastMessage("§eThe election room is now closed. Clerk Seraphine is doing a final count of the votes...");
		Bukkit.broadcastMessage("");
		
		Bukkit.getScheduler().runTaskLater(SkyblockGame.getPlugin(SkyblockGame.class), () -> {
		  Bukkit.broadcastMessage("");
    Bukkit.broadcastMessage("§d§k§lk §e§lEvent: §bMayor Elections " + SkyblockYear.getCurrentYear() + "! §d§k§lk");
    Bukkit.broadcastMessage("§e" + mayor + " §eis elected Mayor for the year, §6gg§e!");
    Bukkit.broadcastMessage("§a" + minister + " §ecame in 2nd and is the Minister, §6lesser gg§e!");
    Bukkit.broadcastMessage("§eSeraphine counted votes from §b" + totalVotes + " §edifferent players.");
    Bukkit.broadcastMessage("§eEverybody unlocks §6exclusive §eperks!");
    Bukkit.broadcastMessage("");
    
}, 100L);


	}
}