package ru.luckoff.mirea.practice_11.task_2;

public class LinkedQueue extends AbstractQueue {
    private Node head;

    public void push(Object element) {
        size++;
        head = new Node(element, head);
    }

    @Override
    public Object pop() {
        size--;
        Object result = head.value;
        head = head.next;
        return result;
    }

    @Override
    public Object peek() {
        return head.value;
    }

    private class Node {
        private Object value;
        private Node next;

        public Node(Object value, Node next) {
            this.value = value;
            this.next = next;
        }
    }

}

