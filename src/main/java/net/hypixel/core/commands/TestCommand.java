package me.zero.skyblock.commands;

import me.zero.skyblock.inventory.GUI;
import me.zero.skyblock.inventory.inventories.MysteryVaultGUI;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import me.zero.skyblock.inventory.GUI;
import me.zero.skyblock.inventory.inventories.MysteryVaultGUI;

public class TestCommand implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

        sender.sendMessage(ChatColor.BLUE + "[DEBUG]" + ChatColor.WHITE + " Developer mode turned on");

        // Check if the sender is a Player
        if (sender instanceof Player) {
            Player player = (Player) sender;

            // Open the MysteryVaultGUI for the player
            new MysteryVaultGUI().open(player);
        } else {
            sender.sendMessage(ChatColor.RED + "Only players can use this command!");
        }

        return true;
    }
}
