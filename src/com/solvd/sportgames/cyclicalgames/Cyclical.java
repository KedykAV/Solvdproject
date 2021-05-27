package com.solvd.sportgames.cyclicalgames;

public abstract class Cyclical {
    private int distance;
    private int laps;
    private String stadium;

    public Cyclical(){

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
    public Cyclical (int distance, int laps, String stadium){
        this.distance = distance;
        this.laps = laps;
        this.stadium = stadium;
    }
    public abstract String getType();
}
