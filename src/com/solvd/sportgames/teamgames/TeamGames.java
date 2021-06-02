package com.solvd.sportgames.teamgames;

public abstract class TeamGames {
    private int sizeTeam;
    private int halftimes;
    private int sizeHalftime;

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

    public void setSizeHalftime(int sizeHalftime) {
        this.sizeHalftime = sizeHalftime;
    }

    public TeamGames(int sizeTeam, int halftimes, int sizeHalftime) {
        this.sizeTeam = sizeTeam;
        this.halftimes = halftimes;
        this.sizeHalftime = sizeHalftime;
    }
    public abstract String getGametype();
}
