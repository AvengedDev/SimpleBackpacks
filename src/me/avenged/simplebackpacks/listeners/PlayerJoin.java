package me.avenged.simplebackpacks.listeners;

import me.avenged.simplebackpacks.Main;
import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

/**
 * Created by Avenged_ on 9/30/2016.
 */
public class PlayerJoin implements Listener {

    @EventHandler
    public void onJoin(PlayerJoinEvent e) {
        Player p = e.getPlayer();

        YamlConfiguration config = Main.config;

        // Player data does not exist, make new player data.
        if(!(config.contains(p.getUniqueId().toString()))){
            config.set(p.getUniqueId().toString() + ".Name", p.getName());
        }

    }

}