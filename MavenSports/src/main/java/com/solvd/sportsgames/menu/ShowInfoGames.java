package com.solvd.sportsgames.menu;


import com.solvd.sportsgames.games.cyclicalgames.Running;
import com.solvd.sportsgames.games.cyclicalgames.Swimming;
import com.solvd.sportsgames.games.teamgames.Basketball;
import com.solvd.sportsgames.games.teamgames.Football;
import com.solvd.sportsgames.utils.JsonProc;

import java.util.Scanner;
import java.util.logging.Logger;

public class ShowInfoGames {
    private final static Logger LOGGER = Logger.getLogger(String.valueOf(ShowInfoGames.class));
    public void ChangeTypeSports(){
        Scanner in = new Scanner(System.in);
        System.out.println("1-Team Games \n2-Cyclical Games");
        String type = in.nextLine();
        switch (type){
            case "1":
                System.out.println("1-Football \n2-Basketball");
                Scanner tg = new Scanner(System.in);
                String types = in.nextLine();
                switch (types){
                    case "1":
                        System.out.println("Types of football: " +
                                "\n1-Professional football " +
                                "\n2-Mini football");
                        Scanner fb = new Scanner(System.in);
                        String tfoot = in.nextLine();
                        switch (tfoot){
                            case "1":
                                Football prof = new Football();
                                prof.setGameType("Prof football");
                                JsonProc jsonAct = new JsonProc();
                                String jsonSrt = jsonAct.convertJavaToJsonStr(prof);
                                LOGGER.info(jsonSrt);
                                prof.setGameType("Prof football");

                                //System.out.println(prof.toString());
                                break;
                            case "2":
                                Football mini = new Football();
                                mini.setGameType("Mini football");
                                mini.setHalftimes(3);
                                mini.setSizeHalftime(20);
                                mini.setSizeTeam(5);
                                System.out.println(mini.toString());
                                break;
                            default:
                                System.out.println("You don't change type of football");
                        }
                        break;
                    case "2":
                        System.out.println("Types of basketball: " +
                                "\n1-Professional basketball " +
                                "\n2-Street ball");
                        Scanner bs = new Scanner(System.in);
                        String tbask = in.nextLine();
                        switch (tbask){
                            case "1":
                                Basketball prof = new Basketball();
                                prof.setGameType("Prof Basketball");
                                System.out.println(prof.toString());
                                break;
                            case "2":
                                Basketball street = new Basketball();
                                street.setGameType("Street ball");
                                street.setHalftimes(3);
                                street.setSizeHalftime(15);
                                street.setSizeTeam(3);
                                System.out.println(street.toString());
                                break;
                            default:
                                System.out.println("You don't change type of basketball");
                        }
                        break;
                    default:System.out.println("You don't change any type game!");
                }
                break;
            case "2":
                System.out.println("1-Running \n2-Swimming");
                Scanner cg = new Scanner(System.in);
                String typs = in.nextLine();
                switch (typs){
                    case "1":
                        System.out.println("Running types: "+
                                "\n1-Sprint "+
                                "\n2-Long Distance");
                        Scanner run = new Scanner(System.in);
                        String trun = in.nextLine();
                        switch (trun){
                            case "1":
                                Running sprint = new Running();
                                sprint.setGameType("Sprint");
                                sprint.setDistance(100);
                                System.out.println(sprint.toString());
                                break;
                            case "2":
                                Running longdist = new Running();
                                longdist.setGameType("Long distance running");
                                longdist.setDistance(5000);
                                longdist.setStadium("Nature");
                                System.out.println(longdist.toString());
                                break;
                            default:
                                System.out.println("You don't change type of running");
                        }
                        break;
                    case "2":
                        System.out.println("Swimming types: "+
                                "\n1-Butterfly "+
                                "\n2-Backstroke swimming");
                        Scanner swim = new Scanner(System.in);
                        String tswim = in.nextLine();
                        switch (tswim){
                            case "1":
                                Swimming butterfly = new Swimming();
                                System.out.println(butterfly.toString());
                                break;
                            case "2":
                                Swimming back = new Swimming();
                                back.setType("Backstroke swimming");
                                back.setLaps(2);
                                back.setDistance(100);
                                System.out.println(back.toString());
                                break;
                            default:
                                System.out.println("You don't change type of swimming");
                        }
                    break;
                    default:System.out.println("You don't change any type game!");
                }
                break;
            default:System.out.println("You don't change any choice!");

        }

    }
}
