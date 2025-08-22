package me.zero.skyblock.farming.drop;

import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.scheduler.BukkitRunnable;

import me.zero.skyblock.main.SkyblockGame;

public class DropTitleAnimation {

    public static void play(Player player, DropRarity rarity, String itemName, int amount) {
        final String baseTitle = "§l" + rarity.getColor() + rarity.getTitle(); // Bold colored
        final String whiteTitle = "§l§f" + rarity.getTitle(); // Bold white
        final String subTitle = "§a" + amount + "x " + itemName;

        // Chat message
        ItemStack heldItem = player.getItemInHand();
        String heldItemName = (heldItem != null && heldItem.hasItemMeta() && heldItem.getItemMeta().hasDisplayName())
                ? heldItem.getItemMeta().getDisplayName()
                : heldItem != null ? heldItem.getType().name() : "Unknown";
        String message = baseTitle + "§r! §e" + heldItemName + " §a" + amount + "x " + itemName + "§e!";
        player.sendMessage(message);

        new BukkitRunnable() {
            int tick = 0;

            @Override
            public void run() {
                if (tick >= 100) { // Total 5 seconds
                    cancel();
                    return;
                }

                String title = tick < 40 ? baseTitle : ((tick / 20) % 2 == 0) ? whiteTitle : baseTitle;

                TitleUtil.sendTitle(player, title, subTitle, 0, 25, 5);
                tick += 20;
            }
        }.runTaskTimer(SkyblockGame.getInstance(), 0, 20);
    }
}
