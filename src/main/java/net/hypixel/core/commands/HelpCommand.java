package me.zero.skyblock.commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import me.zero.skyblock.main.SkyblockGame;

public class HelpCommand implements CommandExecutor {


    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        sender.sendMessage("");
        sender.sendMessage("§e§l" + ((SkyblockGame)SkyblockGame.getPlugin(SkyblockGame.class)).getConfig().getString("servername").toUpperCase() + " NETWORK");
        sender.sendMessage("§eClick to select a help option");
        sender.sendMessage("");
        sender.sendMessage("§c* §b" + ((SkyblockGame)SkyblockGame.getPlugin(SkyblockGame.class)).getConfig().getString("servername") + " Minigames");
        sender.sendMessage("§c* §bFound a Server Bug/Issue");
        sender.sendMessage("§c* §bReport a Rule Breaker");
        sender.sendMessage("§c* §bStore");
        sender.sendMessage("§c* §bSupport");
        sender.sendMessage("§c* §bAllowed Modifications");
        sender.sendMessage("§c* §b" + ((SkyblockGame)SkyblockGame.getPlugin(SkyblockGame.class)).getConfig().getString("servername") + " Rules & Policies");
        sender.sendMessage("§c* §bGeneral Gameplay/Server");
        sender.sendMessage("");
        sender.sendMessage("§eNeed more help? Visit §bour forums§f.");
        sender.sendMessage("");
        return true;
    }
}