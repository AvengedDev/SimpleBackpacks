package me.avenged.simplebackpacks;

import org.bukkit.plugin.java.JavaPlugin;

/**
 * Created by Avenged_ on 9/30/2016.
 */
public class Main extends JavaPlugin {

    public static String Format(String text) {
        return text.replaceAll("&", "§");
    }

    public void onEnable(){
        System.out.println("H");
    }

    public void onDisable(){

    }




}
