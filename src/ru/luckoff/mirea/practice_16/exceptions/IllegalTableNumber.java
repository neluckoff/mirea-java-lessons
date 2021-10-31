package ru.luckoff.mirea.practice_16.exceptions;

public class IllegalTableNumber extends Exception {

    public IllegalTableNumber() {
        super("Столика с таким номером не существует");
    }
}
