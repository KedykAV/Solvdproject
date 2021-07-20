package com.solvd.sportsgames.title;

import com.solvd.sportsgames.area.Stadium;

import java.io.*;
import java.util.logging.Logger;

public class Title {
    private final static Logger LOGGER = Logger.getLogger(String.valueOf(Title.class));
    public void ReadInf(){
        try {
            File file = new File("C:\\Users\\noone\\IdeaProjects\\MavenSports\\src\\main\\java\\Title.txt");
            FileReader fr = new FileReader(file);
            BufferedReader reader = new BufferedReader(fr);
            String line = reader.readLine();
            while (line!=null){
                System.out.println(line);
                line=reader.readLine();
            }
        } catch (FileNotFoundException e) {
            LOGGER.info("File not found");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
