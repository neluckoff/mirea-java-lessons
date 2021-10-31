package ru.luckoff.mirea.practice_16.models;

import ru.luckoff.mirea.practice_16.items.Item;

public class RestaurantOrder implements Order {

    private final int sizeD = 10;
    private int size = 0;
    private Item[] items = new Item[sizeD];

    public boolean add(Item item) {
        if (size < sizeD) {
            items[size] = item;
            size++;
            return true;
        } else return false;

    }

    public boolean remove(String itemName){
        int i = 0;
        while (i < size) {
            if (items[i].getName().equals(itemName)) {
                for (int j = i; j < size - 1;j++)
                    items[j] = items[j + 1];
                items[size-1] = null;
                return true;
            }
            i++;
        }
        return false;
    }

    public int removeAll(String itemName){
        int i = 0;
        int count = 0;
        while (i < size) {
            if (items[i].getName().equals(itemName)) {
                for (int j = i; j < size - 1;j++)
                    items[j] = items[j + 1];
                items[size-1] = null;
                count++;
            }
            i++;
        }
        return count;
    }

    public int itemQuantity(){
        return size;
    }

    public int itemQuantity(String itemName) {
        int count = 0;
        for (int i = 0; i < size; i++)
            if (items[i].getName().equals(itemName))
                count++;
        return count;
    }

    public Item[] getItems(){
        return items;
    }

    public double costTotal() {
        double count = 0;
        for (int i = 0; i < size; i++)
            count += items[i].getPrice();
        return count;
    }

    public String[] itemsNames(){
        String[] ret = new String[size];
        for (int i = 0; i < size; i++)
            ret[i] = items[i].getName();
        return ret;
    }

    public Item[] sortedItemsByCostDesc(){
        for (int out = size - 1; out >= 1; out--)  //Внешний цикл
            for (int in = 0; in < out; in++)    //Внутренний цикл
                if(items[in].getPrice() > items[in + 1].getPrice()) {
                    Item k = items[in];
                    items[in] = items[in + 1];
                    items[in + 1] = k;
                }
        return items;
    }
}
