package com.solvd.sportgames.games.cyclicalgames;

import com.solvd.sportgames.games.Games;

public abstract class Cyclical implements Games {
    private int distance;
    private int laps;
    private String stadium;
    private String gameType;


    public Cyclical(){
    }

    public String getGameType() {
        return gameType;
    }

    public void setGameType(String gameType) {
        this.gameType = gameType;
    }

    public int getDistance() {
        return distance;
    }

    public void setDistance(int distance) {
        this.distance = distance;
    }

    public int getLaps() {
        return laps;
    }

    public void setLaps(int laps) {
        this.laps = laps;
    }

    public String getStadium() {
        return stadium;
    }

    public void setStadium(String stadium) {
        this.stadium = stadium;
    }
    public Cyclical (int distance, int laps, String stadium, String gameType){
        this.distance = distance;
        this.laps = laps;
        this.stadium = stadium;
        this.gameType = gameType;
    }
    public abstract String getType();
}