package com.solvd.sportsgame.martial_arts;

public class Boxing extends Martial_Arts {
    private String judgeName;

    public Boxing(){

    }
    public Boxing(int rounds, int size_round, String inventory, String area, String judgeName){
        super(rounds, size_round, inventory, area);
        this.judgeName = judgeName;
    }
    public void  setJudgeName(String judgeName){
        this.judgeName = judgeName;
    }
    public String getJudgeName(){
        return this.judgeName;
    }
    public void dopInfo(){
        System.out.println("The judge name is: " + getJudgeName());
    }
}
