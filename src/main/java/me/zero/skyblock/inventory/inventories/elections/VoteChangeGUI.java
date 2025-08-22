package me.zero.skyblock.inventory.inventories.elections;

import me.zero.mortar.npc.MortarNPC;
import me.zero.mortar.npc.NPCMeta;
import me.zero.skyblock.inventory.*;
import me.zero.skyblock.main.SkyblockYear;
import me.zero.skyblock.mayors.ElectionVoteManager;
import me.zero.skyblock.mayors.Mayor;
import me.zero.skyblock.mayors.MayorBroadcasts;
import me.zero.skyblock.mayors.MayorManager;
import me.zero.skyblock.sounds.SBSound;
import me.zero.skyblock.util.NumberFormatter;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.event.inventory.InventoryCloseEvent;
import org.bukkit.Sound;

public class VoteChangeGUI extends GUI {

	Mayor fm = MayorManager.getCandidateMayor(1);
	MortarNPC fn = MayorManager.getCandidateNPC(1);
	NPCMeta fnm = MayorManager.getCandidateMeta(1);

	Mayor sm = MayorManager.getCandidateMayor(2);
	MortarNPC sn = MayorManager.getCandidateNPC(2);
	NPCMeta snm = MayorManager.getCandidateMeta(2);

	Mayor tm = MayorManager.getCandidateMayor(3);
	MortarNPC tn = MayorManager.getCandidateNPC(3);
	NPCMeta tnm = MayorManager.getCandidateMeta(3);

	Mayor fom = MayorManager.getCandidateMayor(4);
	MortarNPC fon = MayorManager.getCandidateNPC(4);
	NPCMeta fonm = MayorManager.getCandidateMeta(4);

	Mayor fim = MayorManager.getCandidateMayor(5);
	MortarNPC fin = MayorManager.getCandidateNPC(5);
	NPCMeta finm = MayorManager.getCandidateMeta(5);

	@Override
	public String getTitle() {
		return "Election, Year " + SkyblockYear.getCurrentYear();
	}

	@Override
	public int getSize() {
		return 54;
	}

	@Override
	public void onClick(InventoryClickEvent event) {

		castVote(fnm, event, 1);
		castVote(snm, event, 2);
		castVote(tnm, event, 3);
		castVote(fonm, event, 4);
		castVote(finm, event, 5);


		event.setCancelled(true);

	}

	@Override
	public void onClose(InventoryCloseEvent event) {

	}

