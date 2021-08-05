package com.solvd.sportsgames.menu;


import com.solvd.sportsgames.coonect.Connector;
import com.solvd.sportsgames.games.cyclicalgames.Running;
import com.solvd.sportsgames.games.cyclicalgames.Swimming;
import com.solvd.sportsgames.games.teamgames.Basketball;
import com.solvd.sportsgames.games.teamgames.Football;
import com.solvd.sportsgames.utils.JsonProc;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
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
                                System.out.println("Prof Football info: ");
                                String query = "Select * FROM teamgames Where name_sport='Prof Football'";
                                Connector connector = new Connector();
                                try (PreparedStatement pst = connector.connect().prepareStatement(query)){
                                    ResultSet resultSet = pst.executeQuery();
                                    while (resultSet.next()){
                                        String type_sport = resultSet.getString("type_sport");
                                        String name_sport = resultSet.getString("name_sport");
                                        int size_team =resultSet.getInt("size_team");
                                        int halftimes = resultSet.getInt("halftimes");
                                        int size_halftimes=resultSet.getInt("size_halftimes");
                                        LOGGER.info(String.format("NAMESPORT=%s GAMETYPE=%s  SIZETEAM=%s HALFTIMES=%s SIZEHALFTIMES=%s",
                                                name_sport,type_sport,size_team,halftimes,size_halftimes));
                                    }

                                } catch (SQLException throwables) {
                                    throwables.printStackTrace();
                                }
                                break;
                            case "2":
                                System.out.println("Mini football info: ");
                                String query1 = "Select * FROM teamgames Where name_sport='Mini Football'";
                                Connector connector1 = new Connector();
                                try (PreparedStatement pst = connector1.connect().prepareStatement(query1)){
                                    ResultSet resultSet = pst.executeQuery();
                                    while (resultSet.next()){
                                        String type_sport = resultSet.getString("type_sport");
                                        String name_sport = resultSet.getString("name_sport");
                                        int size_team =resultSet.getInt("size_team");
                                        int halftimes = resultSet.getInt("halftimes");
                                        int size_halftimes=resultSet.getInt("size_halftimes");
                                        LOGGER.info(String.format("NAMESPORT=%s GAMETYPE=%s  SIZETEAM=%s HALFTIMES=%s SIZEHALFTIMES=%s",
                                                name_sport,type_sport,size_team,halftimes,size_halftimes));
                                    }

                                } catch (SQLException throwables) {
                                    throwables.printStackTrace();
                                }
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
                                System.out.println("Prof Basketball info: ");
                                String query = "Select * FROM teamgames Where name_sport='Prof Basketball'";
                                Connector connector = new Connector();
                                try (PreparedStatement pst = connector.connect().prepareStatement(query)){
                                    ResultSet resultSet = pst.executeQuery();
                                    while (resultSet.next()){
                                        String type_sport = resultSet.getString("type_sport");
                                        String name_sport = resultSet.getString("name_sport");
                                        int size_team =resultSet.getInt("size_team");
                                        int halftimes = resultSet.getInt("halftimes");
                                        int size_halftimes=resultSet.getInt("size_halftimes");
                                        System.out.println(String.format("NAMESPORT=%s GAMETYPE=%s  SIZETEAM=%s HALFTIMES=%s SIZEHALFTIMES=%s",
                                                name_sport,type_sport,size_team,halftimes,size_halftimes));
                                    }

                                } catch (SQLException throwables) {
                                    throwables.printStackTrace();
                                }
                                break;
                            case "2":
                                System.out.println("Streetball info: ");
                                String query1 = "Select * FROM teamgames Where name_sport='Streetball'";
                                Connector connector1 = new Connector();
                                try (PreparedStatement pst = connector1.connect().prepareStatement(query1)){
                                    ResultSet resultSet = pst.executeQuery();
                                    while (resultSet.next()){
                                        String type_sport = resultSet.getString("type_sport");
                                        String name_sport = resultSet.getString("name_sport");
                                        int size_team =resultSet.getInt("size_team");
                                        int halftimes = resultSet.getInt("halftimes");
                                        int size_halftimes=resultSet.getInt("size_halftimes");
                                        LOGGER.info(String.format("NAMESPORT=%s GAMETYPE=%s  SIZETEAM=%s HALFTIMES=%s SIZEHALFTIMES=%s",
                                                name_sport,type_sport,size_team,halftimes,size_halftimes));
                                    }

                                } catch (SQLException throwables) {
                                    throwables.printStackTrace();
                                }
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
                                System.out.println("Sprint info: ");
                                String query1 = "Select * FROM cyclical Where discipline='Sprint'";
                                Connector connector1 = new Connector();
                                try (PreparedStatement pst = connector1.connect().prepareStatement(query1)){
                                    ResultSet resultSet = pst.executeQuery();
                                    while (resultSet.next()){
                                        String discipline = resultSet.getString("discipline");
                                        String type_sport = resultSet.getString("type_sport");
                                        int distance =resultSet.getInt("distance");
                                        int n_laps = resultSet.getInt("n_laps");
                                        String stadium =resultSet.getString("stadium");
                                        LOGGER.info(String.format("DISCIPLINE=%s GAMETYPE=%s  DISTANCE=%s NUMBER OF LAPS=%s STADIUM=%s",
                                                discipline,type_sport,distance,n_laps,stadium));
                                    }

                                } catch (SQLException throwables) {
                                    throwables.printStackTrace();
                                }
                                break;
                            case "2":
                                System.out.println("Marathon info: ");
                                String query = "Select * FROM cyclical Where discipline='marathon'";
                                Connector connector = new Connector();
                                try (PreparedStatement pst = connector.connect().prepareStatement(query)){
                                    ResultSet resultSet = pst.executeQuery();
                                    while (resultSet.next()){
                                        String discipline = resultSet.getString("discipline");
                                        String type_sport = resultSet.getString("type_sport");
                                        int distance =resultSet.getInt("distance");
                                        int n_laps = resultSet.getInt("n_laps");
                                        String stadium =resultSet.getString("stadium");
                                        LOGGER.info(String.format("DISCIPLINE=%s GAMETYPE=%s  DISTANCE=%s NUMBER OF LAPS=%s STADIUM=%s",
                                                discipline,type_sport,distance,n_laps,stadium));
                                    }

                                } catch (SQLException throwables) {
                                    throwables.printStackTrace();
                                }
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
                                System.out.println("Butterfly info: ");
                                String query = "Select * FROM cyclical Where discipline='Butterfly'";
                                Connector connector = new Connector();
                                try (PreparedStatement pst = connector.connect().prepareStatement(query)){
                                    ResultSet resultSet = pst.executeQuery();
                                    while (resultSet.next()){
                                        String discipline = resultSet.getString("discipline");
                                        String type_sport = resultSet.getString("type_sport");
                                        int distance =resultSet.getInt("distance");
                                        int n_laps = resultSet.getInt("n_laps");
                                        String stadium =resultSet.getString("stadium");
                                        LOGGER.info(String.format("DISCIPLINE=%s GAMETYPE=%s  DISTANCE=%s NUMBER OF LAPS=%s STADIUM=%s",
                                                discipline,type_sport,distance,n_laps,stadium));
                                    }

                                } catch (SQLException throwables) {
                                    throwables.printStackTrace();
                                }
                                break;
                            case "2":
                                System.out.println("Backstroke swimming info: ");
                                String query1 = "Select * FROM cyclical Where discipline='Backstroke swimming'";
                                Connector connector1 = new Connector();
                                try (PreparedStatement pst = connector1.connect().prepareStatement(query1)){
                                    ResultSet resultSet = pst.executeQuery();
                                    while (resultSet.next()){
                                        String discipline = resultSet.getString("discipline");
                                        String type_sport = resultSet.getString("type_sport");
                                        int distance =resultSet.getInt("distance");
                                        int n_laps = resultSet.getInt("n_laps");
                                        String stadium =resultSet.getString("stadium");
                                        LOGGER.info(String.format("DISCIPLINE=%s GAMETYPE=%s  DISTANCE=%s NUMBER OF LAPS=%s STADIUM=%s",
                                                discipline,type_sport,distance,n_laps,stadium));
                                    }

                                } catch (SQLException throwables) {
                                    throwables.printStackTrace();
                                }
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
