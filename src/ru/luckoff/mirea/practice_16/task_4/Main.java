package ru.luckoff.mirea.practice_16.task_4;

import ru.luckoff.mirea.practice_16.task_2.Dish;
import ru.luckoff.mirea.practice_16.task_2.Drink;

public class Main {
    public static void main(String[] args) {
        RestaurantOrder order = new RestaurantOrder();
        Dish firstDrink = new Dish(5, "Coca-Cola", "Вкусный напиток!");
        Dish firstDish = new Dish(14, "Лазанья", "Вкусная и пряная!");
        Dish secondDish = new Dish(3, "Пельмени", "Всеми хороши.");

        order.add(firstDrink);
        order.add(firstDish);
        order.add(secondDish);
        order.add(secondDish);

        System.out.println(order.costTotal());
        System.out.println(order);
        order.remove("Coca-Cola");
        System.out.println(order);
        System.out.println(order.itemQuantity());
    }
}