	@Override
	public void setItems() {

		inventory.setItem(45, makeTexturedSkullItem(fn.getTexture(), fnm.getDisplayName(), 1, loreGenerator(fm, fnm, fn, 1, player)));

		inventory.setItem(47, makeTexturedSkullItem(sn.getTexture(), snm.getDisplayName(), 1, loreGenerator(sm, snm, sn, 2, player)));

		inventory.setItem(49, makeTexturedSkullItem(tn.getTexture(), tnm.getDisplayName(), 1, loreGenerator(tm, tnm, tn, 3, player)));

		inventory.setItem(51, makeTexturedSkullItem(fon.getTexture(), fonm.getDisplayName(), 1, loreGenerator(fom, fonm, fon, 4, player)));

		inventory.setItem(53, makeTexturedSkullItem(fin.getTexture(), finm.getDisplayName(), 1, loreGenerator(fim, finm, fin, 5, player)));
		
		// 1st candidate panes
		constructPane(0, loreGenerator(fm, fnm, fn, 1, player), fnm, 50, ElectionVoteManager.getVotePercentage(1), 14);
		constructPane(9, loreGenerator(fm, fnm, fn, 1, player), fnm, 40, ElectionVoteManager.getVotePercentage(1), 14);
		constructPane(18, loreGenerator(fm, fnm, fn, 1, player), fnm, 30, ElectionVoteManager.getVotePercentage(1), 14);
		constructPane(27, loreGenerator(fm, fnm, fn, 1, player), fnm, 20, ElectionVoteManager.getVotePercentage(1), 14);
		constructPane(36, loreGenerator(fm, fnm, fn, 1, player), fnm, 10, ElectionVoteManager.getVotePercentage(1), 14);
		
		// 2nd candidate panes
		constructPane(2, loreGenerator(sm, snm, sn, 2, player), snm, 50, ElectionVoteManager.getVotePercentage(2), 13);
		constructPane(11, loreGenerator(sm, snm, sn, 2, player), snm, 40, ElectionVoteManager.getVotePercentage(2), 13);
		constructPane(20, loreGenerator(sm, snm, sn, 2, player), snm, 30, ElectionVoteManager.getVotePercentage(2), 13);
		constructPane(29, loreGenerator(sm, snm, sn, 2, player), snm, 20, ElectionVoteManager.getVotePercentage(2), 13);
		constructPane(38, loreGenerator(sm, snm, sn, 2, player), snm, 10, ElectionVoteManager.getVotePercentage(2), 13);
		
		// 3rd candidate panes
		constructPane(4, loreGenerator(tm, tnm, tn, 3, player), tnm, 50, ElectionVoteManager.getVotePercentage(3), 11);
		constructPane(13, loreGenerator(tm, tnm, tn, 3, player), tnm, 40, ElectionVoteManager.getVotePercentage(3), 11);
		constructPane(22, loreGenerator(tm, tnm, tn, 3, player), tnm, 30, ElectionVoteManager.getVotePercentage(3), 11);
		constructPane(31, loreGenerator(tm, tnm, tn, 3, player), tnm, 20, ElectionVoteManager.getVotePercentage(3), 11);
		constructPane(40, loreGenerator(tm, tnm, tn, 3, player), tnm, 10, ElectionVoteManager.getVotePercentage(3), 11);
		
		// fourth candidate 
		constructPane(6, loreGenerator(fom, fonm, fon, 4, player), fonm, 50, ElectionVoteManager.getVotePercentage(4), 4);
		constructPane(15, loreGenerator(fom, fonm, fon, 4, player), fonm, 40, ElectionVoteManager.getVotePercentage(4), 4);
		constructPane(24, loreGenerator(fom, fonm, fon, 4, player), fonm, 30, ElectionVoteManager.getVotePercentage(4), 4);
		constructPane(33, loreGenerator(fom, fonm, fon, 4, player), fonm, 20, ElectionVoteManager.getVotePercentage(4), 4);
		constructPane(42, loreGenerator(fom, fonm, fon, 4, player), fonm, 10, ElectionVoteManager.getVotePercentage(4), 4);
		
		// fifth candidate
		constructPane(8, loreGenerator(fim, finm, fin, 5, player), finm, 50, ElectionVoteManager.getVotePercentage(5), 10);
		constructPane(17, loreGenerator(fim, finm, fin, 5, player), finm, 40, ElectionVoteManager.getVotePercentage(5), 10);
		constructPane(26, loreGenerator(fim, finm, fin, 5, player), finm, 30, ElectionVoteManager.getVotePercentage(5), 10);
		constructPane(35, loreGenerator(fim, finm, fin, 5, player), finm, 20, ElectionVoteManager.getVotePercentage(5), 10);
		constructPane(44, loreGenerator(fim, finm, fin, 5, player), finm, 10, ElectionVoteManager.getVotePercentage(5), 10);
		
		
		for (int slots = 0; slots < getSize(); slots++) {
			if (inventory.getItem(slots) == null) {
				inventory.setItem(slots, FILLER_GLASS);
			}
		}

	}

	private String loreGenerator(Mayor c, NPCMeta m, MortarNPC mp, int noc, Player player) {
		StringBuilder sb = new StringBuilder();

		sb.append("§8Candidate\n");
		sb.append("§8Year ").append(SkyblockYear.getCurrentYear()).append("\n");
		sb.append("\n§7Votes: §d").append(NumberFormatter.format(ElectionVoteManager.getVotes(noc)))
		.append(" §7(§d").append(ElectionVoteManager.getVotePercentage(noc)).append("%§7)");
		sb.append("\n");
		sb.append("\n").append(c.getFormattedPerks());

		if (ElectionVoteManager.getPlayerVote(player) != noc) {
			sb.append("§eClick to vote for ").append(m.getName()).append("!");
		} else {
			sb.append("§aYou have already voted for this candidate!");
		}

		return sb.toString();
	}


	private void castVote(NPCMeta snm, InventoryClickEvent event, int candidatenumber) {
		if (event.getCurrentItem().getItemMeta().getDisplayName().contains(snm.getDisplayName())) {
			Player p = (Player) event.getWhoClicked();

			if (ElectionVoteManager.getPlayerVote(p) != candidatenumber) {
				
				ElectionVoteManager.addVote(p.getUniqueId(), candidatenumber);
				
				MayorBroadcasts.onVoteCastOrChange(p, false, snm.getDisplayName(), "Settler", 1, ElectionVoteManager.getVotePercentageString(candidatenumber), ElectionVoteManager.getTotalVotesCommafied());
				
				SBSound s = new SBSound(Sound.SUCCESSFUL_HIT, 0, 1f, 1f);
				s.play(p);
				p.closeInventory();

			} else {
				p.sendMessage("§cYou already voted for this candidate!");
				p.playSound(p.getLocation(), Sound.VILLAGER_NO, 1.0f, 1.0f);
			}
		}
	}

	public static boolean isMoreThan(double a, double b) {
		return a > b || a == b;
	}

	private void constructPane(int slot, String lore, NPCMeta meta, double reqper, double per, int durability) {
		if (isMoreThan(per, reqper)) {
			inventory.setItem(slot, makeItemOther(Material.STAINED_GLASS_PANE, meta.getDisplayName(), 1, durability, lore));
		} else {
			inventory.setItem(slot, makeItemOther(Material.STAINED_GLASS_PANE, meta.getDisplayName(), 1, 7, lore));
		}
	}
}