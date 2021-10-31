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
        orderManager.add(0, restaurantOrder2);
        orderManager.add(2, restaurantOrder);

        System.out.println("Количество в Ресторанных заказах - Coca-Cola: " + orderManager.itemRestaurantQuantity("Coca-Cola"));
        System.out.println("Количество в Ресторанных заказах - Суп \"Чучвара\": " + orderManager.itemRestaurantQuantity("Суп \"Чучвара\""));
        System.out.println("Количество в Интернет заказах - Суп \"Чучвара\": " + orderManager.itemInternetQuantity("Суп \"Чучвара\""));
        System.out.println("Интернет сумма - $" + orderManager.internetCostSummary());
        System.out.println("Ресторанная сумма - $" + orderManager.restaurantCostSummary());
        System.out.println("Следующий свободный стол - №" + orderManager.freeTableNumber());
        System.out.println("Свободные столы - " + Arrays.toString(orderManager.freeTableNumbers()));
    }
}
