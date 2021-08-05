package com.solvd.sportsgames.menu;



import com.solvd.sportsgames.area.Stadium;
import com.solvd.sportsgames.games.teamgames.Football;
import com.solvd.sportsgames.title.Title;
import com.solvd.sportsgames.utils.JsonProc;
import com.solvd.sportsgames.utils.SMValue;
import com.solvd.sportsgames.utils.SQLOperation;

import java.util.Scanner;
import java.util.logging.Logger;

public class Menu {
    private final static Logger LOGGER = Logger.getLogger(String.valueOf(JsonProc.class));
    public void startMenu() {



        int i=1;
        while (i>0){
            Title readFile = new Title();
            readFile.ReadInf();
        Stadium stadium = new Stadium();


        Scanner in = new Scanner(System.in);

        String choice = in.nextLine();
        switch (choice){
            case "1":
                ShowInfoGames showInfoGames = new ShowInfoGames();
                showInfoGames.ChangeTypeSports();
                break;
            case "2":
                SQLOperation sqlOperation = new SQLOperation();
                sqlOperation.addSports();
                break;
            case "3":
                stadium.AddReferee();
                break;
            case "4":
                Scanner scanner = new Scanner(System.in);
                SMValue smValue = new SMValue();
                smValue.setFromProperties("C:\\Users\\noone\\IdeaProjects\\MavenSports\\src\\main\\java\\sportsmen.properties","login",scanner.nextLine());
                String valueProp = smValue.getFromProperties("C:\\Users\\noone\\IdeaProjects\\MavenSports\\src\\main\\java\\sportsmen.properties","login");
                System.out.println("Nice to meet you: "+valueProp);
            case "5":
                Football football = new Football();

                JsonProc jsonAct = new JsonProc();
                String jsonSrt = jsonAct.convertJavaToJsonStr(football);
                LOGGER.info(jsonSrt);
                LOGGER.info("-------------");

                jsonAct.convertJavaToJsonFile(football,"football.json");

                String jsonSrt1 = "{\"sizeTeam\":11,\"halftimes\":2,\"sizeHalftime\":45,\"gameType\":\"Football\",\"country\":\"Belarus\"}";
                Football football1 = jsonAct.convertJsonStrToFootballPOJO(jsonSrt1);
                LOGGER.info("Halftimes for POJO " + football1.getHalftimes());
                LOGGER.info("Country for POJO "+ football1.getCountry());

            case "6":
                System.exit(0);
                break;
            default:System.out.println("Incorrect value. Please, try again.");
            i++;




    }}}}







