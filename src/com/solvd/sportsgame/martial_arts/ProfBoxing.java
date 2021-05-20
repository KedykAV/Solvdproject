package com.solvd.sportsgame.martial_arts;

public class ProfBoxing extends Boxing{
    public ProfBoxing(){
        setRounds(10);
        setSize_round(3);
        setInventory("Boxing gloves");
        setArea("Ring");
        setJudgeName("Boris");
    }
    public ProfBoxing(int rounds, int size_round, String inventory, String area, String judgeName){
        super(rounds, size_round, inventory, area, judgeName);
    }
    public void ruleInfo(){
        System.out.println("This is rules of Prof Boxing");
        Info();
        dopInfo();
    }

}
