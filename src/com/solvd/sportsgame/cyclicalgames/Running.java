package com.solvd.sportsgame.cyclicalgames;

public class Running extends Cyclical{
    public Running(){
        setDistance(100);
        setType_area("Stadium");
        setType_discipline("Sprint");
    }
    public Running (int distance, String type_area, String type_discipline){
        super( distance, type_area, type_discipline);
    }
    public void printInfo(){
        System.out.println("Running");
        System.out.println("Running distance is: "+ getDistance() + " m");
        System.out.println("Type of area is: " + getType_area());
        System.out.println("Type of discipline is: " + getType_discipline());
    }
}
