package com.solvd.sportgames.cyclicalgames;

public class Swimming extends Cyclical{
    private String type;
    public Swimming(){
        setDistance(50);
        setLaps(1);
        setStadium("Swimming pool");
        setType("Butterfly");
    }
    public Swimming (int distance, int laps, String stadium, String type){
        super(distance, laps, stadium);
    }

    @Override
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String toString(){
        return  ("Running info:"+"\n"
                + "The type running: " + getType() + ";" + "\n"
                + "The distance length is: " + getDistance() + " m" + ";" +"\n"
                + "Number of laps: " + getLaps() + ";" + "\n"
                + "Type of stadium: " + getStadium() + ";" + "\n" );
    }
}
