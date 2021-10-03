package ru.luckoff.mirea.practice_11.task_1;

import java.util.Arrays;

public class ArrayQueue {
    private int size;
    private Object[] elements = new Object[5];

    public void push(ArrayQueue this, Object element) {
        assert element != null;
        this.ensureCapacity(size + 1);
        this.elements[this.size++] = element;
    }

    private void ensureCapacity(int capacity) {
        if (capacity > this.elements.length) {
            this.elements = Arrays.copyOf(this.elements, 2 * capacity);
        }
    }

    public Object peek() {
        assert size > 0;
        return elements[size - 1];
    }

    public Object pop() {
        assert size > 0;

        Object value = peek();
        elements[--size] = 0;
        return value;
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }
}

