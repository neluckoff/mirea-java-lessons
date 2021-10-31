package ru.luckoff.mirea.practice_16.exceptions;

public class OrderAlreadyAddedException extends Exception {
    public OrderAlreadyAddedException() {
        super("Заказ уже добавлен");
    }
}
