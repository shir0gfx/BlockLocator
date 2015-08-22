package me.shir0gfx.blocklocator;

import me.shir0gfx.blocklocator.BlockLocatorListener; 

import org.bukkit.event.Listener;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;


/**
 * @author shir0gfx
 */

public class BlockLocator extends JavaPlugin implements Listener {
	
	public BlockLocator plugin;
	
	public void onEnable() {
		plugin = this;
		
		System.out.println("[BlockLocator] Enabled!");
		
		PluginManager pm = getServer().getPluginManager();
		
		pm.registerEvents(new BlockLocatorListener(), this);
	}
	
	public void onDisable() {
		plugin = null;
		
		System.out.println("[BlockLocator] Disabled!");
	}
}