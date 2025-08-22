package me.zero.skyblock.listeners;

import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.entity.Player;
import org.bukkit.event.Listener;
import org.bukkit.event.EventHandler;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.inventory.ItemStack;

import me.zero.skyblock.farming.CropManager;
import me.zero.skyblock.farming.crops.Crop;
import me.zero.skyblock.farming.data.CustomDropResult;
import me.zero.skyblock.farming.drop.DropTitleAnimation;
import me.zero.skyblock.util.ToolCheckUtil;

import java.util.List;

public class CropListener implements Listener {

    @EventHandler
    public void onBreak(BlockBreakEvent event) {
        Block block = event.getBlock();
        Material type = block.getType();
        Player player = event.getPlayer();

        Crop crop = CropManager.getCrop(type);
        if (crop == null) return;

        event.setCancelled(true);
        block.setType(Material.AIR);

        boolean doubleChance = ToolCheckUtil.isHolding(player, "Hoe of Greater Tilling");

        // Regular drops
        List<ItemStack> regularDrops = crop.getRegularDrops(player, doubleChance);
        for (ItemStack item : regularDrops) {
            player.getInventory().addItem(item);
        }

        // Custom drops
        for (CustomDropResult result : crop.getCustomDrops(player, doubleChance)) {
            player.getInventory().addItem(result.getDrop());
            DropTitleAnimation.play(player, result.getRarity(), result.getDrop().getType().name(), result.getAmount());
        }

        // XP: apply if needed
    }
}
