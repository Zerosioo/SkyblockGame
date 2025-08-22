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

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.event.inventory.InventoryCloseEvent;
import org.bukkit.Sound;

public class FirstVoteGUI extends GUI {
	
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
        return "Election";
    }

    @Override
    public int getSize() {
        return 27;
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

        inventory.setItem(9, makeTexturedSkullItem(fn.getTexture(), fnm.getDisplayName() , 1, loreGenerator(fm, fnm)));
        
        inventory.setItem(11, makeTexturedSkullItem(sn.getTexture(), snm.getDisplayName() , 1, loreGenerator(sm, snm)));
        
        inventory.setItem(13, makeTexturedSkullItem(tn.getTexture(), tnm.getDisplayName() , 1, loreGenerator(tm, tnm)));
        
        inventory.setItem(15, makeTexturedSkullItem(fon.getTexture(), fonm.getDisplayName() , 1, loreGenerator(fom, fonm)));
        
        inventory.setItem(17, makeTexturedSkullItem(fin.getTexture(), finm.getDisplayName() , 1, loreGenerator(fim, finm)));
        
      for (int slots = 0; slots < getSize(); slots++) {
            if (inventory.getItem(slots) == null) {
                inventory.setItem(slots, FILLER_GLASS);
            }
        }
    
    }
    
    private String loreGenerator(Mayor c, NPCMeta m) {
    	return "§8Candidate\n" + 
    	       "§8Year " + SkyblockYear.getCurrentYear() + "\n" + 
    	       "\n" + 
    	       c.getFormattedPerks() + "§8You may change your vote at\n" + 
    	       "§8anytime until the election\n" + 
    	       "§8ends\n\n" + 
    	       "§eClick to vote for " + m.getName() + "!";
    }
    
    private void castVote(NPCMeta snm, InventoryClickEvent event, int candidatenumber) {
    	if (event.getCurrentItem().getItemMeta().getDisplayName().contains(snm.getDisplayName())) {
    	      	Player p = (Player) event.getWhoClicked();
           	ElectionVoteManager.addVote(p.getUniqueId(), candidatenumber);
           	MayorBroadcasts.onVoteCastOrChange(p, false, snm.getDisplayName(), "Settler", 1, ElectionVoteManager.getVotePercentageString(candidatenumber), ElectionVoteManager.getTotalVotesCommafied());
           	SBSound s = new SBSound(Sound.SUCCESSFUL_HIT, 0, 1f, 1f);
           	s.play(p);
           	p.closeInventory();
           }
    }
    
    public static boolean isMoreThan(double a, double b) {
    return a > b;
    }

    
}