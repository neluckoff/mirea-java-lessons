package ru.luckoff.mirea.practice_16;

import ru.luckoff.mirea.practice_16.items.Dish;
import ru.luckoff.mirea.practice_16.items.Drink;
import ru.luckoff.mirea.practice_16.items.Item;
import ru.luckoff.mirea.practice_16.models.InternetOrder;
import ru.luckoff.mirea.practice_16.models.OrderManager;
import ru.luckoff.mirea.practice_16.models.RestaurantOrder;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Item drink1 = new Drink(5, "Coca-Cola", "Сладкий газированный напиток");
        Item dish1 = new Dish(25,"Суп \"Чучвара\"","Томатный суп с пельменями");
        Item drink2 = new Drink(10, "Sprite", "Сладкий газированный напиток");
        Item drink3 = new Drink(15, "Fanta", "Сладкий газированный напиток");

        OrderManager orderManager = new OrderManager();

        InternetOrder internetOrder = new InternetOrder();
        internetOrder.add(drink1);
        internetOrder.add(drink2);

        RestaurantOrder restaurantOrder = new RestaurantOrder();
        restaurantOrder.add(drink3);
        restaurantOrder.add(dish1);

        RestaurantOrder restaurantOrder2 = new RestaurantOrder();
        restaurantOrder2.add(dish1);
        restaurantOrder2.add(dish1);
        restaurantOrder2.add(dish1);

        orderManager.add("Москва, ул. Тверская, д. 2", internetOrder);
        orderManager.add("Москва, пр. Вернадского, д. 6", internetOrder);
        orderManager.add(1, restaurantOrder2);
        orderManager.add(2, restaurantOrder);

        System.out.println("itemQuantity Restaurant - Coca-Cola: " + orderManager.itemRestaurantQuantity("Coca-Cola"));
        System.out.println("itemQuantity Restaurant - Суп \"Чучвара\": " + orderManager.itemRestaurantQuantity("Суп \"Чучвара\""));
        System.out.println("itemQuantity Internet - Суп \"Чучвара\": " + orderManager.itemInternetQuantity("Суп \"Чучвара\""));
        System.out.println("hashCostSummary: " + orderManager.hashCostSummary());
        System.out.println("ordersCostSummary: " + orderManager.ordersCostSummary());
        System.out.println("freeTableNumber: " + orderManager.freeTableNumber()); //kawo
        System.out.println("freeTableNumbers: " + Arrays.toString(orderManager.freeTableNumbers()));
    }
}
