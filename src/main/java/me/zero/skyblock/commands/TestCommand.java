package me.zero.skyblock.commands;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;

import me.zero.skyblock.commands.abstraction.*;
import me.zero.skyblock.inventory.inventories.elections.FirstVoteGUI;
import me.zero.skyblock.inventory.inventories.elections.VoteChangeGUI;
import me.zero.skyblock.main.SkyblockGame;
import me.zero.skyblock.mayors.MayorBroadcasts;
import me.zero.skyblock.mayors.MayorElectionTiming;
import me.zero.skyblock.mayors.MayorLocalization;
import me.zero.skyblock.ranks.PlayerRank;

@CommandParameters(
	description = "Test",
	usages = "§cUsage: /test start|stop|fnp|fv|av",
	rank = PlayerRank.ADMIN)
public class TestCommand extends SkyBlockCommand {

	@Override
	public void execute(Player player, String[] args)     {
		if (args.length == 1) {
			String mode = args[0].toLowerCase();

			switch (mode) {
			case "start":
				MayorLocalization.startElections();
				break;
			case "stop":
				MayorLocalization.stopElections();
				break;
			case "fnp":
				MayorElectionTiming emt = new MayorElectionTiming(SkyblockGame.getPlugin(SkyblockGame.class));
				emt.forceNextPhase();
				break;
			case "fv":
				new FirstVoteGUI().open(player);
				break;
			case "av":
				new VoteChangeGUI().open(player);
				break;
			}
		} else {
			player.sendMessage("§cUsage: /test start|stop|fnp|fv|av");
		}
	}
}

