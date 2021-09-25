package ru.luckoff.mirea.practice_10.task_2;

public class VictorianChair implements Chair {
    public int age;

    public VictorianChair(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Victorian Chair has been created. Selected age: " + age;
    }
}
