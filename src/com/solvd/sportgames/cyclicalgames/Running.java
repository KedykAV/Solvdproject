package com.solvd.sportgames.cyclicalgames;


public class Running extends Cyclical implements TypeDistance{
    private String type;

    public Running(){
        setDistance(1500);
        setLaps(1);
        setStadium("Running stadium");
        setType("Without obstacles");
    }
    public Running (int distance, int laps, String stadium, String type){
        super(distance, laps, stadium);
        this.type = type;
    }

    @Override
    public String getType() {
        return type;
    }
    @Override
    public void dist () {
        if (getDistance() > 1000) {
            System.out.println("long distance");
        } else
            System.out.println("Short distance");



    }



    public void setType(String type) {
        this.type = type;
    }

      public String toString(){
        return  ("Running info:"+"\n"
                + "The type running: " + getType() + ";" + "\n"
                + "The distance length is: " + getDistance() + " m" + ";" +"\n"
                + "Number of laps: " + getLaps() + ";" + "\n"
                + "Type of stadium: " + getStadium() + "." + "\n" );
    }

    

}
