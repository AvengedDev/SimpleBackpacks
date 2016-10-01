package me.avenged.simplebackpacks.Player;

import org.bukkit.entity.Player;

import java.util.ArrayList;

/**
 * Created by Avenged_ on 9/30/2016.
 */
public class PlayerManager {

    public static ArrayList<NewPlayer> allPlayers = new ArrayList<>();

    public static NewPlayer getPlayerObject(Player p) {
        for (NewPlayer np : allPlayers) {
            if (np.getPlayer().equals(p)) {
                return np;
            }
        }
        return new NewPlayer(p);
    }

}
