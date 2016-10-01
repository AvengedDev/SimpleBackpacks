package me.avenged.simplebackpacks;

import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.java.JavaPlugin;

/**
 * Created by Avenged_ on 9/30/2016.
 */
public class Main extends JavaPlugin {

    public static String Format(String text) {
        return text.replaceAll("&", "§");
    }
    public static Plugin plugin;

    public void onEnable(){
        plugin = this;
        System.out.println("[SimpleBackpacks] Plugin enabled.");
    }

    public void onDisable(){
        plugin = null;
        System.out.println("[SimpleBackpacks] Plugin disabled.");
    }




}
