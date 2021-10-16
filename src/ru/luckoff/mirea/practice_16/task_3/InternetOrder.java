package ru.luckoff.mirea.practice_16.task_3;

import ru.luckoff.mirea.practice_16.task_2.Item;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

public class InternetOrder implements Order {
    LinkedList<Item> list = new LinkedList<Item>();

    public InternetOrder() {
    }

    public InternetOrder(Item[] k) {
        for (int i = 0; i < k.length;i++)
            list.add(k[i]);
    }

    @Override
    public boolean add(Item item) {
        list.add(item);
        return false;
    }

    @Override
    public boolean remove(String itemName) {
        for (Item it: list) {
            if (it.getName().equals(itemName)) {
                list.remove(it);
                return true;
            }
        }
        return false;
    }

    @Override
    public int itemQuantity() {
        return list.size();
    }

    @Override
    public double costTotal() {
        return list.stream().mapToInt(Item::getCost).sum();
//        double count = 0;
//        for (Item it: list) {
//            count += it.getCost();
//        }
//        return count;
    }

    @Override
    public Item[] getItems() {
        return list.toArray(new Item[] {});
    }

    @Override
    public int itemQuantity(String itemName) {
        return (int) list.stream().filter(i -> i.getName().equalsIgnoreCase(itemName)).count();
    }

    @Override
    public String[] dishesNames() {
        String[] ret = new String[list.size()];
        int i = 0;
        for (Item it: list) {
            ret[i] = it.getName();
            i++;
        }
        return ret;
    }

    @Override
    public Item[] sortedDishesByCostDesc() {
        List<Item> d = new ArrayList<>(list);
        d.sort(Comparator.comparing(i -> i.getCost()));
        return d.toArray(new Item[] {});
//        Item[] k = getItems();
//        for (int out = list.size() - 1; out >= 1; out--)  //Внешний цикл
//            for (int in = 0; in < out; in++)    //Внутренний цикл
//                if(k[in].getCost() < k[in + 1].getCost()) {
//                    Item t = k[in];
//                    k[in] = k[in+1];
//                    k[in+1] = t;
//                }
//        return k;
    }

    @Override
    public String toString() {
        return list.toString();
    }
}
