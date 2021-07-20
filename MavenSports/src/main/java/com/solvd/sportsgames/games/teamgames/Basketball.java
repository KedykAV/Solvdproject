package com.solvd.sportsgames.games.teamgames;

public class Basketball extends TeamGames  {
    private String country;
    private String gametype;


    public Basketball() {
        setSizeTeam(5);
        setHalftimes(4);
        setSizeHalftime(10);
        setCountry("Belarus");
        setGameType("Basketball");
    }

    public Basketball(int sizeTeam, int halftimes, int sizeHalftime, String country, String gameType) {
        super(sizeTeam, halftimes, sizeHalftime, gameType);
        this.country = country;

    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }





    public String toString(){
        return  (getGameType()+ " info:"+"\n"
                + "The size of team is: " + getSizeTeam() + ";" + "\n"
                + "Number of times : " + getHalftimes()  + ";" +"\n"
                + "The size of time : " + getSizeHalftime() +  " min"+";" + "\n"
                + "The host country: " + getCountry() + "." + "\n" );
    }
}