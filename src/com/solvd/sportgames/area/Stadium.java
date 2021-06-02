package com.solvd.sportgames.area;

import com.solvd.sportgames.cyclicalgames.Cyclical;
import com.solvd.sportgames.teamgames.TeamGames;


public class Stadium {
    private TeamGames teamGames;
    private Cyclical cyclical;


    public TeamGames getTeamGames() {
        return teamGames;
    }

    public void setTeamGames(TeamGames teamGames) {
        this.teamGames = teamGames;
    }

    public Cyclical getCyclical() {
        return cyclical;
    }

    public void setCyclical(Cyclical cyclical) {
        this.cyclical = cyclical;
    }
}
