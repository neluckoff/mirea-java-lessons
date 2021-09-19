package ru.luckoff.mirea.practice_8;

public class BoundedWaitList<E> extends WaitList<E> {
    public int capacity;

    public BoundedWaitList(int capacity) {
        this.capacity = capacity;
    }

    public int getCapacity() {
        return capacity;
    }

    public void add(E element) {

    }

    @Override
    public String toString() {
        return "BoundedWaitList{" +
                "capacity=" + capacity +
                '}';
    }
}
