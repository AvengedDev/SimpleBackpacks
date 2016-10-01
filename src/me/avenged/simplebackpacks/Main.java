package me.avenged.simplebackpacks;

import me.avenged.simplebackpacks.commands.Backpack;
import me.avenged.simplebackpacks.listeners.PlayerJoin;
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
        registerCommands();
        registerListeners();
        plugin = this;
        System.out.println("[SimpleBackpacks] Plugin enabled.");

        // Saves default config, and creates directory.
        saveDefaultConfig();

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

    public static void saveInv(){
        try{
            config.save(inventoryFile);
        }catch(IOException e){

        }
    }

    private void registerListeners() {
        PluginManager pm = Bukkit.getServer().getPluginManager();
        pm.registerEvents(new PlayerJoin(), this);
    }

    private void registerCommands() {
        getCommand("backpack").setExecutor(new Backpack());


    }

}
