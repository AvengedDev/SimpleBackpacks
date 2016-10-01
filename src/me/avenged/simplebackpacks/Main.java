package me.avenged.simplebackpacks;

import me.avenged.simplebackpacks.commands.Backpack;
import org.bukkit.Bukkit;
import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

import java.io.File;
import java.io.IOException;

/**
 * Created by Avenged_ on 9/30/2016.
 */
public class Main extends JavaPlugin {

    public static String Format(String text) {
        return text.replaceAll("&", "§");
    }

    public static Plugin plugin;
    public static File inventoryFile;
    public static YamlConfiguration config;

    public void onEnable() {
        plugin = this;
        System.out.println("[SimpleBackpacks] Plugin enabled.");

        inventoryFile = new File(getDataFolder(), "InventoryData.yml");
        if (!inventoryFile.exists()) {
            try {
                inventoryFile.createNewFile();
                config = YamlConfiguration.loadConfiguration(inventoryFile);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }else{
            config = YamlConfiguration.loadConfiguration(inventoryFile);
        }

    }

    public void onDisable() {
        plugin = null;
        System.out.println("[SimpleBackpacks] Plugin disabled.");
    }

    private void registerListeners() {
        PluginManager pm = Bukkit.getServer().getPluginManager();
    }

    private void registerCommands() {
        getCommand("backpack").setExecutor(new Backpack());

    }

}
