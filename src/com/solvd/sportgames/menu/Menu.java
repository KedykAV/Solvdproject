package com.solvd.sportgames.menu;

import com.solvd.sportgames.area.Stadium;
import com.solvd.sportgames.games.teamgames.TeamGames;
import com.solvd.sportgames.title.Title;

import java.util.Scanner;

public class Menu {
    public void startMenu() {


        int i=3;
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
                stadium.AddGames();
                break;
            case "3":
                stadium.AddReferee();
                break;
            default:System.out.println("Incorrect value. Please, try again.");
            i--;




    }}}}







