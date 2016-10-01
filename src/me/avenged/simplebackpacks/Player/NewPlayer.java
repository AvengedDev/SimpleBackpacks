package me.avenged.simplebackpacks.Player;

import me.avenged.simplebackpacks.Main;
import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;

/**
 * Created by Avenged_ on 9/30/2016.
 */
public class NewPlayer {

    private Player p;
    private Inventory inv;
    private int slots;

    public NewPlayer(Player player){
        this.p = player;
        createBackpack();
        PlayerManager.allPlayers.add(this);
    }

    private void createBackpack(){
        String perm = "simplebackpacks.size.";
        if(p.hasPermission(perm + "1")){
            slots = 9;
        }else if(p.hasPermission(perm + "2")){
            slots = 18;
        }else if(p.hasPermission(perm + "3")){
            slots = 27;
        }else if(p.hasPermission(perm + "4")){
            slots = 36;
        }else if(p.hasPermission(perm + "5")){
            slots = 45;
        }else if(p.hasPermission(perm + "6")){
            slots = 54;
        }else if(p.hasPermission(perm + "7")){
            slots = 63;
        }else if(p.hasPermission(perm + "8")){
            slots = 72;
        }else if(p.hasPermission(perm + "9")){
            slots = 81;
        }

        this.inv = Bukkit.createInventory(null, this.slots, Main.Format("&6" + getPlayer().getName() + "'s backpack"));
    }

    public Player getPlayer(){
        return this.p;
    }

    public Inventory getInv(){
        return this.inv;
    }

}
