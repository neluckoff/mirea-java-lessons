package ru.luckoff.mirea.practice_16.task_2;

import java.util.ArrayList;
import java.util.List;

public class TablesOrderManager {
    public List<Item> list;

    public TablesOrderManager() {
        this.list = new ArrayList<>();
    }

    public void add(Item item) {
        list.add(item);
    }

    public void remove(Item item) {
        list.remove(item);
    }

    @Override
    public String toString() {
        return list.toString();
    }
}
