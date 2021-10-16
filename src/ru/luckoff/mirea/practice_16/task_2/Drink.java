package ru.luckoff.mirea.practice_16.task_2;

public final class Drink implements Item {
    final int cost;
    final String name;
    final String description;

    public Drink(String name, String description) {
        this.cost = 0;
        this.name = name;
        this.description = description;
    }

    public Drink(int cost, String name, String description) {
        this.cost = cost;
        this.name = name;
        this.description = description;
    }

    @Override
    public int getCost() {
        return cost;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getDescription() {
        return description;
    }

    @Override
    public String toString() {
        return "Name: " + name + " | Cost: $" + cost + " | Description: " + description + "\n";
    }
}
