package com.solvd.sportsgame.teamgames;

public class Basketball extends TeamGames {
    public Basketball(){
        setSize_team(5);
        setHalftimes(4);
        setSize_halftime(12);
        setFederation("NBA");
    }
    public Basketball(int size_team, int halftimes, int size_halftime, String federation){
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
