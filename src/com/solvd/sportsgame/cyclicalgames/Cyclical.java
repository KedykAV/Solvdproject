package com.solvd.sportsgame.cyclicalgames;

public abstract class Cyclical {
    private int distance;
    private String type_area;
    private String type_discipline;

    public Cyclical(){

    }
    public Cyclical(int distance, String type_area, String type_discipline){
        this.distance = distance;
        this.type_area = type_area;
        this.type_discipline = type_discipline;
    }
    public int getDistance(){
        return this.distance;
    }
    public void setDistance(int distance){
        this.distance = distance;
    }
    public String getType_area(){
        return this.type_area;
    }
    public void setType_area(String type_area){
        this.type_area = type_area;
    }
    public String getType_discipline(){
        return this.type_discipline;
    }
    public void setType_discipline(String type_discipline){
        this.type_discipline = type_discipline;
    }
    public abstract void printInfo();
}
