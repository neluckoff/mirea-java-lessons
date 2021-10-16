package ru.luckoff.mirea.practice_16.task_3;

import ru.luckoff.mirea.practice_16.task_2.Dish;
import ru.luckoff.mirea.practice_16.task_2.Drink;
import ru.luckoff.mirea.practice_16.task_2.Item;

import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        InternetOrder orderOne = new InternetOrder();
        Drink firstDrink = new Drink(5, "Coca-Cola", "Вкусный напиток!");
        Dish firstDish = new Dish(14, "Лазанья", "Вкусная и пряная!");
        Dish secondDish = new Dish(3, "Пельмени", "Всеми хороши.");
        orderOne.add(firstDish);
        orderOne.add(firstDrink);
        orderOne.add(secondDish);
        orderOne.sortedDishesByCostDesc();

        System.out.println(orderOne);
        orderOne.remove("Coca-Cola");
        System.out.println("\n" + orderOne);
        System.out.println("itemQuantity - " + orderOne.itemQuantity());
        System.out.println("Cost Total - " + orderOne.costTotal());
    }
}
