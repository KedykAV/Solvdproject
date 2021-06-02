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

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    @Override
    public String getGametype() {
        return gametype;
    }

    public void setGametype(String gametype) {
        this.gametype = gametype;
    }
    @Override
    public void printType(){
        System.out.println("The information of the gametype:");
    }
    public String toString(){
        return  ("Basketball info:"+"\n"
                + "The size of team is: " + getSizeTeam() + ";" + "\n"
                + "Number of times : " + getHalftimes() + " m" + ";" +"\n"
                + "The size of time : " + getSizeHalftime() + ";" + "\n"
                + "The host country: " + getCountry() + "." + "\n" );
    }


}

