package de.jab_1305.commands;

import java.util.List;

import org.bukkit.World;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Entity;
import org.bukkit.entity.Player;



public class aktivieren implements CommandExecutor{

	@Override
	public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
		if(sender instanceof Player ) {
			Player p = (Player) sender;
			p.sendMessage("Test");
			World w = p.getWorld();
			List<Entity> l =w.getEntities();
			System.out.println(l);
		}
		
		return false;
	}
}
