package com.solvd.sportsgames.games.cyclicalgames;

public class Swimming extends Cyclical{
    private String type;
    public Swimming(){
        setDistance(50);
        setLaps(1);
        setStadium("Swimming pool");
        setType("Butterfly");
        setGameType("Swimming");
    }
    public Swimming (int distance, int laps, String stadium, String type, String gameType){
        super(distance, laps, stadium,gameType);
    }

    @Override
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String toString(){
        return  (getGameType() +" info:"+"\n"
                + "The type swimming: " + getType() + ";" + "\n"
                + "The distance length is: " + getDistance() + " m" + ";" +"\n"
                + "Number of laps: " + getLaps() + ";" + "\n"
                + "Type of stadium: " + getStadium() + ";" + "\n" );
    }
}
