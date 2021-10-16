package ru.luckoff.mirea.practice_16.task_4;

import ru.luckoff.mirea.practice_16.task_2.Dish;
import ru.luckoff.mirea.practice_16.task_2.Drink;
import ru.luckoff.mirea.practice_16.task_2.Item;
import ru.luckoff.mirea.practice_16.task_3.Order;

import java.util.Arrays;

public class RestaurantOrder implements Order {
    private final int sizeD = 4;
    private int size = 0;
    private Dish[] dishes = new Dish[sizeD];

    @Override
    public boolean add(Item dish) {
        if (size < sizeD) {
            dishes[size] = (Dish)dish;
            size++;
            return true;
        } else return false;

    }

    @Override
    public boolean remove(String dishName){
        int i = 0;
        while (i < size) {
            if (dishes[i].getName().equals(dishName)) {
                for (int j = i; j < size-1;j++)
                    dishes[j] = dishes[j+1];
                dishes[size-1] = null;
                return true;
            }
            i++;
        }
        return false;
    }

    @Override
    public int itemQuantity(){
        return size;
    }

    @Override
    public int itemQuantity(String dishName) {
        int count = 0;
        for (int i = 0;i < size; i++)
            if (dishes[i].getName().equals(dishName))
                count++;
        return count;
    }

    @Override
    public Item[] getItems(){
        return dishes;
    }

    @Override
    public double costTotal() {
        double count = 0;
        for (int i = 0; i < size; i++)
            count += dishes[i].getCost();
        return count;
    }

    @Override
    public String[] dishesNames(){
        String[] ret = new String[size];
        for (int i = 0; i < size;i++)
            ret[i] = dishes[i].getName();
        return ret;
    }

    @Override
    public Item[] sortedDishesByCostDesc(){
        for (int out = size - 1; out >= 1; out--)  //Внешний цикл
            for (int in = 0; in < out; in++)    //Внутренний цикл
                if(dishes[in].getCost() > dishes[in + 1].getCost()) {
                    Dish k = dishes[in];
                    dishes[in] = dishes[in+1];
                    dishes[in+1] = k;
                }
        return dishes;
    }

    @Override
    public String toString() {
        return Arrays.toString(dishes);
    }
}
