package com.solvd.sportgames;


import com.solvd.sportgames.area.Stadium;
import com.solvd.sportgames.cyclicalgames.Running;
import com.solvd.sportgames.supportpersons.Referee;
import com.solvd.sportgames.teamgames.Basketball;
import com.solvd.sportgames.teamgames.teams.Dinamo;
import com.solvd.sportgames.teamgames.Football;


public class Executor {
    public static void main(String[] args){
        Football football = new Football();
        football.setCountry("Brasil");
        football.printType();
        System.out.println(football.getGametype());
        football.printDiscr();
        System.out.println("------------------------------");

        Basketball basketball = new Basketball();
        basketball.printType();
        System.out.println(basketball.getGametype());
        basketball.printDiscr();
        System.out.println("------------------------------");

        Running sprint = new Running();
        sprint.setDistance(150);
        sprint.printInfo();
        System.out.println("-------------------------------");

        Referee referee  = new Referee();
        referee.say();
        referee.printInfo();
        System.out.println("-------------------------------");

        Stadium stadium = new Stadium();
        stadium.setCyclical(sprint);
        System.out.println("Type game on stadium: " + stadium.getCyclical().getType());
        stadium.setTeamGames(football);
        System.out.println("Type game on stadium: " + stadium.getTeamGames().getGametype());
        stadium.setTeamGames(basketball);
        System.out.println("Type game on stadium: " + stadium.getTeamGames().getGametype());
        System.out.println("-------------------------------");

        Dinamo dinamo = new Dinamo();
        dinamo.setSizeTeam(5);
        dinamo.printType();
        dinamo.printDiscr();
        dinamo.fans(25);
        dinamo.fans("Hey Hooo!");















    }
}
