package ru.luckoff.mirea.practice_16.task_5;

import ru.luckoff.mirea.practice_16.task_2.Item;
import ru.luckoff.mirea.practice_16.task_3.Order;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class OrderManager {
    public List<Item> list = new ArrayList<>();
    private HashMap<String, Order> hashmap = new HashMap<>();

    public void add(Item item) {
        list.add(item);
    }

    public void add(String address, Order order) {
        hashmap.put(address, order);
    }

    public void remove(Item item) {
        list.remove(item);
    }

    public void remove(String adress) {
        hashmap.remove(adress);
    }

    @Override
    public String toString() {
        return list.toString();
    }
}
