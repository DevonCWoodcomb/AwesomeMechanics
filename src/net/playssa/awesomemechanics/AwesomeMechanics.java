package net.playssa.awesomemechanics;

import java.util.logging.Logger;

import lombok.Getter;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public class AwesomeMechanics extends JavaPlugin
{
	@Getter
	private static AwesomeMechanics plugin;
	@Getter
	private static Logger log;
	
	public void onEnable()
	{
		plugin = this;
		log = Bukkit.getLogger();
	}
}