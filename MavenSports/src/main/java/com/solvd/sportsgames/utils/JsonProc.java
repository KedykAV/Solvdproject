package com.solvd.sportsgames.utils;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.solvd.sportsgames.games.teamgames.Football;

import java.io.IOException;
import java.nio.file.Paths;
import java.util.logging.Logger;

public class JsonProc {
    private final static Logger LOGGER = Logger.getLogger(String.valueOf(JsonProc.class));
    public String convertJavaToJsonStr(Object obj) {

        String jsonStr = "";

        try {
            jsonStr = new ObjectMapper().writeValueAsString(obj);
            LOGGER.info("convert to string, finished!");

        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }

        return jsonStr;
    }

    public void convertJavaToJsonFile(Object obj, String pathToFile) {

        try {
            ObjectMapper mapper = new ObjectMapper();
            mapper.writeValue(Paths.get(pathToFile).toFile(), obj);
            LOGGER.info("write to file, finished!");

        } catch (JsonProcessingException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public Football convertJsonStrToFootballPOJO(String jsonStr) {

        Football football = null;
        try {
            ObjectMapper mapper = new ObjectMapper();
            football  = mapper.readValue(jsonStr, Football.class);
            LOGGER.info("convert to POJO, finished!");

        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }

        return football;
    }
}
