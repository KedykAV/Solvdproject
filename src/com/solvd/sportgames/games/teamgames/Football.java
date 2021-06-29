package com.solvd.sportgames.games.teamgames;

public class Football extends TeamGames  {
    private String country;



    public Football() {
        setSizeTeam(11);
        setHalftimes(2);
        setSizeHalftime(45);
        setCountry("Belarus");
        setGameType("Football");
    }

    public Football(int sizeTeam, int halftimes, int sizeHalftime, String country,String gameType) {
        super(sizeTeam, halftimes, sizeHalftime,gameType );
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