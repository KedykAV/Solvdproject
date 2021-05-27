package com.solvd.sportgames.teamgames;

public class Football extends TeamGames implements Type {
    private String country;
    private String gametype;

    public Football() {
        setSizeTeam(11);
        setHalftimes(2);
        setSizeHalftime(45);
        setCountry("Belarus");
        setGametype("Football");
    }

    public Football(int sizeTeam, int halftimes, int sizeHalftime, String country, String gametype) {
        super(sizeTeam, halftimes, sizeHalftime);
        this.country = country;
        this.gametype = gametype;
    }

    public String getGametype() {
        return gametype;
    }

    public void setGametype(String gameName) {
        this.gametype = gameName;
    }

    @Override
    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
    @Override
    public void printType(){
        System.out.println("The type football game:");
    }
    public void printDiscr(){
        System.out.println("The size of team is: " + getSizeTeam());
        System.out.println("Number of times: " + getHalftimes());
        System.out.println("The size of time: " + getSizeHalftime() + " min");
        System.out.println("The host country: " + getCountry());
    }


}

