package ru.luckoff.mirea.practice_16.task_3;

import ru.luckoff.mirea.practice_16.task_2.Item;

public interface Order {
    boolean add(Item item);
    boolean remove(String itemName);
    int itemQuantity();
    double costTotal();
    Item[] getItems();
    int itemQuantity(String itemName);
    String[] dishesNames();
    Item[] sortedDishesByCostDesc();
}
