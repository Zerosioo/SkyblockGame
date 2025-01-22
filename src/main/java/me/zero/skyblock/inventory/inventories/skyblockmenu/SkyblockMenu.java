package me.zero.skyblock.inventory.inventories.skyblockmenu;

import com.mojang.authlib.GameProfile;
import com.mojang.authlib.properties.Property;
import me.zero.skyblock.inventory.GUI;
import me.zero.skyblock.ranks.PlayerRank;
import me.zero.skyblock.user.User;
import me.zero.skyblock.util.SUtil;
import org.bukkit.ChatColor;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.craftbukkit.v1_8_R3.entity.CraftPlayer;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.event.inventory.InventoryCloseEvent;
import org.bukkit.inventory.meta.SkullMeta;

import java.util.UUID;

public class SkyblockMenu extends GUI {

    private String playerSkullTexture;

    @Override
    public String getTitle() {
        return "SkyBlock Menu";
    }

    @Override
    public int getSize() {
        return 54;
    }

    @Override
    public void onClick(InventoryClickEvent event) {
        User user = User.getUser(player.getUniqueId());
        
        if (event.getCurrentItem() != null &&
                event.getCurrentItem().hasItemMeta() &&
                event.getCurrentItem().getItemMeta().getDisplayName().contains("Close")) {
            player.closeInventory();
        }
        
        
        event.setCancelled(true);
    }

    @Override
    public void onClose(InventoryCloseEvent event) {
    }

    @Override
    public void setItems() {
        User user = User.getUser(player.getUniqueId());
        PlayerRank rank = user.rank;
        playerSkullTexture = getPlayerSkullTexture(player.getName());
       String baseLoadingBar = "─────────────────";
       String progressBar = SUtil.createLineProgressBar(baseLoadingBar.length(), ChatColor.AQUA, user.getSkyblockXP(), 100);
       
       if (rank.isAboveOrEqual(PlayerRank.ADMIN)) {
        
        inventory.setItem(0, makeItem(Material.COMMAND, "§cC§eh§9e§ba§1t§4s", 1, 1, "§7An §cADMIN §7exclusive menu."));
       }
       
        inventory.setItem(13, makeTexturedSkullItem(
                playerSkullTexture,
                "§aYour SkyBlock Profile",
                1,
                "§7View your equipment, stats,\n§7and more!\n\n§c ❤️ Health §f100\n§a ❈ Defense §f100\n§c ❁ Strength §f100\n§f ✦ Speed 100\n§9 ☣ Crit Chance §f30%\n§9 ☠ Crit Damage §f50%\n§b ✎ Intelligence §f100\n§6 ⸕ Mining Speed §f0\n§e ⚔ Bonus Attack Speed §f0%\n§3 α Sea Creature Chance §f\n§b ✯ Magic Find §f20\n §f❂ True Defense 0\n §c⫽ Ferocity §f0\n §c๑ Ability Damage §f0%\n §6☘ Mining Fortune §f0\n §6☘ Farming Fortune §f0\n §6☘ Foraging Fortune §f0\n §5✧ Pristine §f0\n\n§eClick to view!"
        ));
        
        inventory.setItem(19, makeItem(Material.DIAMOND_SWORD, "§aYour Skills", 1, 0, "§7View your Skill progression and\n§7rewards.\n\n§eClick to view!"));
        inventory.setItem(20, makeItem(Material.PAINTING, "§aCollections", 1, 0, "§7View all of the items available\n§7in SkyBlock. Collect more of an\n§7Item to unlock rewards on your\n§7way to becoming a master of\n§7SkyBlock!"));
        inventory.setItem(21, makeItem(Material.BOOK, "§aRecipe Book", 1, 0, "§7Through your adventure, you will\n§7unlock recipes for all kinds of\n§7special items! You can view how/n§7to craft these items here."));
        inventory.setItem(22, makeTexturedSkullItem("ewogICJ0aW1lc3RhbXAiIDogMTYxMDk5NzQ2MjIxMywKICAicHJvZmlsZUlkIiA6ICI5OTdjZjFlMmY1NGQ0YzEyOWY2ZjU5ZTVlNjU1YjZmNyIsCiAgInByb2ZpbGVOYW1lIiA6ICJpbzEyIiwKICAic2lnbmF0dXJlUmVxdWlyZWQiIDogdHJ1ZSwKICAidGV4dHVyZXMiIDogewogICAgIlNLSU4iIDogewogICAgICAidXJsIiA6ICJodHRwOi8vdGV4dHVyZXMubWluZWNyYWZ0Lm5ldC90ZXh0dXJlLzMyNTUzMjdkZDhlOTBhZmFkNjgxYTE5MjMxNjY1YmVhMmJkMDYwNjVhMDlkNzdhYzE0MDg4MzdmOWUwYjI0MiIKICAgIH0KICB9Cn0=", "§aSkyBlock Leveling", 1, "§7Your SkyBlock level: " + user.LevelPrefix() + "\n\n§7Determine how far you've\n§7progressed in SkyBlock and earn\n§7rewards from completing unique\n§7tasks.\n\n§7Progress to level " + (user.getSkyblockLevel() + 1) + ":\n" + progressBar + "§bXP"));
        
        inventory.setItem(23, makeItem(Material.BOOK_AND_QUILL, "§aQuest Log", 1, 0, "§7View your active quests,\n§7progress, and rewards\n\n§eClick to view!"));
        
        inventory.setItem(24, makeItem(Material.WATCH, "§aCalendar and Events", 1, 0, "§7View the SkyBlock Calendar,\n§7upcoming events, and event\n§7rewards!\n\n§7Active Event: §cN/A\n§7Ends in: §e0d 0h 0m 0s\n\n§7Next Event: §cN/A\n§7Starting in: §e0d 0h 0m 0s\n\n§eClick to view!"));
        inventory.setItem(25, makeItem(Material.CHEST, "§aStorage", 1, 0, "§7Store global itens that you\n§7want to access at anytime\n§7from anywhere to here.\n\n§eClick to view!"));

        inventory.setItem(49, makeItemOther(Material.BARRIER, "§cClose", 1, 0, ""));

        for (int slots = 0; slots < getSize(); slots++) {
            if (inventory.getItem(slots) == null) {
                inventory.setItem(slots, FILLER_GLASS);
            }
        }
    }

    private String getPlayerSkullTexture(String playerName) {
        CraftPlayer craftPlayer = (CraftPlayer) Bukkit.getPlayer(playerName);
        GameProfile profile = craftPlayer.getProfile();

        for (Property property : profile.getProperties().get("textures")) {
            return property.getValue(); 
        }

        return "ewogICJ0aW1lc3RhbXAiIDogMTYxMzAyNTcxNjYyMiwKICAicHJvZmlsZUlkIiA6ICI2MTZiODhkNDMwNzM0ZTM3OWM3NDc1ODdlZTJkNzlmZCIsCiAgInByb2ZpbGVOYW1lIiA6ICJfX25vdGFodW1hbl9fIiwKICAic2lnbmF0dXJlUmVxdWlyZWQiIDogdHJ1ZSwKICAidGV4dHVyZXMiIDogewogICAgIlNLSU4iIDogewogICAgICAidXJsIiA6ICJodHRwOi8vdGV4dHVyZXMubWluZWNyYWZ0Lm5ldC90ZXh0dXJlLzM2YTAzODNhNTI3ODAzZDk5YjY2MmFkMThiY2FjNzhjMTE5MjUwZWJiZmIxNDQ3NWI0ZWI0ZDRhNjYyNzk2YjQiCiAgICB9CiAgfQp9"; // Default 
    }
}
