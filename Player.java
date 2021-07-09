package MyJava;

import java.util.ArrayList;
import java.util.Scanner;

public class Player {
    public String playerName;
    public int playerAge;
    public String playerType;
    public int playerStatistic;

    public Player(){

    }

    public Player(String playerName,int playerAge, String playerType, int playerStatistic){
        this.playerName = playerName;
        this.playerAge = playerAge;
        this.playerType = playerType;
        this.playerStatistic = playerStatistic;
    }

    public void getAverage(){
        float average=playerStatistic/15;
    }

    public void getDetails(){
        System.out.println(playerName+" "+playerAge+" "+playerType+" "+playerStatistic+" " );
    }

    public void getBestPerformence(){
        System.out.println();
    }

    public void getType(){
        System.out.println();
    }

    public void addPlayer(String a){

    }

}
