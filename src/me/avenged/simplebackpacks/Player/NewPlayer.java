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
        for(int i = 1; i <= 9; i++){
            if(p.hasPermission(perm + i)){
                slots = i * 9;
            }
        }
        this.inv = Bukkit.createInventory(null, this.slots, Main.Format("&6" + getPlayer().getName() + "'s backpack"));
    }

    public void openInventory(){
        p.openInventory(getInv());
    }

    public Player getPlayer(){
        return this.p;
    }

    public Inventory getInv(){
        return this.inv;
    }

}
