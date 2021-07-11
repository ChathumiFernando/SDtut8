import java.net.SocketTimeoutException;
import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class PlayerSelection {

    public static void main(String[] args) {

        Player p1 = new Player();
        p1.Name = "Sanath";
        p1.age = 45;
        p1.type = "batsmen";
        p1.statistics = 40;

        Player p2 = new Player();
        p2.Name = "sangakara";
        p2.age = 40;
        p2.type = "batsmen";
        p2.statistics = 50;

        Player p3 = new Player();
        p3.Name = "mahela";
        p3.age = 41;
        p3.type = "batsmen";
        p3.statistics = 48;

        Player p4 = new Player();
        p4.Name = "shanaka";
        p4.age = 27;
        p4.type = "batsmen";
        p4.statistics = 40;

        Player p5 = new Player();
        p5.Name = "dananjaya";
        p5.age = 29;
        p5.type = "boller";
        p5.statistics = 40;

        Player p6 = new Player();
        p6.Name = "malinga";
        p6.age = 38;
        p6.type = "boller";
        p6.statistics = 47;

        Player p7 = new Player();
        p7.Name = "Isuru";
        p7.age = 29;
        p7.type = "boller";
        p7.statistics = 40;

        Player p8 = new Player();
        p8.Name = "Murali";
        p8.age = 45;
        p8.type = "boller";
        p8.statistics = 47;

        Player p9 = new Player();
        p9.Name = "niroshan";
        p9.age = 32;
        p9.type = "keeper";
        p9.statistics = 40;

        Player p10 = new Player();
        p10.Name = "Chandimal";
        p10.age = 35;
        p10.type = "keeper";
        p10.statistics = 42;

        float p1Avg = p1.getAverage();
        float p2Avg = p2.getAverage();
        float p3Avg = p3.getAverage();
        float p4Avg = p4.getAverage();
        float p5Avg = p5.getAverage();
        float p6Avg = p6.getAverage();
        float p7Avg = p7.getAverage();
        float p8Avg = p8.getAverage();
        float p9Avg = p9.getAverage();
        float p10Avg = p10.getAverage();

        String inputUser;
        do{
            Scanner input = new Scanner(System.in);
            System.out.println("A: Add a player");
            System.out.println("B: Display Two best batsman");
            System.out.println("C: Display Two best bowlers");
            System.out.println("D: Display the best Keeper");
            System.out.println("V: View All methods");
            System.out.println(" ");
            System.out.print("Enter you Option:");
            inputUser = input.next();
            switch (inputUser) {
                case "A":
                    addPlayer();
                    break;
                case "B":
                    float[] bestBatmensArray = {p1Avg, p2Avg, p3Avg, p4Avg};
                    bestBatmens(bestBatmensArray);
                    break;
                case "C":
                    float[] bestBollerArray = {p5Avg, p6Avg, p7Avg, p8Avg};
                    bestBoller(bestBollerArray);
                    break;
                case "D":
                    float[] bestKeeperArray = {p9Avg, p10Avg};
                    bestKeeper(bestKeeperArray);
                    break;
                case "V":
                    viewAllMethods();
                    break;
            }
        }
        while (inputUser != "X");
        System.out.println("Thank you!");

    }

    private static void viewAllMethods() {
        addPlayer();

    }

    public static void bestKeeper(float [] Keeper) {
        Arrays.sort(Keeper);
        System.out.println(Keeper[2]);
    }

    private static void bestBoller(float [] Boller) {
        Arrays.sort(Boller);
        System.out.println(Boller[3]);
        System.out.println(Boller[2]);
    }

    private static void bestBatmens(float [] Batmens) {
        Arrays.sort(Batmens);
        System.out.println(Batmens[3]);
        System.out.println(Batmens[2]);

    }

    private static void addPlayer() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter 3 players name:");
        ArrayList<String> memory = new ArrayList<String>();
        int i = 0;
        while(i < 3)
        {
            memory.add(input.nextLine());
            System.out.println(memory.toString());
            i++;
        }

    }
}