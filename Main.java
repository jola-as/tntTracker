package de.jab_1305.main;

import org.bukkit.plugin.java.JavaPlugin;
import de.jab_1305.commands.aktivieren;

public class Main extends JavaPlugin{
	public void onEnable() {
		getCommand("aktivieren").setExecutor(new aktivieren());
	}
	
	

}