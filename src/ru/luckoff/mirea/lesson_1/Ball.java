package ru.luckoff.mirea.lesson_1;

public class Ball {
    private String name;
    private int cost;

    public Ball(String n, int c){
        name = n;
        cost = c;
    }

    public Ball(String n){
        name = n;
        cost = 0;
    }

    public Ball(){
        name = "null";
        cost = 0;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    @Override
    public String toString() {
        return "Ball{" +
                "name='" + name + '\'' +
                ", cost=" + cost +
                '}';
    }
}
