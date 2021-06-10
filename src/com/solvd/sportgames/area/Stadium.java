package com.solvd.sportgames.area;

import com.solvd.sportgames.cyclicalgames.Cyclical;
import com.solvd.sportgames.teamgames.Football;
import com.solvd.sportgames.teamgames.TeamGames;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;


public class Stadium extends Square{
    private List<TeamGames> listOfteamGames;


    public Stadium() {
        listOfteamGames = new ArrayList<>();

    }

    public void setGame(TeamGames game) {
        listOfteamGames.add(game);
    }

    public List<TeamGames> getListOfteamgames() {
        return listOfteamGames;
    }




}
