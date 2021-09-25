package ru.luckoff.mirea.practice_10.task_1;

public interface ComplexAbstractFactory {
    Complex CreateComplex();
    Complex CreateComplex(int real, int image);
}
