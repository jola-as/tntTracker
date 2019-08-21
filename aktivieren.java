package de.jab_1305.commands;

import java.util.ArrayList;
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
			List<Entity> LTnt = new ArrayList<Entity>();
			for (int i=0; i<LEntities.size(); i++) {
				if(LEntities.get(i).getName() == "CraftTNTPrimed") {
					//LTnt.add(LEntities.get(i));
					System.out.println(LEntities.get(i));
				}
			}
			if (LTnt.size()!= 0) {
				System.out.println(LTnt);
			}
			else {
				System.out.println("LTnt ist null!");
			}
		}
		return true;
	}
}
