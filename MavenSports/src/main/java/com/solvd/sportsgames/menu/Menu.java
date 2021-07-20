package com.solvd.sportsgames.menu;



import com.solvd.sportsgames.area.Stadium;
import com.solvd.sportsgames.title.Title;
import com.solvd.sportsgames.utils.SMValue;

import java.util.Scanner;

public class Menu {
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
                stadium.AddGames();
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
                System.exit(0);
                break;
            default:System.out.println("Incorrect value. Please, try again.");
            i++;




    }}}}







