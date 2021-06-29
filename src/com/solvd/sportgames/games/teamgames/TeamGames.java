package com.solvd.sportgames.games.teamgames;

import com.solvd.sportgames.games.Games;

public abstract class TeamGames implements Games {
    private int sizeTeam;
    private int halftimes;
    private int sizeHalftime;
    private String gameType;

    public TeamGames(){
    }

    public int getSizeTeam() {
        return sizeTeam;
    }

    public void setSizeTeam(int sizeTeam) {
        this.sizeTeam = sizeTeam;
    }

    public int getHalftimes() {
        return halftimes;
    }

    public void setHalftimes(int halftimes) {
        this.halftimes = halftimes;
    }

    public int getSizeHalftime() {
        return sizeHalftime;
    }

    public String getGameType() {
        return gameType;
    }

    public void setGameType(String gameType) {
        this.gameType = gameType;
    }

    public void setSizeHalftime(int sizeHalftime) {
        this.sizeHalftime = sizeHalftime;
    }

    public TeamGames(int sizeTeam, int halftimes, int sizeHalftime, String gameType) {
        this.sizeTeam = sizeTeam;
        this.halftimes = halftimes;
        this.sizeHalftime = sizeHalftime;
        this.gameType = gameType;
    }}
