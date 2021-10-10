package ru.luckoff.mirea.practice_16.task_1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        //first
        System.out.println("Создаем первый напиток: <ИМЯ> <ОПИСАНИЕ>");
        String firstName = in.next();
        String firstDescription = in.next().replace('_', ' ');
        Drink firstDrink = new Drink(firstName, firstDescription);

        System.out.println("Узнаем его Цену: $" + firstDrink.getCost());
        System.out.println("Узнаем его Описание: " + firstDrink.getDescription());
        System.out.println("Узнаем его Название: " + firstDrink.getName());

        System.out.println(firstDrink.toString());

        System.out.println("Создаем второй напиток: <ИМЯ> <ЦЕНА> <ОПИСАНИЕ>");
        String secondName = in.next();
        int secondCost = in.nextInt();
        String secondDescription = in.next().replace('_', ' ');
        Drink secondDrink = new Drink(secondCost, secondName, secondDescription);

        System.out.println("Узнаем его Цену: $" + secondDrink.getCost());
        System.out.println("Узнаем его Описание: " + secondDrink.getDescription());
        System.out.println("Узнаем его Название: " + secondDrink.getName());

        System.out.println(secondDrink.toString());
    }
}
