package ru.luckoff.mirea.practice_09;

public class StudentNotFoundExeption extends Exception{
    public StudentNotFoundExeption(String err) {
        super(err);
    }
}
