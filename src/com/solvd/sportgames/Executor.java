package com.solvd.sportgames;

import com.solvd.sportgames.area.Stadium;
import com.solvd.sportgames.cyclicalgames.Cyclical;
import com.solvd.sportgames.cyclicalgames.Running;
import com.solvd.sportgames.teamgames.Football;
import com.solvd.sportgames.teamgames.TeamGames;

public class
Executor {
    public static void main(String[] args) {



        Football football = new Football();
        football.setGametype("Mini football");
        Football football1 = new Football();
        football1.setGametype("Prof football");

    

        Stadium stadium = new Stadium();
        stadium.setGame(football);
        stadium.setGame(football1);

        for (TeamGames game : stadium.getListOfteamgames()) {
            System.out.println(game.getGametype());
        }
    }
}
