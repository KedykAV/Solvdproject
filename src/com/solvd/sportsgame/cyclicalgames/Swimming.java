package com.solvd.sportsgame.cyclicalgames;

public class Swimming  extends Cyclical{
    public Swimming(){
        setDistance(50);
        setType_area("swimming pool");
        setType_discipline("Freestyle");
    }
    public Swimming (int distance, String type_area, String type_discipline){
        super( distance, type_area, type_discipline);
    }
    public void printInfo(){
        System.out.println("Swimming");
        System.out.println("Swimming distance is: "+ getDistance() + " m");
        System.out.println("Type of area is: " + getType_area());
        System.out.println("Type of discipline is: " + getType_discipline());
    }
}
