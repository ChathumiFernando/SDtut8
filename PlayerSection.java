package com.company;
import java.util.Scanner;

public class PlayerSection {

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
        p3.Name = "dananjaya";
        p3.age = 29;
        p3.type = "boller";
        p3.statistics = 40;

        Player p4 = new Player();
        p4.Name = "malinga";
        p4.age = 38;
        p4.type = "boller";
        p4.statistics = 47;

        Player p5 = new Player();
        p5.Name = "Dikkwella";
        p5.age = 32;
        p5.type = "keeper";
        p5.statistics = 40;


        Scanner input = new Scanner(System.in);
        System.out.println("A: Add a player");
        System.out.println("B: Display Two best batsman");
        System.out.println("C: Display Two best bowlers");
        System.out.println("D: Display the best Keeper");
        System.out.println("V: View All methods");
        String inputUser = input.next();
    }
}
