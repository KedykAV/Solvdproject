package com.solvd.sportsgames.supportpersons;

import com.solvd.sportsgames.area.Stadium;

import java.util.logging.Logger;

public class Referee extends Person implements Speak {
    private final static Logger LOGGER = Logger.getLogger(String.valueOf(Referee.class));
    private String category;
    public Referee(){
        setName("Jack");
        setAge(32);
        setCategory("High");

    }
    public Referee (String name, int age, String category){
        super(name, age);
        this.category = category;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    @Override
    public void say() {
        LOGGER.info("Start game!");
    }
    public void printInfo(){
        System.out.println("Name referee: " + getName());
        System.out.println("Age referee: " + getAge() + " years old");
        System.out.println("The category referee is: " + getCategory());
    }
}