package ru.luckoff.mirea.practice_16.task_1;

final class Drink {
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

    public int getCost() {
        return cost;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    @Override
    public String toString() {
        return "Ваш напиток \"" + name + "\" выходит по стоимости $" + cost + ". Пару слов о товаре: " + description;
    }
}
