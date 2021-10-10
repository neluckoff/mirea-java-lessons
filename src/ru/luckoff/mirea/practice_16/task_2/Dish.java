package ru.luckoff.mirea.practice_16.task_2;

final class Dish implements Item {
    final int cost;
    final String name;
    final String description;

    Dish(String name, String description) {
        this.cost = 0;
        this.name = name;
        this.description = description;
    }

    Dish(int cost, String name, String description) {
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