package ru.luckoff.mirea.practice_08;

public class UnfairWaitList<E> extends WaitList<E> {
    public UnfairWaitList() {
    }

    void remove(E element) {
        content.remove(element);
    }

    void moveToBack(E element) {
        content.remove(element);
        content.add(element);
    }
}
