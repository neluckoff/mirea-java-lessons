package ru.luckoff.mirea.practice_10.task_2;

public class FunctionalChair implements Chair {
    public FunctionalChair() {
    }

    int sum(int a, int b) {
        return a + b;
    }

    @Override
    public String toString() {
        return "Functional Chair has been created." ;
    }
}
