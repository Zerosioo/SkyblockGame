package me.zero.skyblock.user;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.scoreboard.*;

import me.zero.skyblock.main.SkyblockGame;

public class SidebarManager {

	private final SkyblockGame plugin;
	private int colorIndex = 0;
	private final ChatColor[] colors = {
		ChatColor.YELLOW, ChatColor.RED, ChatColor.GREEN, ChatColor.AQUA
	};

	public SidebarManager(SkyblockGame plugin) {
		this.plugin = plugin;
	}

	public void updateScoreboard(Player player) {
		// Create or update the scoreboard
		ScoreboardManager manager = Bukkit.getScoreboardManager();
		Scoreboard scoreboard = manager.getNewScoreboard();
		User user = User.getUser(player.getUniqueId());

		Objective objective = scoreboard.registerNewObjective("sidebar", "dummy");
		objective.setDisplaySlot(DisplaySlot.SIDEBAR);
		objective.setDisplayName(colors[colorIndex] + "SKYBLOCK CO-OP");

		// Cycle through colors
		colorIndex = (colorIndex + 1) % colors.length;

		// Set scoreboard lines
		String[] lines = {
			ChatColor.GRAY + "11/12/22 §8M3D",
			ChatColor.GRAY + "Late Winter 23rd",
			ChatColor.GRAY + "8:30pm " + ChatColor.BLUE + "\u263D",
			ChatColor.DARK_GRAY + "\u25CF " + "§bVillage",
			"    ",
			"     ",
			"§fPurse: §6" + user.getCoins(),
		    "§fBits: §b" + user.getBits(),
			"    ",
			"§ewww.hypixel.net"
		};

		for (int i = 0; i < lines.length; i++) {
			Score score = objective.getScore(lines[i]);
			score.setScore(lines.length - i); // Decrease from top to bottom
		}

		// Apply the scoreboard to the player
		player.setScoreboard(scoreboard);
	}
}
