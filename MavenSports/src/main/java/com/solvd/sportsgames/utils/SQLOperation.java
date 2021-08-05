package com.solvd.sportsgames.utils;

import com.solvd.sportsgames.area.Stadium;
import com.solvd.sportsgames.coonect.Connector;
import com.solvd.sportsgames.games.teamgames.Basketball;
import com.solvd.sportsgames.games.teamgames.Football;
import com.solvd.sportsgames.games.teamgames.TeamGames;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Locale;
import java.util.Scanner;
import java.util.logging.Logger;

public class SQLOperation {
    private final static java.util.logging.Logger LOGGER = Logger.getLogger(String.valueOf(SQLOperation.class));

    public void addSports() {
        int i=0;
        do{
         Scanner in = new Scanner(System.in);
            LOGGER.info("Change your choice: "+
                    "\n1-Show all sports "+
                    "\n2-Add sports to Event"+
                    "\n3-Show added sports");
            String game = in.nextLine();
            switch (game){
                case "1":
                    LOGGER.info("Change type sports game: "+
                            "\n1 -Show Team Games "+
                            "\n2 -Show Cyclical");
                    Scanner cg = new Scanner(System.in);
                    String type = in.nextLine();
                    switch (type){
                        case "1":
                            LOGGER.info("Team Games");
                            String query = "Select type_sport, name_sport FROM teamgames ";
                            Connector connector = new Connector();
                            try (PreparedStatement pst = connector.connect().prepareStatement(query)){
                                ResultSet resultSet = pst.executeQuery();
                                while (resultSet.next()){
                                    String type_sport = resultSet.getString("type_sport");
                                    String name_sport = resultSet.getString("name_sport");
                                    LOGGER.info(String.format("NAMESPORT=%s GAMETYPE=%s",
                                            name_sport,type_sport));
                                }

                            } catch (SQLException throwables) {
                                throwables.printStackTrace();
                            }
                        break;
                        case "2":
                            LOGGER.info("Cyclical Games");
                            String query1 = "Select type_sport, discipline FROM cyclical ";
                            Connector connector1 = new Connector();
                            try (PreparedStatement pst = connector1.connect().prepareStatement(query1)){
                                ResultSet resultSet = pst.executeQuery();
                                while (resultSet.next()){
                                    String type_sport = resultSet.getString("type_sport");
                                    String discioline = resultSet.getString("discipline");
                                    LOGGER.info(String.format("NAMESPORT=%s GAMETYPE=%s",
                                            discioline,type_sport));
                                }

                            } catch (SQLException throwables) {
                                throwables.printStackTrace();
                            }
                        break;

                    }
                break;
                case "2":
                    LOGGER.info("Change type of games"+
                            "\n1-Team Games"+
                            "\n2- Cyclical Games");
                    Scanner tg = new Scanner(System.in);
                    String ch = in.nextLine();
                    switch (ch){
                        case "1":
                            LOGGER.info("Input name of sport"+
                                    "\nProf Football"+
                                    "\nMini Football"+
                                    "\nProf Basketball"+
                                    "\nStreetball");
                            Scanner load = new Scanner(System.in);
                            String change = load.nextLine();
                            String query = "SELECT*FROM TEAMGAMES WHERE NAME_SPORT = ('"+change+"')";
                            Connector connector = new Connector();
                            try (PreparedStatement pst = connector.connect().prepareStatement(query)){
                                ResultSet resultSet = pst.executeQuery();
                                while (resultSet.next()){
                                    try {
                                        PreparedStatement pst1= connector.connect().prepareStatement("INSERT INTO Event(discipline, "
                                                + "type_sport) VALUES ('"+ resultSet.getString(1)+ "','" +resultSet.getString(2)+"')");
                                        pst1.executeQuery();
                                    }catch (SQLException e){
                                        System.out.println(e.getMessage());
                                    }
                                }
                            } catch (SQLException throwables) {
                                throwables.printStackTrace();
                            }
                        break;
                        case "2":
                            LOGGER.info("Input name of sport"+
                                    "\nSprint"+
                                    "\nmarathon"+
                                    "\nButterfly"+
                                    "\nBackstroke swimming");
                            Scanner loads = new Scanner(System.in);
                            String chan = loads.nextLine();
                            String query1 = "SELECT*FROM cyclical WHERE discipline = ('"+chan+"')";
                            Connector connector1 = new Connector();
                            try (PreparedStatement pst = connector1.connect().prepareStatement(query1)){
                                ResultSet resultSet = pst.executeQuery();
                                while (resultSet.next()){
                                    try {
                                        PreparedStatement pst1= connector1.connect().prepareStatement("INSERT INTO Event(discipline, "
                                                + "type_sport) VALUES ('"+ resultSet.getString(1)+ "','" +resultSet.getString(2)+"')");
                                        pst1.executeQuery();
                                    }catch (SQLException e){
                                        System.out.println(e.getMessage());
                                    }
                                }
                            } catch (SQLException throwables) {
                                throwables.printStackTrace();
                            }
                        break;


                    }
                case "3":
                    System.out.println("Show all added sport to Event: ");
                    String query = "Select * FROM Event ";
                    Connector connector = new Connector();
                    try (PreparedStatement pst = connector.connect().prepareStatement(query)){
                        ResultSet resultSet = pst.executeQuery();
                        while (resultSet.next()){
                            String discipline = resultSet.getString("discipline");
                            String type_sport = resultSet.getString("type_sport");

                            System.out.println(String.format("DISCIPLINE=%s GAMETYPE=%s ",
                                    discipline,type_sport));
                        }

                    } catch (SQLException throwables) {
                        throwables.printStackTrace();
                    }
                break;
                default:System.out.println("You don't change any choice!");

            }


        }while(i!=3);
        i++;


    }

   
}

















