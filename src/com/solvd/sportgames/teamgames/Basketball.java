package com.solvd.sportgames.teamgames;

public class Basketball extends TeamGames implements Type {
    private String country;
    private String gametype;


    public Basketball() {
        setSizeTeam(5);
        setHalftimes(4);
        setSizeHalftime(10);
        setCountry("Belarus");
        setGametype("Basketball");
    }

    public Basketball(int sizeTeam, int halftimes, int sizeHalftime, String country, String gametype) {
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
    public void printType() {
        System.out.println("The information of the gametype: ");
    }



    public String toString(){
        return  ("Basketball info:"+"\n"
                + "The size of team is: " + getSizeTeam() + ";" + "\n"
                + "Number of times : " + getHalftimes() + " m" + ";" +"\n"
                + "The size of time : " + getSizeHalftime() + ";" + "\n"
                + "The host country: " + getCountry() + "." + "\n" );
    }
}
