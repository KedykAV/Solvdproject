package com.solvd.sportgames;


import com.solvd.sportgames.cyclicalgames.Running;
import com.solvd.sportgames.supportpersons.Referee;
import com.solvd.sportgames.teamgames.Basketball;
import com.solvd.sportgames.teamgames.Football;

public class Executor {
    public static void main(String[] args){
        Football miniFoot = new Football();
        miniFoot.setCountry("Brasil");
        miniFoot.setHalftimes(3);
        miniFoot.setSizeHalftime(20);
        miniFoot.setGametype("Mini Football");
        miniFoot.printType();
        System.out.println(miniFoot.getGametype());
        miniFoot.printDiscr();
        System.out.println("------------------------------");

        Basketball basketball = new Basketball();
        basketball.printType();
        System.out.println(basketball.getGametype());
        basketball.printDiscr();
        System.out.println("------------------------------");

        Running sprint = new Running();
        sprint.printInfo();
        System.out.println("-------------------------------");

        Referee referee  = new Referee();
        referee.say();
        referee.printInfo();






    }
}
