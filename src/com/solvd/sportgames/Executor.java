package com.solvd.sportgames;


import com.solvd.sportgames.area.Stadium;
import com.solvd.sportgames.cyclicalgames.Running;
import com.solvd.sportgames.cyclicalgames.Swimming;
import com.solvd.sportgames.supportpersons.Referee;
import com.solvd.sportgames.teamgames.Basketball;
import com.solvd.sportgames.teamgames.teams.Dinamo;
import com.solvd.sportgames.teamgames.Football;
import java.util.Scanner;


public class Executor {
    public static void main(String[] args){
        int i = 0;
        do {
        Scanner load = new Scanner(System.in);
        System.out.println("Change type of sport:");
        String sport = load.nextLine();
        switch (sport){
            case "Running":
                Running running = new Running();
                System.out.println(running.toString());
                running.Dist();
                i = 1;
                break;
            case "Football":
                Football football = new Football();
                System.out.println(football.toString());
                i = 1;
                break;
            case "Swimming":
                Swimming swimming = new Swimming();
                System.out.println(swimming.toString());
                i = 1;
                break;
            case "Basketball":
                Basketball basketball = new Basketball();
                System.out.println(basketball.toString());
                i = 1;
                break;
            default:
                System.out.println("You don't change actual sport!");
        }


    }
        while (i<1);
}
}
