package com.solvd.sportsgame.teamgames;

public class Football extends TeamGames {
    public Football(){
      setSize_team(11);
      setHalftimes(2);
      setSize_halftime(45);
      setFederation("UEFA");
    }
    public Football(int size_team, int halftimes, int size_halftime, String federation){
        super(size_team, halftimes, size_halftime, federation);
    }
    public void printInfo(){
        System.out.println("Football");
        System.out.println("Size team is: "+ getSize_team());
        System.out.println("Number of halftimes: "+ getHalftimes());
        System.out.println("Halftime duration: "+ getSize_halftime());
        System.out.println("Name of world federation: "+ getFederation());
    }

}
