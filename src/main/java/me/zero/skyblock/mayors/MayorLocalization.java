package me.zero.skyblock.mayors;

import java.util.ArrayList;

import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.entity.Player;

import me.zero.mortar.npc.NPCMeta;
import me.zero.mortar.utils.PacketUtils;
import me.zero.skyblock.main.SkyblockGame;
import me.zero.skyblock.main.SkyblockYear;
import me.zero.skyblock.npcs.mayors.*;
import me.zero.skyblock.util.HologramUtil;

public class MayorLocalization {
	public static void registerCandidates() {
		MayorManager.registerMayor(new Aatrox());
		MayorManager.registerMayor(new Diana());
		MayorManager.registerMayor(new Paul());
		MayorManager.registerMayor(new Cole());
		MayorManager.registerMayor(new Marina());
	}

	public static void setCandidatePositions() {
		Location l1 = new Location(Bukkit.getWorld("world"), -6.5, 33, -119.5);
		Location l2 = new Location(Bukkit.getWorld("world"), -3.5, 33, -128.5);
		Location l3 = new Location(Bukkit.getWorld("world"), 5.5, 33, -131.5);
		Location l4 = new Location(Bukkit.getWorld("world"), 14.5, 33, -128.5);
		Location l5 = new Location(Bukkit.getWorld("world"), 17.5, 33, -119.5);

		MayorManager.setCandidateLocations(l1, l2, l3, l4, l5);
	}

	public static void startElections() {
		registerCandidates();
		setCandidatePositions();
		
		MayorManager.spawnRandomisedCandidates();
		
		//for (Player player : Bukkit.getOnlinePlayers()) {
//				PacketUtils.uninject(player);
//				PacketUtils.inject(player);
//			}
		
		MayorElectionTiming met = new MayorElectionTiming(SkyblockGame.getPlugin(SkyblockGame.class));

		ArrayList<String> initialLines = new ArrayList<>();
		
		
		initialLines.add("§e§lCLICK TO VOTE");
		initialLines.add("§eTime left: " + met.formatDuration(met.getRemainingCloseTime()));
		initialLines.add("§bYear " + SkyblockYear.getCurrentYear());
		initialLines.add("§e§lMAYOR ELECTIONS");
		
		
		
		
		Location location = new Location(Bukkit.getWorld("world"), 5.5, 33.1, -119.5);
		
		
		HologramUtil.createMultiLineChangingHologram(location, SkyblockGame.getPlugin(SkyblockGame.class), initialLines, 20L, new HologramUtil.LineUpdater() {
			@Override
			public ArrayList<String> update() {
				ArrayList<String> updated = new ArrayList<>();
					updated.add("§e§lCLICK TO VOTE");
					updated.add("§eTime left: " + met.formatDuration(met.getRemainingCloseTime()));
					updated.add("§bYear " + SkyblockYear.getCurrentYear());
					updated.add("§e§lMAYOR ELECTIONS");
			
				return updated;
			}
		});

	}

	public static void stopElections() {
		MayorManager.despawnAllCandidates();
		
		ElectionVoteManager evm = new ElectionVoteManager();
		NPCMeta winnerMeta = MayorManager.getCandidateMeta(evm.calculateWinner());
		NPCMeta ministerMeta = MayorManager.getCandidateMeta(evm.calculateSecondPlace());
		
		MayorBroadcasts.onElectionEnd(winnerMeta.getDisplayName(), ministerMeta.getName(), evm.getTotalVotesCommafied());
		// MayorManager.spawnElectedMayor();
		
		//for (Player player : Bukkit.getOnlinePlayers()) {
//				PacketUtils.uninject(player);
//				PacketUtils.inject(player);
//			}
	}
}