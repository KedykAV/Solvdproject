package com.solvd.sportgames.title;

import java.io.*;

public class Title {
    public void ReadInf(){
        try {
            File file = new File("C:\\Users\\noone\\IdeaProjects\\SolvdProject\\src\\Title.txt");
            FileReader fr = new FileReader(file);
            BufferedReader reader = new BufferedReader(fr);
            String line = reader.readLine();
            while (line!=null){
                System.out.println(line);
                line=reader.readLine();
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
