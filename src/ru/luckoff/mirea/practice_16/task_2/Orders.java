package ru.luckoff.mirea.practice_16.task_2;

public class Orders {
    public static void main(String[] args) {
        Drink firstDrink = new Drink(5, "Coca-Cola", "Вкусный напиток!");
        Dish firstDish = new Dish(14, "Лазанья", "Вкусная и пряная!");

        TablesOrderManager order = new TablesOrderManager();
        order.add(firstDish);
        order.add(firstDrink);
        order.add(new Dish("Суп \"Чучвара\"", "Томатный суп с пельменями"));
        System.out.println(order);

        order.remove(firstDish);
        System.out.println(order);

        System.out.println("Узнаем Описание первого напитка: " + firstDrink.getDescription());
    }
}
