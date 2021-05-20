package com.solvd.sportsgame.martial_arts;

public abstract class Martial_Arts {
    private int rounds;
    private int size_round;
    private String inventory;
    private String area;

    public Martial_Arts(){

    }
    public Martial_Arts(int rounds, int size_round, String inventory, String area){
        this.rounds = rounds;
        this.size_round = size_round;
        this.inventory = inventory;
        this.area = area;
    }
    public int getRounds(){
        return this.rounds;
    }
    public void setRounds(int rounds){
        this.rounds = rounds;
    }
    public int getSize_round(){
        return this.size_round;
    }
    public void setSize_round(int size_round){
        this.size_round = size_round;
    }
    public String getInventory(){
        return this.inventory;
    }
    public void setInventory(String inventory){
        this.inventory = inventory;
    }
    public String getArea(){
        return this.area;
    }
    public void setArea(String area){
        this.area = area;
    }

    public void Info (){
        System.out.println("Size team is: "+ getRounds());
        System.out.println("Number of halftimes: "+ getSize_round());
        System.out.println("Type of inventory: "+ getInventory());
        System.out.println("Type of area: "+ getArea());
    }
    public abstract String getJudgeName();
}
