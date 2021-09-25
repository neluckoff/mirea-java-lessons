package ru.luckoff.mirea.practice_10.task_2;

import java.util.Scanner;

public class ChairFactory implements AbstactChairFactory {
    @Override
    public VictorianChair createVictorianChair() {
        int age;
        Scanner in = new Scanner(System.in);
        System.out.println("Choose age: ");
        age = in.nextInt();
        return new VictorianChair(age);
    }

    @Override
    public MagicChair createMagicChair() {
        return new MagicChair();
    }

    @Override
    public FunctionalChair createFunctionalChair() {
        return new FunctionalChair();
    }
}
