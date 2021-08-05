package com.solvd.sportsgames.utils;



import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.logging.Logger;

public class SMValue {
    private final static Logger LOGGER = Logger.getLogger(String.valueOf(SMValue.class));
    public String getFromProperties(String path, String  key){
        Properties properties = new Properties();
        FileInputStream fl = null;
        try {
            fl=new FileInputStream(path);
            properties.load(fl);
            fl.close();
            return properties.getProperty(key);
        }
        catch (FileNotFoundException e){
            LOGGER.info("File not found!");
        } catch (IOException e) {
            e.printStackTrace();
        }
        return "Default";
    }

    public void setFromProperties(String path, String key, String value){
        Properties properties = new Properties();

        try {
            FileOutputStream fr = new FileOutputStream(path);
            properties.setProperty(key, value);
            properties.store(fr, "");
            fr.close();
        } catch (IOException e){
            e.printStackTrace();
        }
    }

}
