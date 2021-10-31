package ru.luckoff.mirea.practice_16.items;

import java.text.DecimalFormat;

public class Drink implements Item {

    private int price;
    private String name;
    private String description;
    private int priceZero = 0;

    public Drink(int price, String name, String description) throws IllegalArgumentException{
        if(price < 0 || name.equals("") || description.equals(""))
            throw new IllegalArgumentException();

        this.price = price;
        this.name = name;
        this.description = description;
    }
    public Drink(String name, String description) throws IllegalArgumentException{
        if(name.equals("") || description.equals(""))
            throw new IllegalArgumentException();

        this.price = priceZero;
        this.name = name;
        this.description = description;
    }

    @Override
    public int getPrice() {
        return price;
    }

    @Override
    public String getDescription() {
        return description;
    }

    @Override
    public String getName() {
        return name;
    }

    public String getPriceFormat() {
        return new DecimalFormat("###,###").format(price) + "$";
    }

    @Override
    public String toString() {
        return "Напиток " + name + " стоит " + getPriceFormat() + ". Описание: " + description;
    }
}