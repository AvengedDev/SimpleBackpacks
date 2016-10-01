package me.avenged.simplebackpacks.commands;

import me.avenged.simplebackpacks.Player.NewPlayer;
import me.avenged.simplebackpacks.Player.PlayerManager;
import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;

/**
 * Created by Avenged_ on 9/30/2016.
 */
public class Backpack implements CommandExecutor {

    public static String Format(String text) {
        return text.replaceAll("&", "§");
    }

    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        if (sender instanceof Player) {


            if (cmd.getName().equalsIgnoreCase("backpack")) {

                Player p = (Player) sender;

                }
            }

        return false;
    }
}
