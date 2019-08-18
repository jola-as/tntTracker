package de.jab_1305.commands;

import java.util.List;

import org.bukkit.World;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Entity;
import org.bukkit.entity.Player;



public class aktivieren implements CommandExecutor{

	
	public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
		if(sender instanceof Player ) {
			Player p = (Player) sender;
			p.sendMessage("Test");
			World currentW = p.getWorld();
			List<Entity> LEntities =currentW.getEntities();
			System.out.println(LEntities);
			if(LEntities.contains("CraftTNTPrimed")) {
				p.sendMessage("TNT gefunden");
				
				
			}
		}
		
		return false;
	}
}
