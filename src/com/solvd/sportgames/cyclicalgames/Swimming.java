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

    public void printInfo(){
        System.out.println("Swimming");
        System.out.println("The type of swimming is: " + getType());
        System.out.println("The distance length is: " + getDistance() + " m");
        System.out.println("Number of laps: " + getLaps());
        System.out.println("Type of stadium: " + getStadium());
    }
}
