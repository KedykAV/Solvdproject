package com.solvd.sportsgames.games.cyclicalgames;

import com.solvd.sportsgames.area.Stadium;

import java.util.logging.Logger;

public class Running extends Cyclical implements TypeDistance {
    private final static Logger LOGGER = Logger.getLogger(String.valueOf(Running.class));
    private String type;


    public Running(){
        setDistance(1500);
        setLaps(1);
        setStadium("Running stadium");
        setType("Without obstacles");
        setGameType("Running");
    }
    public Running (int distance, int laps, String stadium, String type, String gameType){
        super(distance, laps, stadium,gameType);
        this.type = type;

    }


    @Override
    public String getType() {
        return type;
    }
    @Override
    public void dist () {
        if (getDistance() > 1000) {
            LOGGER.info("long distance");
        } else
            LOGGER.info("Short distance");

    }

    public void setType(String type) {
        this.type = type;
    }

    public String toString(){
        return  (getGameType() +" info:"+"\n"
                + "The type running: " + getType() + ";" + "\n"
                + "The distance length is: " + getDistance() + " m" + ";" +"\n"
                + "Number of laps: " + getLaps() + ";" + "\n"
                + "Type of stadium: " + getStadium() + "." + "\n" );
    }



}