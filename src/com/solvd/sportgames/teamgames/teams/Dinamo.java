package com.solvd.sportgames.teamgames.teams;

import com.solvd.sportgames.teamgames.Football;

public class Dinamo extends Football {
    public Dinamo(){

    }
    @Override
    public void printType(){
        if (getSizeTeam()==5){
            System.out.println("This is mini football team");
        }
        else
            System.out.println("This is default football team");

    }
    public void fans (String fanssay){
        System.out.println("The fan's voice: " + fanssay);
    }
    public void fans (int sizefans){
        if (sizefans>15){
            System.out.println("Good support, loud screams!");
        } else
            System.out.println("I can't hear your support very well!");

    }

    @Override
    public String toString (){
       return ("Dinamo team" + ":" +"\n"
       + "The size of team is: " + getSizeTeam() + ";" + "\n"
       + "The host country: " + getCountry() + ".");

    }
}
