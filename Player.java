public class Player {

    public String Name;
    public int age;
    public String type;
    public int statistics;

    public Player(){

    }

    public Player(String playerName,int playerAge, String playerType, int playerStatistic){
        this.Name = playerName;
        this.age = playerAge;
        this.type = playerType;
        this.statistics = playerStatistic;
    }

    public float getAverage(){
        float average=statistics/15;
        return average;
    }

    public void getDetails(){
        System.out.println(Name+" "+age+" "+type+" "+statistics+" " );
    }

    public void getBestPerformence(){
        System.out.println();
    }

    public void getType(){
        System.out.println();
    }

}