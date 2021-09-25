package ru.luckoff.mirea.practice_10.task_2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ChairFactory factory = new ChairFactory();
        Client client = new Client();
        System.out.println("Creating the firs chair.");
        FunctionalChair chair1 = factory.createFunctionalChair();
        System.out.println(chair1.toString());
        System.out.println("Creating a second chair.");
        MagicChair chair2 = factory.createMagicChair();
        System.out.println(chair2.toString());
        System.out.println("Creating the third chair.");
        VictorianChair chair3 = factory.createVictorianChair();
        System.out.println(chair3.toString());

        System.out.println("\n");
        chair2.doMagic();
        System.out.println("Age: " + chair3.getAge());
        client.sit();
    }
}
