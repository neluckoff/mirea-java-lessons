package ru.luckoff.mirea.practice_8;

import java.util.Collection;
import java.util.concurrent.ConcurrentLinkedQueue;

public class WaitList<E> implements IWaitList<E> {
    private ConcurrentLinkedQueue<E> content;

    public WaitList() {

    }

    public WaitList(ConcurrentLinkedQueue<E> content) {
        this.content = content;
    }

    @Override
    public String toString() {
        return "WaitList{" +
                "content=" + content +
                '}';
    }

    @Override
    public void add(E element) {

    }

    @Override
    public E remove() {
        return null;
    }

    @Override
    public boolean contains(E element) {
        return false;
    }

    @Override
    public boolean containsAll(Collection c) {
        return false;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }
}
