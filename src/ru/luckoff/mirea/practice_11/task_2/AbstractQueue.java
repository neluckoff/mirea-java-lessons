package ru.luckoff.mirea.practice_11.task_2;

public abstract class AbstractQueue {
    protected int size;

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    abstract Object pop();
    abstract Object peek();
}

