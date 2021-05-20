package com.solvd.sportsgame.teamgames;

public abstract class TeamGames {
    private int size_team;
    private int halftimes;
    private int size_halftime;
    private String federation;

    public TeamGames(){

    }
    public TeamGames(int size_team, int halftimes, int size_halftime,String federation){
        this.size_team = size_team;
        this.halftimes = halftimes;
        this.size_halftime = size_halftime;
        this.federation = federation;
    }

    public int getSize_team() {
        return size_team;
    }

    public void setSize_team(int size_team) {
        this.size_team = size_team;
    }

    public int getHalftimes() {
        return halftimes;
    }

    public void setHalftimes(int halftimes) {
        this.halftimes = halftimes;
    }

    public int getSize_halftime() {
        return size_halftime;
    }

    public void setSize_halftime(int size_halftime) {
        this.size_halftime = size_halftime;
    }

    public String getFederation() {
        return federation;
    }

    public void setFederation(String federation) {
        this.federation = federation;
    }

    public abstract void printInfo();
}
