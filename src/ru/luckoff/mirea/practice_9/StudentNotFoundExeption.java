package ru.luckoff.mirea.practice_9;

public class StudentNotFoundExeption extends Exception{
    public StudentNotFoundExeption(String err) {
        super(err);
    }
}
