package com.solvd.sportgames.cyclicalgames;


public class Running extends Cyclical implements TypeDistance{
    private String type;

    public Running(){
        setDistance(1500);
        setLaps(1);
        setStadium("Running stadium");
        setType("Sprint");
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
    public int Dist () {
        if (getDistance() > 1000) {
            System.out.println("long distance");
        } else
            System.out.println("Short distance");
        return getDistance();

    }

    public void setType(String type) {
        this.type = type;
    }

    public void printInfo(){
        System.out.println("Running");
        System.out.println("The type running is: " + getType());
        System.out.println("The distance length is: " + Dist() + " m");
        System.out.println("Number of laps: " + getLaps());
        System.out.println("Type of stadium: " + getStadium());

    }

}
