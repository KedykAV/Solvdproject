package com.solvd.sportgames.area;

import com.solvd.sportgames.games.cyclicalgames.Cyclical;
import com.solvd.sportgames.games.cyclicalgames.Running;
import com.solvd.sportgames.games.cyclicalgames.Swimming;
import com.solvd.sportgames.games.teamgames.Basketball;
import com.solvd.sportgames.games.teamgames.Football;
import com.solvd.sportgames.supportpersons.Referee;
import com.solvd.sportgames.games.teamgames.TeamGames;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class Stadium extends Square{
    private List<TeamGames> listOfteamGames;
    private List<Cyclical> cyclicalList;

    public Stadium() {
        listOfteamGames = new ArrayList<>();
        cyclicalList = new ArrayList<>();
    }

    public void setListOfteamGames(TeamGames teamGames ){
        listOfteamGames.add(teamGames);
    }
    public List<TeamGames>getListOfteamGames(){
        return listOfteamGames;
    }
    public  void addTeamGames(TeamGames teamGames){
        listOfteamGames.add(teamGames);
    }

    public void setCyclicalList(Cyclical cyclical ){
        cyclicalList.add(cyclical);
    }
    public List<Cyclical>getCyclicalList(){
        return cyclicalList;
    }
    public  void addCyclical(Cyclical cyclical){
        cyclicalList.add(cyclical);
    }
    public void printStadiumList(){
        if ( cyclicalList.size()>0 ) {
            System.out.println("---Cyclical Games---");


            for (Cyclical cyclical : cyclicalList) {
                System.out.println(cyclical.getGameType());
            }
        }

        if ( listOfteamGames.size()>0 ) {
            System.out.println("---Team Games---");

            for (TeamGames teamGames : listOfteamGames) {
                System.out.println(teamGames.getGameType());
            }
        }
    }
    public void AddReferee(){
        Referee referee = new Referee();
        Referee referee1 = new Referee();
        HashMap<Referee, String> map = new HashMap<>();
        map.put(referee, "Karl");
        map.put(referee1,"Alex");
        System.out.println(map.get(referee));
    }

    public void AddGames(){
        int i =0;
        Stadium stadium = new Stadium();
        do{
        Scanner in = new Scanner(System.in);
        System.out.println("Change type of game to add"+
                "\n1-Team Game "+
                "\n2-Cyclical game"+
                "\n3-Show added games");
        String game = in.nextLine();
        switch (game){
            case "1":
                System.out.println("Change game: "+
                        "\n1-Football "+
                        "\n2-Basketball ");
                Scanner tg =new Scanner(System.in);
                String tgGame = in.nextLine();
                i=1;
                switch (tgGame){
                    case "1":
                        Football football = new Football();
                        stadium.addTeamGames(football);
                        i=2;
                        break;
                    case "2":
                        Basketball basketball = new Basketball();
                        stadium.addTeamGames(basketball);
                        i=2;
                        break;
                    default:System.out.println("You don't change game!");
                }
                break;
            case "2":
                System.out.println("Change game: "+
                        "\n1-Running "+
                        "\n2-Swimming");
                Scanner cg = new Scanner(System.in);
                String cgGame = in.nextLine();
                i=1;
                switch (cgGame){
                    case "1":
                        Running running = new Running();
                        stadium.addCyclical(running);
                        i=2;
                        break;
                    case "2":
                        Swimming swimming = new Swimming();
                        stadium.addCyclical(swimming);
                        i=2;
                        break;
                    default:System.out.println("You don't change game!");
                }break;
            case "3":
                if (stadium.getListOfteamGames().isEmpty()&&stadium.getCyclicalList().isEmpty()){
                    System.out.println("No  Games");
                }
                else
                    stadium.printStadiumList();

                i=3;
                break;
            default:System.out.println("You don't change type of game!");


        }


    }while (i!=3);
        i++;



}}


