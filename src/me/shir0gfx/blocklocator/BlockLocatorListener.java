package me.shir0gfx.blocklocator;

import org.bukkit.Material;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;

public class BlockLocatorListener implements Listener {
	
	public BlockLocatorListener() {	}
	
	@SuppressWarnings("deprecation")
	@EventHandler
	public void onPlayerInteract(PlayerInteractEvent e) {
		if (e.getPlayer().getItemInHand().getTypeId() == Material.WOOD_AXE.getId() || e.getAction() == Action.RIGHT_CLICK_BLOCK || e.getPlayer().isOp() || e.getPlayer().hasPermission("blocklocator.use")) {
			
			int x = e.getClickedBlock().getX();
			int y = e.getClickedBlock().getY();
			int z = e.getClickedBlock().getZ();
			
			e.getPlayer().sendMessage("§6§lBlockLocator §e§l> §7Positions: §eX: " + x + "§7, §eY: " + y + "§7, §e Z: " + z);
		}
	}

}
